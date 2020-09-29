/*
 	���α׷� >> ���� >> ���μ��� >> �ּ� �ϳ��� ������(�ϳ��� stack)
 	>>JVM�� �ϳ��� main thread(stack) ����
 	
 	���ݱ��� : �̱� ���μ���>> �̱� ������ >> main ���� �ö󰡼� �ϳ��� ����
 	JVM > call stack ���� > main �Լ� ����
 	
 	
 	stack 1�� �Լ��� 10���� ����������, �ѹ��� 1���� �Լ� ����
 */
public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("main �ϲ�");
		worker1();
		worker2();
		System.out.println("main �ϲ� ����");

	}
	
	static void worker1() {
		System.out.println("1�� �ϲ�");
	}
	
	static void worker2() {
		System.out.println("2�� �ϲ�");
	}

}
