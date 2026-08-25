public class AppSort {
   public static void main(String[] args) {
    Integer[] vet = { 0, 7, 2, 4, 6, 1, 3, 10 };
    MaxHeap<Integer> h;
    h = new MaxHeap<>(vet.length);
    h.sort(vet);
    h.print();
    for(int v: vet)
        System.out.println(v);
   } 
}
