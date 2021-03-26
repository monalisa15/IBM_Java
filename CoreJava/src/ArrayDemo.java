
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		int [][] jag = {{1 , 2},{3,4,5},{6,7,8,9}};
		for(int i=0;i<jag.length;i++)
		{
			for(int j=0;j<jag[i].length;j++)
			{
				System.out.print(jag[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
