package com.tongtu.ncgl.jh.beans.orm;

import com.tongtu.ncgl.base.bean.TableChild;
import com.tongtu.ncgl.base.bean.TreeStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:ahtt_nsj
 * 创建时间:13-11-4 上午11:23
 * 修改人：
 * 修改时间:
 *
 * @版本：V
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Table(name = "xt_xzqh", schema = "public")
@Entity
public class XtXzqh implements Serializable {
    @javax.persistence.Column(name = "id")
    @Id
    private int id;
    @javax.persistence.Column(name = "xzqh")
    @Basic
    private String xzqh;
    @javax.persistence.Column(name = "xzqhmc")
    @Basic
    private String xzqhmc;
    @javax.persistence.Column(name = "sjxzqh")
    @Basic
    private Integer sjxzqh;
    @javax.persistence.Column(name = "xzqhjb")
    @Basic
    private Integer xzqhjb;
    @javax.persistence.Column(name = "sortnum")
    @Basic
    private Integer sortnum;
    @javax.persistence.Column(name = "sfsdbsq")
    @Basic
    private Integer sfsdbsq;
    @javax.persistence.Column(name = "xzqhjbhy")
    @Basic
    private String xzqhjbhy;
    @javax.persistence.Column(name = "qhlx")
    @Basic
    private String qhlx;

    public TableChild toTableChild() {
        return new TableChild(this.xzqh.trim(), this.xzqhmc.trim(), "xzqh", TreeStyleEnum.jg.getValue());
    }
}
