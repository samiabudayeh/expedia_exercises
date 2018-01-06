package com.hotmail.sami.modal;

import javax.xml.bind.annotation.XmlType;

import lombok.Data;

@XmlType
public @Data class HotelUrgencyInfo {

	private int airAttachRemainingTime;
	
	private long numberOfPeopleViewing;
	
	private int numberOfPeopleBooked;
	
	private int numberOfRoomsLeft;
	
	private long lastBookedTime;
	
	private String almostSoldStatus;
	
	private String link;
	
	private boolean airAttachEnabled;

	public int getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(int airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public long getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(long numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public int getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public int getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public long getLastBookedTime() {
		return lastBookedTime;
	}

	public void setLastBookedTime(long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}

	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}
	 
}
