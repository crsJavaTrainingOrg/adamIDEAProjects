package hu.adam.codeWarsExercises.sixKyuExercises.UpDown;
//https://www.codewars.com/kata/56cac350145912e68b0006f0
import java.util.Arrays;

public class Updown {
    public static String arrange(String strn){
        String[] words = strn.split(" ");
        String temp = "";
        String temp2 = "";
        for(int i = 0; i < words.length; i++){
            if(i % 2 ==0 &&  i < words.length -1){
                if(words[i].length() <= words[i+1].length()){
                    continue;
                }
                else {
                    temp = words[i];
                    words[i]=words[i+1];
                    words[i+1] = temp;

                }
            }
            else if (i < words.length -1){
                if(words[i].length() >= words[i+1].length()){
                    continue;
                }
                else{
                    temp2 = words[i];
                    words[i] = words[i+1];
                    words[i+1] = temp2;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if( i % 2 > 0){
                words[i] = words[i].toUpperCase();
            }
            else{
                words[i] = words[i].toLowerCase();
            }

        }
        String result = String.join(" ",words);
        return result;

    }
}
