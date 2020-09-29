package kr.or.bit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	
	
	Calendar cal;
	SimpleDateFormat dateFormat;
	Set<Integer> lotto;
	
	public Lotto(){
		lotto = new TreeSet<Integer>();
		cal = Calendar.getInstance();
		dateFormat = new SimpleDateFormat("yyyy년MM월dd일 HH:mm");
	}
	
	
	public String createLottoNumber() {
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		String str = lotto.toString();
		return str;
	}
	
	
	public void Write() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("Lotto.txt",true);
			bw = new BufferedWriter(fw);
			
			bw.write("로또 번호: "+createLottoNumber()+" ["+dateFormat.format(cal.getTime())+"]");
			bw.newLine();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
	
	public void Read() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("Lotto.txt");
			br = new BufferedReader(fr);
			
			int data = 0;
			while((data = br.read())!=-1) {
				System.out.print((char)data);
			}
			
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

}
