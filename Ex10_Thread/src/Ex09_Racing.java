import java.util.ArrayList;

public class Ex09_Racing extends Thread {

	String name;
	int distance;
	public static ArrayList list = new ArrayList();

	public Ex09_Racing(String name) {
		this.name = name;
	} // ������

	public void run() {
		int boxNum = 0;
		String Mark = "";

		while (true) {
			try {
				if (distance > 30) {
					System.out.println(name + "���");
					list.add(name);
					break;
				}

				Thread.sleep(300);
				distance += (int) (Math.random() * 3) + 1;
				boxNum = distance / 5;
				for (int i = 0; i < boxNum; i++) {
					Mark += "��";
				}
				System.out.println(name + " " + Mark);
			}

			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Ex09_Racing R1 = new Ex09_Racing("1��ة");
		Ex09_Racing R2 = new Ex09_Racing("2��ة");
		Ex09_Racing R3 = new Ex09_Racing("3��ة");
		Ex09_Racing R4 = new Ex09_Racing("4��ة");
		Ex09_Racing R5 = new Ex09_Racing("5��ة");
		Ex09_Racing R6 = new Ex09_Racing("6��ة");

		Thread th1 = new Thread(R1);
		Thread th2 = new Thread(R2);
		Thread th3 = new Thread(R3);
		Thread th4 = new Thread(R4);
		Thread th5 = new Thread(R5);
		Thread th6 = new Thread(R6);

		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();

		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			th6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("�������� / " + (i + 1) + "�� : " + list.get(i));
		}

	}
}