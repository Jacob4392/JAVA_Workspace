/*
 	synchronized
 	
 	Collection (vector, arraylist) 비교
 	
 	공유자원 : 여러명의 사용자(스레드)가 동시에 접근해서 사용
 	화장실 1개, 사람 10명(Thread 10개) >> Lock
 	Lock을 통해서 자원을 보호받습니다
 	
 	안전: 잠금장치 >> Lock
 	객체 단위의 Lock
 	함수 단위의 Lock(행 위에다가 걺)
 	
 	반대
 	
 	동시에 처리해야 할 때(자원을 보호할 필요가 없음)
 	
 	
 	
 	
 	
 	
 */

class Wroom {
	synchronized void openDoor(String name) {
		System.out.println(name + "님 화장실 입장");
		for(int i=0;i<100;i++) {
			System.out.println(name+"님 사용: "+i);
			if(i == 10) {
				System.out.println(name +"님");
			}
		}
		System.out.println("이용 종료");
	}
}

class User extends Thread {
	Wroom wr;
	String who;
	User(String name, Wroom w){
		this.who = name;
		this.wr = w;
	}
	
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}

public class Ex11_Sync {

	public static void main(String[] args) {
		//한강 둔치
		Wroom w = new Wroom();
		
		//사람들
		User kim = new User("김씨",w);
		User park = new User("박씨",w);
		User lee = new User("이씨",w);
		
		kim.start();
		park.start();
		lee.start();

	}

}
