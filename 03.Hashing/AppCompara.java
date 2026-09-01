public class AppCompara {
    public static void main(String[] args) {
        
        In arq = new In("DomCasmurro_utf8.txt");

        SeparateChainingHashST<String, Integer> ht = new SeparateChainingHashST<>();
        // LinearProbingHashST<String, Integer> ht = new LinearProbingHashST<>();

        while(arq.hasNextLine()) {
            String linha = arq.readLine();
            String[] pals = linha.split(" ");
            for(String pal: pals) {
                pal = pal.trim().toLowerCase();
                if(pal.equals(""))
                    continue;
                System.out.println(pal);
            }
        }
        arq.close();
        System.out.println("Total de palavras: "+ht.size());
    }
}
