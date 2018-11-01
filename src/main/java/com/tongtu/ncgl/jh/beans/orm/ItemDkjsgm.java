
package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.base.bean.UUIDCRowIDEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


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
 *         &lt;element name="DKBM" type="{}typeDKBM"/>
 *         &lt;element name="DKMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LXBM" type="{}typeLXBM"/>
 *         &lt;element name="LXMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DKGZSL" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DGQCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="JSGMR " type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="JSGMW" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "dkbm",
    "dkmc",
    "lxbm",
    "lxmc",
    "dkgzsl",
    "dgqcd",
    "jsgmr0020",
    "jsgmw",
    "bz"
})
@XmlRootElement(name = "item_dkjsgm")
@Entity
@Table(name = "table_dkjsgm"  ,schema = "public")
public class ItemDkjsgm extends UUIDCRowIDEntity {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "DKBM", required = true)
    protected String dkbm;
    @XmlElement(name = "DKMC", required = true)
    protected String dkmc;
    @XmlElement(name = "LXBM", required = true)
    protected String lxbm;
    @XmlElement(name = "LXMC", required = true)
    protected String lxmc;
    @XmlElement(name = "DKGZSL", required = true, defaultValue = "0")
    protected BigInteger dkgzsl;
    @XmlElement(name = "DGQCD", required = true, defaultValue = "0")
    protected BigDecimal dgqcd;
    @XmlElement(name = "JSGMR ", required = true, defaultValue = "0")
    protected BigDecimal jsgmr0020;
    @XmlElement(name = "JSGMW", required = true, defaultValue = "0")
    protected BigDecimal jsgmw;
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
    @Column(name = "xmid", nullable = false, insertable = false, updatable = false, length = 36, precision = 36)
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
     * 获取dkbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "dkbm", nullable = false, insertable = true, updatable = true, length = 15, precision = 15)
    @Basic
    public String getDkbm() {
        return dkbm;
    }

    /**
     * 设置dkbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDkbm(String value) {
        this.dkbm = value;
    }

    /**
     * 获取dkmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "dkmc", nullable = false, insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getDkmc() {
        return dkmc;
    }

    /**
     * 设置dkmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDkmc(String value) {
        this.dkmc = value;
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
     * 获取dkgzsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Column(name = "dkgzsl", nullable = true, insertable = true, updatable = true,precision=18, scale=0)
    @Basic
    public BigInteger getDkgzsl() {
        return dkgzsl;
    }

    /**
     * 设置dkgzsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDkgzsl(BigInteger value) {
        this.dkgzsl = value;
    }

    /**
     * 获取dgqcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "dgqcd", nullable = true, insertable = true, updatable = true, length = 8, precision = 1)
    @Basic
    public BigDecimal getDgqcd() {
        return dgqcd;
    }

    /**
     * 设置dgqcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDgqcd(BigDecimal value) {
        this.dgqcd = value;
    }

    /**
     * 获取jsgmr0020属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "jsgmr", nullable = true, insertable = true, updatable = true, length = 12, precision = 4)
    @Basic
    public BigDecimal getJsgmr0020() {
        return jsgmr0020;
    }

    /**
     * 设置jsgmr0020属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJsgmr0020(BigDecimal value) {
        this.jsgmr0020 = value;
    }

    /**
     * 获取jsgmw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "jsgmw", nullable = true, insertable = true, updatable = true, length = 12, precision = 4)
    @Basic
    public BigDecimal getJsgmw() {
        return jsgmw;
    }

    /**
     * 设置jsgmw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJsgmw(BigDecimal value) {
        this.jsgmw = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "bz", nullable = true, insertable = true, updatable = true,  length = 500,precision = 500)
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
    @JoinColumn(name = "xmid")
    public ItemXmjbxx getXmjbxx() {
        return xmjbxx;
    }

    public void setXmjbxx(ItemXmjbxx xmjbxx) {
        this.xmjbxx = xmjbxx;
    }
}
