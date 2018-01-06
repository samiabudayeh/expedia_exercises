package com.hotmail.sami.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hotmail.sami.modal.Hotel;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Service
public class HotelServiceImpl implements HotelService {

	private static final String HOTEL_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	public List<Hotel> findAllHotel(Hotel hotel) {
		try {

			Client client = Client.create();

			WebResource webResource = client.resource(HOTEL_URL);

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			if (response == null) {
				throw new RuntimeException("Failed : Client Response is null");
			}
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			if (output == null || output.isEmpty()) {
				throw new RuntimeException("Failed : Null Json Response");
			}
			Gson gson = new Gson();
			JsonElement jelement = new JsonParser().parse(output);
			if (jelement == null) {
				return null;
			}
			JsonObject jsonObject = jelement.getAsJsonObject();
			if (jsonObject == null || jsonObject.get("offers") == null
					|| jsonObject.get("offers").getAsJsonObject() == null
					|| jsonObject.get("offers").getAsJsonObject().get("Hotel") == null) {
				return null;
			}
			Hotel[] hotelArray = gson.fromJson(jsonObject.get("offers").getAsJsonObject().get("Hotel"), Hotel[].class);
			if (hotelArray == null) {
				return null;
			}
			return Arrays.asList(hotelArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}