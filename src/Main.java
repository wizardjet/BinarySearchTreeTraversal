import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter problem: ");
        String input = sc.next();
        int[] problem = stringToIntArray(input);
        BinarySearchTree tree = new BinarySearchTree(problem);
        tree.traverse();
    }

    static int[] stringToIntArray(String s) {
        int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = Character.getNumericValue(s.charAt(i));
        }
        return array;
    }

}