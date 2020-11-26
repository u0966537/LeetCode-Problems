package lc11252020;

public class StudentAttendanceRecordI {
	public boolean checkRecord(String s) {
		if(s == null || s.length() == 0) {
			return true;
		}
		
		int countA = 0;
		int countL = 0;
		for(int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if(current == 'A') {
				countA++;
				countL = 0;
			}
			else if(current == 'L') {
				countL++;
			}
			else {
				countL = 0;
			}
			
			if(countA > 1 || countL== 3) {
				return false;
			}
		}
		
		return true;
	}
}
