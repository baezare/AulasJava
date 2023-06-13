package principalLM;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] nums = new int[n][n];
				
		int negative = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = sc.nextInt();
				if(nums[i][j]<0) {
					negative++;
				}
			}
		}
		System.out.println("Main Diagonal");
		for(int x=0;x<nums.length;x++) {			
			System.out.print(nums[x][x]+" ");		
		}
		System.out.println();
		System.out.println("Negative numbers = "+ negative);
		sc.close();
	}

}
