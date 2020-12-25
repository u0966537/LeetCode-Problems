package lc12262020;

import java.util.List;
import java.util.ArrayList;

public class InsertInterval{
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals == null || intervals.length == 0) return new int[][]{newInterval};
        if(newInterval == null || newInterval.length == 0) return intervals;
        
        List<int[]> res = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
        	if(newInterval == null || intervals[i][1] < newInterval[0]) res.add(intervals[i]);
        	else if(newInterval[1] < intervals[i][0]){
        		res.add(newInterval);
        		res.add(intervals[i]);
        		newInterval = null;
        	}
        	else{
        		newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        		newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        	}
        }
        
        if(newInterval == null) return res.toArray(new int[res.size()][2]);
        res.add(newInterval);
        return res.toArray(new int[res.size()][2]); 
    }
}