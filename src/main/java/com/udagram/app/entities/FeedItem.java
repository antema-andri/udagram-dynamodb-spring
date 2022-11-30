package com.udagram.app.entities;

import java.io.Serializable;
import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@DynamoDBDocument
@DynamoDBTable(tableName = "FeedItem")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class FeedItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@DynamoDBHashKey
	private Long id;
	@DynamoDBAttribute
	private String caption;
	@DynamoDBAttribute
	private String url;
	
	@DynamoDBAttribute
	private Date createdAt;
	@DynamoDBAttribute
	private Date updatedAt;
}
