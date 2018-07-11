package com.jiuyi.alps.nka.dao.common;

import com.jiuyi.alps.nka.domain.common.DictDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by zhangyibo on 2017/2/27.
 */
@Mapper
public interface DictDao {
    @Select({"select * from nnd_dict where path=#{path} and status=1"})
    DictDomain selectByPath(String path);

    @Select({"select * from nnd_dict where parent_path=#{path} and status=1"})
    List<DictDomain> selectSubDicts(String path);

    @Select({"select * from nnd_dict where parent_path=#{path}"})
    List<DictDomain> selectSubDictsByStatus(String path);


    @Select({"select dict_name from nnd_dict where dict_key=#{dictKey} and status=1"})
    String selectNameByKey(String dictKey);
}
