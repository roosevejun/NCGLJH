package com.tongtu.ncgl.jh.services.postgres;

import com.tongtu.ncgl.jh.beans.plan.JSGMXX;

public interface IJsgmService {
    public JSGMXX findJsgmByXmid(String xmid);

    public Object findItemByCrowid(String crowid);
}
