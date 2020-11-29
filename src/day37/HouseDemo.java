package day37;

import java.util.ArrayList;
import java.util.List;

public class HouseDemo {
	public static void main(String[] args) {
		House obj = new House();
		
		List<String> schools = new ArrayList<>();
		schools.add("#12");
		schools.add("#13");
		schools.add("#8");
		
		obj.setSchoolsCloseBy(schools);
		System.out.println(obj.getSchoolsCloseBy());
		
		List<String> schools2 = obj.getSchoolsCloseBy();
		schools2.add("#55");
		
		System.out.println(obj.getSchoolsCloseBy());
		
	}
}
