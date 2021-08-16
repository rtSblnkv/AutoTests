package api;

import io.restassured.response.Response;
import models.User;
import models.UserCreateResponse;
import models.UserNameJob;
import models.UserUpdateResponse;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserApi extends RestApi {

    public UserApi() {
        super();
    }

    public List<User> getUsers()
    {
        List<User> users = given()
                .pathParams("id","")
                .get()
                .jsonPath().getList("data",User.class);
        System.out.println(users);
        return users;
    }

    public User getUser(int id)
    {
        User user = given()
                .pathParams("id",id)
                .get().as(User.class);
        System.out.println(user);
        return user;
    }

    public UserCreateResponse createUser(UserNameJob userData)
    {
        return given()
                .pathParams("id","")
                .body(userData)
                .post().as(UserCreateResponse.class);
    }

    public UserUpdateResponse updateUser(int id,UserNameJob userData)
    {
        return given()
                .pathParams("id",id)
                .body(userData)
                .put().as(UserUpdateResponse.class);
    }

    public Response deleteUser(int id)
    {
        return given()
                .pathParams("id",id)
                .delete();
    }

    @Override
    protected String getBasePath() {
        return EndPoints.USER_BASE_PATH;
    }
}
