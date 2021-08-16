package api;

import io.restassured.response.Response;
import models.User;
import models.UserCreateResponse;
import models.UserNameJob;
import models.UserUpdateResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.generators.UserGenerator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserApiTest {

    private static UserApi api;

    @BeforeAll
    public static void initializeApi()
    {
        api = new UserApi();
    }

    @Test
    public void getUsersFailed(){
        List<User> users = api.getUsers();
        System.out.println(users);

       assertThat(users)
                .isNotNull()
                .extracting(User::getEmail).contains("michael.lawson@reqres.in");
    }

    @Test
    public void getUsers(){
        List<User> users = api.getUsers();
        System.out.println(users);

        assertThat(users)
                .isNotNull()
                .extracting(User::getEmail).contains("eve.holt@reqres.in");
    }

    @Test
    public void getUser()
    {
        User user = api.getUser(1);
        System.out.println(user);
        assertThat(user)
                .isNotNull()
                .extracting(User::getEmail).isEqualTo("george.bluth@reqres.in");

    }

    @Test
    void createUser() {
        UserNameJob unj = UserGenerator.generateUser();

        UserCreateResponse ucr = api.createUser(unj);

        System.out.println(ucr);

        assertThat(ucr)
                .isNotNull()
                .extracting(UserNameJob::getName)
                .isEqualTo("name");
    }

    @Test
    void updateUser() {
        UserNameJob unj = UserGenerator.generateUser();
        UserUpdateResponse userUpdateResponse = api.updateUser(1,unj);

        System.out.println(userUpdateResponse );

        assertThat(userUpdateResponse)
                .isNotNull()
                .extracting(UserNameJob::getName).isEqualTo("name");
    }

    @Test
    void deleteUser() {
        Response response = api.deleteUser(2);
        System.out.println(response.getStatusCode());
        assertThat(response.getStatusCode() == 204);
    }
}