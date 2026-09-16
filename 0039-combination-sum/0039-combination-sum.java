class Solution {
    public static void solve(int[] candidates, int target,
    List<List<Integer>> ans,List<Integer> out, int i){
        if(target==0){
            ans.add(new ArrayList(out));
            return;
        }
        if(i>=candidates.length) return;
        if(target<0){
            return;
        }
        out.add(candidates[i]);
        solve(candidates,target-candidates[i],ans,out,i);

        out.remove(out.size()-1);
        solve(candidates,target,ans,out,i+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int indx=0;
        solve(candidates,target,ans,out,indx);
        return ans;
    }
}