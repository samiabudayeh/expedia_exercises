package com.hotmail.sami.modal;
 
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlType
public @Data class HotelInfo  { 

	private long hotelId;
	
	private String hotelName;
	
	private String localizedHotelName;
	
	private String hotelDestination;
	
	private long hotelDestinationRegionID;
	
	private String hotelLongDestination;
	
	private String hotelStreetAddress;
	
	private String hotelCity;
	
	private String hotelProvince;
	
	private String hotelCountryCode;
	
	private double hotelLatitude;
	
	private String hotelLongitude;
	
	private double hotelStarRating;
	
	private double hotelGuestReviewRating;
	
	private int hotelReviewTotal;
	
	private String hotelImageUrl;
	
	@XmlElement(name="isOfficialRating") 
	private boolean officialRating;

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocalizedHotelName() {
		return localizedHotelName;
	}

	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public long getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(long hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public String getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(String hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public double getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(double hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public int getHotelReviewTotal() {
		return hotelReviewTotal;
	}

	public void setHotelReviewTotal(int hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public boolean isOfficialRating() {
		return officialRating;
	}

	public void setOfficialRating(boolean officialRating) {
		this.officialRating = officialRating;
	}
 
}
