package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이순신");
		studentLee.address = "서울시 서초구 서초동";
	
		Student studentShin = new Student();
		studentShin.studentName = "신수현";
		studentShin.address = "대전시 동구";
	
		studentShin.showStudentInfor();
		studentLee.showStudentInfor();
		
		System.out.println(studentShin);
		System.out.println(studentLee);
	}

}
   