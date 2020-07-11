import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        //solve 3
        Scanner scanner = new Scanner(System.in);
        //reading line of int s as string
        String s  = scanner.nextLine();
        //System.out.println(s);
        //removing whitespace and adding them into an array of strings
        String[] str = s.split(" ");
        //System.out.println(Arrays.toString(str));
//       getting array length and printing
         int length = str.length;
//        for(int i=0;i<length;i++){
//            System.out.print(str[i]);
//        }

        int numOfRotations = scanner.nextInt();
        numOfRotations = numOfRotations % length;
        while(numOfRotations > 0) {
            for (int i = 0; i < length; i++) {
                String temp = str[i];
                str[i] = str[length - 1];
                str[length - 1] = temp;
            }
            numOfRotations--;
        }

        for(int i=0;i<length;i++){
            System.out.print(str[i]);
            if((length-1) != i){
                System.out.print(" ");
            }

        }
        //slove 1
//        Scanner scanner = new Scanner(System.in);
//        String s  = scanner.nextLine();
//        //System.out.println(s);
//        //getting lenth of the input string
//        int totalStringLenth =s.length()+1;
//        //System.out.println(totalStringLenth);
//        int numOfRotations = scanner.nextInt();
//        numOfRotations *= 2;//because we have spaces in string
//        //System.out.println(numOfRotations);
//        if(numOfRotations > totalStringLenth){
//            numOfRotations = totalStringLenth/2 +2;
//            //System.out.println(numOfRotations);
//        }
//        String finalStringAfterRotation="";
//        int substringlength = totalStringLenth-numOfRotations;
//        //System.out.println("totalstrlength-numofrotations ="+ substringlength);
//        for (int i=0;i<totalStringLenth - numOfRotations;i++) {
//            finalStringAfterRotation += String.valueOf(s.charAt(i));
//        }
//        finalStringAfterRotation = s.substring(totalStringLenth-numOfRotations)+" "+finalStringAfterRotation;
//        System.out.println(finalStringAfterRotation.trim());
        //solve 2
//        Scanner scanner = new Scanner(System.in);
//        String s  = scanner.nextLine();
//        System.out.println(s);
//        int numOfRotations = scanner.nextInt();
//        String rotatedArray ="";
//        for(int i=0;i< numOfRotations;i++) {
//            rotatedArray = s.charAt(s.length() - 1) + " " + s.substring(0, s.length() - 2);
//            //rotatedArray.
//            s = rotatedArray;
//            //rotatedArray + s.substring()
//        }
//            System.out.println(rotatedArray);
}
}
