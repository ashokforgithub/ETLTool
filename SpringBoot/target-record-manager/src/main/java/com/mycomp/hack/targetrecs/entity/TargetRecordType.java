package com.mycomp.hack.targetrecs.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the trgtrectype database table.
 * 
 */
@Entity
@Table(name="trgtrectype", schema="hktrgtrecdb")
@NamedQuery(name="TargetRecordType.findAll", query="SELECT t FROM TargetRecordType t")
public class TargetRecordType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long trgrectypid;

	private String convareaname;

	private Timestamp crtdtmstmp;

	private String ctrdusr;

	private String rectypdesc;

	private Timestamp uptmstmp;

	private String upusr;

	//bi-directional many-to-one association to TargetFieldDetails
	@OneToMany(mappedBy="trgtrectype")
	@JsonManagedReference
	private List<TargetFieldDetails> trgtflddtls;

	public TargetRecordType() {
	}

	public Long getTrgrectypid() {
		return this.trgrectypid;
	}

	public void setTrgrectypid(Long trgrectypid) {
		this.trgrectypid = trgrectypid;
	}

	public String getConvareaname() {
		return this.convareaname;
	}

	public void setConvareaname(String convareaname) {
		this.convareaname = convareaname;
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

	public String getRectypdesc() {
		return this.rectypdesc;
	}

	public void setRectypdesc(String rectypdesc) {
		this.rectypdesc = rectypdesc;
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

	public List<TargetFieldDetails> getTrgtflddtls() {
		return this.trgtflddtls;
	}

	public void setTrgtflddtls(List<TargetFieldDetails> trgtflddtls) {
		this.trgtflddtls = trgtflddtls;
	}

	public TargetFieldDetails addTrgtflddtl(TargetFieldDetails trgtflddtl) {
		getTrgtflddtls().add(trgtflddtl);
		trgtflddtl.setTrgtrectype(this);

		return trgtflddtl;
	}

	public TargetFieldDetails removeTrgtflddtl(TargetFieldDetails trgtflddtl) {
		getTrgtflddtls().remove(trgtflddtl);
		trgtflddtl.setTrgtrectype(null);

		return trgtflddtl;
	}

}