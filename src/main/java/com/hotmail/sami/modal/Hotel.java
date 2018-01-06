package com.hotmail.sami.modal;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
 
@XmlType
public class Hotel {
	
	private OfferDateRange offerDateRange;
	
	private Destination destination;
	
	private HotelInfo hotelInfo;
	
	private HotelUrgencyInfo hotelUrgencyInfo;
	
	private HotelPricingInfo hotelPricingInfo;

	private HotelUrls hotelUrls;

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	} 
	
}
