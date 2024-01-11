public static void nStarTriangle(int n) {
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



    }
