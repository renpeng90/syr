package com.jiuyi.alps.nka.error;


import common.rest.error.ServiceError;

/**
 * @author zhangyibo
 */
public class NkaError extends ServiceError {
    public NkaError(String code, String message) {
        super(code, message);
    }

    public static final NkaError NND_0101 = new NkaError("0101", "参数不能为空");
    public static final NkaError NND_0102 = new NkaError("0102", "参数不合法");
    public static final NkaError NND_0103 = new NkaError("0103", "数据重复，无法存储");
    public static final NkaError NND_0104 = new NkaError("0104", "不存在的字典信息");
    public static final NkaError NND_0105 = new NkaError("0105", "数据有误");
    public static final NkaError NND_0106 = new NkaError("0106", "数据状态不正确");

    public static final NkaError NND_0201 = new NkaError("0201", "返利账户不存在");
    public static final NkaError NND_0202 = new NkaError("0202", "返利账户余额不足");
    public static final NkaError NND_0203 = new NkaError("0203", "请勿重复邀请");
    public static final NkaError NND_0204 = new NkaError("0204", "该客户没有返利成就");
    public static final NkaError NND_0205 = new NkaError("0205", "数据重复，无法存储");
    public static final NkaError NND_0206 = new NkaError("0206", "，未设置交易密码无法提现");
    public static final NkaError NND_0207 = new NkaError("0207", "客户还未绑卡，请绑卡后再操作提现");
    public static final NkaError NND_0208 = new NkaError("0208", "交易密码不正确");
    public static final NkaError NND_0209 = new NkaError("0209", "返利余额不满足最低提现金额要求");
    public static final NkaError NND_0210 = new NkaError("0210", "客户还未实名认证");
    public static final NkaError NND_0211 = new NkaError("0211", "邀请失败");
    public static final NkaError NND_0212 = new NkaError("0212", "员工职位不符");
    public static final NkaError NND_0213 = new NkaError("0213", "不存在的员工");

    public static final NkaError NND_0301 = new NkaError("0301", "客户不存在");
    public static final NkaError NND_0302 = new NkaError("0302", "请勿重复设置交易密码");
    public static final NkaError NND_0303 = new NkaError("0303", "交易密码错误");
    public static final NkaError NND_0304 = new NkaError("0304", "请勿重复设置登录密码");
    public static final NkaError NND_0305 = new NkaError("0305", "登录密码错误");
    public static final NkaError NND_0306 = new NkaError("0306", "客户已存在");
    public static final NkaError NND_0307 = new NkaError("0307", "账号已被禁用");
    public static final NkaError NND_0308 = new NkaError("0308", "登录密码格式错误");
    public static final NkaError NND_0309 = new NkaError("0309", "交易密码格式错误");
    public static final NkaError NND_0310 = new NkaError("0310", "验证码错误");
    public static final NkaError NND_0311 = new NkaError("0311", "无效邀请码");
    public static final NkaError NND_0312 = new NkaError("0312", "修改银行卡失败");
    public static final NkaError NND_0313 = new NkaError("0313", "手机号非本人实名");
    public static final NkaError NND_0314 = new NkaError("0314", "银行卡绑定失败，请更换本人实名且未过有效期的一类借记卡");
    public static final NkaError NND_0315 = new NkaError("0315", "生成合同失败");
    public static final NkaError NND_0316 = new NkaError("0316", "开户失败");
    public static final NkaError NND_0317 = new NkaError("0317", "请求账务系统出错");
    public static final NkaError NND_0318 = new NkaError("0318", "请求认证支付-绑卡失败");
    public static final NkaError NND_0319 = new NkaError("0319", "请求认证支付-预支付失败");
    public static final NkaError NND_0320 = new NkaError("0320", "请求认证支付-确认支付失败");
    public static final NkaError NND_0321 = new NkaError("0321", "无效客户");
    public static final NkaError NND_0322 = new NkaError("0322", "数据处理出错");
    public static final NkaError NND_0323 = new NkaError("0323", "存在处理中交易,请稍后重试");
    public static final NkaError NND_0324 = new NkaError("0324", "检测到您未开户，如已开户，请稍后重试");
    public static final NkaError NND_0325 = new NkaError("0325", "合同签署失败，请联系客服或稍后重试");
    public static final NkaError NND_0326 = new NkaError("0326", "您最后一期账单已逾期，请进行当期还款操作");
    public static final NkaError NND_0330 = new NkaError("0330", "请勿重复绑卡");
    public static final NkaError NND_0331 = new NkaError("0331", "客户未绑卡");
    public static final NkaError NND_0332 = new NkaError("0332", "登录失效，请重新登录");
    public static final NkaError NND_0333 = new NkaError("0333", "验证码获取失败");
    public static final NkaError NND_0334 = new NkaError("0334", "可用金额不足，无法提现");
    public static final NkaError NND_0335 = new NkaError("0335", "可用金额不满足最低用款金额要求");
    public static final NkaError NND_0336 = new NkaError("0336", "找不到对应的借款产品");
    public static final NkaError NND_0337 = new NkaError("0337", "不支持的银行卡");
    public static final NkaError NND_0338 = new NkaError("0338", "邀请码解析失败");
    public static final NkaError NND_0339 = new NkaError("0339", "暂未授信的客户");
    public static final NkaError NND_0340 = new NkaError("0340", "未查询到对应的推广渠道信息");
    public static final NkaError NND_0341 = new NkaError("0340", "token校验不通过");
    public static final NkaError NND_0342 = new NkaError("0342", "银行卡发卡行与卡号不一致");
    public static final NkaError NND_0343 = new NkaError("0343", "该身份证号已被使用");
    public static final NkaError NND_0344 = new NkaError("0344", "请先通过身份证OCR");
    public static final NkaError NND_0345 = new NkaError("0345", "客户可用积分不足");
    public static final NkaError NND_0346 = new NkaError("0346", "已签到，请明天再来");
    public static final NkaError NND_0347 = new NkaError("0347", "剩余抽奖次数不足");
    public static final NkaError NND_0348 = new NkaError("0348", "今天已经兑换过抽奖，请明天再来");
    public static final NkaError NND_0349 = new NkaError("0349", "不存在的卡类型");
    public static final NkaError NND_0350 = new NkaError("0350", "交易处理中，请勿重复发起");
    public static final NkaError NND_0351 = new NkaError("0351", "交易已成功，请勿重复发起");
    public static final NkaError NND_0352 = new NkaError("0352", "更新交易状态异常，顺序错误");
    public static final NkaError NND_0353 = new NkaError("0353", "申请件当前状态不可再次放款");

    public static final NkaError NND_0401 = new NkaError("0401", "芝麻信用授权失败[透传state异常]");
    public static final NkaError NND_0402 = new NkaError("0402", "支付宝账号不存在，请先开通实名认证的支付宝账户");
    public static final NkaError NND_0403 = new NkaError("0403", "请重新登录支付宝再试");
    public static final NkaError NND_0404 = new NkaError("0404", "姓名身份证不匹配，请输入正确的身份信息");
    public static final NkaError NND_0405 = new NkaError("0405", "芝麻信用系统繁忙，请稍后再试");
    public static final NkaError NND_0406 = new NkaError("0406", "芝麻信用身份认证初始化异常");
    public static final NkaError NND_0407 = new NkaError("0407", "该用户没有芝麻信用授权码或授权码已过期");
    public static final NkaError NND_0408 = new NkaError("0408", "手机号非本人实名");
    public static final NkaError NND_0409 = new NkaError("0409", "实名认证失败，请重新认证");

    public static final NkaError NND_0501 = new NkaError("0501", "IP地址发送次数超限");

    public static final NkaError NND_0601 = new NkaError("0601", "不存在的合同模板");

    public static final NkaError NND_0701 = new NkaError("0701", "客户资料不全或已过期");
    public static final NkaError NND_0702 = new NkaError("0702", "客户分群策略执行失败");
    public static final NkaError NND_0703 = new NkaError("0703", "存在进行中的自动授信");

    public static final NkaError NND_0801 = new NkaError("0801", "优惠券不可领取");
    public static final NkaError NND_0802 = new NkaError("0802", "优惠券已使用或已过期");
    public static final NkaError NND_0803 = new NkaError("0803", "借还优惠券不能用于还款或还款优惠券不能用于借款");
    public static final NkaError NND_0804 = new NkaError("0804", "使用期数不满住优惠券要求");
    public static final NkaError NND_0805 = new NkaError("0805", "使用额度不满足优惠券要求");
    public static final NkaError NND_0806 = new NkaError("0806", "优惠券获取方式错误");
    public static final NkaError NND_0807 = new NkaError("0807", "优惠券不满足使用条件");


    public static final NkaError NND_9997 = new NkaError("9997", "服务器内部调用异常");
    public static final NkaError NND_9998 = new NkaError("9998", "第三方异常");
    public static final NkaError INTERNAL_ERROR = new NkaError("9999", "未知错误");
}
