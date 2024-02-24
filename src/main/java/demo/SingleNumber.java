package demo;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        var singleNumber = 0;

        for (var num : nums) {
            singleNumber ^= num;
        }
        return singleNumber;
    }
}