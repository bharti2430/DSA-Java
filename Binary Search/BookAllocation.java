Allocate books in such a way that:

1. Each student gets at least one book.
2. Each book should be allocated to only one student.
3. Book allocation should be in a contiguous manner.

public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m>n) return -1;
        int maxi=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
            maxi=Math.max(arr.get(i),maxi);
        }
        int low=maxi,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int stud=findPossibleStudent(arr, mid);
            if(stud>m) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    private static int findPossibleStudent(ArrayList<Integer> arr,int page){
        int student=1,pages=0;
        for(int i=0;i<arr.size();i++){
            if(pages+arr.get(i)<=page){
                pages+=arr.get(i);
            }else{
                student++;
                pages=arr.get(i);
            }
        }
        return student;
    }

Sample Input 1:
4 2
12 34 67 90
Sample Output 1:
113
