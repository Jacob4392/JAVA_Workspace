/*

 *1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)

 *3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)

 *4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
 추후에는 별도의 클래스 분리해서 Lotto.java ..... 

 현재 main 함수 안에서 사용 ....연습...
조별 1개 입니다
 */



public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			//System.out.println(lotto[i]);
			for(int j=0;j<i;j++) {
				while(lotto[i]==lotto[j]) {
					lotto[i]=(int)(Math.random()*45 + 1);
				}
			}
		}
		
		
		for(int i = 0 ; i < lotto.length ;i++) {
			for(int j=i+1 ; j < lotto.length ; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
			
		}
		
		
		/*
		
	int i=0;
	int j=0;

	
	for(i=0;i<arr.length;i++) {
	for(j=0;j<i;j++) {
		while(arr[j] > arr[i]) {
			

		int min=0;
		if(min < arr[j]) {
			min = arr[j];
		}else {
			arr[j] = arr[i];
			arr[i] = min;
		}
		
		}
	}
	}
			 */

	  

	}
		
}

