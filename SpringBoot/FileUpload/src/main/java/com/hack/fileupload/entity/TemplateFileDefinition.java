package com.hack.fileupload.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the tmpltfiledefn database table.
 * 
 */
public class TemplateFileDefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long tmpltfldfnid;

	private Timestamp crtdtmstmp;

	private String crtdusr;

	private String fldelimchar;

	private String fldesc;

	private String flfrmttyp;

	private String flname;

	private Integer flrecendpos;

	private Integer flrecidpos;

	private Integer flrecstartpos;

	private String ismultirectypes;

	private String uptmstmp;

	private String upusr;

	//bi-directional many-to-one association to TemplateRecordType
	private List<TemplateRecordType> tmpltrectypes;

	public TemplateFileDefinition() {
	}

	public Long getTmpltfldfnid() {
		return this.tmpltfldfnid;
	}

	public void setTmpltfldfnid(Long tmpltfldfnid) {
		this.tmpltfldfnid = tmpltfldfnid;
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

	public String getFldelimchar() {
		return this.fldelimchar;
	}

	public void setFldelimchar(String fldelimchar) {
		this.fldelimchar = fldelimchar;
	}

	public String getFldesc() {
		return this.fldesc;
	}

	public void setFldesc(String fldesc) {
		this.fldesc = fldesc;
	}

	public String getFlfrmttyp() {
		return this.flfrmttyp;
	}

	public void setFlfrmttyp(String flfrmttyp) {
		this.flfrmttyp = flfrmttyp;
	}

	public String getFlname() {
		return this.flname;
	}

	public void setFlname(String flname) {
		this.flname = flname;
	}

	public Integer getFlrecendpos() {
		return this.flrecendpos;
	}

	public void setFlrecendpos(Integer flrecendpos) {
		this.flrecendpos = flrecendpos;
	}

	public Integer getFlrecidpos() {
		return this.flrecidpos;
	}

	public void setFlrecidpos(Integer flrecidpos) {
		this.flrecidpos = flrecidpos;
	}

	public Integer getFlrecstartpos() {
		return this.flrecstartpos;
	}

	public void setFlrecstartpos(Integer flrecstartpos) {
		this.flrecstartpos = flrecstartpos;
	}

	public String getIsmultirectypes() {
		return this.ismultirectypes;
	}

	public void setIsmultirectypes(String ismultirectypes) {
		this.ismultirectypes = ismultirectypes;
	}

	public String getUptmstmp() {
		return this.uptmstmp;
	}

	public void setUptmstmp(String uptmstmp) {
		this.uptmstmp = uptmstmp;
	}

	public String getUpusr() {
		return this.upusr;
	}

	public void setUpusr(String upusr) {
		this.upusr = upusr;
	}
	
	public List<TemplateRecordType> getTmpltrectypes() {
		return this.tmpltrectypes;
	}

	public void setTmpltrectypes(List<TemplateRecordType> tmpltrectypes) {
		this.tmpltrectypes = tmpltrectypes;
	}

	public TemplateRecordType addTmpltrectype(TemplateRecordType tmpltrectype) {
		getTmpltrectypes().add(tmpltrectype);
		tmpltrectype.setTmpltfiledefn(this);

		return tmpltrectype;
	}

	public TemplateRecordType removeTmpltrectype(TemplateRecordType tmpltrectype) {
		getTmpltrectypes().remove(tmpltrectype);
		tmpltrectype.setTmpltfiledefn(null);

		return tmpltrectype;
	}

}