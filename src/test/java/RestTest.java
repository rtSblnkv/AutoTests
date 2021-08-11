import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.Resource;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;


public class RestTest{

    @Test
    public void getUsers(){
        List<Resource> resources =  given().spec(EndPoints.REQ_SPEC)
                .when().get()
                .then().statusCode(200)
                .extract().jsonPath().getList("data", Resource.class);

        assertThat(resources).extracting(Resource::getId).contains(1);



    }
}