package week5;

public class App{

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		
		logger.Log("Hello");
		System.out.println();
		logger.Error("Hello");
		System.out.println();
		
		Logger spaceLogger = new SpaceLogger();
		
		spaceLogger.Log("Hello");
		System.out.println();
		spaceLogger.Error("Hello");
		System.out.println();
		

	}
	
	
}