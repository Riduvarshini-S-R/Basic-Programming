//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long max[] = new long[(int)n];
        long curr = a[0];
        
        long sum = 0;
        long maxSum = 0; 
        
        max[0] = a[0];
        for(int i = 1; i < n; i++)
        {
            curr = Math.max(a[i], curr+a[i]);
            max[i] = curr;
        }
 
        
        for (int i = 0; i < k; i++){
            sum += a[i];
        }
        
        maxSum = sum;
        
        for (int i = (int)k; i < n; i++)
        {
            sum = sum + a[i] - a[i-(int)k];
            maxSum = Math.max(maxSum, sum);
            maxSum = Math.max(maxSum, sum + max[(int)(i-k)]);
        }
        return maxSum;
    }
}
