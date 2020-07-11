import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                array[x][y] = scanner.nextInt();
                //System.out.print("array["+x+"]["+y+"]="+array[x][y]);
            }
            scanner.nextLine();
        }

        int numOfSeatsRequired = scanner.nextInt();

        int count = 0;
        boolean result = false;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 0) {
                    count++;
                    if (count == numOfSeatsRequired) {
                        result = true;
                    }
                } else {
                    count = 0;
                }
            }
            if (result == true) {
                System.out.println(i + 1);
                break;
            }

        }
        //System.out.println("out from break");
        if (!result) {
            System.out.println(0);
        }
    }
}
