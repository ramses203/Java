package exceptoin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
public static void main(String[] args) {

		try {
			FileInputStream fi = new FileInputStream("a.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기까지 실행됩니다.");
	
	
}
}