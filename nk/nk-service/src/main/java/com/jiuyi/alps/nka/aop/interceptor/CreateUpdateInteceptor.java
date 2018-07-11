package com.jiuyi.alps.nka.aop.interceptor;

import common.domain.BaseDomain;
import common.util.date.DateUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Properties;

/**
 * @author WangGang
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
@Component
public class CreateUpdateInteceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        Object param = invocation.getArgs()[1];
        if (param instanceof BaseDomain) {
            MappedStatement ms = (MappedStatement) args[0];
            if (SqlCommandType.INSERT.equals(ms.getSqlCommandType())) {
                if (StringUtils.isEmpty(((BaseDomain) param).getCreateTime())) {
                    ((BaseDomain) param).setCreateTime(DateUtil.getCurrentDateTime19());
                }else{
                    ((BaseDomain) param).setUpdateTime(((BaseDomain) param).getCreateTime());
                }
            } else if (SqlCommandType.UPDATE.equals(ms.getSqlCommandType())) {
                if (StringUtils.isEmpty(((BaseDomain) param).getUpdateTime())) {
                    ((BaseDomain) param).setUpdateTime(DateUtil.getCurrentDateTime19());
                }else {
                    ((BaseDomain) param).setUpdateTime(((BaseDomain) param).getUpdateTime());
                }
            }
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
        throw new UnsupportedOperationException();
    }
}
