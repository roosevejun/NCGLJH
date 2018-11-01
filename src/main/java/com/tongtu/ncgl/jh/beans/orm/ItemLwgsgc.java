
package com.tongtu.ncgl.jh.beans.orm;


import com.tongtu.ncgl.base.bean.UUIDCRowIDEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>anonymous complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CROWID" type="{}typeXMID"/>
 *         &lt;element name="XXBLXDM" type="{}typeXXBLXDM"/>
 *         &lt;element name="XXBLXHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XMLXDM" type="{}typeXMLXDM"/>
 *         &lt;element name="XMLX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JSXZDM" type="{}typeJSXZDM"/>
 *         &lt;element name="JSXZHY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JSLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="YJLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EJLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SNJLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SIJLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DWLC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LQLM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SNLM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="JYPZLM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QTYHLM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WPZLM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XZKYZSL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DKGZSL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DGQCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QLZS" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="QLCD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QLMJ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XTXZSL" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="XTJZCSL" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="XTCBJZCSL" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="JHNF" type="{}typeJHNF"/>
 *         &lt;element name="NDJHZE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NDJHCGSTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NDJHDFTZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TBDWDM" type="{}typeTBDWDM"/>
 *         &lt;element name="TBDWMC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "crowid",
        "xxblxdm",
        "xxblxhy",
        "xmlxdm",
        "xmlx",
        "jsxzdm",
        "jsxzhy",
        "jslc",
        "yjlc",
        "ejlc",
        "snjlc",
        "sijlc",
        "dwlc",
        "lqlm",
        "snlm",
        "jypzlm",
        "qtyhlm",
        "wpzlm",
        "xzkyzsl",
        "dkgzsl",
        "dgqcd",
        "qlzs",
        "qlcd",
        "qlmj",
        "xtxzsl",
        "xtjzcsl",
        "xtcbjzcsl",
        "jhnf",
        "ndjhze",
        "ndjhcgstz",
        "ndjhdftz",
        "tbdwdm",
        "tbdwmc",
        "bz"
})
@XmlRootElement(name = "item_lwgsgc")
@Entity
@Table(name = "table_lwgsgc", schema = "public")
public class ItemLwgsgc extends UUIDCRowIDEntity {
    @XmlElement(name = "XXBLXDM", required = true)
    protected String xxblxdm;
    @XmlElement(name = "XXBLXHY", required = true)
    protected String xxblxhy;
    @XmlElement(name = "XMLXDM", required = true)
    protected String xmlxdm;
    @XmlElement(name = "XMLX", required = true)
    protected String xmlx;
    @XmlElement(name = "JSXZDM", required = true)
    protected String jsxzdm;
    @XmlElement(name = "JSXZHY", required = true)
    protected String jsxzhy;
    @XmlElement(name = "JSLC", required = true, defaultValue = "0")
    protected BigDecimal jslc;
    @XmlElement(name = "YJLC", required = true, defaultValue = "0")
    protected BigDecimal yjlc;
    @XmlElement(name = "EJLC", required = true, defaultValue = "0")
    protected BigDecimal ejlc;
    @XmlElement(name = "SNJLC", required = true, defaultValue = "0")
    protected BigDecimal snjlc;
    @XmlElement(name = "SIJLC", required = true, defaultValue = "0")
    protected BigDecimal sijlc;
    @XmlElement(name = "DWLC", required = true, defaultValue = "0")
    protected BigDecimal dwlc;
    @XmlElement(name = "LQLM", required = true, defaultValue = "0")
    protected BigDecimal lqlm;
    @XmlElement(name = "SNLM", required = true, defaultValue = "0")
    protected BigDecimal snlm;
    @XmlElement(name = "JYPZLM", required = true, defaultValue = "0")
    protected BigDecimal jypzlm;
    @XmlElement(name = "QTYHLM", required = true, defaultValue = "0")
    protected BigDecimal qtyhlm;
    @XmlElement(name = "WPZLM", required = true, defaultValue = "0")
    protected BigDecimal wpzlm;
    @XmlElement(name = "QLZS", required = true, defaultValue = "0")
    protected BigInteger qlzs;
    @XmlElement(name = "QLCD", required = true, defaultValue = "0")
    protected BigDecimal qlcd;
    @XmlElement(name = "QLMJ", required = true, defaultValue = "0")
    protected BigDecimal qlmj;
    @XmlElement(name = "DKGZSL", required = true, defaultValue = "0")
    protected BigInteger dkgzsl;
    @XmlElement(name = "DGQCD", required = true, defaultValue = "0")
    protected BigDecimal dgqcd;
    @XmlElement(name = "XZKYZSL", required = true, defaultValue = "0")
    protected BigInteger xzkyzsl;
    @XmlElement(name = "XTXZSL", required = true, defaultValue = "0")
    protected BigInteger xtxzsl;
    @XmlElement(name = "XTJZCSL", required = true, defaultValue = "0")
    protected BigInteger xtjzcsl;
    @XmlElement(name = "XTCBJZCSL", required = true, defaultValue = "0")
    protected BigInteger xtcbjzcsl;
    @XmlElement(name = "JHNF", required = true)
    protected String jhnf;
    @XmlElement(name = "NDJHZE", required = true, defaultValue = "0")
    protected BigDecimal ndjhze;
    @XmlElement(name = "NDJHCGSTZ", required = true, defaultValue = "0")
    protected BigDecimal ndjhcgstz;
    @XmlElement(name = "NDJHDFTZ", required = true, defaultValue = "0")
    protected BigDecimal ndjhdftz;
    @XmlElement(name = "TBDWDM", required = true)
    protected String tbdwdm;
    @XmlElement(name = "TBDWMC", required = true)
    protected String tbdwmc;
    @XmlElement(name = "BZ", required = true)
    protected String bz;
    @XmlTransient()
    private Integer xmpici;

    /**
     * 获取xxblxdm属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "xxblxdm", nullable = false, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getXxblxdm() {
        return xxblxdm;
    }

    /**
     * 设置xxblxdm属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXxblxdm(String value) {
        this.xxblxdm = value;
    }

    /**
     * 获取xxblxhy属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "xxblxhy", nullable = false, insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getXxblxhy() {
        return xxblxhy;
    }

    /**
     * 设置xxblxhy属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXxblxhy(String value) {
        this.xxblxhy = value;
    }

    /**
     * 获取xmlxdm属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "xmlxdm", nullable = false, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getXmlxdm() {
        return xmlxdm;
    }

    /**
     * 设置xmlxdm属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXmlxdm(String value) {
        this.xmlxdm = value;
    }

    /**
     * 获取xmlx属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "xmlx", nullable = false, insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getXmlx() {
        return xmlx;
    }

    /**
     * 设置xmlx属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXmlx(String value) {
        this.xmlx = value;
    }

    /**
     * 获取jsxzdm属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "jsxzdm", nullable = true, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getJsxzdm() {
        return jsxzdm;
    }

    /**
     * 设置jsxzdm属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJsxzdm(String value) {
        this.jsxzdm = value;
    }

    /**
     * 获取jsxzhy属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "jsxzhy", nullable = true, insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getJsxzhy() {
        return jsxzhy;
    }

    /**
     * 设置jsxzhy属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJsxzhy(String value) {
        this.jsxzhy = value;
    }

    /**
     * 获取jslc属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "jslc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getJslc() {
        return jslc;
    }

    /**
     * 设置jslc属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setJslc(BigDecimal value) {
        this.jslc = value;
    }

    /**
     * 获取yjlc属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "yjlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getYjlc() {
        return yjlc;
    }

    /**
     * 设置yjlc属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setYjlc(BigDecimal value) {
        this.yjlc = value;
    }

    /**
     * 获取ejlc属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "ejlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getEjlc() {
        return ejlc;
    }

    /**
     * 设置ejlc属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setEjlc(BigDecimal value) {
        this.ejlc = value;
    }

    /**
     * 获取snjlc属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "snjlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getSnjlc() {
        return snjlc;
    }

    /**
     * 设置snjlc属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setSnjlc(BigDecimal value) {
        this.snjlc = value;
    }

    /**
     * 获取sijlc属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "sijlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getSijlc() {
        return sijlc;
    }

    /**
     * 设置sijlc属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setSijlc(BigDecimal value) {
        this.sijlc = value;
    }

    /**
     * 获取dwlc属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "dwlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getDwlc() {
        return dwlc;
    }

    /**
     * 设置dwlc属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setDwlc(BigDecimal value) {
        this.dwlc = value;
    }

    /**
     * 获取lqlm属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "lqlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getLqlm() {
        return lqlm;
    }

    /**
     * 设置lqlm属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLqlm(BigDecimal value) {
        this.lqlm = value;
    }

    /**
     * 获取snlm属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "snlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getSnlm() {
        return snlm;
    }

    /**
     * 设置snlm属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setSnlm(BigDecimal value) {
        this.snlm = value;
    }

    /**
     * 获取jypzlm属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "jypzlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getJypzlm() {
        return jypzlm;
    }

    /**
     * 设置jypzlm属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setJypzlm(BigDecimal value) {
        this.jypzlm = value;
    }

    /**
     * 获取qtyhlm属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "qtyhlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getQtyhlm() {
        return qtyhlm;
    }

    /**
     * 设置qtyhlm属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setQtyhlm(BigDecimal value) {
        this.qtyhlm = value;
    }

    /**
     * 获取wpzlm属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "wpzlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getWpzlm() {
        return wpzlm;
    }

    /**
     * 设置wpzlm属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setWpzlm(BigDecimal value) {
        this.wpzlm = value;
    }

    /**
     * 获取qlzs属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Column(name = "qlzs", nullable = true, insertable = true, updatable = true, precision = 18, scale = 0)
    @Basic
    public BigInteger getQlzs() {
        return qlzs;
    }

    /**
     * 设置qlzs属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQlzs(BigInteger value) {
        this.qlzs = value;
    }

    /**
     * 获取qlcd属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "qlcd", nullable = true, insertable = true, updatable = true, length = 8, precision = 8, scale = 1)
    @Basic
    public BigDecimal getQlcd() {
        return qlcd;
    }

    /**
     * 设置qlcd属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setQlcd(BigDecimal value) {
        this.qlcd = value;
    }

    /**
     * 获取qlmj属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "qlmj", nullable = true, insertable = true, updatable = true, length = 12, precision = 12, scale = 2)
    @Basic
    public BigDecimal getQlmj() {
        return qlmj;
    }

    /**
     * 设置qlmj属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setQlmj(BigDecimal value) {
        this.qlmj = value;
    }

    /**
     * 获取dkgzsl属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Column(name = "dkgzsl", nullable = true, insertable = true, updatable = true, precision = 18, scale = 0)
    @Basic
    public BigInteger getDkgzsl() {
        return dkgzsl;
    }

    /**
     * 设置dkgzsl属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDkgzsl(BigInteger value) {
        this.dkgzsl = value;
    }

    /**
     * 获取dgqcd属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "dgqcd", nullable = true, insertable = true, updatable = true, length = 8, precision = 8, scale = 1)
    @Basic
    public BigDecimal getDgqcd() {
        return dgqcd;
    }

    /**
     * 设置dgqcd属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setDgqcd(BigDecimal value) {
        this.dgqcd = value;
    }

    /**
     * 获取xzkyzsl属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Column(name = "xzkyzsl", nullable = true, insertable = true, updatable = true, precision = 18, scale = 0)
    @Basic
    public BigInteger getXzkyzsl() {
        return xzkyzsl;
    }

    /**
     * 设置xzkyzsl属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setXzkyzsl(BigInteger value) {
        this.xzkyzsl = value;
    }

    /**
     * 获取xtxzsl属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Column(name = "xtxzsl", nullable = true, insertable = true, updatable = true, precision = 18, scale = 0)
    @Basic
    public BigInteger getXtxzsl() {
        return xtxzsl;
    }

    /**
     * 设置xtxzsl属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setXtxzsl(BigInteger value) {
        this.xtxzsl = value;
    }

    /**
     * 获取xtjzcsl属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Column(name = "xtjzcsl", nullable = true, insertable = true, updatable = true, precision = 18, scale = 0)
    @Basic
    public BigInteger getXtjzcsl() {
        return xtjzcsl;
    }

    /**
     * 设置xtjzcsl属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setXtjzcsl(BigInteger value) {
        this.xtjzcsl = value;
    }

    /**
     * 获取xtcbjzcsl属性的值。
     *
     * @return possible object is
     * {@link BigInteger }
     */
    @Column(name = "xtcbjzcsl", nullable = true, insertable = true, updatable = true, precision = 18, scale = 0)
    @Basic
    public BigInteger getXtcbjzcsl() {
        return xtcbjzcsl;
    }

    /**
     * 设置xtcbjzcsl属性的值。
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setXtcbjzcsl(BigInteger value) {
        this.xtcbjzcsl = value;
    }

    /**
     * 获取jhnf属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "jhnf", nullable = false, insertable = true, updatable = true, length = 4, precision = 4)
    @Basic
    public String getJhnf() {
        return jhnf;
    }

    /**
     * 设置jhnf属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJhnf(String value) {
        this.jhnf = value;
    }

    /**
     * 获取ndjhze属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "ndjyjhze", nullable = true, insertable = true, updatable = true, length = 12, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNdjhze() {
        return ndjhze;
    }

    /**
     * 设置ndjhze属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNdjhze(BigDecimal value) {
        this.ndjhze = value;
    }

    /**
     * 获取ndjhcgstz属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "ndjhcgstz", nullable = true, insertable = true, updatable = true, length = 12, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNdjhcgstz() {
        return ndjhcgstz;
    }

    /**
     * 设置ndjhcgstz属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNdjhcgstz(BigDecimal value) {
        this.ndjhcgstz = value;
    }

    /**
     * 获取ndjhdftz属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Column(name = "ndjhdftz", nullable = true, insertable = true, updatable = true, length = 12, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNdjhdftz() {
        return ndjhdftz;
    }

    /**
     * 设置ndjhdftz属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNdjhdftz(BigDecimal value) {
        this.ndjhdftz = value;
    }

    /**
     * 获取tbdwdm属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "tbdwdm", nullable = true, insertable = true, updatable = true, length = 9, precision = 9)
    @Basic
    public String getTbdwdm() {
        return tbdwdm;
    }

    /**
     * 设置tbdwdm属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTbdwdm(String value) {
        this.tbdwdm = value;
    }

    /**
     * 获取tbdwmc属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "tbdwmc", nullable = true, insertable = true, updatable = true, length = 100, precision = 100)
    @Basic
    public String getTbdwmc() {
        return tbdwmc;
    }

    /**
     * 设置tbdwmc属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTbdwmc(String value) {
        this.tbdwmc = value;
    }

    /**
     * 获取bz属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    @Column(name = "bz", nullable = true, insertable = true, updatable = true, length = 500, precision = 500)
    @Basic
    public String getBz() {
        return bz;
    }

    /**
     * 设置bz属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBz(String value) {
        this.bz = value;
    }

    @Column(name = "pici", nullable = true, insertable = true, updatable = true, precision = 2, scale = 0)
    public Integer getXmpici() {
        return xmpici;
    }

    public void setXmpici(Integer xmpici) {
        this.xmpici = xmpici;
    }
}
