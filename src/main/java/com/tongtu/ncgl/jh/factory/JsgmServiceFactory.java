package com.tongtu.ncgl.jh.factory;

import com.tongtu.ncgl.base.util.XmType;
import com.tongtu.ncgl.jh.services.postgres.IJsgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsgmServiceFactory {
    @Autowired
    @XmType(XmType.Type.Road)
    IJsgmService roadJsgmService;
    @Autowired
    @XmType(XmType.Type.Bridge)
    IJsgmService bridgeJsgmService;
    @Autowired
    @XmType(XmType.Type.Ferry)
    IJsgmService ferryJsgmService;
    @Autowired
    @XmType(XmType.Type.Protect)
    IJsgmService protectJsgmService;
    @Autowired
    @XmType(XmType.Type.Station)
    IJsgmService stationJsgmService;


    public IJsgmService jsgmService(String xmlxdm) {
        if (xmlxdm.equals("10") || xmlxdm.equals("90") || xmlxdm.equals("06") ||xmlxdm.equals("09") ||xmlxdm.equals("07") || xmlxdm.equals("12")) {
            return roadJsgmService;
        } else if (xmlxdm.equals("13")) {
            return protectJsgmService;
        } else if (xmlxdm.equals("30")) {
            return ferryJsgmService;
        } else if (xmlxdm.equals("41")) {
            return bridgeJsgmService;
        } else if (xmlxdm.equals("20")||xmlxdm.equals("22")) {
            return stationJsgmService;
        }
        return null;
    }
}
