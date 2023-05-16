package SingleDimensionalArray;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentID[]=new int[5];
		 studentID[0]=1234;
		 studentID[1]=2345;
		 studentID[2]=4567;
		 studentID[3]=6789;
		 studentID[4]=7890;
		 
		 int arraysize=studentID.length;
		 
		 System.out.println("Length of an Array = " +arraysize);
		
for(int i=0;i<arraysize;i++) {
	System.out.println("Student ID = "+studentID[i]);
}
	}

}
