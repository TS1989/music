package com.music.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Forever
 * @version1.0
 */
@Entity
@Table(name="tb_artist")
public class Artist {
	private int a_id;
	private String a_name;
	private String a_sex;
	private String a_area;
	private String a_photopath;
	private String a_spellname;
	
	public Artist() {
		super();
	}
	public Artist(int a_id, String a_name, String a_sex, String a_area,
			String a_photopath, String a_spellname) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_sex = a_sex;
		this.a_area = a_area;
		this.a_photopath = a_photopath;
		this.a_spellname = a_spellname;
	}
	
	@Id
	@GeneratedValue
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_sex() {
		return a_sex;
	}
	public void setA_sex(String a_sex) {
		this.a_sex = a_sex;
	}
	public String getA_area() {
		return a_area;
	}
	public void setA_area(String a_area) {
		this.a_area = a_area;
	}
	public String getA_photopath() {
		return a_photopath;
	}
	public void setA_photopath(String a_photopath) {
		this.a_photopath = a_photopath;
	}
	public String getA_spellname() {
		return a_spellname;
	}
	public void setA_spellname(String a_spellname) {
		this.a_spellname = a_spellname;
	}
}
