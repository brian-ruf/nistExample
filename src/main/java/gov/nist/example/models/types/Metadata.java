//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.25 at 10:37:16 PM EDT 
//


package gov.nist.example.models.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}title"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}last-modified-date" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}version" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}oscal-version"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}doc-id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}prop" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}role" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}party" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://csrc.nist.gov/ns/oscal/1.0}notes" minOccurs="0"/>
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
    "title",
    "lastModifiedDate",
    "version",
    "oscalVersion",
    "docId",
    "prop",
    "link",
    "role",
    "party",
    "notes"
})
@XmlRootElement(name = "metadata")
public class Metadata {

    @XmlElement(required = true)
    protected Title title;
    @XmlElement(name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    protected Version version;
    @XmlElement(name = "oscal-version", required = true)
    protected OscalVersion oscalVersion;
    @XmlElement(name = "doc-id")
    protected List<DocId> docId;
    protected List<Prop> prop;
    protected List<Link> link;
    protected List<Role> role;
    protected List<Party> party;
    protected Notes notes;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link LastModifiedDate }
     *     
     */
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastModifiedDate }
     *     
     */
    public void setLastModifiedDate(LastModifiedDate value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the oscalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link OscalVersion }
     *     
     */
    public OscalVersion getOscalVersion() {
        return oscalVersion;
    }

    /**
     * Sets the value of the oscalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link OscalVersion }
     *     
     */
    public void setOscalVersion(OscalVersion value) {
        this.oscalVersion = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocId }
     * 
     * 
     */
    public List<DocId> getDocId() {
        if (docId == null) {
            docId = new ArrayList<DocId>();
        }
        return this.docId;
    }

    /**
     * Gets the value of the prop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prop }
     * 
     * 
     */
    public List<Prop> getProp() {
        if (prop == null) {
            prop = new ArrayList<Prop>();
        }
        return this.prop;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * 
     * 
     */
    public List<Link> getLink() {
        if (link == null) {
            link = new ArrayList<Link>();
        }
        return this.link;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * 
     * 
     */
    public List<Role> getRole() {
        if (role == null) {
            role = new ArrayList<Role>();
        }
        return this.role;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

	@Override
	public String toString() {
		return "Metadata [title=" + title + ", lastModifiedDate=" + lastModifiedDate + ", version=" + version
				+ ", oscalVersion=" + oscalVersion + ", docId=" + docId + ", prop=" + prop + ", link=" + link
				+ ", role=" + role + ", party=" + party + ", notes=" + notes + "]";
	}
    
    

}