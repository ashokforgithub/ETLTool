package com.mycomp.hack.entity;

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
@Entity
@Table(name="tmpltrectype", schema="hktemplatedb")
@NamedQuery(name="TemplateRecordType.findAll", query="SELECT t FROM TemplateRecordType t")
public class TemplateRecordType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long tmpltrectypid;

	@Column(nullable=false)
	private Timestamp crtdtmstmp;

	@Column(nullable=false, length=40)
	private String crtdusr;

	@Column(length=1)
	private String isrectypblank;

	@Column(length=100)
	private String rectypdesc;

	@Column(length=4)
	private String rectypname;

	private Timestamp uptmstmp;

	@Column(length=40)
	private String upusr;

	//bi-directional many-to-one association to TemplateFileDetails
	@OneToMany(mappedBy="tmpltrectype")
	private List<TemplateFileDetails> tmpltflddtls;

	//bi-directional many-to-one association to TemplateFileDefinition
	@ManyToOne
	@JoinColumn(name="tmpltfldfnid", nullable=false)	
	@JsonBackReference
	@JsonIgnore
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