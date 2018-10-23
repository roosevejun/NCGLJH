package com.tongtu.ncgl.jh.services.impl;

import com.tongtu.ncgl.base.bean.Pagination;
import com.tongtu.ncgl.jh.beans.plan.PlanQuery;
import com.tongtu.ncgl.jh.beans.plan.Plandetail;
import org.springframework.data.domain.Pageable;

public class UnsafeBridgePlandetailService  extends PlandetailService {
    @Override
    public Plandetail findPlandetailByXmCode(String xmcode) {
        return null;
    }


    @Override
    public Pagination<Plandetail> queryPlandetail(PlanQuery query, Pageable page) {
        return null;
    }
}
