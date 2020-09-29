import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(500);
	}
//	KtTv(int price){
//		super(price);
//	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
	
}

//KtTv tv = new KtTv();

class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
	
}


class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
	
}

public class Ex07_Generic_Quiz {

	public static void main(String[] args) {
		//1.Array 배열을 사용해서 cart 만들고 제품을 담으세요(Tv, Audio, Notebook)
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		
		//2. ArrayList 를 사용해서 cart 만들고 제품을 담으세요
		ArrayList<Product> pcart = new ArrayList<Product>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		
		for(Product product:pcart) {
			System.out.println(product);
		}
		
		//사원 3명을 만드세요.
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000,"김씨","IT"));
		emplist.add(new Emp(2000,"박씨","SALES"));
		emplist.add(new Emp(3000,"이씨","MANAGER"));
		
		//사원의 정보(사번, 이름, 직종)출력하세요.
		//toString() (x)
		for(Emp emp:emplist) {
			System.out.println(emp.getEmpno()+"/"+emp.getEname()+"/"+emp.getJob());
		}
		
		for(int i=0;i<emplist.size();i++) {
			System.out.println(emplist.get(i).getEmpno()+"/"+emplist.get(i).getEname()+"/"+emplist.get(i).getJob());
		}
		
		
		ArrayList<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100,"김씨",1000));
		clist.add(new CopyEmp(200,"이씨",2000));
		clist.add(new CopyEmp(300,"박씨",3000));
		
		//1.200번 사원의 급여를 5000으로 수정하세요.(일반 for문 안에서) getter,setter
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
			}
			System.out.println(clist.get(i));
		}
		
		
		//2.300번 사원의 이름을 "궁금해"로 수정해서 출력하세요(개선된 for문)
		for(CopyEmp cemp:clist) {
			if(cemp.getEmpno()==300) {
				cemp.setEname("궁금해");
			}
			System.out.println(cemp);
		}
		
		
	}

}
