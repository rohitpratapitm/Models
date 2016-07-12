package org.rohit.javabrains.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	
    private String message;
    private Date created;
    private String author;

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    public Comment() {
    }
    
    public Comment(String message, String author) {
    	this.message = message;
    	this.author = author;
    	this.created = new Date();
    }
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
