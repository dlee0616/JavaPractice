

class twoSum {
    public static int [] TwoSum(int[] nums, int target){
     int [] result = new int[2];
        for (int i = 0; i <nums.length; i++){
            for (int j = 0; j < nums.length +1; i++){
                if (numbs[i] + nums[j]== target){
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}