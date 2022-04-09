package algo;

import java.util.Locale;
import java.util.Scanner;

public class Step2_chaterTypeChange {
//    2. 대소문자 변환
//    설명
//
//    대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//    입력
//    첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//    문자열은 영어 알파벳으로만 구성되어 있습니다.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word = in.next();
    }

    private static String execute(String word) {
        String result = "";
        for (char cha: word.toCharArray()
             ) {
            if(cha >= 97 && cha <= 122) {
                //소문자
                String convertString = String.valueOf(cha).toUpperCase();
                result += convertString;
                continue;
            }
            String convertString = String.valueOf(cha).toLowerCase();
            result += convertString;
        }
        return result;
    }
}
