package hu.adam.codeWarsExercises.sixKyuExercises;

public class Magpies {
    public static boolean child(final String bird1, final String bird2) {
        int differences = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                differences++;
            }
        }
        if (differences == 1 || differences == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean grandchild(final String bird1, final String bird2) {
        int differences = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                differences++;
            }
        }
        if(differences == 1 && bird1.length() == 1){
            return false;
        }
        else if(differences == 1 && bird1.length() != 1){
            return true;
        }
        else if (differences == 2 || differences == 3 || differences == 4 || differences == 0 ||  (bird1.length() == 1 && bird1.equals(bird2))) {
            return true;
        }
        else if(bird1.length() == 1 && bird1.equals(bird2)){
            return false;
        }
        else{
                return false;
            }
        }
    }
