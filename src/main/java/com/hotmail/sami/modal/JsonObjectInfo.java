package com.hotmail.sami.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JsonObjectInfo {

	
	private UserInfo userInfo;	
	 
	private OfferInfo oOfferInfo;	
	
	private Offers offers;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public OfferInfo getoOfferInfo() {
		return oOfferInfo;
	}

	public void setoOfferInfo(OfferInfo oOfferInfo) {
		this.oOfferInfo = oOfferInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	} 
}
