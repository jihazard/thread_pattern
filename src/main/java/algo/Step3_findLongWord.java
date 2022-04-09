package algo;

import java.util.List;
import java.util.Scanner;

public class Step3_findLongWord {

    //문장찾기
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(solve(word));

        return ;
    }

    private static String solve(String word) {
        String[] wordArray = word.split("\\s+");
        String result = "";
        for (String word_: wordArray
             ) {
            if(word_.length() > result.length()) result = word_;
        }

        return result;
    }
}
