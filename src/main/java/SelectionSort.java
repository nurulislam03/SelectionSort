/*
 * Tugas Algoritma & Struktur data Sesi 9
 * Nurul Islam Hasanah
 * 20200040079
 * Teknik Informatika 20E (TI20E)
 */
import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
/**
 *
 * @author Nurul Islam Hasanah
 */
public class SelectionSort {

  public static void main(String[] args) {
    
      int[] arr = {13, 34, 31, 65, 42, 02, 04, 45, 40, 05, 64, 22, 47, 75}; 

    int min = arr[0];
    int index = 0;
    int swappingProcess = 0;
    long startTime = System.nanoTime();

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if ( arr[j] < min ) {
          min = arr[j];
          index = j;
          swappingProcess++;
        }
        System.out.println(Arrays.toString(arr) 
                + " - Total Tukar : " + swappingProcess);
      }
      if ( min < arr[i] ) {
        arr[index] = arr[i];
        arr[i] = min;
      }
      min = arr[i + 1];
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Total waktu yang diperlukan : " + timeElapsed + " nano detik");

  }

}