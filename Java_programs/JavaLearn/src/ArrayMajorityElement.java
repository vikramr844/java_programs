public class ArrayMajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,5, 5, 6, 5, 5, 4}; // Example array
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
    }

    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // Find the majority element candidate
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Validate if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }
}
