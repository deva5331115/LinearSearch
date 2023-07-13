
import java.util.Scanner;

    public class LinearSearch {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter array size:");
            int size=scanner.nextInt();
            int array[]=new int[size];
            for(int i=0;i<size;i++)
            {
                array[i]=scanner.nextInt();
            }
            System.out.println("enter a number:");
            int B=scanner.nextInt();
            int counter=0;
            for(int i=0;i<size;i++)
            {
                if(array[i]==B)
                {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

