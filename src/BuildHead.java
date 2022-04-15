import java.util.Arrays;

public class BuildHead {
    public static int topDown(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            topDownHeapBuild(arr, i, arr[i]);
        }
        int comparisons = arr[0];
        arr[0] = 0;
        return comparisons;
    }

    private static void topDownHeapBuild(int[] arr, int index, int val) {
        if (index == 1) {
            arr[index] = val;
        } else {
            int parentIndex = index;
            // check parent val in parent index.
            while (parentIndex > 1) {
                arr[0] = arr[0] + 1;
                if (arr[parentIndex / 2] < val) {
                    int temp = arr[parentIndex / 2];
                    arr[index] = temp;

                    index = parentIndex / 2;
                    parentIndex = index;
                } else {
                    break;
                }
            }
            arr[parentIndex] = val;
        }
    }

    public static void main(String[] args) {
        int[] dataSet1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] dataSet2 = {0, 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15};
        int[] dataSet3 = {0, 4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 14};
        int[] dataSet4 = {0, 5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9};

//        System.out.println(BuildHead.topDown(dataSet1));
//        System.out.println(Arrays.toString(dataSet1));
//        System.out.println(BuildHead.topDown(dataSet2));
//        System.out.println(Arrays.toString(dataSet2));
//        System.out.println(BuildHead.topDown(dataSet3));
//        System.out.println(Arrays.toString(dataSet3));
//        System.out.println(BuildHead.topDown(dataSet4));
//        System.out.println(Arrays.toString(dataSet4));

        System.out.println(BuildHead.bottomUp(dataSet1));
        System.out.println(Arrays.toString(dataSet1));
    }

    public static int bottomUp(int[] arr) {
        for (int i = (arr.length / 2); i > 0; i--) {
            arr[i] = arr[i];
            bottomUpHeapBuild(arr, i, arr[i]);
        }

        int comparisons = arr[0];
        arr[0] = 0;
        return comparisons;
    }

    private static void bottomUpHeapBuild(int[] arr, int index, int val) {
        int maxValueIndex = (index * 2) + 1 >= arr.length ? index * 2 :
                getMaxIndexVal(arr, index * 2, (index * 2) + 1);

        while (index < arr.length) {
            if (index * 2 >= arr.length) break;

            if (arr[maxValueIndex] > val) {
                arr[index] = arr[maxValueIndex];

                index = maxValueIndex;
                if (index * 2 >= arr.length) break;
                if (arr[index * 2] < val && (index * 2) + 1 >= arr.length) {
                    // if parent has one child and child val is less than parent value break.
                    break;
                } else if (arr[index * 2] > val && (index * 2) + 1 >= arr.length) {
                    // if parent has one child and child val is greater than parent value.
                    maxValueIndex = index * 2;
                } else {
                    // get max val for parent's children
                    maxValueIndex = getMaxIndexVal(arr, index * 2, (index * 2) + 1);
                }
            } else {
                break;
            }
        }

        arr[index] = val;
    }

    private static int getMaxIndexVal(int[] arr, int i1, int i2) {
        return arr[i1] >= arr[i2] ? i1 : i2;
    }
}
