package library;

import java.util.ArrayList; //ArrayList를 사용하기 위해 import.

public class Shelf {
	//FIELD
	static private ArrayList<LibraryVO> list = new ArrayList<LibraryVO>();
	//CONSTRUCTOR
	//METHOD (GETTER, SETTER)
	public static ArrayList<LibraryVO> getList() {
		return list;
	}
	public static void setList(ArrayList<LibraryVO> list) {
		Shelf.list = list;
	}
}