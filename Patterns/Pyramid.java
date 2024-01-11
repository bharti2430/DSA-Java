// method 1
public static void nStarTriangle(int n) 
{
     int star=1;
     for(int i=0;i<n;i++){
       for(int j=n-i;j>1;j--){
       System.out.print(" ");
     }
       for(int j=1;j<=star;j++) {
         System.out.print("*");
       }
       System.out.println();
       star+=2;
     }
}

// method 2
for(int i=0;i<n;i++)
  {
      for(int j=0;j<(n-i-1);j++)
      {
          System.out.print(" ");
      }
      for(int j=0;j<(2*i+1);j++)
      {
          System.out.print("*");
      }
      /*for(int j=0;j<(n-i-1);j++)
      {
          System.out.print(" ");
      }*/
      System.out.println();
  }
