package Sort;

import java.util.Arrays;

public class BubbleSort {

    void bubbleSort(String arr[], int n)
    {
        String temp;

        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }

    // Driver method to test above
    public static void main(String args[])
    {
        //BubbleSort ob = new BubbleSort();
        BubbleSort str_ob = new BubbleSort();
        String ar[] = {"z","b","a","c"};
        int n = ar.length;
        str_ob.bubbleSort(ar,n);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(ar));
    }
}
