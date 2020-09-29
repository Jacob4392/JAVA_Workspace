import java.util.ArrayList;

public class Ex09_Racing extends Thread {

	String name;
	int distance;
	public static ArrayList list = new ArrayList();

	public Ex09_Racing(String name) {
		this.name = name;
	} // »ı¼ºÀÚ

	public void run() {
		int boxNum = 0;
		String Mark = "";

		while (true) {
			try {
				if (distance > 30) {
					System.out.println(name + "Åë°ú");
					list.add(name);
					break;
				}

				Thread.sleep(300);
				distance += (int) (Math.random() * 3) + 1;
				boxNum = distance / 5;
				for (int i = 0; i < boxNum; i++) {
					Mark += "¡á";
				}
				System.out.println(name + " " + Mark);
			}

			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Ex09_Racing R1 = new Ex09_Racing("1¹øØ©");
		Ex09_Racing R2 = new Ex09_Racing("2¹øØ©");
		Ex09_Racing R3 = new Ex09_Racing("3¹øØ©");
		Ex09_Racing R4 = new Ex09_Racing("4¹øØ©");
		Ex09_Racing R5 = new Ex09_Racing("5¹øØ©");
		Ex09_Racing R6 = new Ex09_Racing("6¹øØ©");

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
			System.out.println("ÃÖÁ¾¼øÀ§ / " + (i + 1) + "µî : " + list.get(i));
		}

	}
}