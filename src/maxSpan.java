class MaxSpan {
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        int span = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            span = rightMost(nums, digit) - leftMost(nums, digit) + 1;
            if (span > maxSpan) {
                maxSpan = span;
            }
        }
        return maxSpan;
    }

    public int leftMost(int[] nums, int digit) {
        int i = 0;
        while (nums[i] != digit) {
            i++;
        }
        return i;
    }

    public int rightMost(int[] nums, int digit) {
        int i = nums.length - 1;
        while (nums[i] != digit) {
            i--;
        }
        return i;
    }

    public static void main(String [] args){
        MaxSpan m = new MaxSpan();
        m.maxSpan(new int[]{1, 2, 3, 4, 2});
    }
}