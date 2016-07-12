package org.rohit.javabrains.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TwitterRecord {

	private String createdAt;
	private long id;
	private String idString;
	private String text;
	private String source;
	private boolean truncated;
	private String inReplyToStatusId;
	private String inReplyToStatusIdStr;
	private String inReplyToUserId;
	private String inReplyToUserIdStr;
	private String inReplyToScreeName;
	private User user;
	private Point geo;
	private Point coordinates;
	private Place place;
	private String contributors;
	private long retweetCount;
	private Entities entities;
	private boolean favorited;
	private boolean retweeted;
	private boolean possiblySensitive;
	private String lang;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean isTruncated() {
		return truncated;
	}

	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}
	@JsonProperty("in_reply_to_status_id")
	public String getInReplyToStatusId() {
		return inReplyToStatusId;
	}

	public void setInReplyToStatusId(String inReplyToStatusId) {
		this.inReplyToStatusId = inReplyToStatusId;
	}
	@JsonProperty("in_reply_to_status_id_str")
	public String getInReplyToStatusIdStr() {
		return inReplyToStatusIdStr;
	}

	public void setInReplytoStatusIdStr(String inReplytoStatusIdStr) {
		this.inReplyToStatusIdStr = inReplytoStatusIdStr;
	}
	@JsonProperty("in_reply_to_user_id")
	public String getInReplyToUserId() {
		return inReplyToUserId;
	}

	public void setInReplyToUserId(String inReplyToUserId) {
		this.inReplyToUserId = inReplyToUserId;
	}
	@JsonProperty("in_reply_to_user_id_str")
	public String getInReplyToUserIdStr() {
		return inReplyToUserIdStr;
	}

	public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
		this.inReplyToUserIdStr = inReplyToUserIdStr;
	}
	@JsonProperty("in_reply_to_screen_name")
	public String getInReplyToScreeName() {
		return inReplyToScreeName;
	}

	public void setInReplyToScreeName(String inReplyToScreeName) {
		this.inReplyToScreeName = inReplyToScreeName;
	}

	public Point getGeo() {
		return geo;
	}

	public void setGeo(Point geo) {
		this.geo = geo;
	}

	public Point getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Point coordinates) {
		this.coordinates = coordinates;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getContributors() {
		return contributors;
	}

	public void setContributors(String contributors) {
		this.contributors = contributors;
	}
	@JsonProperty("retweet_count")
	public long getRetweetCount() {
		return retweetCount;
	}

	public void setRetweetCount(long retweetCount) {
		this.retweetCount = retweetCount;
	}

	public Entities getEntities() {
		return entities;
	}

	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public boolean isRetweeted() {
		return retweeted;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}
	@JsonProperty("possibly_sensitive")
	public boolean isPossiblySensitive() {
		return possiblySensitive;
	}

	public void setPossiblySensitive(boolean possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
