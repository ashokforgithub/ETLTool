package com.hack.project.projectDetails.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "convproj", schema = "hkprojdb")
public class ProjectDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long convprojid;

	private Timestamp crtdtmstmp;

	private String crtdusr;

	private Timestamp enddate;

	private String enrolledplanno;

	private String isactive;

	private String prkname;

	private String prkplanno;

	private String projname;

	private String projstatus;

	private String projtype;

	private Timestamp startdate;

	private String uptmstmp;

	private String upusr;

	public ProjectDetails() {
	}

	public Long getConvprojid() {
		return this.convprojid;
	}

	public void setConvprojid(Long convprojid) {
		this.convprojid = convprojid;
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

	public Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}

	public String getEnrolledplanno() {
		return this.enrolledplanno;
	}

	public void setEnrolledplanno(String enrolledplanno) {
		this.enrolledplanno = enrolledplanno;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getPrkname() {
		return this.prkname;
	}

	public void setPrkname(String prkname) {
		this.prkname = prkname;
	}

	public String getPrkplanno() {
		return this.prkplanno;
	}

	public void setPrkplanno(String prkplanno) {
		this.prkplanno = prkplanno;
	}

	public String getProjname() {
		return this.projname;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public String getProjstatus() {
		return this.projstatus;
	}

	public void setProjstatus(String projstatus) {
		this.projstatus = projstatus;
	}

	public String getProjtype() {
		return this.projtype;
	}

	public void setProjtype(String projtype) {
		this.projtype = projtype;
	}

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
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

}
