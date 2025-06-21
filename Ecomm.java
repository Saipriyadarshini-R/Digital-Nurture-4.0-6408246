package product;
import java.util.*;
public class Ecomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("p1","xxx","abc");
		Product p2=new Product("p11","yyy","abc");
		Product p3=new Product("p3","zzz","abc");
		Product p4=new Product("p10","aaa","pqr");
		List<Product> lsprod=new ArrayList<>();
		lsprod.add(p1);
		lsprod.add(p2);
		lsprod.add(p3);
		lsprod.add(p4);
		System.out.println("Linear Search");
		Product isPres=lsearch.linearSearch(lsprod, "p3");
		if(isPres!=null) {
			System.out.println("found!");
		}else {
			System.out.println("not found.");
		}
		isPres=lsearch.linearSearch(lsprod, "p9");
		if(isPres!=null) {
			System.out.println("found!");
		}else {
			System.out.println("not found.");
		}
		List<Product> bsprod=new ArrayList<>();
		bsprod.add(p1);
		bsprod.add(p2);
		bsprod.add(p3);
		bsprod.add(p4);
		Collections.sort(bsprod);
		System.out.println("Binary search");
		isPres=bsearch.binarySearch(bsprod, "p10");
		if(isPres!=null) {
			System.out.println("found!");
		}else {
			System.out.println("not found.");
		}
		isPres=bsearch.binarySearch(bsprod, "p9");
		if(isPres!=null) {
			System.out.println("found!");
		}else {
			System.out.println("not found.");
		}

	}

}
