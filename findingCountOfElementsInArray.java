//finding the count of elements in an array

import java.util.*;

public class Main
{
    //using HashMap
    static void findCount1(int[] arr) {
        Map<Integer,Integer> occurances = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            occurances.put(arr[i],occurances.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i : occurances.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }

  //using loops
    static void findCount2(int[] arr) {
        int currElement = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == currElement){
                count++;
            }
            else{
                System.out.println(currElement + " " + count);
                currElement = arr[i];
                count = 1;
            }
        }
        System.out.println(currElement + " " + count);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
		    arr[i] = sc.nextInt();
		}
		findCount1(arr);
		findCount2(arr);
	}
}
