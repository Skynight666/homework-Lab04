import java.util.Scanner;
public class JPA402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入學生人數:");
        int stu = scanner.nextInt();
        double[] numbers = new double[stu];
        double sum=0;
        double ave;
        for (int i = 0; i < stu; i++) {
            System.out.print("第"+ (i+1)+ "個學生的成績:");
            double sc = scanner.nextDouble();
            numbers[i] = sc;
            sum+= numbers[i];
        }
        ave = sum/stu;
        System.out.println("人數:"+stu);
        System.out.println("總分:"+sum);
        System.out.print("平均:" + ave);
    }
}
