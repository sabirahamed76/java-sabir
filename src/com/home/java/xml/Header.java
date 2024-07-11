//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.10 at 07:34:52 PM SGT 
//


package com.home.java.xml;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Header element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="Header">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}MsgVersion"/>
 *           &lt;element ref="{}UserID"/>
 *           &lt;element ref="{}MsgType"/>
 *           &lt;element ref="{}PmtType"/>
 *           &lt;element ref="{}ShipperRef"/>
 *           &lt;element ref="{}ForwarderRef"/>
 *           &lt;element ref="{}TotalOuterPack"/>
 *           &lt;element ref="{}TotalOuterPackUnit"/>
 *           &lt;element ref="{}TotalGrossWeight"/>
 *           &lt;element ref="{}TotalGrossWeightUnit"/>
 *           &lt;element ref="{}Shipper"/>
 *           &lt;element ref="{}Consignee"/>
 *           &lt;element ref="{}ReleaseCode"/>
 *           &lt;element ref="{}ReleaseName"/>
 *           &lt;element ref="{}ReceiptCode"/>
 *           &lt;element ref="{}ReceiptName"/>
 *           &lt;element ref="{}PackingType"/>
 *           &lt;element ref="{}PrevPermitNumber"/>
 *           &lt;element ref="{}OutwardTransportMode"/>
 *           &lt;element ref="{}InwardTransportMode"/>
 *           &lt;element ref="{}DeclRemarks"/>
 *           &lt;element ref="{}PermitRemarks"/>
 *           &lt;element ref="{}SubmissionDate"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgVersion",
    "userID",
    "msgType",
    "pmtType",
    "shipperRef",
    "forwarderRef",
    "totalOuterPack",
    "totalOuterPackUnit",
    "totalGrossWeight",
    "totalGrossWeightUnit",
    "shipper",
    "consignee",
    "releaseCode",
    "releaseName",
    "receiptCode",
    "receiptName",
    "packingType",
    "prevPermitNumber",
    "outwardTransportMode",
    "inwardTransportMode",
    "declRemarks",
    "permitRemarks",
    "submissionDate"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "MsgVersion")
    protected String msgVersion;
    @XmlElement(name = "UserID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String userID;
    @XmlElement(name = "MsgType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msgType;
    @XmlElement(name = "PmtType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pmtType;
    @XmlElement(name = "ShipperRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipperRef;
    @XmlElement(name = "ForwarderRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String forwarderRef;
    @XmlElement(name = "TotalOuterPack")
    protected String totalOuterPack;
    @XmlElement(name = "TotalOuterPackUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String totalOuterPackUnit;
    @XmlElement(name = "TotalGrossWeight")
    protected String totalGrossWeight;
    @XmlElement(name = "TotalGrossWeightUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String totalGrossWeightUnit;
    @XmlElement(name = "Shipper")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipper;
    @XmlElement(name = "Consignee")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String consignee;
    @XmlElement(name = "ReleaseCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseCode;
    @XmlElement(name = "ReleaseName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseName;
    @XmlElement(name = "ReceiptCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiptCode;
    @XmlElement(name = "ReceiptName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiptName;
    @XmlElement(name = "PackingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packingType;
    @XmlElement(name = "PrevPermitNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prevPermitNumber;
    @XmlElement(name = "OutwardTransportMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outwardTransportMode;
    @XmlElement(name = "InwardTransportMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inwardTransportMode;
    @XmlElement(name = "DeclRemarks")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String declRemarks;
    @XmlElement(name = "PermitRemarks")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String permitRemarks;
    @XmlElement(name = "SubmissionDate")
    protected String submissionDate;

    /**
     * Gets the value of the msgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgVersion() {
        return msgVersion;
    }

    /**
     * Sets the value of the msgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgVersion(String value) {
        this.msgVersion = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the pmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtType() {
        return pmtType;
    }

    /**
     * Sets the value of the pmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtType(String value) {
        this.pmtType = value;
    }

    /**
     * Gets the value of the shipperRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperRef() {
        return shipperRef;
    }

    /**
     * Sets the value of the shipperRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperRef(String value) {
        this.shipperRef = value;
    }

    /**
     * Gets the value of the forwarderRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwarderRef() {
        return forwarderRef;
    }

    /**
     * Sets the value of the forwarderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwarderRef(String value) {
        this.forwarderRef = value;
    }

    /**
     * Gets the value of the totalOuterPack property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getTotalOuterPack() {
        return totalOuterPack;
    }

    /**
     * Sets the value of the totalOuterPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOuterPack(String value) {
        this.totalOuterPack = value;
    }

    /**
     * Gets the value of the totalOuterPackUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOuterPackUnit() {
        return totalOuterPackUnit;
    }

    /**
     * Sets the value of the totalOuterPackUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOuterPackUnit(String value) {
        this.totalOuterPackUnit = value;
    }

    /**
     * Gets the value of the totalGrossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * Sets the value of the totalGrossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalGrossWeight(String value) {
        this.totalGrossWeight = value;
    }

    /**
     * Gets the value of the totalGrossWeightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalGrossWeightUnit() {
        return totalGrossWeightUnit;
    }

    /**
     * Sets the value of the totalGrossWeightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalGrossWeightUnit(String value) {
        this.totalGrossWeightUnit = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipper(String value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignee(String value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the releaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseCode() {
        return releaseCode;
    }

    /**
     * Sets the value of the releaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseCode(String value) {
        this.releaseCode = value;
    }

    /**
     * Gets the value of the releaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseName() {
        return releaseName;
    }

    /**
     * Sets the value of the releaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseName(String value) {
        this.releaseName = value;
    }

    /**
     * Gets the value of the receiptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptCode() {
        return receiptCode;
    }

    /**
     * Sets the value of the receiptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptCode(String value) {
        this.receiptCode = value;
    }

    /**
     * Gets the value of the receiptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptName() {
        return receiptName;
    }

    /**
     * Sets the value of the receiptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptName(String value) {
        this.receiptName = value;
    }

    /**
     * Gets the value of the packingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingType() {
        return packingType;
    }

    /**
     * Sets the value of the packingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingType(String value) {
        this.packingType = value;
    }

    /**
     * Gets the value of the prevPermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPermitNumber() {
        return prevPermitNumber;
    }

    /**
     * Sets the value of the prevPermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPermitNumber(String value) {
        this.prevPermitNumber = value;
    }

    /**
     * Gets the value of the outwardTransportMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutwardTransportMode() {
        return outwardTransportMode;
    }

    /**
     * Sets the value of the outwardTransportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutwardTransportMode(String value) {
        this.outwardTransportMode = value;
    }

    /**
     * Gets the value of the inwardTransportMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInwardTransportMode() {
        return inwardTransportMode;
    }

    /**
     * Sets the value of the inwardTransportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInwardTransportMode(String value) {
        this.inwardTransportMode = value;
    }

    /**
     * Gets the value of the declRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclRemarks() {
        return declRemarks;
    }

    /**
     * Sets the value of the declRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclRemarks(String value) {
        this.declRemarks = value;
    }

    /**
     * Gets the value of the permitRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitRemarks() {
        return permitRemarks;
    }

    /**
     * Sets the value of the permitRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitRemarks(String value) {
        this.permitRemarks = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionDate(String value) {
        this.submissionDate = value;
    }

}