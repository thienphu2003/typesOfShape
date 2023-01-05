import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice from 1 to 4 !");
        int in = input.nextInt();
        switch (in){
            case 1 :
                System.out.print("Draw a rectangle");
                System.out.print("height = ");
                int height = input.nextInt();
                System.out.print("width = ");
                int width = input.nextInt();
                for(int i = 1; i <= height; i++){
                    for(int j = 1; j <= width; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
            case 2 :
                System.out.println("Draw a square triangle");
                System.out.println("Enter number of line");
                int number =input.nextInt();
                for(int i=1;i<=number;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            case 3:
                System.out.println("Draw a square top-left triangle");
                System.out.println("Enter number of line");
                int numberLine = input.nextInt();
                for(int i=numberLine;i>=1;i--)
                {
                    for( int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            case 4:
                System.out.println("Draw a balance triangle");
                System.out.println("Enter number of line");
                int line=input.nextInt();
                for ( int i=1;i<=line;i++)
                {
                    for(int j=1;j<=line-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=0;k<2*i-1;k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }


        }
    }
}

