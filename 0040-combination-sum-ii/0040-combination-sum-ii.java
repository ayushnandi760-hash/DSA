class Solution {

    public static void solve(int[] candidates, int target,
                             List<List<Integer>> ans,
                             ArrayList<Integer> out, int i) {

        // Target achieved
        if (target == 0) {
            ans.add(new ArrayList(out));
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
              i + 1);

        // BACKTRACK
        out.remove(out.size() - 1);

        // DON'T TAKE + skip duplicates
        while (i + 1 < candidates.length &&
               candidates[i] == candidates[i + 1]) {
            i++;
        }

        solve(candidates,
              target,
              ans,
              out,
              i + 1);
    }

    public List<List<Integer>> combinationSum2(int[] candidates,
                                               int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();

        solve(candidates, target, ans, out, 0);

        return ans;
    }
}