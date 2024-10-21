/*

DATE: 21/10/202024

  QUESTION:
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


  MY CODE:

*/

import java.util.Scanner;

class Solution {
    // Making the twoSum method static so it can be accessed from the static context
    public static int[] twoSum(int[] nums, int target) {
        // Traverse through the array to find two numbers that sum up to the target
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start j from i+1 to avoid using the same element
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices
                }
            }
        }
        return new int[] { -1, -1 }; // Return -1, -1 if no solution is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target from user
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Call the twoSum function
        int[] result = twoSum(nums, target);

        // Display result
        if (result[0] != -1) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }

        sc.close();
    }
}
