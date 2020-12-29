package lc12292020;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RepeatedDNASequences {
  public List<String> findRepeatedDnaSequences(String s) {
    List<String> res = new ArrayList<>();
    if (s == null || s.length() < 10)
      return res;

    Map<String, Integer> seen = new HashMap<>();
    for (int i = 0; i < s.length() - 9; i++) {
      String temp = s.substring(i, i + 10);

      if (!seen.containsKey(temp))
        seen.put(temp, 0);
      else {
        seen.put(temp, seen.get(temp) + 1);
        if (seen.get(temp) == 1)
          res.add(temp);
        else {
        }
      }
    }
    return res;
  }
}
