import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Ex06_FileReader_FileWriter_Buffer {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
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
			alist.add(lotto[i]);
		}
		String str = alist.toString();
		System.out.println(str);
		
		////////////////////////////////////////////////
		FileWriter fw = null; 
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("Lotto.txt",true); 
			bw = new BufferedWriter(fw);
			
			bw.write("로또");
			bw.newLine();
			bw.write(str);
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		//////////////////////////////////////////////////////////
		
		/*
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			//Line 단위의 처리가 가능
			String line = "";
			for(int i=0;(line = br.readLine())!=null;i++) {
				//System.out.println(line);
				if(line.indexOf(";")!=-1) {
					System.out.println(line);
				}
			}
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
	*/
	}
	
}
