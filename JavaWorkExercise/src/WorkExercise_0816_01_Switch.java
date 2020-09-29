import java.util.Scanner;


public class WorkExercise_0816_01_Switch {
	public static void main(String[] args) {
		Switching s = new Switching();
		s.switchingAlgorithm();
	}
}


class Switching{
	
	private int unit = 10000;
	private int num = 0;
	private boolean switching = false;
	
	public int getUnit() {return unit;}
	public int getNum() {return num;}
	public boolean isSwitching() {return switching;}

	
	public void switchingAlgorithm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int money = Integer.parseInt(sc.nextLine());

		while(unit>1) {
			num = (int)(money/unit);
			System.out.println("Unit:"+unit+ ", Num:"+num);
			money -= unit*num;
			
			if(switching == false) {
				unit = unit / 2;
				switching = true;
			}else {
				unit = unit / 5;
				switching = false;
			}	
		}
	}
}
	
