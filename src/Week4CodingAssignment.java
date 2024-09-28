import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Week4CodingAssignment {

  public static void main(String[] args) {
    
  
    // 1 creation of array that contains the value
    int [] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
    
    // 1 (A)Finding the first and last elements without using indexes
    int first = ages[0];
    int last = ages[ages.length - 1];

    // Subtraction of the first element and last element
    int difference = last - first;
    

    // Print result
    System.out.println("Difference between the first and last elements: " + difference);
    System.out.println("-----------------------------------------------");
    
    //1 (B)
    int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 200}; 
    
    
    //1 b-i- ii
    difference = ages2[ages2.length - 1] - ages2[0];
    System.out.println("Difference between the first and last elements in ages2: " + difference);
    
    //1 c
   
    int sum = 0;
    for (int age : ages) {
        sum += age;
    }
    double averageAge = (double) sum / ages.length;
    System.out.println("Average age: " + averageAge);
    System.out.println("-----------------------------------------------");
    
    //2-----------------------------------------
    
    List<String> names = new ArrayList <String>();
    
    names.add ("Sam");
    names.add ("Tommy");
    names.add ("Tim");
    names.add ("Sally");
    names.add ("Buck");
    names.add ("Bob");
 
    
//a

int totalLetters = 0;
    for (String name : names){
        totalLetters += name.length();
    }
    double averageLetters 
    = (double) totalLetters / names.size();
    System.out.println("Average number per Name: " + averageLetters);
    System.out.println("-----------------------------------------------");
    
   //b
    String concatenatedNames = "";
    for (String name : names) {
        concatenatedNames += name + " ";
    }
    System.out.println("Concatenated names: " + concatenatedNames.trim()); 
    
    System.out.println("-----------------------------------------------");
    
 
    //3- access the last Element
    String lastElement = names.get(names.size() - 1);
    System.out.println("The last element is: " + lastElement);
    
    
    //4-- access the first element
    String firstElement = names.get(0);
    System.out.println("The first element is: " + firstElement);
    
    System.out.println("-----------------------------------------------");
    
    
  //5
    int[] nameLengths = new int[names.size()];

     for (int i = 0; i < names.size(); i++) {
       nameLengths[i] = names.get(i).length();
   }
  
    System.out.println("Name lengths: " + Arrays.toString(nameLengths));
    
    System.out.println("-----------------------------------------------");  
    
    
      //6 
      int totalSum = 0;
        for (int length : nameLengths) {
        totalSum += length;
     }

     // Print the sum
     System.out.println("Sum of name lengths: " + totalSum);
    
     System.out.println("-----------------------------------------------");  
    
    //7
    String word = "Hello";
    int n = 3;
    String concatenatedWord = concatenate(word, n);
    System.out.println("Result: " +concatenatedWord);
    System.out.println("-----------------------------------------------");
  
//8
    String firstName = "John";
    String lastName = "Doe";
    String fullName = getFullName(firstName, lastName);
    System.out.println("Full Name: " + fullName);
    System.out.println("-----------------------------------------------");
//9
    int[] num1 = {50, 60};
    int[] num2 = {10, 20, 5};

    boolean result1 = SumGreaterThan100(num1);
    boolean result2 = SumGreaterThan100(num2);

    System.out.println("The sum is greater than 100: " + result1);
    System.out.println("The sum is greater than 100: " + result2);
    System.out.println("-----------------------------------------------");
    
    //10
    double[] numbers1 = {10.0, 20.0, 30.0};
    double[] numbers2 = {5.5, 7.2, 9.8};

    double average1 = calculatetheAverage(numbers1);
    double average2 = calculatetheAverage(numbers2);

    System.out.println("Average 1: " + average1);
    System.out.println("Average 2: " + average2);
    System.out.println("-----------------------------------------------");
    
    //11
    double[] array1 = {10.1, 20.5, 28.7, 45.0, 88.0};
    double[] array2 = {5.5, 7.2, 9.8, 3.3, 2.9, 6.1};

    boolean result = AverageGreaterThan(array1, array2);
    System.out.println("Is the average of array1 greater than array2? " + result);
    
    System.out.println("-----------------------------------------------");
    
    //12
    boolean isitHot = true;
    double money = 12.0;
    boolean willBuy = willBuyDrink(isitHot, money);
    System.out.println("Will buy a drink: " + willBuy);
    System.out.println("-----------------------------------------------");
    
    
    //13
    int[] numbers = {-2, 1234, 567, 89, 5, 0, -1};//given numbers

    for (int number : numbers) {
        identifyNumber(number);
    }
    System.out.println("-----------------------------------------------");
    
   
  
  
  } //end of main 
     
     //7

    public static String concatenate(String word, int n) {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < n; i++) {
          result.append(word);
      }
      return result.toString();
  }

 

   //8- get First Name and Last Name then print at the console
public static String getFullName(String firstName, String lastName) {
  return firstName + " " + lastName;
}


   //9
public static boolean SumGreaterThan100(int[] numbers) {
  int sum = 0;
  for (int number : numbers) {
      sum += number;
  }
  return sum > 100;
}
 

   //10
public static double calculatetheAverage(double[] numbers) {
  if (numbers.length == 0) {
      return 0.0; 
  }

  double sum = 0.0;
  for (double number : numbers) {
      sum += number;
  }

  return sum / numbers.length;
}


//11
public static boolean AverageGreaterThan(double[] array1, double[] array2) {
  if (array1.length == 0 || array2.length == 0) {
      return false; 
  }

  double average1 = calculatetheAverage(array1);
  double average2 = calculatetheAverage(array2);

  return average1 > average2;
}



//12
public static boolean willBuyDrink(boolean isItHotOutside, double moneyInPocket) {
  return isItHotOutside && moneyInPocket > 10.50;
}


//13 Number Identifier
// declaring int variables and its formula to get the identifiers and print result
public static void identifyNumber(int number) {
  if (number >= 1000) {
      System.out.println(number + " is in the thousands place.");
  } else if (number >= 100) {
      System.out.println(number + " is in the hundreds place.");
  } else if (number >= 10) {
      System.out.println(number + " is in the tens place.");
  } else if (number >= 0) {
      System.out.println(number + " is in the ones place.");
  } else {
    System.out.println(number + " It's beyond the scope!");
  }
}
}


               
        