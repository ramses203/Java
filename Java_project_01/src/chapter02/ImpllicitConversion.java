package chapter02;

public class ImpllicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int iNum = bNum;

		System.out.println(bNum); // 1byte이다 : byte
		System.out.println(iNum); // 4byte이다 : int

		int iNum2 = 20;
		float fNum = iNum2;

		System.out.println(iNum2); // int형
		System.out.println(fNum); // float형

		double dNum;
		dNum = fNum + iNum; // float(20.0) + int(10)
		System.out.println(dNum); // int형과 float을 double형으로 변환해서 연산한 결과값이다.

	}

}
