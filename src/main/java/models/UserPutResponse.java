package models;

import lombok.Data;

@Data
public class UserPutResponse{
	private String name;
	private String job;
	private String updatedAt;
}