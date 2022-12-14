package com.skslate.autowire;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class AirtelStore {
	@Value("${mandal.storeArea}")
	private String storeArea;
	@Value("${mandal.buildingName}")
	private String buildingName;
	@Value("${mandal.pincode}")
	private Integer pincode;
	
	public AirtelStore() {
		
	}
	
	public String getStoreArea() {
		return storeArea;
	}
	public void setStoreArea(String storeArea) {
		this.storeArea = storeArea;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AirtelStore [storeArea=" + storeArea + ", buildingName=" + buildingName + ", pincode=" + pincode + "]";
	}
	
	

}
