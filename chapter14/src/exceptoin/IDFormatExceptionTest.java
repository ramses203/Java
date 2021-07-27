package exceptoin;

public class IDFormatExceptionTest {

	private String userID;
	private String userPassword;
	
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("아이디 값이 null 값일 수 없습니다.");
		}
		else if(userID.length()<8 || userID.length()>20){
			throw new IDFormatException("아이디는 8자이상 20자 이하로 쓰세요.");
		}
		
		this.userID = userID;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	
	public void setUserPassword(String userPassword) throws PasswordException{
		if(userPassword == null) {
			throw new PasswordException("비밀번호가 null 값일 수 없습니다.");
		}
		else if(userPassword.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다.");
		}
		else if(userPassword.length()<5) {
			throw new PasswordException("비밀번호는 5자 이하로 작성할 수 없습니다.");
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





































