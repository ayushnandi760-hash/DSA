class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        int n=nums.length-1;
        sub(ans,out,nums,n,0);  
        return ans; 
    }
    public static  void sub(List<List<Integer>> ans,
    ArrayList<Integer> out,int[]nums,int n,int i){
        if(i>n){
            ans.add(new ArrayList<>(out));
            return;
        }

        out.add(nums[i]);
        sub(ans,out,nums,n,i+1);

        out.remove(out.size()-1);
        sub(ans,out,nums,n,i+1);
    }
}