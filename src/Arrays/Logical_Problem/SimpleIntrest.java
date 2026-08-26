package Selfcode;
import java.util.*;
public class SimpleIntrest {


        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter p:" );
            double p=sc.nextInt();
            System.out.print("Enter r:" );
            double r=sc.nextInt();
            System.out.print("Enter t:" );
            double t=sc.nextInt();
            double si=(p*r*t)/100;
            System.out.println("Simple intrest is-:"+si);
        }
    }



