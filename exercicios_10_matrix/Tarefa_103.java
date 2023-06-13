package exercicios_10_matrix;

import java.util.Scanner;

public class Tarefa_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[][] vetor = new int[num1][num2];
		
		for(int i=0;i<vetor.length;i++) {
			for(int j=0;j<vetor[i].length;j++) {
				vetor[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Escolha um numero: ");
		int num = sc.nextInt();
		
		for(int x=0;x<vetor.length;x++) {
			for(int y=0;y<vetor[x].length;y++) {
				if(vetor[x][y] == num) {
					System.out.println("Position "+x+","+y+":");
					if(y>0) {
						System.out.println("Left: " +vetor[x][y-1]);
				}
					if(y+1 < vetor[x].length) {
						System.out.println("Right: "+vetor[x][y+1]);
					}
					if(x>0) {
						System.out.println("Up: "+vetor[x-1][y]);
					}
					if(x+1 < vetor.length) {
						System.out.println("Down: "+vetor[x+1][y]);
					}				
				}
			}
		}
		
		sc.close();
	}

}
