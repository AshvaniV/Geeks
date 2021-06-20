package java8.package1;

import java.util.HashSet;

public class example1 {
    public static void main(String[] args) {
        System.out.println(isAnagram("eat","ate"));

    }

    static boolean isAnagram(String S1, String S2) {
        if(S1.length() != S2.length())
            return false;
        int l = S1.length();

        HashSet<Character> s = new HashSet<>();
        for(int i = 0; i< l;i++){
            s.add(S1.charAt(i));
        }
        for(int i = 0; i <l ;i++){
            if(s.contains(S2.charAt(i)))
                s.remove(S2.charAt(i));
            else
                return false;
        }
        if(s.isEmpty())
            return true;
return true;
    }
}

/*Input: strs = ["eat","tea","et", tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/

/*
* eat - ate
*
*
*
* */