package stream.other;

import java.io.Console;

public class ConsolTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("직업 : ");
		String job = console.readLine();
		System.out.println("비밀번호 : ");
		char[] readpas = console.readPassword();
		String strPass = new String(readpas);
	
		System.out.println(name);
		System.out.println(job);
		System.out.println(readpas);
	}
}
