package org.rohit.javabrains.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User {
	
	@Id
	private long id;
	private long idString;
	private String name;
	private String screenName;
	private String location;
	private String description;
	private String url;
	private Entities entities;
	private boolean isProtected;
	private long followersCount;
	private long friendsCount;
	private long listedCount;
	private String createdAt;
	private long favouritesCount;
	private int utcOffset;
	private String timeZone;
	private boolean isGeoEnabled;
	private boolean isVerified;
	private long statusesCount;
	private String lang;
	private boolean contributorsEnabled;
	private boolean isTranslator;
	private String profileBackgroundColor;
	private String profileBackgroundImageUrl;
	private String profileBackgroundImageUrlHttps;
	private boolean profileBackgroundTile;
	private String profileImageUrl;
	private String profileImageUrlHttps;
	private String profileBannerUrl;
	private String profileLinkColor;
	private String profileSidebarBorderColor;
	private String profileSidebarFillColor;
	private String profileTextColor;
	private boolean profileUseBackgroundImage;
	private boolean defaultProfile;
	private boolean defaultProfileImage;
	private String following;
	private boolean followRequestSent;
	private String notifications;
	public Entities getEntities() {
		return entities;
	}

	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@JsonProperty("id_str")
	public long getIdString() {
		return idString;
	}

	public void setIdString(long idString) {
		this.idString = idString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("screen_name")
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@JsonProperty("protected")
	public boolean isProtected() {
		return isProtected;
	}

	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}
	@JsonProperty("followers_count")
	public long getFollowersCount() {
		return followersCount;
	}
	
	public void setFollowersCount(long followersCount) {
		this.followersCount = followersCount;
	}
	@JsonProperty("friends_count")
	public long getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(long friendsCount) {
		this.friendsCount = friendsCount;
	}
	@JsonProperty("listed_count")
	public long getListedCount() {
		return listedCount;
	}

	public void setListedCount(long listedCount) {
		this.listedCount = listedCount;
	}
	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@JsonProperty("favourites_count")
	public long getFavouritesCount() {
		return favouritesCount;
	}

	public void setFavouritesCount(long favouritesCount) {
		this.favouritesCount = favouritesCount;
	}
	@JsonProperty("utc_offset")
	public int getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(int utcOffset) {
		this.utcOffset = utcOffset;
	}
	@JsonProperty("time_zone")
	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	@JsonProperty("geo_enabled")
	public boolean isGeoEnabled() {
		return isGeoEnabled;
	}

	public void setGeoEnabled(boolean isGeoEnabled) {
		this.isGeoEnabled = isGeoEnabled;
	}
	@JsonProperty("verified")
	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	@JsonProperty("statuses_count")
	public long getStatusesCount() {
		return statusesCount;
	}

	public void setStatusesCount(long statusesCount) {
		this.statusesCount = statusesCount;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	@JsonProperty("contributors_enabled")
	public boolean isContributorsEnabled() {
		return contributorsEnabled;
	}

	public void setContributorsEnabled(boolean contributorsEnabled) {
		this.contributorsEnabled = contributorsEnabled;
	}
	@JsonProperty("is_translator")
	public boolean isTranslator() {
		return isTranslator;
	}

	public void setTranslator(boolean isTranslator) {
		this.isTranslator = isTranslator;
	}
	@JsonProperty("profile_background_color")
	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}

	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}
	@JsonProperty("profile_background_image_url")
	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}
	@JsonProperty("profile_background_image_url_https")
	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}
	@JsonProperty("profile_background_tile")
	public boolean isProfileBackgroundTile() {
		return profileBackgroundTile;
	}

	public void setProfileBackgroundTile(boolean profileBackgroundTile) {
		this.profileBackgroundTile = profileBackgroundTile;
	}
	@JsonProperty("profile_image_url")
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	@JsonProperty("profile_image_url_https")
	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}
	@JsonProperty("profile_link_color")
	public String getProfileLinkColor() {
		return profileLinkColor;
	}

	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}
	@JsonProperty("profile_sidebar_border_color")
	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}
	@JsonProperty("profile_sidebar_fill_color")
	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}
	@JsonProperty("profile_text_color")
	public String getProfileTextColor() {
		return profileTextColor;
	}

	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}
	@JsonProperty("profile_use_background_image")
	public boolean isProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}

	public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}
	@JsonProperty("default_profile")
	public boolean isDefaultProfile() {
		return defaultProfile;
	}

	public void setDefaultProfile(boolean defaultProfile) {
		this.defaultProfile = defaultProfile;
	}
	@JsonProperty("default_profile_image")
	public boolean isDefaultProfileImage() {
		return defaultProfileImage;
	}

	public void setDefaultProfileImage(boolean defaultProfileImage) {
		this.defaultProfileImage = defaultProfileImage;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}
	@JsonProperty("follow_request_sent")
	public boolean isFollowRequestSent() {
		return followRequestSent;
	}

	public void setFollowRequestSent(boolean followRequestSent) {
		this.followRequestSent = followRequestSent;
	}

	public String getNotifications() {
		return notifications;
	}

	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}
	@JsonProperty("profile_banner_url")
	public String getProfileBannerUrl() {
		return profileBannerUrl;
	}

	public void setProfileBannerUrl(String profileBannerUrl) {
		this.profileBannerUrl = profileBannerUrl;
	}
}
