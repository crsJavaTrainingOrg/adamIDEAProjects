package hu.adam.codeWarsExercises.sixKyuExercises.TalkLikeSiegfried;

public class TalkLikeSigfried {
    public static String siegfried(final int week, final String str) {

        String[] words = str.split(" ");

        String result = "";

            if (week >= 1) {
                result = str.replaceAll("ci","si");
                result = result.replaceAll("ce","se");
                result = result.replaceAll("c(?!h)","k");

            }
            if(week >= 2){
                result = result.replaceAll("ph","f");

            }
            if(week >=3){
                result = result.replaceAll("e+(?<=\\w{4})\b", "");
                for(int k = 0; k < words.length; k++){
                    words[k] = words[k].replaceAll("(.)//1","$1");
                }
            }
            if(week >= 4){
                result = result.replaceAll("th","z");
                result = result.replaceAll("wr","v");
                result = result.replaceAll("w","v");
            }
            if(week >= 5){
                result = result.replaceAll("ou","u");
                result = result.replaceAll("an","un");
                result = result.replaceAll("ing*$","ink");
                result = result.replaceAll("^sm*","schm");


        }
        return result;
    }
}

