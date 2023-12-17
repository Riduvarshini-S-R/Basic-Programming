import java.util.*;

public class Main
{
    //using Hashmap
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> frequency = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            frequency.put(s.charAt(i),frequency.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            if(!frequency.containsKey(t.charAt(i)) || frequency.get(t.charAt(i))==0)
                return false;
            frequency.put(t.charAt(i),frequency.get(t.charAt(i))-1);
        }
        return true;
    }

    //using Array 
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            if (count[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            count[t.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(isAnagram(s,t));
	}
}
