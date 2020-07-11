import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //scanner.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        //scanner.nextLine();
        int num = scanner.nextInt();
        int count = 0;
        for (int ele : array) {
            //System.out.println(ele);
            if (ele == num) {
                count++;
            }
             //System.out.println("count="+count);
        }
        System.out.println(count);
    }
}
