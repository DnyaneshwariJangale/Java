package patterns;

public class Halfpyramid {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    
}
}

// for inverted pyramid for loop of i is changes
//for(int i=n;i>=1;i--)