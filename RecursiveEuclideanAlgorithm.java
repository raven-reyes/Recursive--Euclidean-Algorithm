
public class RecursiveEuclideanAlgorithm {
	public static int Rec_Euclidean_GCD(int a, int b) {
		
		// base case 
		// whenever b is equals to zero , the value of a is the GCD
		if(b == 0) {
			return a;
		}
		 
			// else if b is not equals to zero, then a is equals to the value of b , and b is equals to a mod b 
			// GCD(169, 36) = GCD( 36, 169 mod 36)
		// we recursively call this formular until b is equals to zero
			return Rec_Euclidean_GCD( b,  a % b);

			
		}
	// driver code
	public static void main(String[] args) {
		int a = 1370;
		int b = 528;
		System.out.println(" the GCD of " + a +  " and  " + b + "  is : " +  Rec_Euclidean_GCD(a , b ));

	}

}