package day2Homeworks;

public class Main {

	public static void main(String[] args) {
		
		//CATEGORY
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Tümü";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Programlama(3)";
		
		
		//INSTRUCTOR
		Instructor instructor1 = new Instructor(1, "Tümü");
		/*instructor1.id = 1;
		instructor1.name = "Tümü";*/
		
		Instructor instructor2 = new Instructor(2, "Engin Demirog");
		/*instructor2.id = 2;
		instructor2.name = "Engin Demirog";*/
		
		
		//COURSE
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Yazilim Gelistirici Yetistirme Kampi(JAVA + REACT)";
		course1.programmingLanguage = "JAVA and REACT";
		course1.instructor = "Engin Demirog";
		course1.description = "2 ay surecek Yazilim Gelistirici Yetistirme Kampimizin takip, dokuman ve duyularini buradan yapacagiz.";
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Yazilim Gelistirici Yetistirme Kampi(C# + ANGULAR)";
		course2.programmingLanguage = "C# and ANGULAR";
		course2.instructor = "Engin Demirog";
		course2.description = "2 ay surecek Yazilim Gelistirici Yetistirme Kampimizin takip, dokuman ve duyularini buradan yapacagiz.";
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giris Icin Temel Kurs";
		course3.programmingLanguage = "PYTHON, JAVA and C#";
		course3.instructor = "Engin Demirog";
		course3.description = "PYTHON, JAVA ve C# gibi tum programlama dillerri icin temel programlama mantigini anlasilir orneklerle ogrenin.";
		
		Course[] course = {course1, course2, course3};
		
		for (Course courses : course) {
			System.out.println(courses.id + "-" + courses.name);
			System.out.println(courses.programmingLanguage);
			System.out.println("From " + courses.instructor);
			System.out.println(courses.description);
			System.out.println("--------------------------------------");


		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
		courseManager.deleteCourse(course3);
	}
	}


