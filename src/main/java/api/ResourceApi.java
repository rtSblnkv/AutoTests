package api;

import models.Resource;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ResourceApi extends RestApi {

    public ResourceApi() {
        super();
    }

    public List<Resource> getResources()
    {
        List<Resource> resources = given()
                .pathParams("id","")
                .get().jsonPath().getList("data",Resource.class);
        return resources;
    }

    public Resource getResource(int id)
    {
        Resource singleResource = given()
                .pathParams("id",id)
                .get().as(Resource.class);
        return singleResource;
    }

    @Override
    protected String getBasePath() {
        return EndPoints.RESOURCES_BASE_PATH;
    }
}
