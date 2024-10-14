public class Main {
    public static void main(String[] args) {

        // 1'den 100'e kadar olan sayılar için döngü
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;  // Asal sayı olduğunu varsayıyoruz

            // Sayının asal olup olmadığını kontrol etmek için
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {  // Eğer i, j'ye bölünüyorsa asal değildir
                    isPrime = false;
                    break;  // Asal olmadığını bulduk, kontrol etmeye gerek yok
                }
            }

            // Eğer isPrime hala true ise bu sayı asaldır
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
