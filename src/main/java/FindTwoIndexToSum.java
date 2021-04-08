import java.util.HashMap;


class FindTwoIndexToSum {
    public int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    x = i;
                    y = j;
                }
        }

        int[] v = new int[2];
        v[0] = x;
        v[1] = y;
        return v;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num2 = target - nums[i];
            if (hashMap.containsKey(num2)) {
                return new int[]{hashMap.get(num2), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{};

    }

}
