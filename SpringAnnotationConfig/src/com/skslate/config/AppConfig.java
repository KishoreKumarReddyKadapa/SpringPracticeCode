package com.skslate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.skslate.annotations.AirtelStore;

@Configuration
@ComponentScan(basePackages = {"com.skslate","com.sk"})
//@PropertySource("classpath:data.properties")
@PropertySources(
		{
			@PropertySource("classpath:data.properties")
		}
	)
public class AppConfig {

//	@Bean
//	public Airtel getAirtelObj() {  // method name is act as reference 
//		AirtelStore as = getAirtelStoreObj();
//		return new Airtel(as);
//	}

//	@Bean("airtelStores")
//	public AirtelStore getAirtelStoreObj() {  // method name is act as reference 
//		return new AirtelStore();
//	}
//	@Bean("airtelStores2")
//	public AirtelStore getAirtelStoreObj2() {  // method name is act as reference 
//		return new AirtelStore();
//	}
//	
//	@Bean("airtelStores1")
//	@Primary 
//	public com.skslate.annotations.store.AirtelStore getAirtelStoreObj1() {  // method name is act as reference 
//		return new com.skslate.annotations.store.AirtelStore();
//	}
}
