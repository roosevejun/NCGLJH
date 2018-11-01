
package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.base.bean.UUIDCRowIDEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CROWID" type="{}typeXMID"/>
 *         &lt;element name="XMID" type="{}typeXMID"/>
 *         &lt;element name="LXBM" type="{}typeLXBM"/>
 *         &lt;element name="LXMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QLBM" type="{}typeQLBM"/>
 *         &lt;element name="QLMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QLZXZH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QLCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KJZC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AKJF" type="{}typeAKJF"/>
 *         &lt;element name="AKJFHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QMQK" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QMJK" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SJHZ" type="{}typeSJHZ"/>
 *         &lt;element name="SJHZHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crowid",
    "xmid",
    "lxbm",
    "lxmc",
    "qlbm",
    "qlmc",
    "qlzxzh",
    "qlcd",
    "kjzc",
    "akjf",
    "akjfhy",
    "qmqk",
    "qmjk",
    "sjhz",
    "sjhzhy",
    "bz"
})
@XmlRootElement(name = "item_qljsgm")
@Entity
@Table(name = "table_qljsgm"  ,schema = "public")
public class ItemQljsgm extends UUIDCRowIDEntity {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "LXBM", required = true)
    protected String lxbm;
    @XmlElement(name = "LXMC", required = true)
    protected String lxmc;
    @XmlElement(name = "QLBM", required = true)
    protected String qlbm;
    @XmlElement(name = "QLMC", required = true)
    protected String qlmc;
    @XmlElement(name = "QLZXZH", required = true, defaultValue = "0")
    protected BigDecimal qlzxzh;
    @XmlElement(name = "QLCD", required = true, defaultValue = "0")
    protected BigDecimal qlcd;
    @XmlElement(name = "KJZC", required = true, defaultValue = "0")
    protected BigDecimal kjzc;
    @XmlElement(name = "AKJF", required = true)
    protected String akjf;
    @XmlElement(name = "AKJFHY", required = true)
    protected String akjfhy;
    @XmlElement(name = "QMQK", required = true, defaultValue = "0")
    protected BigDecimal qmqk;
    @XmlElement(name = "QMJK", required = true, defaultValue = "0")
    protected BigDecimal qmjk;
    @XmlElement(name = "SJHZ", required = true)
    protected String sjhz;
    @XmlElement(name = "SJHZHY", required = true)
    protected String sjhzhy;
    @XmlElement(name = "BZ", required = true)
    protected String bz;
    @XmlTransient()
    private ItemXmjbxx xmjbxx;
    /**
     * 获取xmid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmcode", nullable = false,insertable = false, updatable = false, length = 36, precision = 36)
    @Basic
    public String getXmid() {
        return xmid;
    }

    /**
     * 设置xmid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmid(String value) {
        this.xmid = value;
    }

    /**
     * 获取lxbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "lxbm", nullable = false, insertable = true, updatable = true, length = 10, precision = 10)
    @Basic
    public String getLxbm() {
        return lxbm;
    }

    /**
     * 设置lxbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLxbm(String value) {
        this.lxbm = value;
    }

    /**
     * 获取lxmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "lxmc", nullable = false, insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getLxmc() {
        return lxmc;
    }

    /**
     * 设置lxmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLxmc(String value) {
        this.lxmc = value;
    }

    /**
     * 获取qlbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "qlbm", nullable = false, insertable = true, updatable = true, length = 15, precision = 15)
    @Basic
    public String getQlbm() {
        return qlbm;
    }

    /**
     * 设置qlbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQlbm(String value) {
        this.qlbm = value;
    }

    /**
     * 获取qlmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "qlmc", nullable = false, insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getQlmc() {
        return qlmc;
    }

    /**
     * 设置qlmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQlmc(String value) {
        this.qlmc = value;
    }

    /**
     * 获取qlzxzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "qlzxzh", nullable = true, insertable = true, updatable = true, precision = 7, scale = 3)
    @Basic
    public BigDecimal getQlzxzh() {
        return qlzxzh;
    }

    /**
     * 设置qlzxzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQlzxzh(BigDecimal value) {
        this.qlzxzh = value;
    }

    /**
     * 获取qlcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "qlcd", nullable = true, insertable = true, updatable = true, precision = 8, scale = 1)
    @Basic
    public BigDecimal getQlcd() {
        return qlcd;
    }

    /**
     * 设置qlcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQlcd(BigDecimal value) {
        this.qlcd = value;
    }

    /**
     * 获取kjzc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "kjzc", nullable = true, insertable = true, updatable = true, precision = 8, scale = 1)
    @Basic
    public BigDecimal getKjzc() {
        return kjzc;
    }

    /**
     * 设置kjzc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKjzc(BigDecimal value) {
        this.kjzc = value;
    }

    /**
     * 获取akjf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "akjf", nullable = false, insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getAkjf() {
        return akjf;
    }

    /**
     * 设置akjf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkjf(String value) {
        this.akjf = value;
    }

    /**
     * 获取akjfhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "akjfhy", nullable = false, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getAkjfhy() {
        return akjfhy;
    }

    /**
     * 设置akjfhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkjfhy(String value) {
        this.akjfhy = value;
    }

    /**
     * 获取qmqk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "qmqk", nullable = false, insertable = true, updatable = true, precision = 5, scale = 1)
    @Basic
    public BigDecimal getQmqk() {
        return qmqk;
    }

    /**
     * 设置qmqk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQmqk(BigDecimal value) {
        this.qmqk = value;
    }

    /**
     * 获取qmjk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "qmjk", nullable = false, insertable = true, updatable = true, precision = 5, scale = 1)
    @Basic
    public BigDecimal getQmjk() {
        return qmjk;
    }

    /**
     * 设置qmjk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */

    public void setQmjk(BigDecimal value) {
        this.qmjk = value;
    }

    /**
     * 获取sjhz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "sjhz", nullable = false, insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getSjhz() {
        return sjhz;
    }

    /**
     * 设置sjhz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjhz(String value) {
        this.sjhz = value;
    }

    /**
     * 获取sjhzhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "sjhzhy", nullable = false, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getSjhzhy() {
        return sjhzhy;
    }

    /**
     * 设置sjhzhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjhzhy(String value) {
        this.sjhzhy = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "bz", nullable = false, insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getBz() {
        return bz;
    }

    /**
     * 设置bz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBz(String value) {
        this.bz = value;
    }
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "xmcode")
    public ItemXmjbxx getXmjbxx() {
        return xmjbxx;
    }

    public void setXmjbxx(ItemXmjbxx xmjbxx) {
        this.xmjbxx = xmjbxx;
    }
}
