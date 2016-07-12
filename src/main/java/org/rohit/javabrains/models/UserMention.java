package org.rohit.javabrains.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserMention {

	private String screenName;
	private String name;
	private long id;
	private String idString;
	private int[] indices;
	
	@JsonProperty("screen_name")
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@JsonProperty("id_str")
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public int[] getIndices() {
		return indices;
	}
	public void setIndices(int[] indices) {
		this.indices = indices;
	}
	
	
}
