package tutorial19;

public class Main19 {
	
	public static void main(String[] arg) {
		
		
		String a = "man";
		int b = 0;
		
		// 자바는 string을 비교할때 equal(.)을 이용한다
		// 그이유는 string은 다른 자료형과 다른 문자형 자료형이기 때문이다.
		if(a.equals("man"))
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
			
		}
		if(b == 3)
		{
			System.out.println("b는 3입니다.");
		}
		else
		{
			System.out.println("3이 아닙니다.");
			
			
		}
		if(a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("참입니다");
			
		}
		else 
		{
			System.out.println("거짓입니다");
			
			// 조건문 활용해보기
			
		}
		
	}

}
