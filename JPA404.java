public class JPA404 {
    public static void main(String[] args) {
        int[] c = new int[10];
        c[0] = 0;
        c[1] = 1;
        for (int i = 0; i < 8; i++) {
            c[i+2] = c[i+1]+c[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }
    }
}
