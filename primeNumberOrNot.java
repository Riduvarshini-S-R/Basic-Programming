// To find if the number is prime or not

public class Main{
    
    //normal method
    
    static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    //improvised method
    
    static boolean isPrime2(int n){
        if(n==0 || n==1)
            return false;
        if(n==2)
            return true;
        if(n%2==0)
            return false;
        //i+=2
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    //improvised method 2
    
    static boolean isPrime3(int n){
        if(n==0 || n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        //i+=6
        for(int i=5;i<Math.sqrt(n);i+=6){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public static void main(String args[]){
        System.out.println(isPrime(7));
        System.out.println(isPrime(22));
        System.out.println(isPrime(29));
    }
}
