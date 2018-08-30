package Package1;

import java.util.LinkedList;

public class Fokat {
public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
	l.add("a");
	l.add("b");
	l.add("c");
	l.add("d");
	System.out.println(l);
	System.out.println(l.size());
	l.addFirst("hello");
	System.out.println(l.set(1, "hiiiii"));
	System.out.println(l);
	System.out.println("new list size is :-");
	System.out.println(l.size());

}}