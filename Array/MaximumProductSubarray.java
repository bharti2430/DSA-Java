public int maxProduct(int[] arr) {
         int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int currentProduct=1;
            for(int j=i;j<arr.length;j++){
                currentProduct*=arr[j];
                maxProduct=Math.max(currentProduct,maxProduct);
            }
        }
        return maxProduct;
    }
