package PracticalQuestions.Easy;

public class recTable {
    public static void main(String[] args){
        int n = 9; //uer choice
        table(n,1);
    }
    static void table(int n, int i){
        System.out.println(n * i);
        i++;
        table2(n, i);
    }
    static void table2(int n, int i){
        System.out.println(n * i);
        i++;
        table3(n, i);
    }
    static void table3(int n, int i){
        System.out.println(n * i);
        i++;
        table4(n, i);
    }
    static void table4(int n, int i){
        System.out.println(n * i);
        i++;
        table5(n, i);
    }
    static void table5(int n, int i){
        System.out.println(n * i);
        i++;
        table6(n, i);
    }
    static void table6(int n, int i){
        System.out.println(n * i);
        i++;
        table7(n, i);
    }
    static void table7(int n, int i){
        System.out.println(n * i);
        i++;
        table8(n, i);
    }
    static void table8(int n, int i){
        System.out.println(n * i);
        i++;
        table9(n, i);
    }
    static void table9(int n, int i){
        System.out.println(n * i);
        i++;
        table10(n, i);
    }
    static void table10(int n, int i){
        System.out.println(n * i);
    }
}