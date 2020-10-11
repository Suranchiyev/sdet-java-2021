package day11;

public class StrSubstring {
	public static void main(String[] args) {
		//             012345678910
		String java = "Java is fun";
		
		// .substring(index1)
		// .substring(index1, index2)
		// substring method are used to get part of the string from the string
		
		System.out.println(java);
		String javaFunPart = java.substring(8); 
		System.out.println(javaFunPart); // fun
		
		//            0123456789
		String str = "SoftSkills";
		str = str.substring(4);
		System.out.println(str);
		 
		//     0123456789
		str = "my workspace";
		str = str.substring(7);
		System.out.println(str);
		
		//             0123456789
		String str1 = "SoftSkills";
		str1 = str1.substring(0, 4);
		System.out.println(str1); // Soft
		
		//                      1011
		//             0123456789
		String str2 = "Java is cool";
		str2 = str2.substring(5, 7);
		System.out.println(str2);
		
		//              0123456789
		String str4 =  "HelloWorld"; // loW
		String str5 =  "SDLC";       // DL
		String str6 =  "Sublime";    // bl
		String str7 =  "Window";     // ind
		String str8 =  "OptimizePDF"; // PDF
		String str9 =  "Navigate";  // Nav
		String str10 = "Search"; // ear
		
		System.out.println("---------------");
		System.out.println(str4.substring(3, 6)); // loW
		System.out.println(str5.substring(1, 3));
		System.out.println(str6.substring(2, 4));
		System.out.println(str7.substring(1, 4));
		System.out.println(str8.substring(8));
		System.out.println(str9.substring(0, 3));
		System.out.println(str10.substring(1, 4));
		
		//              0123456
		String str11 = "book";
		// System.out.println(str11.substring(2, 5)); IndexOutOfBoundException
		
		//str1.substring(7, 8); IndexOutOfBoundException
	}
}
