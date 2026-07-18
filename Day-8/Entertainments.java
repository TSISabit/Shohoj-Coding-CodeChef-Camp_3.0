import java.util.*; 
public class Entertainments{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt(); 
        n *= 200; 
        if(n < 1000) System.out.println(n);
        else System.out.println(1000); 
    }
}