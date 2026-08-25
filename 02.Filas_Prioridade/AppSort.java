public class AppSort {
   public static void main(String[] args) {
    Integer[] vet = { 0, 7, 2, 4, 6, 1, 3, 10 };
    MaxHeap<Integer> h;
    h = new MaxHeap<>(10);
    h.sort(vet);
   } 
}
