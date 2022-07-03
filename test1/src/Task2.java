import java.util.Scanner;

public class Task2 {
    public static int task2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = scanner.nextInt();

        int res = 1;
        for (int i = 0; i <= a; i++) {
            if (tub(i)){
                res *= i;
            }
        }

        String s = String.valueOf(res);

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0'){
                count++;
            }
        }

        System.out.println(s);
        return count;
    }

    public static boolean tub(int a){
        if (a == 1 || a == 0)  return false;


        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }


    public static int right() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = scanner.nextInt();

        if (a >= 5) return 1;
        else return 0;
    }
}
