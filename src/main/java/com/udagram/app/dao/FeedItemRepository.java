package com.udagram.app.dao;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udagram.app.entities.FeedItem;

@EnableScan
@Repository
public interface FeedItemRepository extends CrudRepository<FeedItem, Long>{
	
}
