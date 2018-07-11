package common.dto;

import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lixiaolei on 2017/3/2.
 */
public class PageableDto<T> implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    // 当前页的起始值
    private Integer offset = 0;
    // 每页显示的总条数,默认15条
    private Integer limit = 15;
    // 排序字段
    private String sort;
    // 升序/降序
    private String order;
    //总页数
    private long totalPages;
    // 总条数
    private long total;
    // 分页结果
    private List<T> rows;
    
    public Integer getOffset() {
        return offset;
    }
    
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getLimit() {
        return limit;
    }
    
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public String getSort() {
        return sort;
    }
    
    public void setSort(String sort) {
        this.sort = sort;
    }
    
    public String getOrder() {
        return order;
    }
    
    public void setOrder(String order) {
        this.order = order;
    }
    
    public long getTotalPages() {
        return totalPages;
    }
    
    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }
    
    public long getTotal() {
        return total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }
    
    public List<T> getRows() {
        return rows;
    }
    
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
    
    public void setRowsPlus(List<T> rows) {
        if (CollectionUtils.isEmpty(this.rows)) {
            this.setRows(rows);
        } else {
            this.rows.addAll(rows);
        }
    }
}
