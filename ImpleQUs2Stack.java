package tss;

import java.util.Stack;

public class ImpleQUs2Stack {

	public static void main(String[] args) {
		Stack s1=new Stack();
		Stack s2=new Stack();
		s1.add("A");
		s1.add("B");
		s1.add(4);
		int i;
		Object[] o=s1.toArray();
		for(i=o.length-1;i>=0;i--)
		{
			s2.add(s1.get(i));
		}
		Object[] o2=s2.toArray();
		for(i=0;i<o2.length;i++)
		{
			System.out.println(s2.get(i));
		}
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
	}

}
