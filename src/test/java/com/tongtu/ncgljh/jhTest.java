package com.tongtu.ncgljh;

import com.tongtu.ncgl.base.util.XmType;
import com.tongtu.ncgl.jh.beans.orm.ItemNdjh;
import com.tongtu.ncgl.jh.beans.plan.Plandetail;
import com.tongtu.ncgl.jh.configurer.db.PostgresConfig;
import com.tongtu.ncgl.jh.configurer.db.SqlserverConfig;
import com.tongtu.ncgl.jh.factory.PlandetailServiceFactory;
import com.tongtu.ncgl.jh.services.postgres.IPlandetailService;
import com.tongtu.ncgl.jh.services.postgres.impl.PlandetailService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@ContextConfiguration(classes = {PostgresConfig.class, DatastoreFactoryConfig.class, JsonConfig.class})
@ContextConfiguration(classes = {PostgresConfig.class})
@ComponentScan("com.tongtu.ncgl.jh.factory")
@ComponentScan("com.tongtu.ncgl.jh.repository.postgres")
@ComponentScan("com.tongtu.ncgl.jh.services.postgres")
@RunWith(SpringRunner.class)
public class jhTest {
    public static Logger loggerInfo = LogManager.getLogger("info");
    @Autowired
    PlandetailServiceFactory plandetailServiceFactory;
//    @Autowired
//    @XmType(XmType.Type.Road)
//    private IPlandetailService planService;
    @Test
    public void test() {

        Plandetail  plandetail=  plandetailServiceFactory.plandetailService("09").findPlandetailByXmCode("C8A306C2-AB79-4B00-9067-4ADD80C1AE3F");
        for(ItemNdjh ndjh:plandetail.getNdjh())
        loggerInfo.info(ndjh.getXmid());
        for(Object jsgm:plandetail.getJsgmxx().getJsgmss())
        loggerInfo.info(jsgm.getClass());
    }
}
