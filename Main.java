import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int box,ans,num;
        
        ans = 0;
        box = sc.nextInt();
        
        for(int i = 0; i < box; i++){
            num = sc.nextInt();
            
            if(num > 4){
                ans += num;
            }
            
        }
        
        System.out.println(ans);
        
        sc.close();
        
    }
}
