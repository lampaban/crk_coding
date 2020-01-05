package crkCode.chapter1;
//******************************************
//Implement an algorithm that determine if a string has unique characters
//what if you cannot use additional data structures
//******************************************

import java.util.ArrayList;
import java.util.List;

public class isUnique {
    public static void main(String args[])
    {
        List<String> toVerify = new ArrayList<String>();
        toVerify.add("Hola a todos");
        toVerify.add("Hi");
        toVerify.add("Ciao  ");

        for (String str : toVerify) {
            System.out.println(String.format("%s has unique characters: %s" , str, verifyUniqueBrutalForce(str)));
        }

    }

    /**
     * This is the brutal force code
     * @param str
     * @return
     */
    private static boolean verifyUniqueBrutalForce(String str){
        for (int i = 0 ; i < str.length(); i++) {
            int cont = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i))
                {
                    cont++;
                    if(cont > 1){ return false;}
                }
            }
        }
        return true;
    }

}
