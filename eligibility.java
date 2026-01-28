import java.util.*;

public class eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age :");
        int a= sc.nextInt();

        if(a<18){
            System.out.println("Not Eligible !! ");
        }
        else{
            System.out.println("Eligible ");
        }

        
    }
}
    

