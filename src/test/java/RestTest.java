import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class RestTest{
    @Test
    public void getUsers(){
        String res =  given().
                baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200)
                .extract().asString();


        System.out.println(res);

    }
}