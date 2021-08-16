package utils.generators;

import models.UserNameJob;

public class UserGenerator {

    public static UserNameJob generateUser()
    {
        return UserNameJob.builder()
                .name("name")
                .job("job")
                .build();
    }
}
