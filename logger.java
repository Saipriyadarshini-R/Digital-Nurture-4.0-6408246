package designpatterns;

public class logger {
	 private static logger instance;


	private logger() {
		// TODO Auto-generated constructor stub
		System.out.println("Logger instance created");
	}

	public static logger getInstance() {
		if (instance==null) {
			synchronized(logger.class) {
				if(instance==null) {
					instance= new logger();
				}
			}
		}
		return instance;
	}
	public void log(String message) {
		System.out.println(message);
	}

}
