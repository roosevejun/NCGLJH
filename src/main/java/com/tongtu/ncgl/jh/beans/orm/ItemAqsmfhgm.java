
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
 *         &lt;element name="QDZH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZDZH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="YHLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GJND" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "qdzh",
    "zdzh",
    "yhlc",
    "gjnd",
    "bz"
})
@XmlRootElement(name = "item_aqsmfhgm")
@Entity
@Table( name = "table_aqsmfhgm" ,schema = "public")
public class ItemAqsmfhgm extends UUIDCRowIDEntity {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "LXBM", required = true)
    protected String lxbm;
    @XmlElement(name = "LXMC", required = true)
    protected String lxmc;
    @XmlElement(name = "QDZH", required = true, defaultValue = "0")
    protected BigDecimal qdzh;
    @XmlElement(name = "ZDZH", required = true, defaultValue = "0")
    protected BigDecimal zdzh;
    @XmlElement(name = "YHLC", required = true, defaultValue = "0")
    protected BigDecimal yhlc;
    @XmlElement(name = "GJND", required = true)
    protected String gjnd;
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
     * 获取yhlc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Column(name = "yhlc", nullable = true, insertable = true, updatable = true, precision = 7, scale = 3)
    @Basic
    public BigDecimal getYhlc() {
        return yhlc;
    }

    /**
     * 设置yhlc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYhlc(BigDecimal value) {
        this.yhlc = value;
    }

    /**
     * 获取gjnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "gjnd", nullable = false, insertable = true, updatable = true, length = 4, precision = 4)
    @Basic
    public String getGjnd() {
        return gjnd;
    }

    /**
     * 设置gjnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjnd(String value) {
        this.gjnd = value;
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
