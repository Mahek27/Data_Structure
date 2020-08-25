
 /*	You are given a string representing an attendance record for a student. 
 * 	The record only contains the following three characters:
		'A' : Absent.
		'L' : Late.
		'P' : Present.
 *	A student could be rewarded if his attendance record doesn't contain more 
 *	than one 'A' (absent) or more than two continuous 'L' (late).
 */

public class StudentAttendanceRecordI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "PPALLP";
		boolean result = checkRecord(c);
		System.out.print(result);
	}
	public static boolean checkRecord(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                count++;
            }            
        }
        return count < 2 && s.indexOf("LLL") < 0;
    }

}
