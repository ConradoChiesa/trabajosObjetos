package vocabulario;

import java.util.*;

public class Vocabulario {
    private String texto;
        Map<String, Integer> occurrences;

    public Vocabulario(String texto) {
        this.texto = texto;
        this.occurrences = new HashMap<String, Integer>();
        mapeo();
    }

    public Map<String, Integer> getOccurrences() {
        return occurrences;
    }

    private void mapeo() {
        String[] arrOfStr = texto.split("[, ?.@]+");
        for ( String word : arrOfStr ) {
            Integer oldCount = occurrences.get(word);
            if ( oldCount == null ) {
                oldCount = 0;
            }
            occurrences.put(word.toLowerCase(), oldCount + 1);
        }
    }

    public int getCantPalDif() {
        return occurrences.size();
    }

    public Map getListalfAlbetic() {
        return new TreeMap<>(occurrences);
    }

    public Map getWordForOccurence() {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(occurrences.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
                return (m2.getValue()).compareTo(m1.getValue());
            }
        });

        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

 /*   public Map getPalabrasMasFrecuentes(int cantPalabras) {
        
    }*/



    public static void main(String[] args) {
        Vocabulario voc = new Vocabulario("This article is contributed by Vaibhav Bajpai. Or is you want to share more information to about to the topic discussed above.");
       System.out.println("La cantidad de palabras es: "+ voc.getCantPalDif());
       System.out.println("La lista ordenada alfabeticamnte: ");
      //  printMap(voc.getListalfAlbetic());
        printMap(voc.getWordForOccurence());
    }

    public static <String, Integer> void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}