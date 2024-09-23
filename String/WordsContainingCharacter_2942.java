package String;

import java.util.ArrayList;

public class WordsContainingCharacter_2942 {
    public static void main(String[] args) {
        String[] words = {"leet", "abc", "code"};
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }
    static ArrayList<Integer> findWordsContaining(String[] words, char x){
        ArrayList<Integer> list = new ArrayList<>();
        String target = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(target)){
                list.add(i);
            }
        }
        return list;
    }
}
