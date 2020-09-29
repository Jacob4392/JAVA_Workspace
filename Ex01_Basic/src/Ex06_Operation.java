


public class Ex06_Operation {

	public static void main(String[] args) {
		int sum = 0;
		//대입연산자 " +=, -=, *=, /= ...
		sum+=1; // sum = sum +1
		sum-=1; // sum = sum -1
		System.out.println("sum: " + sum);
		
		//간단한 학점 계산기
		//학점: A+ A- B+ B- ... F
		//데이터 점수 : 94점
		
		//판단기준: 90점 이상>> A
		//그러나: 95점 이상>> A+
		//아니라면 : A-
		//90(95 A+ 아니면 A-).. 80.. 70.. 나머지 F
		
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
		String grade = ""; //문자열의 초기화
		System.out.println("당신의 점수는: " + score);
		
		//학점 계산 로직
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
