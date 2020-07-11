import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int[][] rotatedArray = new int[m][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                array[x][y] = scanner.nextInt();
                //System.out.print("array["+x+"]["+y+"]="+array[x][y]);
            }
            //scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedArray[j][n - 1 - i] = array[i][j];
                //System.out.print(" ");
            }
            System.out.print(" ");
        }
//        System.out.println();
//        for(int[] subArray : array) {
//            for(int arrayEle : subArray){
//                System.out.print(arrayEle + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(" ");
        for (int[] subArray : rotatedArray) {
            for (int arrayEle : subArray) {
                System.out.print(arrayEle + " ");
            }
            System.out.println();
        }
    }
}
