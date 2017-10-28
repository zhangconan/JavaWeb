package com.zkn.springmvc.annotationanalysis.result;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create By ZKN
 *
 * @author zhangkenan
 * @date 2017/10/28
 * @time 下午3:05
 */
@ToString
public class PageDataResult<T> extends BaseResult implements Serializable {

    private static final long serialVersionUID = 6756235617055382848L;

    private Map<String, Object> data = new HashMap<>(2);
    /**
     * 分页信息
     */
    private PageInfoVO page = new PageInfoVO();

    public PageDataResult() {
        data.put("page", page);
    }

    /**
     * 每页显示条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        page.setPageSize(pageSize == null ? 0 : pageSize);
    }

    /**
     * 当前页
     *
     * @param currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        page.setCurrentPage(currentPage == null ? 0 : currentPage);
    }

    /**
     * 数据总条数
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        page.setTotalCount(totalCount == null ? 0 : totalCount);
    }

    /**
     * 设置结果集
     *
     * @param listData
     */
    public void setListData(List<T> listData) {
        data.put("data", listData);
    }

    @Data
    private class PageInfoVO implements Serializable {

        private static final long serialVersionUID = -3808286335434311717L;
        /**
         * 每页显示条数
         */
        private Integer pageSize;
        /**
         * 当前页数
         */
        private Integer currentPage;
        /**
         * 数据总条数
         */
        private Long totalCount;
    }
}
