import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double[] two = {1.57, 7.654, 9.986};

        char[] three = new char[4];
        three[0] = 'a';
        three[1] = 'b';
        three[2] = 'c';
        three[3] = 'd';

        System.out.println();
        // Задача 2

        for (int index = 0; index < one.length; index++) {
            if (index < one.length - 1) {
                System.out.print(one[index] + ", ");
            } else {
                System.out.print(one[index]);
            }
        }
        System.out.println();


        for (int i = 0; i != two.length; i++) {
            if (i < two.length - 1) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();

        for (int a = 0; a < three.length; a++) {
            if (a < three.length - 1) {
                System.out.print(three[a] + ", ");
            } else {
                System.out.print(three[a]);
            }
        }
        System.out.println();

        System.out.println();

        // Задача 3

        for (int i = one.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
            }
        }
        System.out.println();

        for (int i = two.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();

        for (int i = three.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(three[i] + ", ");
            } else {
                System.out.print(three[i]);
            }
        }
        System.out.println();

        System.out.println();

        // Задача 4

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));

    }
}