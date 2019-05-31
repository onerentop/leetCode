import java.util.HashMap;

/**
 * @Author: wangren.
 * @Description: (两数之和)
 * @Date:Created in 2019-05-31 09:57.
 * @Modified By:
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            if (map.containsKey(i1) && map.get(i1) != i) {
                return new int[]{map.get(i1),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有找到两个数之和为目标的数");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        StringBuilder tar = new StringBuilder();
        tar.append("目标的数组下标为=[");
        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                tar.append(ints[i]);
            } else {
                tar.append(",").append(ints[i]);
            }
        }
        tar.append("]");
        System.out.println(tar);
    }
}
