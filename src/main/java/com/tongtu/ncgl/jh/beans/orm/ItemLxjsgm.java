
package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.jh.beans.plan.JSGMXX;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="QDMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QDZH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZDMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZDZH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="JHJSLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LDJSDJ" type="{}typeLDJSDJ"/>
 *         &lt;element name="LDJSDJHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LDLMLX" type="{}typeLDLMLX"/>
 *         &lt;element name="LDLMLXHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LMKD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LJKD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QLZS" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="QLCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SDZS" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SDCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "qdmc",
    "qdzh",
    "zdmc",
    "zdzh",
    "jhjslc",
    "ldjsdj",
    "ldjsdjhy",
    "ldlmlx",
    "ldlmlxhy",
    "lmkd",
    "ljkd",
    "qlzs",
    "qlcd",
    "sdzs",
    "sdcd",
    "bz"
})
@XmlRootElement(name = "item_lxjsgm")
@Entity
@Table(name = "table_lxjsgm"  ,schema = "public")
public class ItemLxjsgm extends JSGMXX {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "LXBM", required = true)
    protected String lxbm;
    @XmlElement(name = "LXMC", required = true)
    protected String lxmc;
    @XmlElement(name = "QDMC", required = true)
    protected String qdmc;
    @XmlElement(name = "QDZH", required = true, defaultValue = "0")
    protected BigDecimal qdzh;
    @XmlElement(name = "ZDMC", required = true)
    protected String zdmc;
    @XmlElement(name = "ZDZH", required = true, defaultValue = "0")
    protected BigDecimal zdzh;
    @XmlElement(name = "JHJSLC", required = true, defaultValue = "0")
    protected BigDecimal jhjslc;
    @XmlElement(name = "LDJSDJ", required = true)
    protected String ldjsdj;
    @XmlElement(name = "LDJSDJHY", required = true)
    protected String ldjsdjhy;
    @XmlElement(name = "LDLMLX", required = true)
    protected String ldlmlx;
    @XmlElement(name = "LDLMLXHY", required = true)
    protected String ldlmlxhy;
    @XmlElement(name = "LMKD", required = true, defaultValue = "0")
    protected BigDecimal lmkd;
    @XmlElement(name = "LJKD", required = true, defaultValue = "0")
    protected BigDecimal ljkd;
    @XmlElement(name = "QLZS", required = true, defaultValue = "0")
    protected BigInteger qlzs;
    @XmlElement(name = "QLCD", required = true, defaultValue = "0")
    protected BigDecimal qlcd;
    @XmlElement(name = "SDZS", required = true, defaultValue = "0")
    protected BigInteger sdzs;
    @XmlElement(name = "SDCD", required = true, defaultValue = "0")
    protected BigDecimal sdcd;
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
    @Column(name = "xmcode", nullable = false, insertable = false, updatable = false, length = 36, precision = 36)
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
    @Column(name = "lxmc", nullable = false, insertable = true, updatable = true, length = 500, precision = 500)
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
     * 获取qdmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "qdmc", nullable = true, insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getQdmc() {
        return qdmc;
    }

    /**
     * 设置qdmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdmc(String value) {
        this.qdmc = value;
    }

    /**
     * 获取qdzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "qdzh", nullable = true, insertable = true, updatable = true, precision = 7, scale = 3)
    @Basic
    public BigDecimal getQdzh() {
        return qdzh;
    }

    /**
     * 设置qdzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQdzh(BigDecimal value) {
        this.qdzh = value;
    }

    /**
     * 获取zdmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "zdmc", nullable = true, insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getZdmc() {
        return zdmc;
    }

    /**
     * 设置zdmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZdmc(String value) {
        this.zdmc = value;
    }

    /**
     * 获取zdzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "zdzh", nullable = true, insertable = true, updatable = true, precision = 7, scale = 3)
    @Basic
    public BigDecimal getZdzh() {
        return zdzh;
    }

    /**
     * 设置zdzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZdzh(BigDecimal value) {
        this.zdzh = value;
    }

    /**
     * 获取jhjslc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "jslc", nullable = true, insertable = true, updatable = true, precision = 7, scale = 3)
    @Basic
    public BigDecimal getJhjslc() {
        return jhjslc;
    }

    /**
     * 设置jhjslc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJhjslc(BigDecimal value) {
        this.jhjslc = value;
    }

    /**
     * 获取ldjsdj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jsdj", nullable = true, insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getLdjsdj() {
        return ldjsdj;
    }

    /**
     * 设置ldjsdj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdjsdj(String value) {
        this.ldjsdj = value;
    }

    /**
     * 获取ldjsdjhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jsdjhy", nullable = true, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getLdjsdjhy() {
        return ldjsdjhy;
    }

    /**
     * 设置ldjsdjhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdjsdjhy(String value) {
        this.ldjsdjhy = value;
    }

    /**
     * 获取ldlmlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "lmlx", nullable = true, insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getLdlmlx() {
        return ldlmlx;
    }

    /**
     * 设置ldlmlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdlmlx(String value) {
        this.ldlmlx = value;
    }

    /**
     * 获取ldlmlxhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "lmlxhy", nullable = true, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getLdlmlxhy() {
        return ldlmlxhy;
    }

    /**
     * 设置ldlmlxhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdlmlxhy(String value) {
        this.ldlmlxhy = value;
    }

    /**
     * 获取lmkd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "lmkd", nullable = true, insertable = true, updatable = true,  precision = 5, scale = 1)
    @Basic
    public BigDecimal getLmkd() {
        return lmkd;
    }

    /**
     * 设置lmkd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLmkd(BigDecimal value) {
        this.lmkd = value;
    }

    /**
     * 获取ljkd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "ljkd", nullable = true, insertable = true, updatable = true, precision = 5, scale = 1)
    @Basic
    public BigDecimal getLjkd() {
        return ljkd;
    }

    /**
     * 设置ljkd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLjkd(BigDecimal value) {
        this.ljkd = value;
    }

    /**
     * 获取qlzs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Column(name = "qlzs", nullable = true, insertable = true, updatable = true, length = 18, precision = 0)
    @Basic
    public BigInteger getQlzs() {
        return qlzs;
    }

    /**
     * 设置qlzs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQlzs(BigInteger value) {
        this.qlzs = value;
    }

    /**
     * 获取qlcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "qlym", nullable = true, insertable = true, updatable = true, precision = 5, scale = 1)
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
     * 获取sdzs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Column(name = "sdzs", nullable = true, insertable = true, updatable = true, length = 18, precision = 0)
    @Basic
    public BigInteger getSdzs() {
        return sdzs;
    }

    /**
     * 设置sdzs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */

    public void setSdzs(BigInteger value) {
        this.sdzs = value;
    }

    /**
     * 获取sdcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "sdym", nullable = true, insertable = true, updatable = true, precision = 5, scale = 1)
    @Basic
    public BigDecimal getSdcd() {
        return sdcd;
    }

    /**
     * 设置sdcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSdcd(BigDecimal value) {
        this.sdcd = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "bz", nullable = true, insertable = true, updatable = true, length = 500, precision = 500)
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
