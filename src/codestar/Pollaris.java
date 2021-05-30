package codestar;

import java.util.Scanner;

public class Pollaris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = str.length();
        if (checkString(str)){
            System.out.println("YES");
        }else System.out.println("NO");
        
    }
    private static boolean checkString(String str) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;

        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
             if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if( capitalFlag && lowerCaseFlag)
                return true;
        }
        return false;
    }
}
