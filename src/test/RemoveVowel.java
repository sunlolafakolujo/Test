package test;

import java.util.Set;

public class RemoveVowel {

    public static String removeVowelFromString(String str) {
        Set<Character> vowel=Set.of('a','e','i','o','u');
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();

        for(char c:ch) {
            if(!vowel.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(removeVowelFromString("hello world"));
    }
}
