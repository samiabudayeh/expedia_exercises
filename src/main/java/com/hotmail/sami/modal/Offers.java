package com.hotmail.sami.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="offers") 
public class Offers {
	
	@XmlElement(name="Hotel") 
	private Hotel Hotel;

	public Hotel getHotel() {
		return Hotel;
	}

	public void setHotel(Hotel Hotel) {
		this.Hotel = Hotel;
	} 
}
