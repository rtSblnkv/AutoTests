package api;

import models.Resource;
import models.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ResourceApiTest {

    private static ResourceApi api;

    @BeforeAll
    public static void initializeApi()
    {
        api = new ResourceApi();
    }
    @Test
    void getResources() {
        List<Resource> resources = api.getResources();

        System.out.println(resources);

        assertThat(resources)
                .isNotNull()
                .extracting(Resource::getName).contains("cerulean");
    }

    @Test
    void getResource() {

        Resource resource = api.getResource(1);
        System.out.println(resource);

        assertThat(resource)
                .isNotNull()
                .extracting(Resource::getName).isEqualTo("cerulean");
    }
}