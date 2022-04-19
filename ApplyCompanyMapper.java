package com.xakr.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xakr.controller.applyCompany.params.ApplyCompanyParam;
import com.xakr.mybatis.model.ApplyCompany;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 申请公司 Mapper 接口
 * </p>
 *
 * @author wr
 * @since 2021-08-05
 */
@Component
public interface ApplyCompanyMapper extends BaseMapper<ApplyCompany> {

    /**
     * 申请企业数量
     * @param params params
     * @return 数量
     */
    int loadApplyCompanyListCount(ApplyCompanyParam params);

    /**
     * 申请企业列表
     * @param params params
     * @return list
     */
    List<ApplyCompany> loadApplyCompanyList(ApplyCompanyParam params);
}
