package java_example_180524;

public class Ch6_20_Exercise {
	//필드 선언
	private String name;
	private int number;
	private int money;
	
	
	
	//생성자 선언
	//이름
	public String getOwnerName() 
	{
		return name;
	}
	public void setOwnerName(String name) 
	{
		this.name = name;
	}
	//계좌
	public int getAccountNumber() 
	{
		return number;
	}
	public void setAccountNumber(int number) 
	{
		this.number = number;
	}
	//잔고(돈)
	public int getValance() 
	{
	
		return money;
	}
	
	public void setValance(int money)
	{
		this.money = money;
		
		
	}
	//입금처리
	public void deposit(int i) 
	{
		this.money=this.money+i;
	}
	//출금처리및 잔고부족알림
    public void withdraw(int i) 
    {
    	this.money=this.money-i;
    	if(this.money<=0) 
    	{
    		System.out.println("잔고가 부족합니다.");
    		this.money = 0;
    	}
	}
	
	//출력.
	public void result() 
	{
		System.out.println("예금주 이름 : " + getOwnerName());
		System.out.println("계좌번호 : " + getAccountNumber());
		System.out.println("잔고 : " + getValance());
	}
	
	
	
	
	
}
