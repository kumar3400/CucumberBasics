package StepDefinitions;

import AmazonPageimplimentation.Product;
import AmazonPageimplimentation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {

	Product product;

	Search search;

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("step.1 iam on serachpage");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productname, Integer price) {
		System.out.println("step.2 Search the product name:" + productname + "price is" + price);

		product = new Product(productname, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productname) {

		System.out.println("step.3 Search the productname:" + productname + "is displayed");

		search = new Search();
		
	String name  =	search.displayProduct(product);
		
		System.out.println("search product is:"+name);
		
		Assert.assertEquals(product.getProductname(), name);

	}
	//this is for reg expressions in cucumber 
	@Then("^order name is \"([^\"]+)\" and price is (\\d+)$")
	public void order_id_is_username_is(String  ordername, Integer price) {
	    System.out.println(ordername + " "+price );
	}

}
