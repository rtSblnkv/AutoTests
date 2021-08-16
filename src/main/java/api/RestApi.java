package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public abstract class RestApi {

    protected RequestSpecification REQ_SPEC;

    protected abstract String getBasePath();

   public RestApi()
   {
       REQ_SPEC =
               new RequestSpecBuilder()
                       .setBaseUri(EndPoints.BASE_URI)
                       .setBasePath(getBasePath())
                       .setContentType(ContentType.JSON)
                       .build();

       RestAssured.requestSpecification = REQ_SPEC;
   }


}
