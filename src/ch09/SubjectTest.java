package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentBaek = new Student(100, "������");
		studentBaek.setKoreanSubject("����", 100);
		studentBaek.setMathSubject("����", 100);
		
		Student studentJeong = new Student(101, "������");
		studentJeong.setKoreanSubject("����", 50);
		studentJeong.setMathSubject("����", 30);
		
		studentBaek.showScoreInfo();
		studentJeong.showScoreInfo();
		

	}

}
