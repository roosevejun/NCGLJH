package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.base.bean.TableChild;
import com.tongtu.ncgl.base.bean.TreeStyleEnum;
import com.tongtu.ncgl.base.bean.UUIDCRowIDEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:ahtt_nsj
 * 创建时间:13-11-13 下午1:29
 * 修改人：
 * 修改时间:
 *
 * @版本：V
 */

@Table(name = "xt_switch"  ,schema = "public")
@Entity
public class XtSwitch extends UUIDCRowIDEntity {
    private String code;
    private String text;
    private Long type;
    private String describe;
    private String parent;
    private Boolean status;

    @Column(name = "switch_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "switch_data", nullable = true, insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Column(name = "switch_type", nullable = true, insertable = true, updatable = true, precision =2, scale = 0)
    @Basic
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Column(name = "switch_describe", nullable = true, insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Column(name = "switch_parent", nullable = true, insertable = true, updatable = true, length = 36, precision = 36)
    @Basic
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Column(name = "switch_status", nullable = true, insertable = true, updatable = true, precision =1, scale = 0)
    @Basic
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public TableChild toTableChild() {
        return new TableChild(this.code, this.text, this.type.toString(), TreeStyleEnum.jg.getValue());
    }
}
