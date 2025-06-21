package product;
import java.util.*;
public class lsearch {

	public static Product linearSearch(List<Product> prods,String sv) {
		// TODO Auto-generated constructor stub
		for(Product prod:prods) {
			if(prod.getprodId().equals(sv)) {
				return prod;
			}
		}
		return null;
	}
}
