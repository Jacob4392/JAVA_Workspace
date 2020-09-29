
public class WorkExercise_0810_01_Star {

	public static void main(String[] args) {
		
		for(int i=0;i<20;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}

		System.out.println("----------------------------------");
		
		for(int m=0;m<20;m++) {
			for(int n=0;n<20;n++) {
				if(m+n < 20) {
					System.out.print("*");
				}
			}System.out.println();
		}
		

		
		System.out.println("---------------------------------");
		
		for(int o=0;o<=20;o++) {
			for(int p=20;p>=0;p--) {
				if(o >= p) {
					System.out.print("*");
					continue;
				}else {
					System.out.print(" ");
				}
			
			}System.out.println();
		}
		System.out.println("-----------------------------------");
		
		for(int q=0;q<=20;q++) {
			for(int r=0;r<=20;r++) {
				if(q <= r) {
					System.out.print("*");
					continue;
				}System.out.print(" ");
			}System.out.println();
		}
	
		System.out.println("-----------------------------------");
		
		for(int k=0;k<20;k++) {
			for(int l=0;l<20;l++) {
				if(k <= l) {
					System.out.print("*");
				}
			}System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for(int s=0, u=40;s<=20;s++, u++) {
			for(int t=20,v=20;t>=0 || v<=u;t--,v++) {
				if(s>=t || u<=v) {
					System.out.print("*");
					continue;
				}System.out.print(" ");
			}System.out.println();
		}
		
	}

}
