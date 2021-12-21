package ss11_DSA_Stack_Queue.bai_tap;

import java.util.HashMap;

public class DemChu {
    public static void main(String[] args) {
        characterCount("Nguyen Xuan Hai");
    }
    private static void characterCount(String inputString) {
        HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();
        char[] charArray = inputString.toCharArray();
        for (char c : charArray)
        {
            if(eachCharCountMap.containsKey(c)) {
                eachCharCountMap.put(c, eachCharCountMap.get(c)+1);
            }
            else {
                eachCharCountMap.put(c, 1);
            }
        }
        System.out.println(eachCharCountMap);
    }
}
