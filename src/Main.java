import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};

        for (int i = 0; i<ålder.length; i++){
          if (ålder[i]<20){
              System.out.println("alla under 20: " +namn [i]  +  ålder[i]);
          }
        }
        System.out.println("mmm");
        int i = 0;
        while (i<ålder.length){
           if (ålder[i]>=20 && ålder[i]<=30){
               System.out.println("alla personeer mellan 20-30 år :" +namn [i] +  ålder [i]);
           }
       i++;
       }
        System.out.println("");
       for (int l = 0; l<ålder.length; l++){
           if (ålder[l]<20 || ålder[l]>29){
               System.out.println("personeer som är yngre än 20 och äldre än 29 år: " +namn [l] +  ålder[l]);

           }
       }
       int minstaÅlder = ålder [0];
       int maxÅlder = ålder[0];
       String yngstaDemon = namn [0];
       String äldstaDemon = namn [0];

       for (int k = 1; k<ålder.length; k++){
           if (ålder[k]<minstaÅlder){
               minstaÅlder = ålder[k];
               yngstaDemon = namn [k];
           }
           if (ålder[k]>maxÅlder){
               maxÅlder = ålder [k];
               äldstaDemon = namn[k];
           }
       }
        System.out.println("yngsta demonen är "+ (yngstaDemon)+ ","+(minstaÅlder)+ " äldsta demonen är "+äldstaDemon +"," +maxÅlder);

       ArrayList<String> jämnaÅldrarDemon = new ArrayList<>();
       for (int v = 0; v<ålder.length; v++){
           if (ålder[v] % 2 == 0){
               jämnaÅldrarDemon.add(namn [v]);
           }
       }
        System.out.println("Dom som har en ålder som är jämn är " + jämnaÅldrarDemon);

       for (int p = 0; p<ålder.length;p++){
           if (ålder [p]>40){
               break;
           }
           System.out.println("Stop så fort ålder över 40 " +namn[p]);
       }

    }

}