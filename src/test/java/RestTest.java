
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.Resource;

import org.junit.jupiter.api.Test;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class RestTest{
    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
                    .setBaseUri(EndPoints.BASE_URI)
                    .setBasePath("/unknown")
                    .setContentType(ContentType.JSON)
                    .build();


    @Test
    public void getUsers(){
        List<Resource> resources =  given().spec(REQ_SPEC)
                .when().get()
                .then().statusCode(200)
                .extract().jsonPath().getList("data", Resource.class);

        assertThat(resources).extracting(Resource::getId).contains(1);
    }

    @Test
    public void createUser()
    {

    }
}