package com.udagram.app.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udagram.app.entities.FeedItem;
import com.udagram.app.service.FeedItemService;

@RestController
@RequestMapping("/feeds")
public class FeedController {
	@Autowired
	FeedItemService feedItemService;
	
	@GetMapping
	public ResponseEntity<Iterable<FeedItem>> getAll() {
		return ResponseEntity.ok(feedItemService.getFeeds());
	}
	
	@PostMapping
	public ResponseEntity<FeedItem> add(@RequestBody FeedItem feedItem) {
		return ResponseEntity.ok(feedItemService.add(feedItem));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<FeedItem>> findById(@PathVariable Long id) {
		return ResponseEntity.ok(feedItemService.findById(id));
	}
}
