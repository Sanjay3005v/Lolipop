package June10;

import java.util.*;

public class spiralMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = scan.nextInt();
		int[][] nums = new int[row][col];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				nums[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println(spiralOrder(nums));
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < rows * cols; i++) {
            res.add(matrix[y][x]);
            matrix[y][x] = -101;
            if (!(0<=x+dx && x+dx<cols && 0<=y+dy && y+dy<rows) || matrix[y+dy][x+dx] == -101) {
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x += dx;
            y += dy;
        }
        return res;        
    }
}

