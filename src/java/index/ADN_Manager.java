package index;



/**
 * 
 * @author tarda
 */
public class ADN_Manager {

    /**
     * Funcio que agafa l'atribut ADN i el retorna invertit
     * @return ADN invertit.
     */
    public String invertADN(String ADN) {
        StringBuilder builder = new StringBuilder(ADN);
        return builder.reverse().toString();
    }
    
    public boolean validaADN(String ADN) {
        int a = numAdenines(ADN);
        int c = numCitosines(ADN);
        int g = numGuanines(ADN);
        int t = numTimines(ADN);
        int total = a + c + g + t;
        return ADN.length() == total;
    }

    /**
     * Fa recompte de totes les A's i retorna la quantitat
     *
     * @return Numero de adenines acumulades a tota la cadena
     */
    public int numAdenines(String ADN) {
        int a = 0;
        //char[] letter = this.adn.toUpperCase().toCharArray();
        for (int i = 0; i < ADN.length(); i++) {
            if (ADN.toUpperCase().charAt(i) == 'A') {
                a++;
            }
        }
        return a;
    }

    /**
     * Fa recompte de totes les G's i retorna la quantitat
     *
     * @return Numero de adenines acumulades a tota la cadena
     */
    public int numGuanines(String ADN) {
        int g = 0;
        //char[] letter = this.adn.toUpperCase().toCharArray();
        for (int i = 0; i < ADN.length(); i++) {
            if (ADN.toUpperCase().charAt(i) == 'G') {
                g++;
            }
        }
        return g;
    }

    /**
     * Fa recompte de totes les T's i retorna la quantitat
     *
     * @return Numero de adenines acumulades a tota la cadena
     */
    public int numTimines(String ADN) {
        int t = 0;
        for (int i = 0; i < ADN.length(); i++) {
            if (ADN.toUpperCase().charAt(i) == 'T') {
                t++;
            }
        }
        return t;
    }

    /**
     * Fa recompte de totes les C's i retorna la quantitat
     *
     * @return Numero de adenines acumulades a tota la cadena
     */
    public int numCitosines(String ADN) {
        int c = 0;
        for (int i = 0; i < ADN.length(); i++) {
            if (ADN.toUpperCase().charAt(i) == 'C') {
                c++;
            }
        }
        return c;
    }

    /**
     * Funcio que compara el recompte de totes les lletres
     *
     * @return La lletra que té mes recompte que la resta
     */
    public String maxLetter(String ADN) {
        int max = 0;
        String base;
        int a = numAdenines(ADN);
        int c = numCitosines(ADN);
        int g = numGuanines(ADN);
        int t = numTimines(ADN);

        if (a > c && a > g && a > t) {
            base = "A";
            max = a;
        } else if (c > a && c > g && c > t) {
            base = "C";
            max = c;
        } else if (g > a && g > c && g > t) {
            base = "G";
            max = g;
        } else {
            base = "T";
            max = t;
        }

        return base;
    }
    
    /** 
     * Mètode que genera una lletra d'ADN aleatòria. Com que
     * només sé generar números aleatoris farem aquesta traducció:
     * Si num aleatori = 1, sortirà una A, si és 2 una C, si és 3
     * una G i si és 4 una T.
     * @return String Lletra d'ADN vàlida: A, C, G o T.
     */
    public static String lletraADNAleatoria() {
         String[] possiblesValorsADN = {"A", "C", "G", "T"};
         int numAleatori = (int) (Math.random() * 4) + 0;
         // El número aleatori ens indica l'index de la taula que hem de consultar.
         return possiblesValorsADN[numAleatori];
    }

    
    /**
     * Funcio que genera una cadena d'ADN aleatoriament a partir 
     * d'una longitud
     * @param longitud Longitud de l'ADN a generar.
     * @return Una cadena d'ADN vàlida.
     * 
     */
    public String cadenaADNAleatoria(int longitud) {
      // L'StringBuilder es una classe que ens permet operar i 
      // concatenar Strings de forma més eficient.
      // Com que farem moltes concatenacions ens serà útil.
      
      StringBuilder adnAleatori = new StringBuilder();
      
      // Generem lletres aleatories i les posem a la cadena adnAleatori
      // fins que haguem arribat el tamanyADN.
      String lletraADN = "";
      for (int i = 0; i < longitud; i++) {
          lletraADN = lletraADNAleatoria();
          adnAleatori.append(lletraADN);
      }
      return adnAleatori.toString();
    }
    
    /**
     * Funcio que compara el recompte de totes les lletres
     *
     * @return La lletra que té menys recompte que la resta
     * 
     */
    public String minLetter(String ADN) {
        int min = 0;
        String base;
        int a = numAdenines(ADN);
        int c = numCitosines(ADN);
        int g = numGuanines(ADN);
        int t = numTimines(ADN);

        if (a < c && a < g && a < t) {
            base = "A";
            min = a;
        } else if (c < a && c < g && c < t) {
            base = "C";
            min = c;
        } else if (g < a && g < c && g < t) {
            base = "G";
            min = g;
        } else {
            base = "T";
            min = t;
        }

        return base;
    }
}
