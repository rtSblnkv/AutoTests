package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Resource{
	private String color;
	private int year;
	private String name;
	private int id;

	@JsonProperty(value="pantone_value")
	private String pantoneValue;
}