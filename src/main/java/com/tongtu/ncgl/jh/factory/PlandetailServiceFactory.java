package com.tongtu.ncgl.jh.factory;

import com.tongtu.ncgl.base.util.XmType;
import com.tongtu.ncgl.jh.services.postgres.IPlandetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlandetailServiceFactory {
    @Autowired
    @XmType(XmType.Type.Road)
    IPlandetailService roadPlandetailService;



    public IPlandetailService plandetailService(String xmlxdm) {
        if (xmlxdm.equals("10") || xmlxdm.equals("90") || xmlxdm.equals("06") ||xmlxdm.equals("09") ||xmlxdm.equals("07") || xmlxdm.equals("12")) {
            return roadPlandetailService;
        } else if (xmlxdm.equals("13")) {
            return null;
        } else if (xmlxdm.equals("30")) {
            return null;
        } else if (xmlxdm.equals("41")) {
            return null;
        } else if (xmlxdm.equals("20")||xmlxdm.equals("22")) {
            return null;
        }
        return null;
    }
}
