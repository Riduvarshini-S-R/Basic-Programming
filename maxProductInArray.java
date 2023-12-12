//max product of 2 elements in an array

import java.util.*;

public class Main
{
    //method 1 - secondBiggest and biggest
    public static int maxProduct1(int[] nums) {
        int biggest = 0;
        int secondBiggest = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > biggest){
                secondBiggest = biggest;
                biggest = nums[i];   
            }
            else{
                if(nums[i] > secondBiggest)
                    secondBiggest = nums[i];
            }
        }
        return (secondBiggest-1)*(biggest-1);
    }
    
    //method 2 - sorting and picking the last 2 elements
    public static int maxProduct2(int[] nums) {
        int biggest = 0;
        int secondBiggest = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > biggest){
                secondBiggest = biggest;
                biggest = nums[i];   
            }
            else{
                if(nums[i] > secondBiggest)
                    secondBiggest = nums[i];
            }
        }
        return (secondBiggest-1)*(biggest-1);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println(maxProduct1(arr));
		System.out.println(maxProduct2(arr));
	}
}
