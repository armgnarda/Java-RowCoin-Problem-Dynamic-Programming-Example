
public class CoinRow {

	public static void main(String[] args) {
		
		int[] myArr = {5, 1, 2, 10, 6, 2};
		System.out.println("Largest number: " + maxRowCoin(myArr));

	}
	
	public static int maxRowCoin(int[] arr) {
		
		int len = arr.length;
		
		// create empty array
		int[] dp = new int[len];
		
		//dp[0] = 0;
		//dp[1] = arr[1];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		
		for (int i = 2; i < len; i++) {
			dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
		}
		
		
		return dp[len-1];
	}

}
