package stream.other;

import java.io.Console;

public class ConsolTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("�̸� : ");
		String name = console.readLine();
		System.out.println("���� : ");
		String job = console.readLine();
		System.out.println("��й�ȣ : ");
		char[] readpas = console.readPassword();
		String strPass = new String(readpas);
	
		System.out.println(name);
		System.out.println(job);
		System.out.println(readpas);
	}
}
