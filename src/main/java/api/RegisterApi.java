package api;

import models.RegLog;
import models.RegLogResponse;

import static io.restassured.RestAssured.given;

public class RegisterApi extends RestApi {

    public RegisterApi() {
        super();
    }

    public RegLogResponse registerUser(RegLog registerData)
    {
        return given().body(registerData).post().as(RegLogResponse.class);
    }

    @Override
    protected String getBasePath() {
        return EndPoints.REGISTER_BASE_PATH;
    }
}
