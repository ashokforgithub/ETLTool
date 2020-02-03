package com.mycomp.hack.targetrecs.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.sql.Timestamp;


/**
 * The persistent class for the trgtflddtls database table.
 * 
 */
@Entity
@Table(name="trgtflddtls", schema="hktrgtrecdb")
@NamedQuery(name="TargetFieldDetails.findAll", query="SELECT t FROM TargetFieldDetails t")
public class TargetFieldDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String trgtflddetid;

	private Timestamp crtdtmstmp;

	private String ctrdusr;

	private String flddatfmt;

	private String flddattype;

	private String flddesc;

	private String fldname;

	private Timestamp uptmstmp;

	private String upusr;

	//bi-directional many-to-one association to TargetRecordType
	@ManyToOne
	@JoinColumn(name="trgrectypid")
	@JsonBackReference
	private TargetRecordType trgtrectype;

	public TargetFieldDetails() {
	}

	public String getTrgtflddetid() {
		return this.trgtflddetid;
	}

	public void setTrgtflddetid(String trgtflddetid) {
		this.trgtflddetid = trgtflddetid;
	}

	public Timestamp getCrtdtmstmp() {
		return this.crtdtmstmp;
	}

	public void setCrtdtmstmp(Timestamp crtdtmstmp) {
		this.crtdtmstmp = crtdtmstmp;
	}

	public String getCtrdusr() {
		return this.ctrdusr;
	}

	public void setCtrdusr(String ctrdusr) {
		this.ctrdusr = ctrdusr;
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

	public String getFldname() {
		return this.fldname;
	}

	public void setFldname(String fldname) {
		this.fldname = fldname;
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

	public TargetRecordType getTrgtrectype() {
		return this.trgtrectype;
	}

	public void setTrgtrectype(TargetRecordType trgtrectype) {
		this.trgtrectype = trgtrectype;
	}

}