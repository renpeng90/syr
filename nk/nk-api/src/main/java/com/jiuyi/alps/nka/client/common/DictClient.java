package com.jiuyi.alps.nka.client.common;

import com.jiuyi.alps.nka.domain.common.DictDomain;
import com.jiuyi.alps.nka.dto.common.DictDto;
import common.rest.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangyibo on 2017/12/8.
 */
@FeignClient(value = "nnd-service")
public interface DictClient {

    @RequestMapping(value = "/dict", method = {RequestMethod.GET})
    RestResponse<DictDto> getDict(@RequestParam(value = "path") String path);

    @RequestMapping(value = "/dict/subs", method = {RequestMethod.GET})
    RestResponse<List<DictDto>> getSubDicts(@RequestParam(value = "path") String path);

    @RequestMapping(value = "/dict/subsByStatus", method = {RequestMethod.GET})
    RestResponse<List<DictDto>> getSubDictsByStatus(@RequestParam(value = "path") String path);

    @RequestMapping(value = "/dict/cache", method = {RequestMethod.DELETE})
    RestResponse<Void> clearCache();

    @RequestMapping(value = "/area/province", method = {RequestMethod.GET})
    RestResponse<List<Map<String, String>>> getProvinces();

    @RequestMapping(value = "/area/{code}/city", method = {RequestMethod.GET})
    RestResponse<List<Map<String, String>>> getCities(@PathVariable("code") String provinceCode);

    @RequestMapping(value = "/area/{code}/zone", method = {RequestMethod.GET})
    RestResponse<List<Map<String, String>>> getZones(@PathVariable("code") String cityCode);

    @RequestMapping(value = "/bankInfo/{cardBin}", method = RequestMethod.GET)
    RestResponse<DictDomain> getBankInfoByBin(@PathVariable(value = "cardBin") String cardBin);

    @RequestMapping(value = "/bankCodes", method = RequestMethod.GET)
    RestResponse<List<DictDomain>> getBankCodes();

}
