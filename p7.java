class p6{
    public static void main(String[] args) {
    int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
    for(int r=0;r<arr[r].length;r++){
        int temp;
        for(int c=0;c<arr[r].length;c++){ 
          temp=arr[r][c];
          arr[r][c]= arr[r][c].length-r-1;
          (arr[r][c])-r-1 = temp;
          
            System.out.println(arr[r][c]);
        }  
        
    }
}
}

