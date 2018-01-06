package com.hotmail.sami.modal;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Persona {
	private String personaType;

	public String getPersonaType() {
		return personaType;
	}

	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	} 
}
