package examples;

public class Q30MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {6, -3, -10, 0, 2};
		System.out.println(maxProduct(number));
	}
	 public static int maxProduct(int[] nums) {

		    int leftProduct = 1;
		    int rightProduct = 1;
		    int result = nums[0];

		    for (int i = 0; i < nums.length; i++) {
		    	int max;
		      leftProduct = leftProduct == 0 ? 1 : leftProduct;
		      rightProduct = rightProduct == 0 ? 1 : rightProduct;
		      leftProduct = leftProduct * nums[i];
		      rightProduct =rightProduct * nums[nums.length - 1 - i];
		      max=Math.max(leftProduct, rightProduct);
		      result = Math.max(result,max);
		    }
		    return result;
		  }

}
