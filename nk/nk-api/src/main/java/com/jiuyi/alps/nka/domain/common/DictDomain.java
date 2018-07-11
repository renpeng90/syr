package com.jiuyi.alps.nka.domain.common;


import common.domain.BaseDomain;

/**
 * 字典信息 Created by zhangyibo on 2017/2/27.
 */
public class DictDomain extends BaseDomain {
    public static final String PATH_SEPARATOR = "/";
    /**
     * 省市县字典路径
     */
    public static final String AREA_PATH = "/AREA";
    /**
     * 业务字典路径
     */
    public static final String BUSINESS_PATH = "/BUSINESS/";

    /**
     * 银行卡字典路径
     */
    public static final String BANK_CODE_PATH = "/BANK_CODE/";

    /**
     * 银行卡bin字典
     */
    public static final String BANK_CARD_BIN_PATH = "/BANK_CARD_BIN/";

    /**
     * 二维码海报配置
     */
    public static final String QR_CODE_POSTER_CONFIG_PATH = "/QR_CODE_POSTER_CONFIG";

    public static final int STATUS_ENABLED = 1;
    public static final int STATUS_DISABLED = 0;

    /**
     * 字典Key
     */
    private String dictKey;
    /**
     * 字典名称
     */
    private String dictName;
    /**
     * 值1
     */
    private String dictValue1;
    /**
     * 值2
     */
    private String dictValue2;
    /**
     * 值3
     */
    private String dictValue3;
    /**
     * 值4
     */
    private String dictValue4;
    /**
     * 值5
     */
    private String dictValue5;
    /**
     * 父节点path
     */
    private String parentPath;
    /**
     * 全路径
     */
    private String path;
    /**
     * 排序字段
     */
    private Integer sort;
    /**
     * 描述
     */
    private String note;
    /**
     * 状态
     */
    private Integer status;

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictValue1() {
        return dictValue1;
    }

    public void setDictValue1(String dictValue1) {
        this.dictValue1 = dictValue1;
    }

    public String getDictValue2() {
        return dictValue2;
    }

    public void setDictValue2(String dictValue2) {
        this.dictValue2 = dictValue2;
    }

    public String getDictValue3() {
        return dictValue3;
    }

    public void setDictValue3(String dictValue3) {
        this.dictValue3 = dictValue3;
    }

    public String getDictValue4() {
        return dictValue4;
    }

    public void setDictValue4(String dictValue4) {
        this.dictValue4 = dictValue4;
    }

    public String getDictValue5() {
        return dictValue5;
    }

    public void setDictValue5(String dictValue5) {
        this.dictValue5 = dictValue5;
    }

    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "dictKey='" + dictKey + '\'' +
                ", dictName='" + dictName + '\'' +
                ", dictValue1='" + dictValue1 + '\'' +
                ", dictValue2='" + dictValue2 + '\'' +
                ", dictValue3='" + dictValue3 + '\'' +
                ", dictValue4='" + dictValue4 + '\'' +
                ", dictValue5='" + dictValue5 + '\'' +
                ", parentPath='" + parentPath + '\'' +
                ", path='" + path + '\'' +
                ", sort=" + sort +
                ", note='" + note + '\'' +
                ", status=" + status +
                '}';
    }


}
