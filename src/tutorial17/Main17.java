package tutorial17;

public class Main17 {
	
	public static void main(String[] args) {
		
		String a = "I love You.";
		if(a.contains("love"))
		{
			// 포함하는 경우 실행되는 부분
			System.out.println("Me Too.");
		}
		else
		{
			// 포함되지 않는 경우 실행되는 부분
			System.out.println("I Hate you.");
		}	
		
	}

}
