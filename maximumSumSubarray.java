//to find contiguous subarray

import java.util.*;

public class Main
{
    //brute force method
    //in this method, we use 2 loops to iterate through the list to form windows
    static long maximumSumSubarray1(int K, ArrayList<Integer> Arr,int N){
        int maxSum=0;
        for(int i=0;i<=N-K;i++){
            int sum=0;
            for(int j=i;j<i+K;j++){
                sum+=Arr.get(j);
            }
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum;
    }
    
    //efficient method
    //in this method, we find the first window sum (first K elements), using a seperate loop. We then use another loop to iterate from K through the array and update the current sum by 
    //subtracting the first element of the previous subarray and adding the current element.  
    static long maximumSumSubarray2(int K, ArrayList<Integer> Arr,int N){
        long maxSum=0;
        long sum=0;
        
        for(int i=0;i<K;i++){
            sum += Arr.get(i);
        }
        
        maxSum=sum;
        
        for(int i=K;i<N;i++){
            sum += Arr.get(i)-Arr.get(i-K);
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            Arr.add(x); 
        }
        System.out.println(maximumSumSubarray1(K,Arr,N));
        System.out.println(maximumSumSubarray2(K,Arr,N));
	}
}
