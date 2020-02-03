package com.mycomp.hack.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the tmpltflddtls database table.
 * 
 */
@Entity
@Table(name="tmpltflddtls", schema="hktemplatedb")
@NamedQuery(name="TemplateFileDetails.findAll", query="SELECT t FROM TemplateFileDetails t")
public class TemplateFileDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long tmpltflddetid;

	@Column(nullable=false)
	private Timestamp crtdtmstmp;

	@Column(length=40)
	private String crtdusr;

	private Integer fldcolpos;

	@Column(length=20)
	private String flddatfmt;

	@Column(length=20)
	private String flddattype;

	@Column(length=100)
	private String flddesc;

	private Integer fldendpos;

	@Column(nullable=false, length=40)
	private String fldname;

	private Integer fldstartpos;

	@Column(length=1)
	private String isfldforconv;

	private Timestamp uptmstmp;

	@Column(length=40)
	private String upusr;

	//bi-directional many-to-one association to TemplateRecordType
	@ManyToOne
	@JoinColumn(name="tmpltrectypid", nullable=false)
	@JsonIgnore
	private TemplateRecordType tmpltrectype;

	public TemplateFileDetails() {
	}

	public Long getTmpltflddetid() {
		return this.tmpltflddetid;
	}

	public void setTmpltflddetid(Long tmpltflddetid) {
		this.tmpltflddetid = tmpltflddetid;
	}

	public Timestamp getCrtdtmstmp() {
		return this.crtdtmstmp;
	}

	public void setCrtdtmstmp(Timestamp crtdtmstmp) {
		this.crtdtmstmp = crtdtmstmp;
	}

	public String getCrtdusr() {
		return this.crtdusr;
	}

	public void setCrtdusr(String crtdusr) {
		this.crtdusr = crtdusr;
	}

	public Integer getFldcolpos() {
		return this.fldcolpos;
	}

	public void setFldcolpos(Integer fldcolpos) {
		this.fldcolpos = fldcolpos;
	}

	public String getFlddatfmt() {
		return this.flddatfmt;
	}

	public void setFlddatfmt(String flddatfmt) {
		this.flddatfmt = flddatfmt;
	}

	public String getFlddattype() {
		return this.flddattype;
	}

	public void setFlddattype(String flddattype) {
		this.flddattype = flddattype;
	}

	public String getFlddesc() {
		return this.flddesc;
	}

	public void setFlddesc(String flddesc) {
		this.flddesc = flddesc;
	}

	public Integer getFldendpos() {
		return this.fldendpos;
	}

	public void setFldendpos(Integer fldendpos) {
		this.fldendpos = fldendpos;
	}

	public String getFldname() {
		return this.fldname;
	}

	public void setFldname(String fldname) {
		this.fldname = fldname;
	}

	public Integer getFldstartpos() {
		return this.fldstartpos;
	}

	public void setFldstartpos(Integer fldstartpos) {
		this.fldstartpos = fldstartpos;
	}

	public String getIsfldforconv() {
		return this.isfldforconv;
	}

	public void setIsfldforconv(String isfldforconv) {
		this.isfldforconv = isfldforconv;
	}

	public Timestamp getUptmstmp() {
		return this.uptmstmp;
	}

	public void setUptmstmp(Timestamp uptmstmp) {
		this.uptmstmp = uptmstmp;
	}

	public String getUpusr() {
		return this.upusr;
	}

	public void setUpusr(String upusr) {
		this.upusr = upusr;
	}

	@JsonIgnore
	public TemplateRecordType getTmpltrectype() {
		return this.tmpltrectype;
	}

	@JsonIgnore
	public void setTmpltrectype(TemplateRecordType tmpltrectype) {
		this.tmpltrectype = tmpltrectype;
	}

}