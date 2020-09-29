import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

/*
문제
main 함수 제외한 Thread 2개 생성
1. 시간(time) 제어하는 Thread
2. 단어 입력을 처리하는 Thread

main 함수 2개 실행

단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요
hint) 공유자원 (static)

Thread : 상태정보 

join : 다른 스레드의 종료를 기다림 (휴게실에서)

다양한 계산 작업 ... 각 행성별 거리를 구해서  ... 그 합산한 결과 ...
10 개   ... 1개  ... 합산 

main 스레드에게 join 걸어서 .... 기달려 ... WordInputProcess , WordTimeOut 
*/
class WordInputProcess extends Thread{
	@Override
	public void run() {
		
		while(true) {
			String dan="2";
			String inputdata = JOptionPane.showInputDialog("dan" + "단 값을 입력");
			if(inputdata != null && !inputdata.equals("")) {
				Ex05_Word_GuGuDan.inputcheck = true; //값을 변경
			}
			System.out.println("입력한 값은: " + inputdata);
		}

		//hint_1 : HashMap 구구단 만들기 
				HashMap<String, Integer> gugudan = new HashMap<String, Integer>();
				
				for(int i = 0 ; i < 5 ; i++) {
					int num1 = (int)(Math.random()*9)+1;
					int num2 = (int)(Math.random()*9)+1;
					gugudan.put(num1+"*"+num2, num1*num2);
				}
				
//				for(Map.Entry m : gugudan.entrySet()) {
//					System.out.println(m.getKey() + "/" +m.getValue());
//				}
				
				
				//hint_3
				//처리 결과 (문제 , 사용자가 입력한 값 , 유무) 관리
				//class QuizInfo 
				ArrayList<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();
				
				
				//hint_2
				//gugudan  문제와  답 비교하기 (문제 .... 답값 받기)
				Set keys = gugudan.keySet();
				Object[] keylist = keys.toArray();
				int answer=0;
				for(int i = 0 ; i < keylist.length ; i++) {
				    answer = Integer.parseInt(JOptionPane.showInputDialog((String)keylist[i]));
				    System.out.println("제출한 값"+answer);
				    if(gugudan.get(keylist[i])==answer) {
				    	System.out.println("정답");
				    	QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "O"));
				    }else {
				    	System.out.println("오답");
				    	QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "X"));
				    }
				}
				
				for(int i = 0 ; i < QuizUserInfo.size() ; i++) {
					System.out.println(QuizUserInfo.get(i).toString());
				}
		
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			
			if(Ex05_Word_GuGuDan.inputcheck)return; //run함수 탈출
			
			System.out.println("남은 시간: " + i+"초");
			try {
				 Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class QuizInfo3{
	String keylist;
	int answer;
	String check;
	
	
	public QuizInfo3(String keylist, int answer, String check) {
		super();
		this.keylist = keylist;
		this.answer = answer;
		this.check = check;
	}


	@Override
	public String toString() {
		return "[문제]: " + keylist + " [제출한 값]: " + answer + " [결과]: " + check;
	}
	
	
	
}

//Quiz 에 대한 정보 (문제 , 입력한 답 , 결과 )
class QuizInfo4 {
    String question;
    int answer;
    String result;
    
    public QuizInfo4(String question, int answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "문제:"+this.question+" 쓴답:"+this.answer+" 채점:"+this.result;
    }
}

public class Ex05_Word_GuGuDan {
	
	static boolean inputcheck= false;
	ArrayList<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();
	
	public static void main(String[] args) {
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
			
		word.start();
		time.start();
		
		

		

		
		
		try {
			word.join(); //main 에게 word 끝날때까지 기달려 ..
			time.join(); //main 에게 time 끝날때까지 기달려 ..
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//문제 확인
		System.out.println("Main END");

	}

}