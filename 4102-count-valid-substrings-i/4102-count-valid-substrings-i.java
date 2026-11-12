class Solution {
    public long countValidSubstrings(String s) {
        int n= s.length();
        int l = 0;
        long ans=0;
        for(int right=0; right<n; right++){
            if(right >=2 && s.charAt(right-2)== 'a' && s.charAt(right-1)== 'b' && s.charAt(right)== 'c'){
                l = Math.max(l, right-1);
            }
            ans += right-l+1;
        }
        return ans;
    }
}