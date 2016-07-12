package org.rohit.javabrains.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entities {
	
	private Url url;
	private Url description;
	private List<HashTag> hashtags;
	private List<UrlLink>urls ;
	private List<UserMention> userMentions;
	private List<Media> media;
	
	public Url getUrl() {
		return url;
	}
	public void setUrl(Url url) {
		this.url = url;
	}
	public Url getDescription() {
		return description;
	}
	public void setDescription(Url description) {
		this.description = description;
	}
	public List<HashTag> getHashtags() {
		return hashtags;
	}
	public void setHashtags(List<HashTag> hashtags) {
		this.hashtags = hashtags;
	}
	@JsonProperty("user_mentions")
	public List<UserMention> getUserMentions() {
		return userMentions;
	}
	public void setUserMentions(List<UserMention> userMentions) {
		this.userMentions = userMentions;
	}
	public List<Media> getMedia() {
		return media;
	}
	public void setMedia(List<Media> media) {
		this.media = media;
	}

	public List<UrlLink> getUrls() {
		return urls;
	}

	public void setUrls(List<UrlLink> urls) {
		this.urls = urls;
	}
}
