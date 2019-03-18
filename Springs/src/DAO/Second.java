package DAO;

public class Second {

	public static void main(String[] args) {
		String s="Welcom to Legato w";
		int count=0;
				for(int i=0;i<=s.length()-1;i++)
				{
					
					for(int j=i+1;j<=s.length()-1;j++)
					{
						if(s.charAt(i)==s.charAt(j))
						{
							count++;
						}
						
					}
					if(s.charAt(i)!=' ') {
						System.out.println(s.charAt(i)+"="+count);
						
				}
			
				}
				count=0;
	}

}
