import java.util.Set;
import java.util.TreeSet;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
public class asdasd {
	public static void main(String[] args) {
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		
		String str = lotto.toString();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("Lotto.txt",true);
			bw = new BufferedWriter(fw);
			
			bw.write("·Î¶Ç");
			bw.newLine();
			bw.write(str);
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
}