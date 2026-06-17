public class linearSearch {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String name = "Ashish";

        int target = 80;
        char key = 'u';
//        int result = search(arr, target);
//        boolean result = search(arr, target);
        boolean result2 = search(name, key);

//        if (result != -1) {
//            System.out.println("Element found at index " + result);
//        } else {
//            System.out.println("Element not found.");
//        }
        System.out.println(result2);
//        System.out.println(result);
    }

//    static int search(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//
//        }
//        return -1;
//    }

    //returning true/false
//    static boolean search(int[] arr, int target) {
//        if (arr.length == 0) {
//            return false;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return true;
//            }
//
//        }
//        return false;
//    }

    static boolean search(String name, char key) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == key) {
                return true;
            }

        }
        return false;
    }
}
