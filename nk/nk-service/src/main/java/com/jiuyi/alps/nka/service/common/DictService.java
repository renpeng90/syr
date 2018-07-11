package com.jiuyi.alps.nka.service.common;

import com.alibaba.fastjson.JSON;
import com.jiuyi.alps.nka.dao.common.DictDao;
import com.jiuyi.alps.nka.domain.common.DictDomain;
import common.cache.LRUCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * 字段服务
 *
 * @author zhangyibo
 */
@Service
public class DictService {

    private static final Logger logger = LoggerFactory.getLogger(DictService.class);

    private static final int MAX_CACHE_CAPACITY = 2 << 8;

    private static final LRUCache<String, DictDomain> CACHE = new LRUCache<>(MAX_CACHE_CAPACITY);

    @Autowired
    private DictDao dictDao;

    /**
     * 关于为什么返回Optinal: 可以方便的表述在返回null的情况下程序该如何处理 1.如果为null 就给一个默认值 Optional.orElse(defaul Value);
     * 2.如果为null 就抛异常 Optional.orElseThrow(some Exception); 3.如果为null 就返回null Optional.get();
     */
    public Optional<DictDomain> getDictByPath(String path) {
        logger.info("DictService.getDictByPath(path={})", path);

        DictDomain dict = CACHE.get(path);

        if (dict == null) {
            dict = dictDao.selectByPath(path);
            if (dict == null) {
                Optional.ofNullable(dict);
            } else {
                CACHE.put(path, dict);
            }
        }
        logger.info("DictService.getDictByPath.result={}", JSON.toJSONString(dict));

        return Optional.ofNullable(dict);
    }

    public String buildPath(String... pathEles) {
        StringBuilder path = new StringBuilder();
        for (String pathEle : pathEles) {
            path.append(pathEle);
        }
        return path.toString();
    }


    public void clear() {
        CACHE.clear();
    }

    public List<DictDomain> findSubDicts(String parentPath) {
        logger.info("DictService.findSubDicts(parentPath={})", parentPath);

        List<DictDomain> dicts = dictDao.selectSubDicts(parentPath);

        if (dicts == null || dicts.isEmpty()) {
            return Collections.emptyList();
        }

        if (dicts.stream().allMatch(dict -> dict.getSort() != null)) {
            dicts.sort(Comparator.comparing(DictDomain::getSort));
        }

        logger.info("findSubDicts.result={}", JSON.toJSONString(dicts));

        return dicts;
    }

    public List<DictDomain> findSubDictsByStatus(String parentPath) {
        logger.info("DictService.findSubDicts(parentPath={})", parentPath);

        List<DictDomain> dicts = dictDao.selectSubDictsByStatus(parentPath);

        if (dicts == null || dicts.isEmpty()) {
            return Collections.emptyList();
        }

        if (dicts.stream().allMatch(dict -> dict.getSort() != null)) {
            dicts.sort(Comparator.comparing(DictDomain::getSort));
        }

        logger.info("findSubDicts.result={}", JSON.toJSONString(dicts));

        return dicts;
    }

}
