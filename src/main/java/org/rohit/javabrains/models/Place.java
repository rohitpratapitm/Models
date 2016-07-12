package org.rohit.javabrains.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Place {
	
	private String id;
	private String url;
	private String placeType;
	private String name;
	private String fullName;
	private String countryCode;
	private String country;
	private int[] polylines;
	private Box boundingBox;
	private Object attributes;
	
	public String getId() {
		return id;
	}
	public String getUrl() {
		return url;
	}
	@JsonProperty("place_type")
	public String getPlaceType() {
		return placeType;
	}
	public String getName() {
		return name;
	}
	@JsonProperty("full_name")
	public String getFullName() {
		return fullName;
	}
	@JsonProperty("country_code")
	public String getCountryCode() {
		return countryCode;
	}
	public String getCountry() {
		return country;
	}
	public int[] getPolylines() {
		return polylines;
	}
	@JsonProperty("bounding_box")
	public Box getBoundingBox() {
		return boundingBox;
	}
	public Object getAttributes() {
		return attributes;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPolylines(int[] polylines) {
		this.polylines = polylines;
	}
	public void setBoundingBox(Box boundingBox) {
		this.boundingBox = boundingBox;
	}
	public void setAttributes(Object attributes) {
		this.attributes = attributes;
	}
	
	
}
