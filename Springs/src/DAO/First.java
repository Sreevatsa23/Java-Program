package DAO;

public class First {

	public static void main(String[] args) {
		String str= "1 2j Welcome to 1457 Legato12";
		char[] s= {'1','2','3','4','5','6','7','8','9','0'};
		//String s=" ";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			Character c =str.charAt(i);
			if(str.charAt(i)!=' ')
			{
					
				count++;
			}
			if(Character.isDigit(c))
			{
				count--;
			}
		}
		System.out.println("count="+count);
	}
}
