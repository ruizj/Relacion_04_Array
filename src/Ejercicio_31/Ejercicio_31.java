package Ejercicio_31;

import java.lang.reflect.Array;

public class Ejercicio_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {1,2,3,4};
		int []b = {5,6,7,8,9};
		int []c = ConcatenasArraysPro(a, b);
		
	}
	
	public static int[] ConcatenasArraysPro( int []a, int[]b){
		int [] ArrayCont  = new int [a.length+b.length];
		
		System.arraycopy(a, 0, ArrayCont, 0, a.length);
		System.arraycopy(b, 0, ArrayCont, a.length, b.length);
		
		for(int i = 0; i < ArrayCont.length; i++){
			
			System.out.print(ArrayCont[i]+"\t");
			
		}
		return  ArrayCont;
	}

}
