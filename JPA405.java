public class JPA405 {
    public static void main(String[] args) {
        String []c = {"A","B","C","D","E","F","G","H","I","J"};
        System.out.print("反轉陣列資料之前:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+c[i]);
        }
        System.out.println();
        System.out.print("反轉陣列資料之後:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(" "+c[i]);
        }
    }
}
