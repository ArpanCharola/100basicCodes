import java.util.Scanner;

class positiveNegative {
    public void checkNumber(int n) {
        if (n > 0) {
            System.out.println(n + " is a positive number.");
        } else if (n < 0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = sc.nextInt();
        positiveNegative obj = new positiveNegative();
        obj.checkNumber(n);
        sc.close();
    }
}