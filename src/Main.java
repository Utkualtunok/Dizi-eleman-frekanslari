public class Main {
    public static void main(String[] args) {
        int [] array = {10,20,10,10,20,5,20,20};
        //Frekansları saklamak için yeni dizi
        int [] frekansDizi = new int[array.length];

        // Diziyi tarayarak her elemanın frekansını bul
        for (int i = 0; i < array.length; i++) {
            if (frekansDizi[i] == -1) {
                continue; //Kontrol edilen elemanı tekrar kontrol etmeden devam et
            }
            int frekans = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frekans++; // Elemanın frekansını artır
                    frekansDizi[j] = -1;
                }
            }
            //Frekansları diziye ekleme
            frekansDizi[i] = frekans;
        }
        //Ekrana yazdırma işlemi
        System.out.println("Dizideki elemanların frekansları:");
        for (int i = 0; i < array.length; i++) {
            if (frekansDizi[i] != -1) {
                System.out.println(array[i] + " sayısı " + frekansDizi  [i] + " kez tekrar edildi.");
            }
        }
    }
}