package com.jiuyi.alps.nka.util;

import java.math.BigDecimal;

/**
 *
 * @author zhangyibo
 * @date 2017/11/7
 */
public final class AmountUtil {

    public static final Integer FEN_TO_YUAN = 1;
    public static final Integer YUAN_TO_FEN = 2;

    /**
     *
     * @param amount
     * @return
     */
    public static final BigDecimal amtUnitTransfer(Integer amount,Integer type){
        if(FEN_TO_YUAN.equals(type)){
            return BigDecimal.valueOf(amount).divide(BigDecimal.valueOf(100),2,BigDecimal.ROUND_HALF_UP);
        }else{
            return BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(100));
        }

    }

    /**
     *
     * @param amount
     * @return
     */
    public static final BigDecimal amtUnitTransfer(Double amount,Integer type){
        if(FEN_TO_YUAN.equals(type)){
            return BigDecimal.valueOf(amount).divide(BigDecimal.valueOf(100),2,BigDecimal.ROUND_HALF_UP);
        }else{
            return BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(100));
        }
    }

    public static final Double fenToYuan(Integer amount){
        return amtUnitTransfer(amount,FEN_TO_YUAN).doubleValue();
    }

    public static final Integer yuanToFen(Double amount){
        return amtUnitTransfer(amount,YUAN_TO_FEN).intValue();
    }
    
    /**
     * 计算本利
     * @param principal 本金
     * @param rate 利率
     * @param days 天数
     * @return
     */
    public static Integer calcPrincipalInterest(Integer principal, BigDecimal rate, Integer days) {
        return principal + calcInterest(principal, rate, days);
    }
    
    /**
     * 利息计算
     * 算法 ： 本金 * 利率（年）/ 一年的天数（365） * 天数
     *
     * @param principal   本金
     * @param rate      利率
     * @param days      天数
     */
    public static Integer calcInterest(Integer principal, BigDecimal rate, Integer days) {
        Integer interest = new BigDecimal(principal).multiply(rate).multiply(new BigDecimal(days))
                .divide(new BigDecimal(365), 0, BigDecimal.ROUND_DOWN).intValue();
        return interest;
    }
    /**
     * 利息计算 按月
     * 算法 ： 本金 * 利率（年）* 月份/ 12 月
     *
     * @param principal   本金
     * @param rate      利率
     * @param months      天数
     */
    public static Integer calcInterestByMonth(Integer principal, BigDecimal rate, Integer months) {
        Integer interest = new BigDecimal(principal).multiply(rate).multiply(new BigDecimal(months))
                .divide(new BigDecimal(12), 0, BigDecimal.ROUND_DOWN).intValue();
        return interest;
    }

}
