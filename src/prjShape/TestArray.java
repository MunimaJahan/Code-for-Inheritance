package prjShape;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 25;

		float[] x = new float[ARRAY_SIZE];
		int[] a= {1,3,4,15,10};
		int max=0;
		String[] names= new String[5];
		names[0]="Name1";
		for (int i = 0; i < a.length; i++)

		{
			//a[i]+=5;
		     //System.out.println(a[i]);
			if(max<a[i]) {
				max=a[i];
			}
		}
		
		System.out.println(max);

	}

}
