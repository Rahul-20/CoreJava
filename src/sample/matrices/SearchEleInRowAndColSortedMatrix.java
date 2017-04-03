package sample.matrices;

/* 
1) Start with top right element
2) Loop: compare this element e with x
		i) if they are equal then return its position
		ii) e < x then move it to down (if out of bound of matrix then break return false) 
		iii) e > x then move it to left (if out of bound of matrix then break return false)
3) repeat the i), ii) and iii) till you find element or returned false

*/

public class SearchEleInRowAndColSortedMatrix 
{
	public static void main(String[] args) 
	{
		int mat[][] = { {10, 20, 30},
                {15, 25, 35},
                {27, 29, 37},
                {32, 33, 39},
              };
		
		search(mat,29);
		
	}

	public static void search(int mat[][],int x)
	{
		int i=0; 
		int j=2;
		
		while(i<4 && j>=0)
		{
			if(mat[i][j]==x)
			{
				System.out.println("Found::::"+"i::"+i+"::::j::::"+j);
				System.out.println(mat[i][j]);
			}
			if(mat[i][j]>x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
	}
}
