package co.edu.variable;

public class SortExe {

	public static void main(String[] args) {
		int[] numAry = {34, 21, 33,1,12,24,22,};
		for(int i=0; i<numAry.length; i++)
		for(int j = 0; j<numAry.length-1; j++){
			if(numAry[j]>numAry[(j+1)])
			{
				int temp = numAry[j];
				numAry[j] = numAry[(j+1)];
				numAry[(j+1)] = temp;
			}
		}
		for(int n: numAry)
		System.out.println(n);
	}
}
