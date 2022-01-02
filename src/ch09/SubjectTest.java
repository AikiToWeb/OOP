package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentBaek = new Student(100, "백종헌");
		studentBaek.setKoreanSubject("국어", 100);
		studentBaek.setMathSubject("수학", 100);
		
		Student studentJeong = new Student(101, "정동은");
		studentJeong.setKoreanSubject("국어", 50);
		studentJeong.setMathSubject("수학", 30);
		
		studentBaek.showScoreInfo();
		studentJeong.showScoreInfo();
		

	}

}
