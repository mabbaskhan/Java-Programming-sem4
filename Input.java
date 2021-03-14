import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter username:");
    
   
    String userName = myObj.nextLine();
    System.out.println("Enter userId:");
    int userId = myObj.nextInt();
    
    System.out.println("Username is: " + userName);
    System.out.println("UserId is: " + userId );
     
  }
}
