import javax.naming.ldap.SortControl;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chapter1 {

    //todo:counting duplicate characters(raspuns carte)
    public Map<Character, Integer> duplicateCharacters(String text) {
        Map<Character, Integer> raspuns = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            raspuns.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }
        return raspuns;
    }

    //todo:counting duplicate characters(raspunsul meu)
    public void duplicateCharacterss(String text) {
        List<Integer> numere = new ArrayList<>();
        List<Character> caractere = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (caractere.contains(c) == false) {
                caractere.add(c);
                numere.add(1);
            } else {
                int index = getIndex(caractere, c);
                int nr = numere.get(index);
                nr++;
                numere.set(index, nr);
            }

        }
        System.out.println(caractere);
        System.out.println(numere);
    }

    //todo:find the first non-repeated character
    public char findFirstNonRepeatedCharacter(String text) {
        HashMap<Character, Integer> caractere = new HashMap<>();
        char raspuns = ' ';
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            caractere.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }
        for (Map.Entry<Character, Integer> a : caractere.entrySet()) {
            if (a.getValue() == 1) {
                raspuns = a.getKey();
            }
        }
        return raspuns;
    }

    //todo:reversing letters and words
    public <E> int getIndex(List<E> lista, E element) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == element) {
                return i;
            }
        }
        return -1;

    }

    //todo:reversing letters and words
    public StringBuilder reverseWords(String text) {
        String[] a = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String cuvant : a) {
            StringBuilder aux = new StringBuilder();
            for (int i = cuvant.length() - 1; i >= 0; i--) {
                aux.append(cuvant.charAt(i));
            }
            result.append(aux).append(" ");
        }
        return result;
    }

    //todo:check if a string contains only digit
    public boolean containDigit(String str) {
        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }

    //todo:reversting letters and words
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    //todo:counting the vowels and  consoants from a string
    public Map<String, Integer> countingVowelsAndConsoants(String str) {
        str = str.toLowerCase();
        Map<String, Integer> result = new HashMap<>();
        result.put("vocale", 0);
        result.put("consoane", 0);
        for (int i = 0; i < str.length(); i++) {
            if (vocale(str.charAt(i)) == true) {
                result.compute("vocale", (v, k) -> ++k);
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                result.compute("consoane", (v, k) -> ++k);
            }
        }
        return result;
    }

    //todo:counting the occurances of a certain character
    public int occurances(String str, char c) {
        return str.length() - str.replace(String.valueOf(c), "").length();
    }

    //todo:removing white space from a string
    public String whiteSpace(String str) {
        return str.replace(" ", "");
    }

    //todo:joining a multiple string by a specific delimiter
    public String joiningDelimiter(String str, char delimiter) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (i = 0; i < str.length() - 1; i++) {
            stringBuilder.append(str.charAt(i)).append(delimiter);
        }
        return stringBuilder.toString();
    }

    public static boolean vocale(char a) {
        String vocale = "aeiouAEIOU";
        for (int i = 0; i < vocale.length(); i++) {
            if (vocale.charAt(i) == a)
                return true;
        }
        return false;
    }

    //todo:all the permutation of a string
    public void permuteAndPrint(String str) {
        permuteAndPrint("", str);
    }

    private  void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
//todo:check if a string is a palindrom
    public boolean palindrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    //todo:removing duplicate characters
    public StringBuilder removeDuplicateCharacters(String str){
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            map.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }
        for(Map.Entry<Character,Integer> a:map.entrySet()){
                stringBuilder.append(a.getKey());
        }
        System.out.println(map);
        return stringBuilder;
    }
    public  String removeDuplicates(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();
        for (char c: chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public StringBuilder removeDuplicate(String str){
        Set<Character> set=new HashSet<>();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c:set){
            stringBuilder.append(c);
        }
        return stringBuilder;
    }

    //todo:removing a specific character
    public String removeCharacter(String str,char c){
        return str.replaceAll(String.valueOf(c),"");
    }
    //todo:finding the character with the most apperances
    public Character theMostAPpearance(String str){
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
                map.compute(str.charAt(i), (key, value) -> (value == null) ? 1 : ++value);
            }
        }
        char result=' ';
        System.out.println(map);
        for(Map.Entry<Character,Integer> a:map.entrySet()){
            if(a.getValue()>max){
                max=a.getValue();
                result=a.getKey();
            }
        }
        return result;
    }
    //todo:sorting array by length
    public StringBuilder sortingArrayByLength(String str,String direction){
        List<String> result=new ArrayList<>();
        String[] cuvinte=str.split(" ");
StringBuilder stringBuilder=new StringBuilder();
        for(String s:cuvinte){
            result.add(s);
        }
        result.sort(Comparator.comparingInt(String::length));
        if(direction.equals("crescator")){
            for(String s:result){
                stringBuilder.append(s).append(" ");
            }
        }else if(direction.equals("descrescator")){
            for(int i=result.size()-1;i>=0;i--){
                stringBuilder.append(result.get(i)).append(" ");
            }
        }
    return stringBuilder;
    }
    //todo:checking if a string contains a substring
    public boolean checkSubstring(String str,String substr){
        return str.contains(substr);
    }
    //todo:counting the occurances of a substring
    public int occuranceSubstring(String str,String substr){
        Pattern pattern = Pattern.compile(substr);
        Matcher matcher = pattern.matcher(str);
        int position = 0;
        int count = 0;
        while (matcher.find(position)) {
            position = matcher.start() + 1;
            count++;
        }
    return count;
    }
    //todo:check if tow strings are anagram
    public boolean anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        Set<Character> first=new HashSet<>();
        Set<Character> second=new HashSet<>();
        for(Character c:str1.toCharArray()){
            first.add(c);
        }
        for(Character d:str2.toCharArray()){
            second.add(d);
        }
        if(first.equals(second)==false){
            return false;
        }
        return true;
    }

    //todo:concat the same string n time
    public StringBuilder concat(String str,int n){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str);
        int nr=0;
        while(nr!=n){
            stringBuilder.append(str);
            nr++;
        }
        return stringBuilder;
    }

    //todo:finding the longest common prefix
    public String longestPrefix(String[] strs){
        if (strs.length == 1) {
            return strs[0];
        }
        int firstLen = strs[0].length();
        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (prefixLen >= strs[i].length()
                        || strs[i].charAt(prefixLen) != ch) {
                    return strs[i].substring(0, prefixLen);
                }
            }
        }
        return strs[0];
    }

}



