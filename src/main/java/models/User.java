package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
	private int id;
	private String avatar;

	@JsonProperty(value="first_name")
	private String firstName;

    @JsonProperty(value="last_name")
    private String lastName;

	private String email;
}