public class Main {
    public static void main(String[] args)
    {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original: "+Arrays.toString(array_nums));
        int max_val = array_nums[0];
        int min = array_nums[0];
        for(int i = 1; i < array_nums.length; i++)
        {
            if(array_nums[i] > max_val)
                max_val = array_nums[i];
            else if(array_nums[i] < min)
                min = array_nums[i];
        }
        System.out.println("Difference: "+(max_val-min));
    }

    //Ejercicio 2
    public static String printNumber(int num)
    {
        int num[] = {5, 7, -8, 5, 14, 1};

        int first_element, second_element, arr_size = num.length;

        if (arr_size < 2)
        {
            System.out.println("less array.");
            return;
        }

        first_element = second_element = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            if (arr[i] < first_element)
            {
                second_element = first_element;
                first_element = arr[i];
            }

            else if (arr[i] < second_element && arr[i] != first_element)
                second_element = arr[i];
        }
        if (second_element == Integer.MAX_VALUE)
            System.out.println("No element.");
        else
            System.out.println("Smallest element" +
                    first_element + "second Smallest  element" + second_element +".");

    }
}
