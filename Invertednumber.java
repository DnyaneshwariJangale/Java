package patterns;

public class Invertednumber{
    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //inner loop for space 
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
    
}
    }
}