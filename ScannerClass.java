import java.util.Scanner;

class Data{
    public static void main(String[] args){
        Scanner myData = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = myData.nextLine();
        
        System.out.println("Enter your rollNo: ");
        int rollNo = myData.nextInt();
        
        System.out.println("Enter your batchNo and semester: ");
        int batchNo = myData.nextInt();
        int sem = myData.nextInt();
        
        System.out.println("Name = "+ name +"\nRollNo = "+ rollNo +"\nBatchNo = "+ batchNo +"\nSemester = "+ sem);

        
    }
}
