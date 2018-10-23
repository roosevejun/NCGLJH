package com.tongtu.ncgl.jh.services.impl;

import com.tongtu.ncgl.base.bean.Pagination;
import com.tongtu.ncgl.jh.beans.plan.PlanQuery;
import com.tongtu.ncgl.jh.beans.plan.Plandetail;
import com.tongtu.ncgl.jh.repository.postgres.JTLNDJHRepository;
import com.tongtu.ncgl.jh.repository.postgres.JTXMJBXXRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

public class RoadPlandetailService extends PlandetailService {

    @Autowired
    JTXMJBXXRepository jtxmjbxxRepository;
    @Autowired
    JTLNDJHRepository jtlndjhRepository;

    @Override
    public Plandetail findPlandetailByXmCode(String xmcode) {
        Plandetail plandetail = new Plandetail();
        plandetail.setXmjbxx(jtxmjbxxRepository.findXmbjxxByXmid(xmcode));
        plandetail.setNdjh(jtlndjhRepository.findItemNdjhByXmid(xmcode));
        plandetail.setNdjh(jtlndjhRepository.findItemNdjhByXmid(xmcode));
        plandetail.setNdjh(jtlndjhRepository.findItemNdjhByXmid(xmcode));
        return plandetail;
    }


    @Override
    public Pagination<Plandetail> queryPlandetail(PlanQuery query, Pageable page) {
        return null;
    }
}
