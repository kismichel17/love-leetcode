package demo;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        var lowIndex = 0;
        var highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            var middleIndex = (lowIndex + highIndex) / 2;

            if (nums[middleIndex] == target) {
                return middleIndex;
            }

            if (nums[middleIndex] < target) {
                lowIndex = middleIndex + 1;
            }

            if (nums[middleIndex] > target) {
                highIndex = middleIndex - 1;
            }
        }

        return nums[lowIndex] >= target ? lowIndex : lowIndex + 1;
    }
}