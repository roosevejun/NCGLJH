package com.tongtu.ncgl.jh.services;

import com.tongtu.ncgl.base.bean.Pagination;
import com.tongtu.ncgl.jh.beans.plan.PlanQuery;
import com.tongtu.ncgl.jh.beans.plan.Plandetail;
import org.springframework.data.domain.Pageable;

public interface IPlandetailService {
    /**
     * 根据计划项目编码获取相应计划信息
     * @param xmcode 项目编码
     * @return 成功与否
     */
    public Plandetail findPlandetailByXmCode(String xmcode);
    /**
     * 备案项目
     * @param xmcode 项目编码
     * @return 成功与否
     */
    public Boolean recordPlandetail(String xmcode);
    /**
     * 撤销项目备案
     * @param xmcode 项目编码
     * @return 成功与否
     */
    public Boolean revokeRecordPlandetail(String xmcode);

    /**
     * 根据计划项目编码获取相应计划信息
     * @param query 项目编码
     * @return 成功与否
     */
    public Pagination<Plandetail> queryPlandetail(PlanQuery query, Pageable page);

}
