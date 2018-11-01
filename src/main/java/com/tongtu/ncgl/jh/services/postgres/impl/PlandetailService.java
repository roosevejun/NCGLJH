package com.tongtu.ncgl.jh.services.postgres.impl;

import com.tongtu.ncgl.base.bean.Pagination;
import com.tongtu.ncgl.jh.beans.plan.PlanQuery;
import com.tongtu.ncgl.jh.beans.plan.Plandetail;
import com.tongtu.ncgl.jh.factory.JsgmServiceFactory;
import com.tongtu.ncgl.jh.repository.postgres.JTLNDJHRepository;
import com.tongtu.ncgl.jh.repository.postgres.JTXMJBXXRepository;
import com.tongtu.ncgl.jh.services.postgres.IJsgmService;
import com.tongtu.ncgl.jh.services.postgres.IPlandetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;


public abstract class PlandetailService implements IPlandetailService {

    @Autowired
    JTXMJBXXRepository jtxmjbxxRepository;
    @Autowired
    JTLNDJHRepository jtlndjhRepository;
    @Autowired
    JsgmServiceFactory jsgmServiceFactory;

    @Override
    public Plandetail findPlandetailByXmCode(String xmcode) {
        Plandetail plandetail = new Plandetail();
        plandetail.setXmjbxx(jtxmjbxxRepository.findXmbjxxByXmid(xmcode));
        plandetail.setNdjh(jtlndjhRepository.findItemNdjhByXmid(xmcode));
        IJsgmService jsgmService = jsgmServiceFactory.jsgmService(plandetail.getXmjbxx().getXmlxdm());
        plandetail.setJsgmxx(jsgmService.findJsgmByXmid(xmcode));
        return plandetail;
    }

    @Override
    public Boolean recordPlandetail(String xmcode) {
        return null;
    }

    @Override
    public Boolean revokeRecordPlandetail(String xmcode) {
        return null;
    }

    @Override
    public Pagination<Plandetail> queryPlandetail(PlanQuery query, Pageable page) {
        return null;
    }
}
