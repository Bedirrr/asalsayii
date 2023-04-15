public class asalsayii {

    public static void main(String[] args) {

        for(int i=2; i<=100; i++) { // 1 asal sayı değildir, dolayısıyla 2'den başlıyoruz.
            boolean asalMi = true;
            for(int j=2; j<=Math.sqrt(i); j++) { // Bir sayının asal olup olmadığını kontrol etmek için, sadece 2'ye ve köküne kadar olan sayılara bakmamız yeterlidir.
                if(i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if(asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}