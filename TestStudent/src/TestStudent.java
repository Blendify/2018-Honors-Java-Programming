/**
 * @(#)TestStudent.java
 *
 * TestStudent application
 *
 * Discription: This application uses the Student class and
 *              tests it by using every constructor and method.
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/04/03
 */

public class TestStudent{

   public static void main (String[] args){
      Student s1, s2, s3, s4;
      
      System.out.println("Testing Default Constuctor:");
      s1 = new Student();
      System.out.println(s1 + "\n");
      
      System.out.println("Testing Constuctor with name:");
      s2 = new Student("Name 2");
      System.out.println(s2 + "\n");;
      
      System.out.println("Testing Constuctor with names and 3 test scores:");
      s3 = new Student("Name 3", 100, 100, 100);
      System.out.println(s3 + "\n");
      
      System.out.println("Testing Constuctor that copies s3:");
      s4 = new Student(s3);
      System.out.println(s4 + "\n");

      System.out.println("Testing method: setName of s1 to \"Bob\"");
      s1.setName("Bob");
      System.out.println(s1 + "\n");
      
      System.out.println("Testing method: getName of s1");
      System.out.println("Name: " + s1.getName());
      System.out.println(s1 + "\n");
      
      System.out.println("Testing method: setScore of s1 to 80, 90, 100");
      s1.setScore(1,80);
      s1.setScore(2,90);
      s1.setScore(3,100);
      System.out.println(s1 + "\n");
      
	  System.out.println("Testing method: getScore of s1 test 1:");
      System.out.println("Test 1: " + s1.getScore(1));
      System.out.println(s1 + "\n");

	  System.out.println("Testing method: getAverage of s1:");
      System.out.println("Average: " + s1.getAverage());
      System.out.println(s1 + "\n");  

	  System.out.println("Testing method: getHighScore of s1:");
      System.out.println("Highscore: " + s1.getHighScore());
      System.out.println(s1 + "\n");    

	  System.out.println("Testing method: toString of s1:");
      System.out.println(s1 + "\n");
      
      System.out.println(s1.getName() + "'s Highest scores in descending order are:");
      System.out.print(s1.getHighestScores());
   }
}

/*
--------------------Configuration: TestStudent - JDK version 1.6.0_14 <Default> - <Default>--------------------
Testing Default Constuctor:
Name:    
Test 1:  0
Test 2:  0
Test 3:  0
Average: 0

Testing Constuctor with name:
Name:    Name 2
Test 1:  0
Test 2:  0
Test 3:  0
Average: 0

Testing Constuctor with names and 3 test scores:
Name:    Name 3
Test 1:  100
Test 2:  100
Test 3:  100
Average: 100

Testing Constuctor that copies s3:
Name:    Name 3
Test 1:  100
Test 2:  100
Test 3:  100
Average: 100

Testing method: setName of s1 to "Bob"
Name:    Bob
Test 1:  0
Test 2:  0
Test 3:  0
Average: 0

Testing method: getName of s1
Name: Bob
Name:    Bob
Test 1:  0
Test 2:  0
Test 3:  0
Average: 0

Testing method: setScore of s1 to 80, 90, 100
Name:    Bob
Test 1:  80
Test 2:  90
Test 3:  100
Average: 90

Testing method: getScore of s1 test 1:
Test 1: 80
Name:    Bob
Test 1:  80
Test 2:  90
Test 3:  100
Average: 90

Testing method: getAverage of s1:
Average: 90
Name:    Bob
Test 1:  80
Test 2:  90
Test 3:  100
Average: 90

Testing method: getHighScore of s1:
Highscore: 100
Name:    Bob
Test 1:  80
Test 2:  90
Test 3:  100
Average: 90

Testing method: toString of s1:
Name:    Bob
Test 1:  80
Test 2:  90
Test 3:  100
Average: 90

Bob's Highest scores in descending order are:
100
90
80
Process completed.
 */
