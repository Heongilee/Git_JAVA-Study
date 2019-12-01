package Num9;

import java.util.Vector;

interface IStack<T>{
	T pop();
	boolean push(T ob);
}
class MyStack<Integer> implements IStack<Integer>{
	private int capacity = 10;
	private int pos = 0;
	private Vector<Integer> myStack = new Vector<Integer>();
	@Override
	public Integer pop() {
		Integer res;
		pos--;
		try {
			res = myStack.get(pos);
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
		return res;
	}
	public boolean push(Integer val) {
		if(pos >= capacity)
		{
			return false;
		}
		else
		{
			myStack.add(val);
			pos++;
			return true;
		}
		
	};
}
public class JS15012970_Q09 {
	public static void main(String[] args) {
		IStack<Integer> s = new MyStack<Integer>();
		for(int i=0;i<10;i++) s.push(i);
		while(true)
		{
			Integer n = s.pop();
			if(n == null) break;
			System.out.println(n+" ");
		}
	}
}
