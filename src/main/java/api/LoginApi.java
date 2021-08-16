package api;

import models.RegLog;
import models.RegLogResponse;

import static io.restassured.RestAssured.given;

public class LoginApi extends RestApi{

    public LoginApi() {
        super();
    }

    public RegLogResponse loginUser(RegLog loginData)
    {
        return given().body(loginData).post().as(RegLogResponse.class);
    }


    @Override
    protected String getBasePath() {
        return EndPoints.LOGIN_BASE_PATH;
    }
}
