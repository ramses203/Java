package object;

public class StringTest2 {
public static void main(String[] args) {
	
	String javaStr = new String("java");
	String androidStr = new String("android");
	System.out.println(javaStr);
	System.out.println("ó�� ���ڿ� �ּҰ�: " + System.identityHashCode(javaStr) );
	
	
	
	javaStr = javaStr.concat(androidStr);
	
	System.out.println(javaStr);
	System.out.println("����� ���ڿ� �ּҰ�: " + System.identityHashCode(javaStr));
	
	
	
}
}
