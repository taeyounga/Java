package java_20170918_person;

public class MovieTest {

	public static void main(String[] args) {
/*		Person jeon = new Person();
		jeon.name = "������";
		jeon.age = 30;
		//jeon.bestFilm = "�ϻ�"; Person�� bestFilm�� ���ǵ��� �ʾұ� ������ ������ �� ����.
		System.out.println("name = " + jeon.name);
		System.out.println("age = " + jeon.age);
		jeon.exercise();
		System.out.println();*/ // �߻�Ŭ������ �Ǹ� ��ü������ �ȵȴ�.
		
		Person gong = new Actor();
		gong.name = "����";
		gong.age = 30;
		System.out.println("name = "+ gong.name);
		System.out.println("age = "+ gong.age);
		gong.exercise();
		System.out.println();
		//gong.bestFilm = "������"; �� ������ �ȵɱ�? ����� ���信 ���� �˰��־���Ѵ�.
		
		Actor song = new Actor();
		song.name = "������";
		song.age = 30;
		song.bestFilm = "�¾��� �Ŀ�";
		
		System.out.println("name = " + song.name);
		System.out.println("age = " + song.age);
		System.out.println("bestFilm = " + song.bestFilm);
		song.exercise();
		System.out.println();
	}
}
