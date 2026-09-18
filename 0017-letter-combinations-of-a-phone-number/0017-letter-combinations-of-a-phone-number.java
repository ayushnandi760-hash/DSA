class Solution {
    public static void solve(String digits,List<String> ans,StringBuilder out,String[] mapped,int i){
        if(i>=digits.length()){
            ans.add(out.toString());
            return;
        }

        int no= digits.charAt(i)-'0';
        String s=mapped[no];

        for(int j =0; j<s.length();j++){
            out.append(s.charAt(j));
            solve(digits,ans,out,mapped,i+1);
            out.deleteCharAt(out.length()-1);
        }


    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        String[] mapped={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,ans,out,mapped,0);
        return ans;

    }
}