import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//1.��� 3���� ���弼��(��, �迭�� ����ϼ���)
		//1000,ȫ�浿
		//2000,������
		//3000,������
		//�����, ������ ����� �̸��� ����ϼ���.


		//1
		Emp[] p_array = new Emp[3];
		p_array[0] = new Emp();
		p_array[1] = new Emp();
		p_array[2] = new Emp();
		
		p_array[0].setEmpno(1000);
		p_array[1].setEmpno(2000);
		p_array[2].setEmpno(3000);
		
		p_array[0].setName("ȫ�浿");
		p_array[1].setName("������");
		p_array[2].setName("������");
		
		for(int i=0;i<p_array.length;i++) {
			p_array[i].empInfoPrint();
		}
		
		
		
		//1
		Emp[] emplist1 = new Emp[3];
		for(int i=0;i<emplist1.length;i++) {
			emplist1[i] = new Emp();
			System.out.println(emplist1[i]);
		}
		emplist1[0].setEmpno(1000);
		emplist1[1].setEmpno(2000);
		
		
		
		//2
		Emp[] emplist2 = new Emp[] {new Emp(1,"�̾�"), new Emp(2,"�ھ�")};
		for(int i=0; i<emplist2.length;i++) {
			emplist2[i].empInfoPrint();
		}
		
		//3
		Emp[] emplist3 = {new Emp(3,"�达"), new Emp(4,"ȫ��")};
		for(int i=0; i<emplist3.length;i++) {
			emplist3[i].empInfoPrint();
		}
		
		
		//�׷� ������ for���� ������� ��ü�迭 ��µ� ������ for�� ����Ͽ� �ۼ��غ�����
		//
		for(Emp e:emplist3) {
			e.empInfoPrint();
		}
		
		
		
	}

}
