package week5;

public class AsteriskLogger implements Logger {

	@Override
	
	public void Log(String log) {
		System.out.println("***" + log + "***");

	}

	@Override
	public void Error(String error) {
			System.err.println(asterisks(error));
			System.err.println("***" + "ERROR: " + error + "***");
			System.err.println(asterisks(error));
			System.out.println();
			}
			
		public String asterisks(String error) {
			String asteriskAdding = "";
			
			int asterisk = 13 + error.length(); 
			for(int i = 1; i <= asterisk; i++) {
			asteriskAdding += "*";
		}
			return asteriskAdding;
		}

}
