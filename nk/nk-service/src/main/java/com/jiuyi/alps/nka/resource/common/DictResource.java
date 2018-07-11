package com.jiuyi.alps.nka.resource.common;

import com.jiuyi.alps.nka.client.common.DictClient;
import com.jiuyi.alps.nka.domain.common.DictDomain;
import com.jiuyi.alps.nka.dto.common.DictDto;
import com.jiuyi.alps.nka.error.NkaError;
import com.jiuyi.alps.nka.service.common.DictService;
import common.rest.RestResponse;
import common.rest.RestResponseBuilder;
import common.rest.exception.RestException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by WangGang on 2017/11/18.
 */
@Api(tags = "dict-info-api", description = "字典信息接口")
@RestController
public class DictResource implements DictClient {

    @Autowired
    private DictService dictService;

    @Override
    @ApiOperation("查询指定码信息")
    @RequestMapping(value = "/dict", method = {RequestMethod.GET})
    public RestResponse<DictDto> getDict(@RequestParam(value = "path") String path) {
        DictDomain dict = dictService.getDictByPath(path).orElse(null);
        return new RestResponseBuilder().success(dict);
    }

    @Override
    @ApiOperation("查询指定码的所有子节点")
    @RequestMapping(value = "/dict/subs", method = {RequestMethod.GET})
    public RestResponse<List<DictDto>> getSubDicts(@RequestParam(value = "path") String path) {
        List<DictDomain> dicts = dictService.findSubDicts(path);
        return new RestResponseBuilder().success(dicts);
    }

    @Override
    @ApiOperation("根据状态查询指定码的所有子节点")
    @RequestMapping(value = "/dict/subsByStatus", method = {RequestMethod.GET})
    public RestResponse<List<DictDto>> getSubDictsByStatus(@RequestParam(value = "path") String path) {
        List<DictDomain> dicts = dictService.findSubDictsByStatus(path);
        return new RestResponseBuilder().success(dicts);
    }

    @Override
    @ApiOperation("清空码表缓存")
    @RequestMapping(value = "/dict/cache", method = {RequestMethod.DELETE})
    public RestResponse<Void> clearCache() {
        dictService.clear();
        return new RestResponseBuilder().success(null);
    }

    @Override
    @ApiOperation("查询所有省")
    @RequestMapping(value = "/area/province", method = {RequestMethod.GET})
    public RestResponse<List<Map<String, String>>> getProvinces() {
        List<DictDomain> dicts = dictService.findSubDicts(DictDomain.AREA_PATH);

        return new RestResponseBuilder().success(this.dictToMap(dicts));
    }

    @Override
    @ApiOperation("查询指定省下的市")
    @RequestMapping(value = "/area/{code}/city", method = {RequestMethod.GET})
    public RestResponse<List<Map<String, String>>> getCities(@PathVariable("code") String provinceCode) {
        List<DictDomain> dicts = dictService.findSubDicts(DictDomain.AREA_PATH + DictDomain.PATH_SEPARATOR + provinceCode);

        return new RestResponseBuilder().success(this.dictToMap(dicts));

    }

    @Override
    @ApiOperation("查询指定市下的区")
    @RequestMapping(value = "/area/{code}/zone", method = {RequestMethod.GET})
    public RestResponse<List<Map<String, String>>> getZones(@PathVariable("code") String cityCode) {
        String provinceCode = cityCode.substring(0, 2) + "0000";
        List<DictDomain> dicts = dictService.findSubDicts(DictDomain.AREA_PATH + DictDomain.PATH_SEPARATOR + provinceCode + DictDomain.PATH_SEPARATOR + cityCode);

        return new RestResponseBuilder().success(this.dictToMap(dicts));
    }

    @Override
    @ApiOperation("根据卡bin查询银行卡信息")
    @RequestMapping(value = "/bankInfo/{cardBin}", method = RequestMethod.GET)
    public RestResponse<DictDomain> getBankInfoByBin(@PathVariable(value = "cardBin") String cardBin) {
        Optional<DictDomain> cardBinDictOp = dictService.getDictByPath(DictDomain.BANK_CARD_BIN_PATH + cardBin);
        DictDomain cardBinDict = cardBinDictOp.orElseThrow(() -> new RestException(NkaError.NND_0337));
        //还要查询一下是否在银行支持列表范围内
        Optional<DictDomain> bankCodeDictOp = dictService.getDictByPath(DictDomain.BANK_CODE_PATH + cardBinDict.getDictValue2());
        if (!bankCodeDictOp.isPresent()) {
            throw new RestException(NkaError.NND_0337);
        }
        return new RestResponseBuilder<DictDomain>().success(cardBinDict);
    }

    @Override
    @RequestMapping(value = "/bankCodes", method = RequestMethod.GET)
    public RestResponse<List<DictDomain>> getBankCodes() {
        List<DictDomain> bankCodes = dictService.findSubDicts("/BANK_CODE");
        return new RestResponseBuilder<>().success(bankCodes);
    }

    private List<Map<String, String>> dictToMap(List<DictDomain> dicts) {
        List<Map<String, String>> list = new ArrayList<>();
        for (DictDomain dict : dicts) {
            Map<String, String> map = new HashMap<>(2);
            map.put("code", dict.getDictKey());
            map.put("name", dict.getDictName());
            list.add(map);
        }
        return list;
    }

}
