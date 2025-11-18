package PracticalQuestions.Easy;
//import java.util.*;

public class recursionTable {
    public static void Table(int num, int i){
        if(i > 10){
            return;
        }
        System.out.println(num + " * " + i + " = " + (num * i));
        Table(num, i+1);
    }
    public static void main(String[] args) {
        int n = 9;
        int i = 1;
        Table(n, 1);
    }
}