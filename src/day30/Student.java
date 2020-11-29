package day30;

public class Student {
	public String name;
	public String course;
	public int score;
	
	public Student(String name, String course, int score) {
		this.name = name;
		this.course = course;
		this.score = score;
	}

	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", score=" + score + "]";
	}
}
