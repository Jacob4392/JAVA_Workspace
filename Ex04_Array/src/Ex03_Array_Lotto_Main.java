/*

 *1. 1~45������ ������ �߻����� 6���� �迭�� ��������
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)

 *3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)

 *4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
 ���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 

 ���� main �Լ� �ȿ��� ��� ....����...
���� 1�� �Դϴ�
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

