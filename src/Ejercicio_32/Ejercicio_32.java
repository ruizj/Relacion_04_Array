package Ejercicio_32;

public class Ejercicio_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {1,2,3,4};
		int [] b;
		b = CopiaArrayPro(a);
	}

	public static int [] CopiaArrayPro (int []a){
		int [] copia =new int [a.length];
		
		for(int i = 0; i < a.length; i++){
			
			copia[i] =  a[i];
			System.out.print(copia[i] + "\t");
		}
		
		return copia;
		
	}
}
