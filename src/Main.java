import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        taskBorder(1, true);

        int[] inputArray1 = {12, 5, 10, 11, 15};
        float[] outputArray1 = new float[4];

        float sum = 0;
        float max = Float.NEGATIVE_INFINITY;
        float min = Float.POSITIVE_INFINITY;
        float avg = 0;

        for (int e : inputArray1) {
            sum += e;
            if (e > max) {
                max = e;
            }
            if (e < min) {
                min = e;
            }
        }
        avg = sum / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = avg;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        // Задание 2
        taskBorder(2, false);

        int[] inputArray2 = {1, 2, 54, 12, 100};
        float[] outputArray2 = new float[inputArray2.length];

        int i = 0;
        for (int e : inputArray2) {
            outputArray2[i] = (float) (e * 0.13);
            i++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        // Задание 3
        taskBorder(3, false);

        int[] inputArray3 = {3000, 4000, 5500, 1500, 7000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        i = 0;
        for (int e : inputArray3) {
            if (e > 5000) {
                outputArray3[i] = true;
            }
            i++;
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        // Задание 4
        taskBorder(4, false);

        int[] inputArray4 = {3000, -4000, 5500, 1500, 7000};
        boolean[] outputArray4 = {true};

        for (int e : inputArray4) {
            if (e < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        // Задание 5
        taskBorder(5, false);

        int[] inputArray5 = {121132, 552332, -1420, 114311, 152345};
        int[] outputArray5 = new int[1];

        for (int e : inputArray5) {
            if (e > 0) {
                outputArray5[0] += 1;
            }
        }

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }

    public static void taskBorder(int taskNum, boolean isStart) {
        if (isStart == false) {
            System.out.println("-------------------------------");
        }

        System.out.println("ЗАДАЧА " + taskNum);
    }
}




