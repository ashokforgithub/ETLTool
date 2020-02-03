package com.mycomp.hack.srctrgtmap.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the srctrgfldmapping database table.
 * 
 */
@Entity
@Table(name="srctrgfldmapping", schema="hksrctrgmap")
@NamedQuery(name="SrcTrgFldMapping.findAll", query="SELECT s FROM SrcTrgFldMapping s")
public class SrcTrgFldMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long fldmappingid;

	@Temporal(TemporalType.DATE)
	private Date crtdtmstmp;

	private String crtdusr;

	private String maptype;

	private Long srcfldid;

	private String srcfldname;

	private Long tmpltfldfnid;

	private Long trgfldid;

	private String trgfldname;

	@Temporal(TemporalType.DATE)
	private Date uptmstmp;

	private String upusr;

	public SrcTrgFldMapping() {
	}

	public Long getFldmappingid() {
		return this.fldmappingid;
	}

	public void setFldmappingid(Long fldmappingid) {
		this.fldmappingid = fldmappingid;
	}

	public Date getCrtdtmstmp() {
		return this.crtdtmstmp;
	}

	public void setCrtdtmstmp(Date crtdtmstmp) {
		this.crtdtmstmp = crtdtmstmp;
	}

	public String getCrtdusr() {
		return this.crtdusr;
	}

	public void setCrtdusr(String crtdusr) {
		this.crtdusr = crtdusr;
	}

	public String getMaptype() {
		return this.maptype;
	}

	public void setMaptype(String maptype) {
		this.maptype = maptype;
	}

	public Long getSrcfldid() {
		return this.srcfldid;
	}

	public void setSrcfldid(Long srcfldid) {
		this.srcfldid = srcfldid;
	}

	public String getSrcfldname() {
		return this.srcfldname;
	}

	public void setSrcfldname(String srcfldname) {
		this.srcfldname = srcfldname;
	}

	public Long getTmpltfldfnid() {
		return this.tmpltfldfnid;
	}

	public void setTmpltfldfnid(Long tmpltfldfnid) {
		this.tmpltfldfnid = tmpltfldfnid;
	}

	public Long getTrgfldid() {
		return this.trgfldid;
	}

	public void setTrgfldid(Long trgfldid) {
		this.trgfldid = trgfldid;
	}

	public String getTrgfldname() {
		return this.trgfldname;
	}

	public void setTrgfldname(String trgfldname) {
		this.trgfldname = trgfldname;
	}

	public Date getUptmstmp() {
		return this.uptmstmp;
	}

	public void setUptmstmp(Date uptmstmp) {
		this.uptmstmp = uptmstmp;
	}

	public String getUpusr() {
		return this.upusr;
	}

	public void setUpusr(String upusr) {
		this.upusr = upusr;
	}

}