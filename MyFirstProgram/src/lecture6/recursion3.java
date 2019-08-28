package lecture6;

public class recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[4][4];
		countqueen
	
		
	}
	public static int countqueens(boolean[][] board ,int row) {
		if(row==board.length) {
			return 1;
		}
		int count=0;
		for(int col=0;col<board[row].length;col++) {
			if(isitsafe(board,row,col)) {
				board[row][col]=true;
				count=count+countqueens(board,row+1);
				board
				
			}
		}
	}

}
