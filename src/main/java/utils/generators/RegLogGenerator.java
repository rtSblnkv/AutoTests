package utils.generators;

import models.RegLog;

public class RegLogGenerator {

    public static RegLog generateRegisterOrLoginData()
    {
        return RegLog.builder()
                .email("email")
                .password("password")
                .build();
    }
}
