
package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.base.bean.UUIDJBXXEntity;

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
 *         &lt;element name="XMID" type="{}typeXMID"/>
 *         &lt;element name="XMMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XMBM" type="{}typeXMBM"/>
 *         &lt;element name="XMLXDM" type="{}typeXMLXDM"/>
 *         &lt;element name="XMLX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XZQH" type="{}typeXZQH"/>
 *         &lt;element name="XZQHMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JSXZDM" type="{}typeJSXZDM"/>
 *         &lt;element name="JSXZHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TBDWDM" type="{}typeTBDWDM"/>
 *         &lt;element name="TBDWMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "xmid",
    "xmmc",
    "xmbm",
    "xmlxdm",
    "xmlx",
    "xzqh",
    "xzqhmc",
    "jsxzdm",
    "jsxzhy",
    "tbdwdm",
    "tbdwmc",
    "bz"
})

@XmlRootElement(name = "item_xmjbxx")
@Entity
@Table(name = "table_xmjbxx"  ,schema = "public")
public class ItemXmjbxx extends UUIDJBXXEntity {
    @XmlElement(name = "XMMC", required = true)
    protected String xmmc;
    @XmlElement(name = "XMBM", required = true)
    protected String xmbm;
    @XmlElement(name = "XMLXDM", required = true)
    protected String xmlxdm;
    @XmlElement(name = "XMLX", required = true)
    protected String xmlx;
    @XmlElement(name = "XZQH", required = true)
    protected String xzqh;
    @XmlElement(name = "XZQHMC", required = true)
    protected String xzqhmc;
    @XmlElement(name = "JSXZDM", required = true)
    protected String jsxzdm;
    @XmlElement(name = "JSXZHY", required = true)
    protected String jsxzhy;
    @XmlElement(name = "TBDWDM", required = true)
    protected String tbdwdm;
    @XmlElement(name = "TBDWMC", required = true)
    protected String tbdwmc;
    @XmlElement(name = "BZ", required = true)
    protected String bz;
    @XmlTransient()
    private Integer xmpici;
    @XmlTransient()
    private Integer beian;
    @XmlTransient()
    private XtXzqh xtXzqh;

    /**
     * 获取xmmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmname", insertable = true, updatable = true, length = 200, precision = 200)
    @Basic
    public String getXmmc() {
        return xmmc;
    }

    /**
     * 设置xmmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmmc(String value) {
        this.xmmc = value;
    }

    /**
     * 获取xmbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmid", unique = true, insertable = true, updatable = true, length = 13, precision = 13)
    @Basic
    public String getXmbm() {
        return xmbm;
    }

    /**
     * 设置xmbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmbm(String value) {
        this.xmbm = value;
    }

    /**
     * 获取xmlxdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmtypedm", insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getXmlxdm() {
        return xmlxdm;
    }

    /**
     * 设置xmlxdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlxdm(String value) {
        this.xmlxdm = value;
    }

    /**
     * 获取xmlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmtype", insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getXmlx() {
        return xmlx;
    }

    /**
     * 设置xmlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlx(String value) {
        this.xmlx = value;
    }

    /**
     * 获取xzqh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmxzqhcode", nullable = false, insertable = true, updatable = false, length = 6, precision = 6)
    @Basic
    public String getXzqh() {
        return xzqh;
    }

    /**
     * 设置xzqh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXzqh(String value) {
        this.xzqh = value;
    }

    /**
     * 获取xzqhmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmxzqhxian", insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getXzqhmc() {
        return xzqhmc;
    }

    /**
     * 设置xzqhmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXzqhmc(String value) {
        this.xzqhmc = value;
    }

    /**
     * 获取jsxzdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmjsxzdm", insertable = true, updatable = true, length = 1, precision = 1)
    @Basic
    public String getJsxzdm() {
        return jsxzdm;
    }

    /**
     * 设置jsxzdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsxzdm(String value) {
        this.jsxzdm = value;
    }

    /**
     * 获取jsxzhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmjsxzhy", insertable = true, updatable = true, length = 20, precision = 20)
    @Basic
    public String getJsxzhy() {
        return jsxzhy;
    }

    /**
     * 设置jsxzhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsxzhy(String value) {
        this.jsxzhy = value;
    }

    /**
     * 获取tbdwdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmtbdwdm", insertable = true, updatable = true, length = 9, precision = 9)
    @Basic
    public String getTbdwdm() {
        return tbdwdm;
    }

    /**
     * 设置tbdwdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbdwdm(String value) {
        this.tbdwdm = value;
    }

    /**
     * 获取tbdwmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmtbdwmc", insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getTbdwmc() {
        return tbdwmc;
    }

    /**
     * 设置tbdwmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbdwmc(String value) {
        this.tbdwmc = value;
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
    @Column(name = "pici", insertable = true, updatable = true, precision = 2, scale = 0)
    public Integer getXmpici() {
        
        return xmpici;
    }

    public void setXmpici(Integer xmpici) {
        this.xmpici = xmpici;
    }

    @Column(name = "beian", insertable = true, updatable = true, precision = 2, scale = 0)
    public Integer getBeian() {
        return beian;
    }

    public void setBeian(Integer beian) {
        this.beian = beian;
    }

    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "xmxzqhcode",referencedColumnName="xzqh", insertable = false, updatable = false)
    public XtXzqh getXtXzqh() {
        return xtXzqh;
    }

    public void setXtXzqh(XtXzqh xtXzqh) {
        this.xtXzqh = xtXzqh;
    }
}
