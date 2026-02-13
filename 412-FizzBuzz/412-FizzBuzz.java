// Last updated: 2/13/2026, 9:44:37 AM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";
            ans.add(s.isEmpty() ? String.valueOf(i) : s);
        }
        return ans;
    }
}
