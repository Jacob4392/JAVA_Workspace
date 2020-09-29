import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex11_PrintWriter {

	public static void main(String[] args) {
		//출력형식의 정의
		//친인척 : printf(), String.format()
		//레포팅(출력물)
		//오즈, 크리스탈 레포트 소프트웨어
		//로또 출력 
		try {
			
			//write
			PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt");
			pw.println("********************************");
			pw.println("*           HOMEWORK           *");
			pw.println("********************************");
			pw.printf("%3s : %5d  %5d  %5d  %5.1f","아무개",100,90,50,(float)((100+90+50)/3));
			pw.println();
			pw.close();
			
			//read(line 단위로 읽을 수 있음) 엔터단위로 읽을 수 있음
			FileReader fr = new FileReader("C:\\Temp\\homework.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//여기^^
		}
			
		
		
		
	}

}
