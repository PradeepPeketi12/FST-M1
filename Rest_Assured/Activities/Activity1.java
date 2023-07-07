package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {
    String baseURI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void postRequest(){
            String reqBody =

                    " {\n" +
                            "                        \"id\" : 77232,\n" +
                            "                        \"name\" : \"Riley\",\n" +
                            "                        \"status\" : \"alive\"\n" +
                            "                      }";
        Response response = given().contentType(ContentType.JSON).body(reqBody).when().post(baseURI);
        System.out.println(response.getBody().asPrettyString());
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));

    }


    @Test(dependsOnMethods = "postRequest")
    public void getRequest(){
        Response response = given().contentType(ContentType.JSON)
                .when().pathParam("petId", 77232).get(baseURI + "/{petId}");

        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));

    }

    @Test(dependsOnMethods = "getRequest")
    public void deleteRequest(){
        Response response = given().contentType(ContentType.JSON)
                .when().pathParam("petId", 77232).get(baseURI + "/{petId}");

        response.then().statusCode(200);
        System.out.println("Deleted pet Id is : "+response.then().extract().path("id"));
    }
}
