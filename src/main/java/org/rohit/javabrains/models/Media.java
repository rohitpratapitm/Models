package org.rohit.javabrains.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Media {
	
	private long id;
	private String idString;
	private int[] indices;
	private String mediaUrl;
	private String mediaUrlHttps;
	private String url;
	private String displayUrl;
	private String expandedUrl;
	private String type;
	private Sizes sizes;
	
	public long getId() {
		return id;
	}
	@JsonProperty("id_str")
	public String getIdString() {
		return idString;
	}
	public int[] getIndices() {
		return indices;
	}
	@JsonProperty("media_url")
	public String getMediaUrl() {
		return mediaUrl;
	}
	@JsonProperty("media_url_https")
	public String getMediaUrlHttps() {
		return mediaUrlHttps;
	}
	public String getUrl() {
		return url;
	}
	@JsonProperty("display_url")
	public String getDisplayUrl() {
		return displayUrl;
	}
	@JsonProperty("expanded_url")
	public String getExpandedUrl() {
		return expandedUrl;
	}
	public String getType() {
		return type;
	}
	public Sizes getSizes() {
		return sizes;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public void setIndices(int[] indices) {
		this.indices = indices;
	}
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}
	public void setMediaUrlHttps(String mediaUrlHttps) {
		this.mediaUrlHttps = mediaUrlHttps;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}
	public void setExpandedUrl(String expandedUrl) {
		this.expandedUrl = expandedUrl;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setSizes(Sizes sizes) {
		this.sizes = sizes;
	}
	
	
	
}
