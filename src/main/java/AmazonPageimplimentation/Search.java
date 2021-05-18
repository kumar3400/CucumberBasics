package AmazonPageimplimentation;

public class Search {
	
	public String displayProduct(Product product) {
		
		if(product.getProductList().contains(product.getProductname())) {
			
			return product.getProductname();
			
		}
		return null;
	}

}
