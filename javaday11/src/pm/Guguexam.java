package pm;

public class Guguexam {
	
	public static void main(String[] args) {
	
//		for (int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10 ; j++) {
//				System.out.print(i + "*" + j + "=" + i*j + " ");
//			
//			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i < 10; i++) {
			for(int j = 2; j < 10 ; j++) {
				//System.out.print(j + "*" + i + "=" + i*j + "    ");
				//System.out.printf("%d*%d = %2d\t",j,i,i*j); //간격 맞추기
				System.out.print(j + "*" + i + "=" + i*j + "\t\t");//간격 맞추기
			}
			System.out.println();
		}
		
	}
}
