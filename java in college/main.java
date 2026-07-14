import java.util.Scanner;
public class {
    public static void main(String[] args){
        Scanner sc=new Scaneer(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        int age;
        if (age<18){
        System.out.println("Your are not alegible for job because your minor");

        }
        else if(age=>18 &&  age<40){
            System.out.println("your are eligible for job");
                    }
        else if(age>=40 && age<60){
            System.out.println("Your are eligible for job but retirment is soon");
        }
        else(age<=60){
            System.out.println("retirment time");
        }
        sc.close();
    }
}