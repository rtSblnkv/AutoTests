package models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.DateDeserializer;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserCreateResponse extends UserNameJob{
	private int id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss:SSSZ")
    @JsonDeserialize(using = DateDeserializer.class)
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ",name="+ getName()+
                '}';
    }

}