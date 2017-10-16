package java_20170918_person;

public class MovieTest {

	public static void main(String[] args) {
/*		Person jeon = new Person();
		jeon.name = "전지현";
		jeon.age = 30;
		//jeon.bestFilm = "암살"; Person은 bestFilm이 정의되지 않았기 때문에 설정할 수 없다.
		System.out.println("name = " + jeon.name);
		System.out.println("age = " + jeon.age);
		jeon.exercise();
		System.out.println();*/ // 추상클래스가 되면 객체생성이 안된다.
		
		Person gong = new Actor();
		gong.name = "공유";
		gong.age = 30;
		System.out.println("name = "+ gong.name);
		System.out.println("age = "+ gong.age);
		gong.exercise();
		System.out.println();
		//gong.bestFilm = "도깨비"; 왜 접근이 안될까? 상속의 개념에 대해 알고있어야한다.
		
		Actor song = new Actor();
		song.name = "송혜교";
		song.age = 30;
		song.bestFilm = "태양의 후예";
		
		System.out.println("name = " + song.name);
		System.out.println("age = " + song.age);
		System.out.println("bestFilm = " + song.bestFilm);
		song.exercise();
		System.out.println();
	}
}
