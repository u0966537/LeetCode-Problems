package lc12262020;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeIntervals{
	public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) return intervals;
        
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
       	List<int[]> res = new ArrayList<>();
       	
       	int[] current = intervals[0];
       	for(int i = 1; i < intervals.length; i++){
       		if(current[1] < intervals[i][0]){
       			res.add(current);
       			current = intervals[i];	
       		}
       		else{
       			current[1] = Math.max(current[1], intervals[i][1]);
       		}
       	}
       	res.add(current);
       	
       	return res.toArray(new int[res.size()][2]);
    }
}