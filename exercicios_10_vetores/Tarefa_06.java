package exercicios_10_vetores;

import java.util.Scanner;

public class Tarefa_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quant = sc.nextInt();
		
		int[] nums1 = new int[quant];
		int[] nums2 = new int[quant];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<nums1.length; i++) {			
			nums1[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<nums1.length; i++) {			
			nums2[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE");
		for(int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]+nums2[i]);
		}
		sc.close();
	}

}
