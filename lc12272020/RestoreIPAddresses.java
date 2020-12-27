package lc12272020;

import java.util.List;

public class RestoreIPAddresses {
  public List<String> restoreIpAddresses(String s) {
    List<String> res = new ArrayList<>();
    if (s == null || s.length() == 0)
      return res;
    helper(res, new ArrayList<>(), 0, s);
    return res;
  }

  // dfs
  private void helper(List<String> res, List<String> comb, int pos, String s) {
    // ensure generated 4 integers, and all the digits are used.
    if (comb.size() == 4 && pos == s.length())
      // put '.' between each integer
      res.add(String.join(".", comb));

    else if (comb.size() < 4) {
      // each integer can have max 3 digits
      for (int i = 1; i <= 3; i++) {
        // out of index
        if (pos + i > s.length())
          return;
        //
        if (i > 1 && s.charAt(pos) == '0') r
          turn;

        String str = s.substring(pos, pos + i);
        int val = Integer.parseInt(str);

        if (val <= 255) {
          comb.add(str);
          helper(res, comb, pos + i, s);
          comb.remove(comb.size() - 1);
        }
      }
    }
  }
}
