import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class EndPoints {
    public static final String BASE_URI = "https://reqres.in";
    public static final String USERS_BASE_PATH = "/users/{id}";
    public static final String RESOURCES_BASE_PATH = "/unknown/{id}";

    public static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
            .setBaseUri(BASE_URI)
            .setBasePath("/unknown")
            .setContentType(ContentType.JSON)
            .build();
}
