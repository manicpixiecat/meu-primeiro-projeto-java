package edu.tati.primeirasemana.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Tatielle";
        String segundoNome = "Pires";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

        public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultadodometodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
    
    }
    
      