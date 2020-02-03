package com.hack.fileupload.entity;

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
public class TemplateFileDetails implements Comparable<TemplateFileDetails> {
	private static final long serialVersionUID = 1L;

	private Long tmpltflddetid;

	private Timestamp crtdtmstmp;

	private String crtdusr;

	private Integer fldcolpos;

	private String flddatfmt;

	private String flddattype;

	private String flddesc;

	private Integer fldendpos;

	private String fldname;

	private Integer fldstartpos;

	private String isfldforconv;

	private Timestamp uptmstmp;

	private String upusr;

	//bi-directional many-to-one association to TemplateRecordType
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fldcolpos == null) ? 0 : fldcolpos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateFileDetails other = (TemplateFileDetails) obj;
		if (fldcolpos == null) {
			if (other.fldcolpos != null)
				return false;
		} else if (!fldcolpos.equals(other.fldcolpos))
			return false;
		return true;
	}

	@Override
	public int compareTo(TemplateFileDetails o) {
		// TODO Auto-generated method stub
		return this.fldcolpos.compareTo(o.getFldcolpos());
	}

}