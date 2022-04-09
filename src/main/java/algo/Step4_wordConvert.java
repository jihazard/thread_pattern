package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step4_wordConvert {
    //단어뒤집기
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int input1 = in.nextInt();
        for (int i = 0; i <= input1; i++) {
            String word = in.nextLine();
            System.out.println(solve(word));
        }

        return ;
    }
    private static String solve(String word){

            StringBuffer buffer = new StringBuffer();
            buffer.append(word).reverse();
        return buffer.toString();
    }
}
