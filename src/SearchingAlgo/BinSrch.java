package SearchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BinSrch {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi"};

        System.out.print("Enter the target : ");
        Scanner sc = new Scanner(System.in);
        String target = sc.next();

        int result = BinSearch(arr,target);

        if(result == -1){
            System.out.println("Target not found");
        }else{
            System.out.println(target + " found at index " + result);
        }

    }

public static int BinSearch(String[] arr,String target) {
    int l = 0;
    int r = arr.length - 1;

    while (l <= r) {
        int mid = (l + r) / 2;

        int cmp = arr[mid].compareTo(target);

        if (cmp == 0) return mid;

        if (cmp < 0)
            l = mid + 1;
        else
            r = mid - 1;


    }
    return -1;
}

}