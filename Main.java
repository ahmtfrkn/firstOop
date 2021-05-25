
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "% 5", "Java Yetiştirme Krusu", "Engin Demiroğ");
		Course course2 = new Course (2,"%7,5", "Diksiyon Kursu","Engin Demiroğ");
		Course course3 = new Course (3,"%1000", "Classını Konuşturma Kurs","Engin Demiroğ");
		
		Course [] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println("Kursun Adı : " + course.courseName);
			System.out.println("Kursun Hocası : "+ course.teacherName);
			System.out.println("Kursu Tamamlanma Yüzdesi : " + course.percentOfCompletion);
			
			
			
		}
			System.out.println("Toplam Kurs Sayısı : " + courses.length);
			System.out.println("");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("");
			
			CourseSevice courseService = new CourseSevice();
			courseService.addToCourse(course1);
			courseService.addToCourse(course2);
			courseService.addToCourse(course3);
			
			Student student1 = new Student(1,"Ahmet Furkan","Düşmez");
			Student student2 = new Student(2,"Sabri","Sarıoğlu");
			Student student3 = new Student(3,"Roberto","Carlos");
			
			Student [] students = {student1,student2,student3};
			
			for (Student student : students) {
				
				System.out.println("Öğrenci Adı : " + student.studentName);
				System.out.println("Öğrenci Soyadı : " + student.studentSurname);
				
				
			}
			
			StudentService studentService = new StudentService();
			studentService.addStudent(student1);
			studentService.addStudent(student2);
			studentService.addStudent(student3);
			
		

	}

}
