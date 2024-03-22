package exam;

public class main {
    public static void main(String[] args) {
        //question1
        int num = 9;
        System.out.println("odd numbers are: ");
        printOddNumbers(num);


        //question2
        int[] arrayOne = {10, 20, 30,40, 50};
        int answer = sumOfArray(arrayOne);
        System.out.println("The sum total is " + sumOfArray(arrayOne));
        //question 3
        double[] arrayTwo = {5, 10, 15, 20, 25};
        double answerThree = averageOfArray(arrayTwo);
        System.out.println("The average is " + averageOfArray(arrayTwo));
        //Question 4
        int randomNum = randomNumber();
        System.out.println("You rolled a " + randomNum);
       //question 5
        int[] even = {2, 3, 6, 11, 12, 13};
        System.out.println("Sum of even numbers is " + sumOfEvenNumbers(even));
        //question6
        double cubeLength = 5.0;
        double cubeVolume = volumeOfCube(cubeLength);
        System.out.println("Cube volume is " + cubeVolume);
//        //question 7
        String hello = "Hello what is your name";
        char countChar = 'a';
        int times = countCharacter(hello, countChar);
        System.out.println("The letter A appears: " + times);


    }
//question1
    public static int printOddNumbers(int odd) {
      for(int  i=  10; i > 0; i--){
          if (i % 2 != 0) {
              System.out.println(i);
          }
      }
        return odd;
    }
    //question 2
    public static int sumOfArray(int[] questionTwo) {
        int sum = 0;
        for(int num : questionTwo) {
            sum += num;
        }
        return sum;
    }
    //question 3
    public static double averageOfArray(double[] questionThree) {
        double sum = 0;
        for(double num : questionThree) {
            sum += num;
        }
        return sum / questionThree.length;
    }
    //question 4
    public static int randomNumber(){
    int random = (int) Math.floor((Math.random() * 6) + 1);
        return random;
    }
    //question5 create a method that calculates the sum of all even numbers in an array
    public static int sumOfEvenNumbers(int[] questionFive) {
        int[] even = {2, 3, 6, 11, 12, 13};
        int sum = 0;
        for(int i: even)
            if(i % 2 == 0) {
                sum += i;
            }
        return sum;
    }
//question 6
    public static double volumeOfCube(double cube){
        double volume = cube * cube * cube;
        return volume;
    }
    //question 7
    public static int countCharacter(String numOfA, char character ){
       int count = 0;
       for (int i = 0; i <numOfA.length(); i++){
           if(numOfA.charAt(i) == character);
           count++;
       }
       return count;
   }
}