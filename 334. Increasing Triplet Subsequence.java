class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i<n; i++)
        {
            if(nums[i]>list.get(list.size()-1))
            {
                list.add(nums[i]);
                if(list.size() == 3) return true;
            }

            //modification in binary-search app. used in LIS
            for(int id = 0; id<list.size(); id++)
            {
                if(list.get(id)>=nums[i])
                {
                    list.set(id, nums[i]);
                    break;
                }
            }
        }
        return false;
    }
}
