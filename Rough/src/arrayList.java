import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
    static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<Integer>(4);

        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);
        List1.add(50);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Give 5 input: ");
//        for (int i=0; i<5; i++){
//            List1.add(sc.nextInt());
//        }

        //to get at any index
        for (int i=0; i<5; i++){
            System.out.print(List1.get(i) + " ");
        }

        System.out.println(List1);
    }
}
