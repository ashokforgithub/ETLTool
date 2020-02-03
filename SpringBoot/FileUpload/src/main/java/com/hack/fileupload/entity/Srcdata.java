package com.hack.fileupload.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tmpltfiledefn database table.
 * 
 */
@Entity
@Table(name = "srcdata", schema = "hksourceload")
public class Srcdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	private Long sourcdataid;

	@Column(nullable = false)
	private Long linenum;

	@Column(nullable = false)
	private Long templateid;

	@Column(nullable = false)
	private String templatekey;
	@Column(nullable = false)
	private String templatevalue;
	public Long getSourcdataid() {
		return sourcdataid;
	}
	public void setSourcdataid(Long sourcdataid) {
		this.sourcdataid = sourcdataid;
	}
	public Long getLinenum() {
		return linenum;
	}
	public void setLinenum(Long linenum) {
		this.linenum = linenum;
	}
	public Long getTemplateid() {
		return templateid;
	}
	public void setTemplateid(Long templateid) {
		this.templateid = templateid;
	}
	public String getTemplatekey() {
		return templatekey;
	}
	public void setTemplatekey(String templatekey) {
		this.templatekey = templatekey;
	}
	public String getTemplatevalue() {
		return templatevalue;
	}
	public void setTemplatevalue(String templatevalue) {
		this.templatevalue = templatevalue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}