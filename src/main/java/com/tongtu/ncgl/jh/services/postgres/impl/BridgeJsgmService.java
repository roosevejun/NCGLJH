package com.tongtu.ncgl.jh.services.postgres.impl;

import com.tongtu.ncgl.base.util.XmType;
import com.tongtu.ncgl.jh.beans.plan.JSGMXX;
import com.tongtu.ncgl.jh.repository.postgres.ItemQljsgmRepository;
import com.tongtu.ncgl.jh.services.postgres.IJsgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@XmType(XmType.Type.Bridge)
public class BridgeJsgmService implements   IJsgmService {
    @Autowired
    ItemQljsgmRepository itemRepository;


    @Override
    public JSGMXX findJsgmByXmid(String xmid) {
        return new JSGMXX(this.itemRepository.findByXmid(xmid));
    }

    @Override
    public Object findItemByCrowid(String crowid) {
        return itemRepository.findItemByCrowid(crowid);
    }
}
