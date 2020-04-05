import java.util.Arrays;
import java.util.*;
public class activity
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		int t,n;
		t=in.nextInt();
                for(int q=0;q<t;q++){
                    ArrayList<String> hs=new ArrayList<String>();
                     n=in.nextInt();
		int S[]=new int[n];
		int E[]=new int[n];
		for(int i=0;i<n;i++)
		 {
				S[i]=in.nextInt();
				E[i]=in.nextInt();
				
                    }
              
                int k;
                hs.add("C");
			for( k=1;k<n;k++)
			{   
                 
				if(S[k]<=E[k-1])
				{
                                    hs.add("J");
                                }
                                        
                            else
				{
						hs.add("C");
                                }
					
				
				
				
			}
                          String res = String.join("",hs);
                           if(E[k]<=E[k-1]){
                                    if(E[k+1]<E[k-1]){
                                         System.out.println("Case #"+(q+1)+":"+ "IMPOSSIBLE");
                                         
                                    } 
                }
                          System.out.println("Case #"+(q+1)+":"+" "+res);
		}
        }
	}
