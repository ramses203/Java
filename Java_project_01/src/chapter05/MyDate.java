package chapter05;

    public class MyDate {

	private int day;
	private int month;
	private int year;
//==============================================
//  ���⼭���� set �޼���
	
	public void setDay(){
    if(day == 2){
    	if(day<1 || day >28){
        System.out.println("�Է°� �����Դϴ�.");
        }
         else{
         this.day = day;
         }}}
         
         
	

	public void setmonth(){
    if (month <1 || month > 12){
    System.out.println("�Է°� �����Դϴ�.");
    }
       else{
       this.month = month;
    }}
   
    
	
	
    public void setyear(){
      this.year = year;
    }
    
//===========================================    
//  ���⼭���� get �޼���   
    public int getDay() {
		return day;
	}



	public int getMonth() {
		return month;
	}



	public int getYear() {
		return year;
	}



	public static void main(String[] args){

   

   



}}
