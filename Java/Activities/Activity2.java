package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11, 10};
        int sum=0;
        int result = 30;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 10){
                sum += arr[i];
            }
        }
        if(sum == result){
            System.out.println("Result is 30");
        }
        else{
            System.out.println("Result is not 30");
        }
    }
}
