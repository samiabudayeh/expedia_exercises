package com.hotmail.sami.modal;

import javax.xml.bind.annotation.XmlType;
 
@XmlType
public class HotelUrls {
	
	private String hotelInfositeUrl;
	
	private String hotelSearchResultUrl;

	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	} 
	
}
