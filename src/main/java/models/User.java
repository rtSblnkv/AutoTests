package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int id;

    private String email;

    @JsonProperty(value="first_name")
	private String firstName;

    @JsonProperty(value="last_name")
    private String lastName;

    private String avatar;

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                "}\n";
    }
}