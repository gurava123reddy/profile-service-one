package com.thinkconstructive.profileserviceone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {
	
	@GetMapping(value = "/{profileId}")
	public Profile getProfile(@PathVariable("profileId") String profileId) {
		
		List<String> posts = new ArrayList<>();
		posts.add("post 1");
		posts.add("post 2");
		
		List<String> notifications = new ArrayList<>();
		notifications.add("Notification 1");
		notifications.add("Notification 2");
		
		return new Profile("1", posts, notifications);
		
		
	}

}
