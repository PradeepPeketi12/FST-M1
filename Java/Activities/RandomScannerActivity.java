package activities;

import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int randomValue = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        Random indexGen = new Random();
        randomValue = indexGen.nextInt(arr.length);
        System.out.println(arr[randomValue]);
    }
}
