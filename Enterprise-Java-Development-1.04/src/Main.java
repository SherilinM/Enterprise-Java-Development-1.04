import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        difference();
        smallest();
        resolution();
    }

    public static void difference(String[]args) {

        int[] num_list = {1, 2, 3, 4, 5};
        int max = num_list[0];
        int min = num_list[0];

        for(int i : num_list ) {
            if(num_list[i] > max)
                max = num_list[i];
            else if(num_list[i] < min)
                min = num_list[i];
        }
        System.out.println("This is the difference between the largest and smallest values in an array of numbers:"+(max-min));
    }

    public static void smallest(String[]args)
    {
        int num_arr[] = {1, 10, 3, 15, 8};
        int first_num, second_num, num_arr_size = num_arr.length;

        if (num_arr_size > 2)
        {
            System.out.println("Array has less than two numbers.");
            return;
        }
        first_num = second_num = Integer.MAX_VALUE;
        for (int i : num_arr ) //ESTO ES CORRECTO?
        {
            if (num_arr[i] < first_num)
            {
                second_num = first_num;
                first_num = num_arr[i];
            }
            else if (num_arr[i] < second_num && num_arr[i] != first_num)
                second_num = num_arr[i];
        }
        if (second_num == Integer.MAX_VALUE)
            System.out.println("No second smallest element.");
        else
            System.out.println("The smallest number is " +
                    first_num + " and second Smallest  number is " + second_num);
    }

    public static void resolution(String[]args) {
        int x, y;
        Scanner in = new Scanner(System.in);

        System.out.println("First number: ");
        x = in.nextInt();
        System.out.println("Second number: ");
        y = in.nextInt();

        System.out.println(Math.pow(x, 2) + Math.pow(((4 * y) / 5 - x), 2));
    }
}