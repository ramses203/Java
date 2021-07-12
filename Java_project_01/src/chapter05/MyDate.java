package chapter05;

    public class MyDate {

	private int day;
	private int month;
	private int year;
//==============================================
//  여기서부터 set 메서드
	
	public void setDay(){
    if(day == 2){
    	if(day<1 || day >28){
        System.out.println("입력값 오류입니다.");
        }
         else{
         this.day = day;
         }}}
         
         
	

	public void setmonth(){
    if (month <1 || month > 12){
    System.out.println("입력값 오류입니다.");
    }
       else{
       this.month = month;
    }}
   
    
	
	
    public void setyear(){
      this.year = year;
    }
    
//===========================================    
//  여기서부터 get 메서드   
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
