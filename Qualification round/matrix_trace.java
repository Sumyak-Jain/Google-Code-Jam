import java.util.*;
public class matrix_trace
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
       int t=ob.nextInt();
       for(int k=0;k<t;k++)
       {
           int trace=0;
           int row=0;
        int columm=0;
        int n=ob.nextInt();
        int mat[][]=new int[n][n];

        for(int i=0;i<n;i++)//Entering the matrix from user.
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=ob.nextInt();
            }
        }
        
        
        for(int i=0;i<n;i++)//Calculate trace of the matrix
        {
            trace=trace+mat[i][i];
        }
        
        
        
        for(int a=0;a<n;a++){
            int a1=0;
            for(int b=0;b<n;b++){
                
                for(int c=b+1;c<n;c++){
                if(mat[a][b]==mat[a][c]){
                    a1++;
                }
            }
                
            }
            if(a1>=1)
                row++;
            
        }
           System.err.println(row);
            for(int a=0;a<n;a++){
            int a1=0;
            for(int b=0;b<n;b++){
                
                for(int c=b+1;c<n;c++){
                if(mat[b][a]==mat[c][a]){
                    a1++;
                }
            }
                
            }
            if(a1>=1)
                columm++;
            
        }
           System.err.println(columm);
        System.out.println("Case #"+(k+1)+": "+trace+" "+row+" "+columm+" ");
       }
      
}
}
