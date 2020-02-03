package com.hack.fileupload.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tmpltrectype database table.
 * 
 */
public class TemplateRecordType implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long tmpltrectypid;

	private Timestamp crtdtmstmp;

	private String crtdusr;

	private String isrectypblank;

	private String rectypdesc;

	private String rectypname;

	private Timestamp uptmstmp;

	private String upusr;

	//bi-directional many-to-one association to TemplateFileDetails
	private List<TemplateFileDetails> tmpltflddtls;

	
	private TemplateFileDefinition tmpltfiledefn;

	public TemplateRecordType() {
	}

	public Long getTmpltrectypid() {
		return this.tmpltrectypid;
	}

	public void setTmpltrectypid(Long tmpltrectypid) {
		this.tmpltrectypid = tmpltrectypid;
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

	public String getIsrectypblank() {
		return this.isrectypblank;
	}

	public void setIsrectypblank(String isrectypblank) {
		this.isrectypblank = isrectypblank;
	}

	public String getRectypdesc() {
		return this.rectypdesc;
	}

	public void setRectypdesc(String rectypdesc) {
		this.rectypdesc = rectypdesc;
	}

	public String getRectypname() {
		return this.rectypname;
	}

	public void setRectypname(String rectypname) {
		this.rectypname = rectypname;
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

	
	public List<TemplateFileDetails> getTmpltflddtls() {
		return this.tmpltflddtls;
	}

	public void setTmpltflddtls(List<TemplateFileDetails> tmpltflddtls) {
		this.tmpltflddtls = tmpltflddtls;
	}

	public TemplateFileDetails addTmpltflddtl(TemplateFileDetails tmpltflddtl) {
		getTmpltflddtls().add(tmpltflddtl);
		tmpltflddtl.setTmpltrectype(this);

		return tmpltflddtl;
	}

	public TemplateFileDetails removeTmpltflddtl(TemplateFileDetails tmpltflddtl) {
		getTmpltflddtls().remove(tmpltflddtl);
		tmpltflddtl.setTmpltrectype(null);

		return tmpltflddtl;
	}

	@JsonIgnore
	public TemplateFileDefinition getTmpltfiledefn() {
		return this.tmpltfiledefn;
	}

	@JsonIgnore
	public void setTmpltfiledefn(TemplateFileDefinition tmpltfiledefn) {
		this.tmpltfiledefn = tmpltfiledefn;
	}

}