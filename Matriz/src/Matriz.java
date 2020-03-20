
public class Matriz {
	int[][] matriz;

	public Matriz(int[][] matriz) {
		this.matriz = matriz;
	
	}
	public void down(int lin, int col) {
		if (matriz.length-1  >= lin + 1) {
			if (matriz[lin + 1].length-1 >= col) {
				System.out.printf("Down: %d\n", matriz[lin + 1][col]);
			}
		}
	}

	public void up(int lin, int col) {
		if (0 <= lin - 1 && lin - 1 <= matriz.length-1) {
			if (matriz[lin - 1].length -1>= col && col >= 0  ) {
				System.out.printf("up: %d\n", matriz[lin - 1][col]);
			}
		}

	}

	public void left(int lin, int col) {
		if (lin >= 0 && lin <= matriz.length -1) {
			if (matriz[lin].length -1 >= col -1 && col - 1 >= 0) {
				System.out.printf("Left: %d\n", matriz[lin][col-1]);
			}
		}

	}
	public void right(int lin, int col) {
		if (lin >= 0 && lin <= matriz.length -1) {
			if (matriz[lin].length -1 >= col +1 && col + 1 >= 0) {
				System.out.printf("Right: %d\n", matriz[lin][col+1]);
			}
		}

	}

	public int getMatriz(int lin , int col) {
		return matriz[lin][col];
	}

	public void setMatriz(int lin, int col, int valor) {
		matriz[lin][col]= valor;
	}
	
	
}
