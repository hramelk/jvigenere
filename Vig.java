import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vig {
	
	public static void main(String[] args) {
		// String text = "";
		String key = "";
		if (args.length < 2) {
			String filename = new java.io.File(Vig.class.getProtectionDomain()
					.getCodeSource().getLocation().getPath()).getName();
			System.out.println("Usage: " + filename
					+ " -e[ncode] || -d[ecode] <KEY>");
			System.exit(0);
		}
		String action = args[0];
		key = args[1];
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(isReader);
		try {
			String inputStr = bufReader.readLine();
			if (inputStr != null) {
				// text += inputStr + "\n";
				doSomething(inputStr, key, action);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void doSomething(String text, String key, String action) {
		if (action.equals("-e") || action.equals("-encode")) {
			System.out.println(Vigenere5.encode(text, key));
		} else if (action.equals("-d") || action.equals("-decode")) {
			System.out.println(Vigenere5.decode(text, key));
		} else {
			System.out.println("Wrong argument");
			System.exit(0);
		}
	}
}
