package org.rohit.javabrains.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UrlLink {

	private String link;
	private String expandedUrl;
	private String displayUrl;
	int[] indices;
	
	@JsonProperty("url")
	public String getLink() {
		return link;
	}
	public void setUrl(String link) {
		this.link = link;
	}
	@JsonProperty("expanded_url")
	public String getExpandedUrl() {
		return expandedUrl;
	}
	public void setExpandedUrl(String expandedUrl) {
		this.expandedUrl = expandedUrl;
	}
	public int[] getIndices() {
		return indices;
	}
	public void setIndices(int[] indices) {
		this.indices = indices;
	}
	@JsonProperty("display_url")
	public String getDisplayUrl() {
		return displayUrl;
	}
	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}
	
}
