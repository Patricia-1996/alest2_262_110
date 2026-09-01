public class AppCompara {
    public static void main(String[] args) {
        
        //In arq = new In("DomCasmurro_utf8.txt");
        In arq = new In("mobydick.txt");

        //SeparateChainingHashST<String, Integer> ht = new SeparateChainingHashST<>();
        LinearProbingHashST<String, Integer> ht = new LinearProbingHashST<>();

        long tempoIni = System.nanoTime();
        while(arq.hasNextLine()) {
            String linha = arq.readLine();
            String[] pals = linha.split(" ");
            for(String pal: pals) {
                pal = pal.trim().toLowerCase()
                    .replaceAll("[^a-zA-Z0-9]", "");
                if(pal.equals(""))
                    continue;
                //System.out.println(pal);

                if(!ht.containsKey(pal))
                    ht.put(pal, 1);
                else
                    ht.put(pal, ht.get(pal)+1);
            }
        }
        long tempoFim = System.nanoTime();
        // Converte tempo para segundos
        double tempo = (tempoFim - tempoIni)/1e9;
        arq.close();
        System.out.println("Total de palavras: "+ht.size());

        for(String pal: ht.keySet()) {
            System.out.println(pal + " -> " + ht.get(pal));
        }
        System.out.println("Tempo: "+tempo);
    }
}
