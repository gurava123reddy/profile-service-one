package com.thinkconstructive.profileserviceone;

import java.util.List;

public class Profile {
	
	private String profileId;
	private List<String> posts;
	private List<String> notifications;
	
	public Profile() {}
	
	public Profile(String profileId, List<String> posts, List<String> notifications) {
		super();
		this.profileId = profileId;
		this.posts = posts;
		this.notifications = notifications;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public List<String> getPosts() {
		return posts;
	}

	public void setPosts(List<String> posts) {
		this.posts = posts;
	}

	public List<String> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<String> notifications) {
		this.notifications = notifications;
	}
}
