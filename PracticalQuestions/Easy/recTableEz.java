package PracticalQuestions.Easy;

public class recTableEz {
    public static void main(String[] args){
        int n = 9; //uer choice
        table(n,1);
    }
    static void table(int n, int i){
        if(i == 11){
            return;
        }
        System.out.println(n * i);
        table(n, i + 1);
    }
}