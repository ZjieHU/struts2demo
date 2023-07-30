package struts2demo;

import java.io.IOException;

public class Main {
	
	public static void out() {
		try {
			Runtime.getRuntime().exec("open -a Calculator");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
