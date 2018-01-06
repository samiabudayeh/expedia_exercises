package com.hotmail.sami.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotmail.sami.modal.Hotel;
import com.hotmail.sami.service.HotelService;
 

@Controller
public class HotelController {

	private HotelService hotelService;

	@Autowired(required = true)
	@Qualifier(value = "hotelService")
	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService; 
	} 
 
	@RequestMapping("/hotel")
	public String init(@ModelAttribute("dep") Hotel hotel,Model model) {
		List<Hotel> hotelList = hotelService.findAllHotel(hotel);

		model.addAttribute("hotelList", hotelList);
		// returns the view name
		return "hotel";

	}
	
}
