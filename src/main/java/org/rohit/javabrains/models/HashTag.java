package org.rohit.javabrains.models;

public class HashTag {

	private String text;
	private int[] indices;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int[] getIndices() {
		return indices;
	}
	public void setIndices(int[] indices) {
		this.indices = indices;
	}
	
}
