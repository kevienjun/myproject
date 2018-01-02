package com.jun.aa;

public class Tester {

	public static void main(String[] args) {
//		Student stu = new Student("ÁÂ®aºÓ",55,66,77);//
		Student stu = new Student("ÁÂ®aºÓ");
		/*/stu.english = 55;
		stu.math = 66;
		stu.chinese = 77;/*/
		stu.print();
		int avg = stu.getAverage();
		System.out.println("ÁÂ®aºÓ"+avg);
		Student.method();
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
		

	}

}
