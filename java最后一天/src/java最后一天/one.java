package java最后一天;

public class one {
	public static void main(String[] args) {
		int w=0;
		for (int i = 0; i < 60; i++) {
			if(i>=21&&i<=50) {
				
				if(i%2==0) {
					w++;
					System.out.println(i);
				}
			}
			
		}
		System.out.println(w);
	}
}
