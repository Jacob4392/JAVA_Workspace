


public class Ex06_Operation {

	public static void main(String[] args) {
		int sum = 0;
		//���Կ����� " +=, -=, *=, /= ...
		sum+=1; // sum = sum +1
		sum-=1; // sum = sum -1
		System.out.println("sum: " + sum);
		
		//������ ���� ����
		//����: A+ A- B+ B- ... F
		//������ ���� : 94��
		
		//�Ǵܱ���: 90�� �̻�>> A
		//�׷���: 95�� �̻�>> A+
		//�ƴ϶�� : A-
		//90(95 A+ �ƴϸ� A-).. 80.. 70.. ������ F
		
		int num = 95;
		
		if(num>=95) {
			System.out.println("A+");
		}else if(num>=90){
			System.out.println("A-");
		}else if(num>=85){
			System.out.println("B+");
		}else if(num>=80){
			System.out.println("B-");
		}else if(num>=75){
			System.out.println("C+");
		}else if(num>=70){
			System.out.println("C-");
		}else {
			System.out.println("F");
		}

		
		int score = 95;
		String grade = ""; //���ڿ��� �ʱ�ȭ
		System.out.println("����� ������: " + score);
		
		//���� ��� ����
		if(score>=90) {
			grade = "A";
			grade = (score>=95)?(grade+="+"):(grade+="-");
		}else if(score>=80) {
			grade = "B";
			grade = (score>=85)?(grade+="+"):(grade+="-");
		}else if(score>=70)	{
			grade = "C";
			grade = (score>=75)?(grade+="+"):(grade+="-");
		}else {
			grade = "F";
		}
		
		
		
		
	}

}
