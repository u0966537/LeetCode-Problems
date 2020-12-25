package lc12252020;

public class MultiplyStrings{
	
	public String multiply(String num1, String num2) {
		if(num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0) return "0";
		
		int[] digits = new int[num1.length() + num2.length()];
		for(int i = num1.length() - 1; i >= 0; i--){
			for(int j = num2.length() - 1; j >=0; j--){
				int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int carryIndex = i + j;
				int digitIndex = i + j + 1;
				int sum = product + digits[digitIndex];
				digits[digitIndex] = sum % 10;
				digits[carryIndex] += sum / 10;
			}	
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < digits.length; i++){
			if(digits[i] == 0 && sb.length() ==0) continue;
			sb.append(digits[i]);
		}
	
		return sb.length() == 0 ? "0"  :  sb.toString();
    }
}