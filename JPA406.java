import java.util.Scanner;
public class JPA406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]c = {30,50,80,100};
        System.out.print("停車時數:");
        int hours = scanner.nextInt();
        if (hours<=2){
            System.out.println("應繳費用:" + (c[0]*hours)+"元整");
            System.out.println("--------------------");
        } else if (hours>2&&hours<4){
            System.out.println("應繳費用:" + ((c[0]*2)+ (c[1]*(hours-2)))+"元整");
            System.out.println("--------------------");
        } else if (hours>=4&&hours<6){
            System.out.println("應繳費用:" + ((c[0]*2)+ (c[1]*2)+ (c[2]*(hours-4)))+"元整");
            System.out.println("--------------------");
        } else {
            System.out.println("應繳費用:" + ((c[0]*2)+ (c[1]*2)+ (c[2]*2)+(c[3]*(hours-6)))+"元整");
            System.out.println("--------------------");
        }
    }
}
