package notebook;

import java.util.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

public class NoteBook {
	private ArrayList<String> notes=new ArrayList<String>(); //∑∫–Õ¿‡

	
	public void add(String s) {
		notes.add(s);
		size++;
	}
	
	public void add(String s, int location) {
		notes.add(location,s);
	}
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a=new String[notes.size()];
//		for (int i=0;i<notes.size();i++) {
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb=new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third",1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		nb.removeNote(1);
		String[] a=nb.list();
		for (String s:a) {
			System.out.println(s);
		}
		
	}

}
