package stepdef;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BDDStyleMethod {
    private static Response response;
//    Response response;

    public static void simpleGetPost() {
        RestAssured.baseURI = "http://localhost:3030";
        response = given().
                body("{" +
                        "\"name\":\"New Product\"," +
                        "\"type\":\"Hard Good\"," +
                        "\"upc\":\"12345676\"," +
                        "\"price\":99.99," +
                        "\"description\":\"This is a placeholder request for creating a new product.\"," +
                        "\"model\":\"NP12345\"" +
                        "}").
                when().post("/products").
                then().
                assertThat().statusCode(201).
                extract().response();

        String responseString = response.asString();
        System.out.println(responseString);
        System.out.println("{" +
                "\"name\":\"New Product\"," +
                "\"type\":\"Hard Good\"," +
                "\"upc\":\"12345676\"," +
                "\"price\":99.99," +
                "\"description\":\"This is a placeholder request for creating a new product.\"," +
                "\"model\":\"NP12345\"" +
                "}");
    }
}
