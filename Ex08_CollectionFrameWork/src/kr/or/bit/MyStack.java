package kr.or.bit;

//자료구조 만들기 (Stack)
//저장 공간: Array : Object[] stackarr
//위치 정보: 저장되는 값이 있는 위치(index)
//기능: push, pop, empty, full


public class MyStack {
	private Object[] stackarr; //저장소 확보
	private int maxsize; //최대크기
	private int top; //배열의 index값(위치 정보)
	
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1); //true, false
	}
	
	public boolean isFull() {
		return (top == maxsize-1); //true, false
	}
	
	public void push(Object i) {
		if(isFull()) {
			System.out.println("stack full");
		}else {
			stackarr[++top]=i; //처음 top = -1 >>[0]
		}
	}
	
	public Object pop() {
		Object value=null;
		if(isEmpty()) {
			System.out.println("stack empty");
		}else {
			value = stackarr[top];
			top--;
		}
		return value;
	}
	
	
}
