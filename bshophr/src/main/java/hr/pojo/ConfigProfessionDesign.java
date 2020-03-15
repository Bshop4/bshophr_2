package hr.pojo;

import java.io.Serializable;

public class ConfigProfessionDesign implements Serializable{
	private int pd_id;
	private String profession_design_id;
	private String profession_design_name;
	
	
	public int getPd_id() {
		return pd_id;
	}
	public void setPd_id(int pd_id) {
		this.pd_id = pd_id;
	}
	public String getProfession_design_id() {
		return profession_design_id;
	}
	public void setProfession_design_id(String profession_design_id) {
		this.profession_design_id = profession_design_id;
	}
	public String getProfession_design_name() {
		return profession_design_name;
	}
	public void setProfession_design_name(String profession_design_name) {
		this.profession_design_name = profession_design_name;
	}
	

}
