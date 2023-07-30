package Recursionn;

public class InviteGuestforParty {
	public static int callGuests(int n) {
		if (n <= 1) {
			return 1;
		}
		
		// call the SINGLE guest at a time
		int ways1 = callGuests(n-1);
		
		// call in PAIRS guest at a time
		int ways2 = (n-1)*callGuests(n-2);
		
		return ways1 + ways2;
	}
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(callGuests(n));
	}

}
