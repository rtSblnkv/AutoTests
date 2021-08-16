package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int id;

    private String email;

	private String firstName;

    private String lastName;

    @JsonProperty(value="avatar")
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