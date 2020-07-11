import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayOfGrades = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOfGrades[i] = scanner.nextInt();
        }
        int A = 0, B = 0, C = 0, D = 0;
        for (int i = 0; i < n; i++) {
            if (arrayOfGrades[i] == 2) {
                D++;
            } else if (arrayOfGrades[i] == 3) {
                C++;
            } else if (arrayOfGrades[i] == 4) {
                B++;
            } else if (arrayOfGrades[i] == 5) {
                A++;
            }
        }
        System.out.print(D + " " + C + " " + B + " " + A);
    }
}
