package com.tongtu.ncgl.jh.services.postgres.impl;

import com.tongtu.ncgl.base.bean.Pagination;
import com.tongtu.ncgl.base.util.XmType;
import com.tongtu.ncgl.jh.beans.plan.PlanQuery;
import com.tongtu.ncgl.jh.beans.plan.Plandetail;
import com.tongtu.ncgl.jh.repository.postgres.JTLNDJHRepository;
import com.tongtu.ncgl.jh.repository.postgres.JTXMJBXXRepository;
import com.tongtu.ncgl.jh.services.postgres.IJsgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("plandetailService")
@Transactional
@XmType(XmType.Type.Road)
public class RoadPlandetailService extends PlandetailService {

    @Autowired
    JTXMJBXXRepository jtxmjbxxRepository;
    @Autowired
    JTLNDJHRepository jtlndjhRepository;
    @Autowired
    @XmType(XmType.Type.Road)
    IJsgmService roadJsgmService;


    public Pagination<Plandetail> queryPlandetail(PlanQuery query, Pageable page) {
        return null;
    }
}
