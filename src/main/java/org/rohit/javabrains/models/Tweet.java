package org.rohit.javabrains.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Tweet {

	private String text;
	private String createdAt;
	@Id
	private long tweetId;
	private String userName;
	
	public String getText() {
		return text;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public long getTweetId() {
		return tweetId;
	}
	public String getUserName() {
		return userName;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public void setTweetId(long tweetId) {
		this.tweetId = tweetId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Id : "+getTweetId()+"\n");
		builder.append("CreatedAt : "+getCreatedAt()+"\n");
		builder.append("Text : "+getText()+"\n");
		builder.append("User : "+getUserName()+"\n");
		
		return builder.toString();
	}
	
}
