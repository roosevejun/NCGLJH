package com.tongtu.ncgl.base.util;


import com.tongtu.ncgl.base.bean.UUIDCRowIDEntity;
import com.tongtu.ncgl.base.bean.UUIDEntity;
import com.tongtu.ncgl.base.bean.UUIDXMIDEntity;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: ahtt_nsj
 * Date: 13-6-26
 * Time: 上午10:20
 * To change this template use File | Settings | File Templates.
 */
public class UUIDGenerator implements IdentifierGenerator, Configurable {

    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {

    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) throws HibernateException {
        if (object instanceof UUIDEntity) {
            if (((UUIDEntity) object).getId() == null) {
                return UUID.randomUUID().toString();
            } else {
                return ((UUIDEntity) object).getId();
            }
        }
        if (object instanceof UUIDCRowIDEntity) {
            if (((UUIDCRowIDEntity) object).getCrowid() == null) {
                return UUID.randomUUID().toString();
            } else {
                return ((UUIDCRowIDEntity) object).getCrowid();
            }
        }
        if (object instanceof UUIDXMIDEntity) {
            if (((UUIDXMIDEntity) object).getXmid()== null) {
                return UUID.randomUUID().toString();
            } else {
                return ((UUIDXMIDEntity) object).getXmid();
            }
        }
        return null;
    }
}
