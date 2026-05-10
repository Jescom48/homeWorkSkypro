import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] inputArray1 = {10000, 12750, 3030, 700, 8250};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int max = 0;
        int min = inputArray1[0];
        float average = 0.0f;

        for (int i : inputArray1) {
            sum += i;
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        average = (float) sum / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println();

        // Задача 2

        int[] inputArray2 = {55000, 73000, 62000, 50000, 87000};
        float[] outputArray2 = new float[inputArray2.length];
        int index = 0;

        for (float salary : inputArray2) {
            outputArray2[index] = salary * 0.13f;
            index++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println();
        // Задача 3

        int[] inputArray3 = {7000, 2000, 4000, 6000, 8000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        index = 0;

        for (int bonus : inputArray3) {
            outputArray3[index] = bonus > 5000;
            index++;
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println();
        // Задача 4

        int[] inputArray4 = {100, 0, 5000, -100, 300};
        boolean[] outputArray4 = {true};

        for (int deposit : inputArray4) {
            if (deposit < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println();
        // Задача 5

        int[] inputArray5 = {-50000, 2000, -2000, 300, 70000};
        int positiveMonth = 0;

        for (int positive : inputArray5) {
            if (positive > 0) {
                positiveMonth++;
            }
        }
        int[] outputArray5 = {positiveMonth};

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));


    }
}