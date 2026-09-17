class Solution {
    
        public static void solve(int[] candidates, int target,
                             List<List<Integer>> ans,
                             ArrayList<Integer> out, int i,int count) {

        // Target achieved
        if (target == 0 && out.size()==count) {
            ans.add(new ArrayList<>(out));
            return;
        }

        // Stop
        if (i == candidates.length || target < 0) {
            return;
        }

        // TAKE
        out.add(candidates[i]);

        solve(candidates,
              target - candidates[i],
              ans,
              out,
              i + 1,count);

        // BACKTRACK
        out.remove(out.size() - 1);

        // DON'T TAKE + skip duplicates
        while (i + 1 < candidates.length &&
               candidates[i] == candidates[i + 1]) {
            i++;
        }

        solve(candidates, target,ans,out,i + 1,count);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] candidates={1,2,3,4,5,6,7,8,9};
         Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();

        solve(candidates, n, ans, out, 0,k);

        return ans;
    }
    
}