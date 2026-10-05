public class NumerosPares {
    public static void main(String[] args) {
        
        System.out.println("Números pares entre 33 e 57:");
        
        for (int i = 33; i <= 57; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
