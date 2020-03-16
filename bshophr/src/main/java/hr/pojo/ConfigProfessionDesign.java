package hr.pojo;

import java.io.Serializable;

public class ConfigProfessionDesign implements Serializable{
	private int pdId;
	private String professionDesignName;
	
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public String getProfessionDesignName() {
		return professionDesignName;
	}
	public void setProfessionDesignName(String professionDesignName) {
		this.professionDesignName = professionDesignName;
	}
	
	
	

}
