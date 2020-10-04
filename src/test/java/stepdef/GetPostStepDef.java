package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetPostStepDef {

    @Given("^User perform Get Operation to get all list of products$")
    public void user_perform_get_operation_to_get_all_list_of_products() throws Throwable {
       BDDStyleMethod.simpleGetPost();
    }

    @And("^User verify the total products and limits$")
    public void user_verify_the_total_products_and_limits() throws Throwable {

    }

}
