package exceptoin;

public class IDFormatExceptionTest {

	private String userID;
	private String userPassword;
	
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("���̵� ���� null ���� �� �����ϴ�.");
		}
		else if(userID.length()<8 || userID.length()>20){
			throw new IDFormatException("���̵�� 8���̻� 20�� ���Ϸ� ������.");
		}
		
		this.userID = userID;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	
	public void setUserPassword(String userPassword) throws PasswordException{
		if(userPassword == null) {
			throw new PasswordException("��й�ȣ�� null ���� �� �����ϴ�.");
		}
		else if(userPassword.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�.");
		}
		else if(userPassword.length()<5) {
			throw new PasswordException("��й�ȣ�� 5�� ���Ϸ� �ۼ��� �� �����ϴ�.");
		}
		
		this.userPassword = userPassword;
	}
	
	public static void main(String[] args) {
		
		IDFormatExceptionTest IDE = new IDFormatExceptionTest();
		
		String userID = null; 
		try {
			IDE.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			IDE.setUserID(userID);
		}
		catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	
		
		String userPassword = null;
		try {
			IDE.setUserPassword(userPassword);
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPassword = "sjdfkhal";
		try {
			IDE.setUserPassword(userPassword);
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPassword = "1234";
		try {
			IDE.setUserPassword(userPassword);
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}





































