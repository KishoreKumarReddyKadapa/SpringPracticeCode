package com.skslate.annotations.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.skslate.Store;
@Component("airtelStore1") //<bean tag in xml file --> id="reference variable", class="complete package + Class Name"
@Primary   
public class AirtelStore implements Store {
	@Value("${city.storeArea}")
	private String storeArea;
	@Value("${city.buildingName}") // <property tag in xml file
	private String buildingName;
	@Value("12345")
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

	@Override
	public String getBeanName() {
		// TODO Auto-generated method stub
		return "Madhapur Bean";
	}
	
	

}
