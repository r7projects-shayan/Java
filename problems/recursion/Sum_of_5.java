import java.util.*;



public class Sum_of_5{
    public static int sum(int n){
    
    if(n<=0){
        return 0;
    }

    return n+sum(n-1);

}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int result = sum(n);
        System.out.println("Result: "+result);

    }
}