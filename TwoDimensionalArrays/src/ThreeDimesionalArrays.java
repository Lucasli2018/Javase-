import java.util.Arrays;

public class ThreeDimesionalArrays {

	public static void main(String[] args) {
		String [][][] name={
				{
					{"一维数组","小青","小红","小黄"},
					{"二维数组","小绿","小白"}
				},
				{
					{"三维数组","饼干","面包"},
					{"水","牛奶"}
				}
		};
		
		System.out.println(Arrays.deepToString(name));
	}

}
