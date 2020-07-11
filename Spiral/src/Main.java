import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int count = 1;
        int top = 0, bottom = n - 1, right = n - 1,left = 0;
        int direction = 1;
        while (top <= bottom && left <= right) {
            //moving left to right, prints forst line,change top to next line (increase by 1)
            if (direction == 1) {
                for (int i = left; i <= right; i++) {
                    array[top][i] = count++;
                }
                direction = 2;
                top++;
            } else if (direction == 2) { //moving top to bottom,prints one line,reduce right by 1 aftter printing
                for (int i = top; i <= bottom; i++) {
                    array[i][right] = count++;
                }
                right--;
                direction = 3;
            } else if (direction == 3) { 
                //moving left to right at the bottom,prints one line,reduce bottom by 1 aftter printing
                for (int i = right; i >= left; i--) {
                    array[bottom][i] = count++;
                }
                bottom--;
                direction = 4;
            } else if (direction == 4) { //moving bottom to top,prints one line,increase left by 1 aftter printing
                for (int i = bottom; i >= top; i--) {
                    array[i][left] = count++;
                }
                left++;
                direction = 1;
            }
        }
//
        for (int[] subArray : array) {
            for (int arrayEle : subArray) {
                System.out.print(arrayEle + " ");
            }
            System.out.println();
        }

    }
}
