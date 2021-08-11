import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class RestTest{

    public static final RequestSpecification REQ_SPEC = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in")
            .setBasePath("/unknown")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();
    @Test
    public void getUsers(){
        String res =  given().spec(REQ_SPEC)
                .when().get()
                .then().statusCode(200)
                .extract().asString();


        System.out.println(res);

    }
}