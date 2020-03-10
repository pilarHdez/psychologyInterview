import java.util.*;

public class Solution{
    
    /**
      * findSum
      * The indexes start at 0
      * @param int[] arr
      * @param int sumValue
      */
    public static void findSum(int[] arr, int sumValue){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sumValue){
                    System.out.println("Index 1:" + i);
                    System.out.println("Index 2:" + j);
                    return;
                }
            }
            
        }
        
        System.out.println("No elements to get " + sumValue);
    }
    
    /**
      * countOcurrences
      * The ocurrrences will print in alphafebitc order
      * @param String strValue
      */
    public static void countOccurences(String strValue){
        HashMap<Character, Integer> mapChar = new HashMap<Character, Integer>();
        
        char[] strToArray = strValue.replace(" ","").toCharArray();
        
        for (char c : strToArray) { 
            if (mapChar.containsKey(c)) { 
                mapChar.put(c, mapChar.get(c) + 1); 
            } 
            else { 
                mapChar.put(c, 1); 
            } 
        } 
        
        // Could be an external function 
        for (Map.Entry entry : mapChar.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    }
      
    public static void main(String[] args){
        System.out.println("Solution 1:");
        System.out.println("findSum([1, 20, 13, 16], 29)");
        findSum(new int[] {1, 20, 13, 16}, 29);
        System.out.println("findSum([3, 15, 18, 8, -1], 17)");
        findSum(new int[] {3, 15, 18, 8, -1}, 17);
        
        System.out.println("Solution 2:");
        System.out.println("countOccurences(Hello World)");
        countOccurences("Hello World");
        System.out.println("countOccurences(Purple People Eater)");
        countOccurences("Purple People Eater");
        
    }
}
