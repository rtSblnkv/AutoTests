import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class EndPoints {
    public static final String USERS_BASE_PATh = "/users/{id}";
    public static final String RESOURCES_BASE_PATH = "/unknown/{id}";

    public static final RequestSpecification REQ_SPEC = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in")
            .setBasePath("/unknown")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();


}
