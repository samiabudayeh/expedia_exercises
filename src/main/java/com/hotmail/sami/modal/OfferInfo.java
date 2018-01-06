package com.hotmail.sami.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="offerInfo") 
public class OfferInfo {
	
	private String siteID;
	
	private String language;
	
	private String currency;
	
	private String userSelectedCurrency;

	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUserSelectedCurrency() {
		return userSelectedCurrency;
	}

	public void setUserSelectedCurrency(String userSelectedCurrency) {
		this.userSelectedCurrency = userSelectedCurrency;
	}
	 
}
