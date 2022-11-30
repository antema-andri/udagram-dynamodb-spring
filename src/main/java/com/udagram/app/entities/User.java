package com.udagram.app.entities;

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
@DynamoDBTable(tableName = "User")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class User {
	private static final long serialVersionUID = 1L;
	
	@DynamoDBHashKey
	private Long id;
	@DynamoDBAttribute
	private String email;
	@DynamoDBAttribute
	private String passwordHash;
	@DynamoDBAttribute
	private Date createdAt;
	@DynamoDBAttribute
	private Date updatedAt;
}
