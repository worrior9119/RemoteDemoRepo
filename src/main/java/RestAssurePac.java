import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class RestAssurePac {
    @Test
    public static void test1(){
        RestAssured.baseURI="http://localhost:3030";
        given().param("id","43900").
                when().
                get("/products").then().
                assertThat().statusCode(200).
                and().contentType(ContentType.JSON).
                and().body("total",comparesEqualTo(1)).
                and().body("data",hasSize(1)).
                and().body("data[0].id",comparesEqualTo(43900)).
                and().header("ETag","W/\"471-EkkpoDVqIFKRYrkRj8KVs1ZlZMs\"");
        System.out.println("Passed");
    }
}

