package product;
import java.util.*;
public class bsearch {

	public static Product binarySearch(List<Product> sortedprod,String prodId) {
		// TODO Auto-generated constructor stub
		int low=0;
		int high=sortedprod.size()-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			Product midp=sortedprod.get(mid);
			String midpid=midp.getprodId();
			int comp=prodId.compareTo(midpid);
			if(comp==0) {
				return midp;
			}else if(comp<0) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return null;
	}
}

