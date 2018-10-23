
package com.tongtu.ncgl.jh.beans.orm;

import com.tongtu.ncgl.base.bean.UUIDCRowIDEntity;

import java.math.BigDecimal;
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
 *         &lt;element name="JHNF" type="{}typeJHNF"/>
 *         &lt;element name="JSKGN" type="{}typeKGNF"/>
 *         &lt;element name="JSWGN" type="{}typeWGNF"/>
 *         &lt;element name="ZTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CGSTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CGSTZBZBZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SFFNDAPJH" type="{}typeBoolean"/>
 *         &lt;element name="SFFNDAPJHHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SNDLJWCTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SNDLJWCCGSTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NDJHZE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NDJHCGSTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NDJHDFTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZYJSNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GKHHZPFWH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CSHSGTPFWH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JDGZ" type="{}typeJDGZ"/>
 *         &lt;element name="JDGZHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "jhnf",
    "jskgn",
    "jswgn",
    "ztz",
    "cgstz",
    "cgstzbzbz",
    "sffndapjh",
    "sffndapjhhy",
    "sndljwctz",
    "sndljwccgstz",
    "ndjhze",
    "ndjhcgstz",
    "ndjhdftz",
    "zyjsnr",
    "gkhhzpfwh",
    "cshsgtpfwh",
    "jdgz",
    "jdgzhy",
    "bz"
})
@XmlRootElement(name = "item_ndjh")
@Entity
@Table(name = "table_ndjh"  ,schema = "public")
public class ItemNdjh extends UUIDCRowIDEntity {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "JHNF", required = true)
    protected String jhnf;
    @XmlElement(name = "JSKGN", required = true)
    protected String jskgn;
    @XmlElement(name = "JSWGN", required = true)
    protected String jswgn;
    @XmlElement(name = "ZTZ", required = true, defaultValue = "0")
    protected BigDecimal ztz;
    @XmlElement(name = "CGSTZ", required = true, defaultValue = "0")
    protected BigDecimal cgstz;
    @XmlElement(name = "CGSTZBZBZ", required = true, defaultValue = "0")
    protected BigDecimal cgstzbzbz;
    @XmlElement(name = "SFFNDAPJH", required = true)
    protected String sffndapjh;
    @XmlElement(name = "SFFNDAPJHHY", required = true)
    protected String sffndapjhhy;
    @XmlElement(name = "SNDLJWCTZ", required = true, defaultValue = "0")
    protected BigDecimal sndljwctz;
    @XmlElement(name = "SNDLJWCCGSTZ", required = true, defaultValue = "0")
    protected BigDecimal sndljwccgstz;
    @XmlElement(name = "NDJHZE", required = true, defaultValue = "0")
    protected BigDecimal ndjhze;
    @XmlElement(name = "NDJHCGSTZ", required = true, defaultValue = "0")
    protected BigDecimal ndjhcgstz;
    @XmlElement(name = "NDJHDFTZ", required = true, defaultValue = "0")
    protected BigDecimal ndjhdftz;
    @XmlElement(name = "ZYJSNR", required = true)
    protected String zyjsnr;
    @XmlElement(name = "GKHHZPFWH", required = true)
    protected String gkhhzpfwh;
    @XmlElement(name = "CSHSGTPFWH", required = true)
    protected String cshsgtpfwh;
    @XmlElement(name = "JDGZ", required = true)
    protected String jdgz;
    @XmlElement(name = "JDGZHY", required = true)
    protected String jdgzhy;
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
    @Column(name = "xmcode", nullable = false, insertable = true, updatable = true, length = 36, precision = 36)
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
     * 获取jhnf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmjhnf", insertable = true, updatable = true, length = 4, precision = 4)
    @Basic
    public String getJhnf() {
        return jhnf;
    }

    /**
     * 设置jhnf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJhnf(String value) {
        this.jhnf = value;
    }

    /**
     * 获取jskgn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmkgnf", insertable = true, updatable = true, length = 4, precision = 4)
    @Basic
    public String getJskgn() {
        return jskgn;
    }

    /**
     * 设置jskgn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJskgn(String value) {
        this.jskgn = value;
    }

    /**
     * 获取jswgn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmwgnf", insertable = true, updatable = true, length = 4, precision = 4)
    @Basic
    public String getJswgn() {
        return jswgn;
    }

    /**
     * 设置jswgn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJswgn(String value) {
        this.jswgn = value;
    }

    /**
     * 获取ztz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmjhztz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getZtz() {
        return ztz;
    }

    /**
     * 设置ztz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZtz(BigDecimal value) {
        this.ztz = value;
    }

    /**
     * 获取cgstz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmcgstz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getCgstz() {
        return cgstz;
    }

    /**
     * 设置cgstz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCgstz(BigDecimal value) {
        this.cgstz = value;
    }

    /**
     * 获取cgstzbzbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmcgsbzbz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getCgstzbzbz() {
        return cgstzbzbz;
    }

    /**
     * 设置cgstzbzbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCgstzbzbz(BigDecimal value) {
        this.cgstzbzbz = value;
    }

    /**
     * 获取sffndapjh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmsffndjh", insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getSffndapjh() {
        return sffndapjh;
    }

    /**
     * 设置sffndapjh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSffndapjh(String value) {
        this.sffndapjh = value;
    }

    /**
     * 获取sffndapjhhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmsffndjhhy", insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getSffndapjhhy() {
        return sffndapjhhy;
    }

    /**
     * 设置sffndapjhhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSffndapjhhy(String value) {
        this.sffndapjhhy = value;
    }

    /**
     * 获取sndljwctz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmsndljwctz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getSndljwctz() {
        return sndljwctz;
    }

    /**
     * 设置sndljwctz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSndljwctz(BigDecimal value) {
        this.sndljwctz = value;
    }

    /**
     * 获取sndljwccgstz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmsndljwccgstz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getSndljwccgstz() {
        return sndljwccgstz;
    }

    /**
     * 设置sndljwccgstz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSndljwccgstz(BigDecimal value) {
        this.sndljwccgstz = value;
    }

    /**
     * 获取ndjhze属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmndjztz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNdjhze() {
        return ndjhze;
    }

    /**
     * 设置ndjhze属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNdjhze(BigDecimal value) {
        this.ndjhze = value;
    }

    /**
     * 获取ndjhcgstz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmndjhcgstz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNdjhcgstz() {
        return ndjhcgstz;
    }

    /**
     * 设置ndjhcgstz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNdjhcgstz(BigDecimal value) {
        this.ndjhcgstz = value;
    }

    /**
     * 获取ndjhdftz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "xmndjhdftz", insertable = true, updatable = true, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNdjhdftz() {
        return ndjhdftz;
    }

    /**
     * 设置ndjhdftz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNdjhdftz(BigDecimal value) {
        this.ndjhdftz = value;
    }

    /**
     * 获取zyjsnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmjsnr", insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getZyjsnr() {
        return zyjsnr;
    }

    /**
     * 设置zyjsnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZyjsnr(String value) {
        this.zyjsnr = value;
    }

    /**
     * 获取gkhhzpfwh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmgkpf", insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getGkhhzpfwh() {
        return gkhhzpfwh;
    }

    /**
     * 设置gkhhzpfwh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGkhhzpfwh(String value) {
        this.gkhhzpfwh = value;
    }

    /**
     * 获取cshsgtpfwh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmsjpf", insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getCshsgtpfwh() {
        return cshsgtpfwh;
    }

    /**
     * 设置cshsgtpfwh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshsgtpfwh(String value) {
        this.cshsgtpfwh = value;
    }

    /**
     * 获取jdgz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmxmjd", insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getJdgz() {
        return jdgz;
    }

    /**
     * 设置jdgz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdgz(String value) {
        this.jdgz = value;
    }

    /**
     * 获取jdgzhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmxmjdhy", insertable = true, updatable = true, length = 10, precision = 10)
    @Basic
    public String getJdgzhy() {
        return jdgzhy;
    }

    /**
     * 设置jdgzhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdgzhy(String value) {
        this.jdgzhy = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmbz", insertable = true, updatable = true, length = 500, precision = 500)
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

    @ManyToOne( targetEntity = ItemXmjbxx.class,fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "xmcode", insertable = false, updatable = false)

    public ItemXmjbxx getXmjbxx() {
        return xmjbxx;
    }

    public void setXmjbxx(ItemXmjbxx xmjbxx) {
        this.xmjbxx = xmjbxx;
    }
}
