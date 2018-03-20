/**
 * @(#)TestStudent.java
 *
 * TestStudent application
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/3/15
 */
 
public class TestStudent{

   public static void main (String[] args){
      Student s1, s2, s3, s4;
      
      System.out.println("Testing Default Constuctor:");
      s1 = new Student();
      System.out.println(s1);
      
      System.out.println("Testing Constuctor with name:");
      s2 = new Student("Name 2");
      System.out.println(s2);
      
      System.out.println("Testing Constuctor with names and 3 test scores:");
      s3 = new Student("Name 3", 100, 100, 100);
      System.out.println(s3);
      
      System.out.println("Testing Constuctor that copies s3:");
      s4 = new Student(s3);
      System.out.println(s4);

      System.out.println("Testing method: setName of s1 to \"Bob\"");
      s1.setName("Bob");
      System.out.println(s1);
      
      System.out.println("Testing method: getName of s1");
      s1.getName();
      System.out.println(s1);
      
      System.out.println("Testing method: setScore of s1 to 80, 90, 100");
      s1.setScore(1,80);
      s1.setScore(2,90);
      s1.setScore(3,100);
      System.out.println(s1);
      
	  System.out.println("Testing method: getScore of s1 test 1:");
      System.out.println(s1.getScore(1));
      System.out.println(s1);

	  System.out.println("Testing method: getAverage of s1:");
      System.out.println((s1.getAverage());
      System.out.println(s1);      

	  System.out.println("Testing method: getHighScore of s1:");
      System.out.println((s1.getHighScore());
      System.out.println(s1);      

	  System.out.println("Testing method: toString of s1:");
      System.out.println(s1);
      
      System.out.print(s1.getHighestScores());
   }
}
