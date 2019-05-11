package java最后一天;

public class two {
	public static void main(String[] args) {
			String ss=" ";
			String s1="";
			int sum=0;
			int j=0;
			for (int i = 0; i < 100; i++) {
			sum=i*i*i;
			s1=String.valueOf(sum);
			ss=String.valueOf(i);
			if(i<10)
			{	
				
				
				if(ss==s1) {
					j++;
					System.out.println(i);
				}
					
					
			}
			if(i<100&&i>10)
			{
				
				String dd=s1.substring(s1.length()-2, s1.length()-1);
				if(ss==dd) {
					System.out.println(i);
				}
					j++;
			}
			if(i<1000&&i>100)
			{
				
				String dd=s1.substring(s1.length()-3, s1.length()-1);
				if(ss==dd) {
					j++;
					System.out.println(i);
				}
					
			}
			if(i<10000&&i>1000)
			{
				
				String dd=s1.substring(s1.length()-3, s1.length()-1);
				if(ss==dd) {
					j++;
					System.out.println(i);
				}
					
			}
		}
	}
}
