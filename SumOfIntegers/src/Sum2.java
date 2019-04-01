
public class Sum2 {

	/**
	 * 从M至N的自然数的和：M + ... + N
	 */
	public static void main(String[] args) {
		int m = 50;
		int n = 100;
		// FIXME: 50 + 51 + 52 + ... + 100 = ?
		int sum = 0;
		sum=sum(m,n);
		// 检查结果是否为3825:
		System.out.println(sum);
	}
	
	static int sum(int m,int n){
		if(m==n){
			return n;
		}else{
			return m+sum(m+1,n);
		}
	}

}
