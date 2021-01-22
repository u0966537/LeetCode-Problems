package prime;

import java.util.Arrays;

public class MeetingRooms {
	public static void main(String[]args) {
		System.out.println(canAttendMeetings(new int[][] {{0, 30}, {5, 10}, {15, 20}}));
		System.out.println(canAttendMeetings(new int[][] {{7, 10}, {2,4}}));
	}
	
	public static boolean canAttendMeetings(int[][] intervals) {
		if(intervals == null || intervals.length == 0)
			return true;
		
		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
		
		for(int i = 1; i < intervals.length; i++) {
			if(intervals[i - 1][1] > intervals[i][0])
				return false;
		}
		
		return true;
	}
}
