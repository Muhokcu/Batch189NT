package day11multidimensionalarrays;
// Arrays01 deki sorunun chat GPD cevabi
public class Arrays01SoruGPDCevabi {
    public static void main(String[] args) {
        int[] a = {0, 2, 3, 0, 12, 0};
        int size = a.length;
        System.out.println(size);

        int[] result = new int[size];
        int nonZeroIndex = 0;
        int zeroCount = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] != 0) {
                result[nonZeroIndex] = a[i];
                nonZeroIndex++;
            } else {
                zeroCount++;
            }
        }

        for (int i = size - zeroCount; i < size; i++) {
            result[i] = 0;
        }

        // Yeni diziyi yazdırma
        System.out.print("Yeni dizi: ");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }

    }
}
