import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int [] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    String[] studentNames = new String[15];
    for(int i = 0; i < 15; i++){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is the student's name?");
    String name = scan.next();
    studentNames[(i)] = (name);

    }
    int a = 0;
    while(a < 15){
      System.out.println(studentNames[a] + " sits in seat #" + seats[a]);
      a++;

    }
  }
}