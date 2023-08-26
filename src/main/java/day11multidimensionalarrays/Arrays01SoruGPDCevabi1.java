package day11multidimensionalarrays;

public class Arrays01SoruGPDCevabi1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 12, 1};
        moveOnesToEnd(a);

        // Diziyi yazdırma
        System.out.print("Yeni dizi: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void moveOnesToEnd(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        int nonOneIndex = 0;
        int oneCount = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != 1) {
                result[nonOneIndex] = arr[i];
                nonOneIndex++;
            } else {
                oneCount++;
            }
        }

        for (int i = size - oneCount; i < size; i++) {
            result[i] = 1;
        }

        // Orijinal diziyi güncelleme
        for (int i = 0; i < size; i++) {
            arr[i] = result[i];
        }
    }
}
