package lc12252020;

import java.util.List;
import java.util.ArrayList;

public class CombinationSum{
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates ==  null || candidates.length == 0) return new ArrayList<>();
        int[] arr = new int[target];
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, arr, res, target, 0, 0);
        return res;
    }
    public void helper(int[] cand, int[] arr, List<List<Integer>> res, int target, int start, int curidx){
        if (target==0){
            List<Integer> out =  new ArrayList<>();
            for (int i=0; i<curidx; i++){
                out.add(arr[i]);
            }
            res.add(out);
        }
        else if (target > 0){
            for (int i=start; i < cand.length; i++){
                arr[curidx] = cand[i];
                // curidx = level, the number of elements.
                helper(cand, arr, res, target - cand[i], i, curidx+1);
            }
        }
    }
}