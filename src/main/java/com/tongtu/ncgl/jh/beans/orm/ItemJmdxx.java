
package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.jh.beans.plan.KeyPoint;

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
 *         &lt;element name="JMDLX" type="{}typeJMDLX"/>
 *         &lt;element name="JMDLXHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JMDBM" type="{}typeJMDBM"/>
 *         &lt;element name="JMDMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TDZK" type="{}typeTDZK"/>
 *         &lt;element name="TDZKHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "jmdlx",
    "jmdlxhy",
    "jmdbm",
    "jmdmc",
    "tdzk",
    "tdzkhy",
    "bz"
})
@XmlRootElement(name = "item_jmdxx")
@Entity
@Table(name = "table_jmdxx"  ,schema = "public")
public class ItemJmdxx  extends KeyPoint {
    @XmlElement(name = "XMID", required = true)
    protected String xmid;
    @XmlElement(name = "JMDLX", required = true)
    protected String jmdlx;
    @XmlElement(name = "JMDLXHY", required = true)
    protected String jmdlxhy;
    @XmlElement(name = "JMDBM", required = true)
    protected String jmdbm;
    @XmlElement(name = "JMDMC", required = true)
    protected String jmdmc;
    @XmlElement(name = "TDZK", required = true)
    protected String tdzk;
    @XmlElement(name = "TDZKHY", required = true)
    protected String tdzkhy;
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
     * 获取jmdlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jmdlx", nullable = false, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getJmdlx() {
        return jmdlx;
    }

    /**
     * 设置jmdlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmdlx(String value) {
        this.jmdlx = value;
    }

    /**
     * 获取jmdlxhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jmdlxhy", nullable = false, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getJmdlxhy() {
        return jmdlxhy;
    }

    /**
     * 设置jmdlxhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmdlxhy(String value) {
        this.jmdlxhy = value;
    }

    /**
     * 获取jmdbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jmdbm", nullable = false, insertable = true, updatable = true, length = 15, precision = 15)
    @Basic
    public String getJmdbm() {
        return jmdbm;
    }

    /**
     * 设置jmdbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmdbm(String value) {
        this.jmdbm = value;
    }

    /**
     * 获取jmdmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jmdmc", nullable = false, insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getJmdmc() {
        return jmdmc;
    }

    /**
     * 设置jmdmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmdmc(String value) {
        this.jmdmc = value;
    }

    /**
     * 获取tdzk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "tdzk", nullable = false, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getTdzk() {
        return tdzk;
    }

    /**
     * 设置tdzk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdzk(String value) {
        this.tdzk = value;
    }

    /**
     * 获取tdzkhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "tdzkhy", nullable = false, insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getTdzkhy() {
        return tdzkhy;
    }

    /**
     * 设置tdzkhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdzkhy(String value) {
        this.tdzkhy = value;
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
