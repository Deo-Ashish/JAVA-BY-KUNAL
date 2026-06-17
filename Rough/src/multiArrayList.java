import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {
    static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);

        Scanner in = new Scanner(System.in);

        //Initialization of ArrayList
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.print("Enter elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
