public class Array{
    public static void main(String args[]){
        int n1 [][] = {{1,2,3,4},{3,4,5,6},{5,6,7,8}};

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
            System.out.print(n1[i][j]+ " ");
            }
            System.out.println(" ");
            
        }
    
        for (int[] n:n1){
            for ( int m:n){
                System.out.print(m+ " ");
            }
            System.out.println(" ");
        }
    }
}