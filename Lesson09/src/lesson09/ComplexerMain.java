package lesson09;

import java.util.Comparator;
import java.util.Iterator;

public class ComplexerMain {
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Printer.INK);
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Comparable<?> c; //비교 가능한
		Comparator<?> c2; //비교자
		
		Iterable<?> i;
		Iterator i2;
		
	}  //언제 인터페이스를 쓰는
}
