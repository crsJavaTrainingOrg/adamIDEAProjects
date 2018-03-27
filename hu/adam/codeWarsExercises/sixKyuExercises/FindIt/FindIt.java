package hu.adam.codeWarsExercises.sixKyuExercises.FindIt;
//https://www.codewars.com/kata/5a78515c0136a1bf3e000047
public class FindIt {
    public static int findIt(String s) {
        String withoutLetters = s.replaceAll("[^\\d.,X]", "");
        String[] numbersToBeUsed = withoutLetters.split("X");
        int leftSide = Integer.parseInt(numbersToBeUsed[0]);
        int modul = Integer.parseInt(numbersToBeUsed[1].substring(1));
        int rightSide = 1;
        leftSide = leftSide % modul;
        int counter = 0;
        while (counter <=10) {
            if (rightSide % leftSide == 0) {
                rightSide = rightSide / leftSide;

                break;
            }
            rightSide = rightSide + modul;

            counter++;
        }
        if (counter > 10 && rightSide % leftSide != 0){
            return -1;
        } else {
            return rightSide;
        }

    }
}
