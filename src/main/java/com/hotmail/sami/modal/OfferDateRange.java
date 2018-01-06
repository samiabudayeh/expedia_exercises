package com.hotmail.sami.modal;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlType
public class OfferDateRange {
	
	private List<Integer> travelStartDate;
	
	private List<Integer> travelEndDate;
	
	private int lengthOfStay;

	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	
	public String getTravelStartDateValue() {
		if (travelStartDate == null ||
			travelStartDate.isEmpty() ||
			travelStartDate.size() < 3) {
			return "";
		}
		return travelStartDate.get(0).toString()
				.concat("-")
				.concat(travelStartDate.get(1).toString())
				.concat("-")
				.concat(travelStartDate.get(2).toString());
	}
	
	public String getTravelEndDateValue() {
		if (travelEndDate == null ||
			travelEndDate.isEmpty() ||
			travelEndDate.size() < 3) {
			return "";
		}
		return travelEndDate.get(0).toString()
				.concat("-")
				.concat(travelEndDate.get(1).toString())
				.concat("-")
				.concat(travelEndDate.get(2).toString());
	}
}
