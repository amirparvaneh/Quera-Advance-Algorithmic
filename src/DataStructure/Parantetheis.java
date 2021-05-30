package DataStructure;

import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Parantetheis{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        k(str);
    }
    public static void k(String str){
        boolean res = true;
        if (str.length()==0){
            res = false;
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> integerStack  = new Stack<>();
        for (int i = 0 ; i<str.length() ; i++){
            if (str.charAt(i)== '('){
                integerStack.push(i+1);
            }else {
                if (integerStack.size()==0){
                    res = false;
                    break;
                }
                else {
                    String tem = "" + integerStack.pop() + " " + (i+1) + " \n";
                    sb.append(tem);
                }
            }
        }
        if (!res || integerStack.size()>0 ){
            System.out.println("-1");
        }else {
            System.out.println(sb.toString());
        }
    }
}
/*
import java.util.*;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        k2(st);
    }

    public static void k2(String str) {
        boolean res = true;
        if (str.length() == 0) {
            res = false;
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                integerStack.push(i + 1);
            } else {
                if (integerStack.size() == 0) {
                    res = false;
                    break;
                } else {
                    String tmp = "" + integerStack.pop() + " " + (i + 1)+ " \n";
                    sb.append(tmp);
                }
            }
        }
        if (!res || integerStack.size() > 0) {
            System.out.println("-1");
        } else {
            System.out.println(sb.toString());
        }
    }
}
*/
