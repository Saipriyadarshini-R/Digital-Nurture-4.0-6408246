package product;

public class Product implements Comparable<Product>{
	private String prodId;
	private String prodName;
	private String category;

	public Product(String prodId,String prodName,String category) {
		// TODO Auto-generated constructor stub
		this.prodId=prodId;
		this.prodName=prodName;
		this.category=category;
	}
	public String getprodId() {
		return prodId;
	}
	public String getprodName() {
		return prodName;
	}
	public String getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return prodId+" "+prodName+" "+category;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null || getClass()!=obj.getClass()) return false;
		Product product=(Product)obj;
		return prodId.equals(product.prodId);
	}
	@Override
	public int hashCode() {
	    return prodId.hashCode();
	}
	@Override
	public int compareTo(Product other) {
        return this.prodId.compareTo(other.prodId);
    }
}
