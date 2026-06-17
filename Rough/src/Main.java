import java.util.*;

void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    System.out.print("Enter name of your friends: ");
    String n = sc.next();

    if(n.equals("Ashish")){
        System.out.println("Hello Ashish");
    }
    if(n.equals("Adarsh")){
        System.out.println("Hello Adarsh");
    }
    if(n.equals("Ankit")){
        System.out.println("Hello Ankit");
    }*/

  /*  Scanner in  = new Scanner(System.in);
    System.out.print("Enter day ");
    int day = in.nextInt();
    in.close();*/

   /* switch (day) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Invalid day");
    }*/

//    for (int i=1; i<=10; i++) System.out.print(i+" ");
//    int[] arr = new int[50];
//    int n = 30;
//    int arr2[];
//    arr2 = new int[39];
////    arr = new int[]{2, 34, 5, 6};
//    System.out.println(Arrays.toString(arr));
//
//    String[] name = new String[1];
//    name = new String[]{"Ashish"};
//    System.out.println(name[0]);

    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter row & col: ");
//    int row = sc.nextInt();
//    int col = sc.nextInt();
//
//
//    int[][] arr = new int[row][col];

    int[][] arr = {{2,1,3}, {1,7,5}, {2,2}};

//    System.out.print("Enter elements: ");
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//            arr[i][j] = sc.nextInt();
//        }
//    }

//    for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//            System.out.print(arr[i][j] + " ");
//        }
//        System.out.println();
//    }

    for (int[] ints : arr) {
        System.out.println(Arrays.toString(ints));
    }

}