
package liste;


public class graf {
 
    int n=0;
 //   int a[10][10];
    public int generare_cost(int n, int a[][])
{
int i,j,k;
for(k=0;k<n;k++)
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            if(a[i][j]>a[i][k]+a[k][j]) a[i][j]=a[i][k]+a[k][j];
for(i=0; i<n; i++){
    for(j=0;j<n;j++)
        System.out.print(a[i][j]);
System.out.print("\n\n");

}
return a[n][n];
}
    
    
   
}
