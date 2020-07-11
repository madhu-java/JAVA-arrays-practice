import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        int triples = 0;
        for (int i = 1; i < n; i++) {
            if (array[i - 1] + 1  == array[i]) {
                count++;
                //System.out.println("array[i]"+array[i]+"count"+count);
                if (count >= 2) {
                    triples += 1;
                    //System.out.println("triples"+triples);
                }
            } else {
                count = 0;
            }
        }
        System.out.println(triples);
    }
}
