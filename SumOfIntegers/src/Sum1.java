
public class Sum1 {

	/**
	 * 前N个自然数的和：1 + 2 + 3 + ... + N
	 * 
	 * 求和公式：
	 * 
	 *  (1 + N) * N
	 * -------------
	 *       2
	 */
	public static void main(String[] args) {
		int n = 100;
		// FIXME:
		
		int sum = 0;
		sum=sum(n);
		// 检查结果是否为5050:
		System.out.println(sum);
	}
	
	static int sum(int n){
		if(n==1){
			return n;
		}else{
			return n+sum(n-1);
		}
	}

}