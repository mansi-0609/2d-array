class p6{
    public static void main(String[] args) {
    int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
    for(int r=0;r<arr[r].length;r++){
        int sum=0;
        for(int c=0;c<arr[r].length;c++){ 
            sum+=arr[r][c] ;  
        } System.out.println( sum);
    }
}
}
