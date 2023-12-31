package leet150.array;

/**
 * 0 1 2 3 4 5 6
 * -------------
 * 3 4 5 6 0 1 2
 * 3 4 5 6 7 8 9
 * 0 1
 * ----
 * 1 0
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        int[] origin = nums.clone();
        for (int i = 0; i < nums.length; i++)
            nums[(i + k) % nums.length] = origin[i];
    }
}
