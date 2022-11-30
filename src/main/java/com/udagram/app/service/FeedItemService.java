package com.udagram.app.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udagram.app.dao.FeedItemRepository;
import com.udagram.app.entities.FeedItem;

@Service
public class FeedItemService {
	@Autowired
	FeedItemRepository feedItemRepository;
	
	public Iterable<FeedItem> getFeeds() {
		return feedItemRepository.findAll();
	}
	
	public Optional<FeedItem> findById(Long id) {
		return feedItemRepository.findById(id);
	}
	
	public FeedItem add(FeedItem feedItem) {
		feedItem.setCreatedAt(new Date());
		feedItem.setUpdatedAt(new Date());
		return feedItemRepository.save(feedItem);
	}
	
	public void delete(Long id) {
		boolean isExist = feedItemRepository.existsById(id);
		if(isExist) {
			feedItemRepository.deleteById(id);
		}
	}
	
	public FeedItem update(FeedItem feedItem, Long id) {
		boolean isExist = feedItemRepository.existsById(id);
		if(isExist) {
			feedItem.setId(id);
			return feedItemRepository.save(feedItem);
		}
		return null;
	}
}
