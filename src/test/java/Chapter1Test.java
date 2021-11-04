import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Chapter1Test {
private Chapter1 chapter=new Chapter1();
    @Test
    void duplicateCharacters() {
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.duplicateCharacters("AbcdAbc"));
        chapter1.duplicateCharacterss("AbcdAbcA");
    }
    @Test
    void getIndex(){
        Chapter1 chapter1 =new Chapter1();
        List<Integer> a=new ArrayList<>();
        a.add(11);
        a.add(23);
        a.add(34);
        System.out.println(chapter1.getIndex(a,1));
    }
    @Test
    void nonRepeat(){
        Chapter1 chapter1=new Chapter1();
        System.out.println( chapter1.findFirstNonRepeatedCharacter("becbedad"));
    }
    @Test
    void reverseWords(){
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.reverseWords("Acadea"));
        System.out.println(chapter1.reverseWords("A fost o data ca nici o data"));
    }
    @Test
    void check(){
        Chapter1 chapter1=new Chapter1();
        assertEquals(true,chapter1.containDigit("123a4"));
    }
    @Test
    void countVowelsAndCon(){
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.countingVowelsAndConsoants("abcdeIouBdEF"));
    }
    @Test
    void occurance(){
        Chapter1 chapter1=new Chapter1();
        assertEquals(3,chapter1.occurances("abcdcefc",'c'));
    }
    @Test
    void whiteSpace(){
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.whiteSpace("a fost o data ca nici o data"));
    }
    @Test
    void delimiter(){
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.joiningDelimiter("a fost o data ca nici o data",'#'));
    }
    @Test
    void permutation(){
        Chapter1 chapter1=new Chapter1();
        chapter1.permuteAndPrint("ABC");
        }
    @Test
    void palindrom(){
        Chapter1 chapter1=new Chapter1();
        assertEquals(true,chapter1.palindrom("abac"));
    }
    @Test
    void duplicateCharacter(){
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.removeDuplicate("abacabdc"));
    }
    @Test
    void removeCharacter(){
        Chapter1 chapter1=new Chapter1();
        System.out.println(chapter1.removeCharacter("abcdefc",'c'));
    }
    @Test
    void theMostAppearance(){
        System.out.println( chapter.theMostAPpearance("aa aaaaaeeeeabcbdabwbbccadvvbbeffbb"));;

    }
    @Test
    void srotingArray(){
        System.out.println(chapter.sortingArrayByLength("a fost o data ca nici o data","crescator"));
    }
    @Test
    void checkSubstring(){
        assertEquals(true,chapter.checkSubstring("alabama","lb"));
    }
    @Test
    void checkOuccuranceSUbstring(){
        assertEquals(2,chapter.occuranceSubstring("alabamamamam","am"));

    }
    @Test
    void checkAnagram(){
        assertEquals(true,chapter.anagram("hello","lohel"));
    }
    @Test
    void concatStringNTime(){
        System.out.println(chapter.concat("am",3));
    }
}