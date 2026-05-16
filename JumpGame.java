import java.util.*;

public class JumpGame {

    // Function to check whether we can reach the last index
    public static boolean canJump(int[] nums) {

        // Stores the farthest index we can reach
        int maxIndex = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If current index is greater than reachable index
            // then we cannot move further
            if (i > maxIndex) {
                return false;
            }

            // Update the farthest reachable index
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        // If loop completes, last index is reachable
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        boolean result = canJump(nums);

        // Print result
        System.out.println("Can reach last index: " + result);

        sc.close();
    }
}