class Solution {
    static void solve(List<List<Integer>> ans,
        List<Integer> out,int []nums,int i){
            if(i>nums.length-1){
                ans.add(new ArrayList<>(out));
                return;
            }
            out.add(nums[i]);
            solve(ans,out,nums,i+1);
            out.remove(out.size()-1);
            while(i+1<nums.length && nums[i]==nums[i+1])i++;
            solve(ans,out,nums,i+1);
            

        }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int indx=0;
        solve(ans,out,nums,indx);
        return ans;

    }
}