
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
 *         &lt;element name="KYZBM" type="{}typeKYZBM"/>
 *         &lt;element name="KYZMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XZBM" type="{}typeXZBM"/>
 *         &lt;element name="XZMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZDMJ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="JZMJ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZJBZDM" type="{}typeKYZJB"/>
 *         &lt;element name="KYZJBHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NPJRLKFSL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "kyzbm",
    "kyzmc",
    "xzbm",
    "xzmc",
    "zdmj",
    "jzmj",
    "zjbzdm",
    "kyzjbhy",
    "npjrlkfsl",
    "bz"
})
@XmlRootElement(name = "item_kyzjsgm")
@Entity
@Table(name = "table_kyzjsgm"  ,schema = "public")
public class ItemKyzjsgm extends UUIDCRowIDEntity {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "KYZBM", required = true)
    protected String kyzbm;
    @XmlElement(name = "KYZMC", required = true)
    protected String kyzmc;
    @XmlElement(name = "XZBM", required = true)
    protected String xzbm;
    @XmlElement(name = "XZMC", required = true)
    protected String xzmc;
    @XmlElement(name = "ZDMJ", required = true, defaultValue = "0")
    protected BigDecimal zdmj;
    @XmlElement(name = "JZMJ", required = true, defaultValue = "0")
    protected BigDecimal jzmj;
    @XmlElement(name = "ZJBZDM", required = true)
    protected String zjbzdm;
    @XmlElement(name = "KYZJBHY", required = true)
    protected String kyzjbhy;
    @XmlElement(name = "NPJRLKFSL", required = true, defaultValue = "0")
    protected BigDecimal npjrlkfsl;
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
    @Column(name = "xmcode", nullable = false,insertable = true, updatable = false, length = 36, precision = 36)
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
     * 获取kyzbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "kyzbm", nullable = false, insertable = true, updatable = true, length = 15, precision = 15)
    @Basic
    public String getKyzbm() {
        return kyzbm;
    }

    /**
     * 设置kyzbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKyzbm(String value) {
        this.kyzbm = value;
    }

    /**
     * 获取kyzmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "kyzmc", nullable = false, insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getKyzmc() {
        return kyzmc;
    }

    /**
     * 设置kyzmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKyzmc(String value) {
        this.kyzmc = value;
    }

    /**
     * 获取xzbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xzbm", insertable = true, updatable = true, length = 12, precision =12)
    @Basic
    public String getXzbm() {
        return xzbm;
    }

    /**
     * 设置xzbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXzbm(String value) {
        this.xzbm = value;
    }

    /**
     * 获取xzmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xzmc", insertable = true, updatable = true, length = 100, precision =100)
    @Basic
    public String getXzmc() {
        return xzmc;
    }

    /**
     * 设置xzmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXzmc(String value) {
        this.xzmc = value;
    }

    /**
     * 获取zdmj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "zdmj", insertable = true, updatable = true, length = 8, precision = 8, scale = 1)
    @Basic
    public BigDecimal getZdmj() {
        return zdmj;
    }

    /**
     * 设置zdmj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZdmj(BigDecimal value) {
        this.zdmj = value;
    }

    /**
     * 获取jzmj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "jzmj", insertable = true, updatable = true, length = 8, precision = 8, scale = 1)
    @Basic
    public BigDecimal getJzmj() {
        return jzmj;
    }

    /**
     * 设置jzmj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJzmj(BigDecimal value) {
        this.jzmj = value;
    }

    /**
     * 获取zjbzdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "zjbzdm", insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getZjbzdm() {
        return zjbzdm;
    }

    /**
     * 设置zjbzdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjbzdm(String value) {
        this.zjbzdm = value;
    }

    /**
     * 获取kyzjbhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "kyzjbhy", insertable = true, updatable = true, length = 20, precision =20)
    @Basic
    public String getKyzjbhy() {
        return kyzjbhy;
    }

    /**
     * 设置kyzjbhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKyzjbhy(String value) {
        this.kyzjbhy = value;
    }

    /**
     * 获取npjrlkfsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "npjrlkfsl", insertable = true, updatable = true, length = 8,  precision = 8, scale = 1)
    @Basic
    public BigDecimal getNpjrlkfsl() {
        return npjrlkfsl;
    }

    /**
     * 设置npjrlkfsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNpjrlkfsl(BigDecimal value) {
        this.npjrlkfsl = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "bz", insertable = true, updatable = true,  length = 500,precision = 500)
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
    @JoinColumn(name = "xmcode" ,insertable=false, updatable=false, referencedColumnName = "xmcode")
    public ItemXmjbxx getXmjbxx() {
        return xmjbxx;
    }

    public void setXmjbxx(ItemXmjbxx xmjbxx) {
        this.xmjbxx = xmjbxx;
    }
}
