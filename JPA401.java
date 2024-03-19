import java.util.Scanner;
public class JPA401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int count = 0;
        System.out.println("請輸入10個整數:");
        for (int i = 0; i < 10; i++) {
            System.out.print("第"+ (i+1) +"個整數:");
            int num = scanner.nextInt();
            numbers[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > 60) {
                count++;
                sum += numbers[i];
            }
        }
        float ave = 0;
        if (count != 0) {
            ave = (float) sum / count;
        }
        System.out.println("陣列中大於60的數有" + count + "個");
        System.out.println("總合為"+sum);
        System.out.println("平均值為"+ave);
    }
}
