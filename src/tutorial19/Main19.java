package tutorial19;

public class Main19 {
	
	public static void main(String[] arg) {
		
		
		String a = "man";
		int b = 0;
		
		// �ڹٴ� string�� ���Ҷ� equal(.)�� �̿��Ѵ�
		// �������� string�� �ٸ� �ڷ����� �ٸ� ������ �ڷ����̱� �����̴�.
		if(a.equals("man"))
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("���ڰ� �ƴմϴ�.");
			
		}
		if(b == 3)
		{
			System.out.println("b�� 3�Դϴ�.");
		}
		else
		{
			System.out.println("3�� �ƴմϴ�.");
			
			
		}
		if(a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("���Դϴ�");
			
		}
		else 
		{
			System.out.println("�����Դϴ�");
			
			// ���ǹ� Ȱ���غ���
			
		}
		
	}

}
