import java.io.*;
public class MatrixMultiplication {
 public static void main(String[] args) throws IOException {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Rows of A: "); int r1=Integer.parseInt(br.readLine());
  System.out.print("Columns of A: "); int c1=Integer.parseInt(br.readLine());
  System.out.print("Rows of B: "); int r2=Integer.parseInt(br.readLine());
  System.out.print("Columns of B: "); int c2=Integer.parseInt(br.readLine());
  if(c1!=r2){System.out.println("Multiplication not possible");return;}
  int[][] a=new int[r1][c1],b=new int[r2][c2],c=new int[r1][c2];
  System.out.println("Enter A values row by row:");
  for(int i=0;i<r1;i++)for(int j=0;j<c1;j++)a[i][j]=Integer.parseInt(br.readLine());
  System.out.println("Enter B values row by row:");
  for(int i=0;i<r2;i++)for(int j=0;j<c2;j++)b[i][j]=Integer.parseInt(br.readLine());
  for(int i=0;i<r1;i++)for(int j=0;j<c2;j++)for(int k=0;k<c1;k++)c[i][j]+=a[i][k]*b[k][j];
  System.out.println("Product:");for(int[] row:c){for(int v:row)System.out.print(v+" ");System.out.println();}
 }
}
