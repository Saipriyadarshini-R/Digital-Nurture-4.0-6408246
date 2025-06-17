package designpatterns;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger log1=logger.getInstance();
		log1.log("1");
		logger log2=logger.getInstance();
		log2.log("2");
		if(log1==log2) {
			System.out.println("success");
			System.out.println("1)"+log1.hashCode());
			System.out.println("2)"+log2.hashCode());
		}else {
			System.out.println("fail");
		}

	}

}
