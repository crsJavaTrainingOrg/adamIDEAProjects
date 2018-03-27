package hu.adam.codeWarsExercises.sevenKyuExercises;
//https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers){

        StringBuilder result = new StringBuilder();
        result.append("(");
        for(int i = 0; i <= 2; i++){
            result.append(numbers[i]);
            if(i == 2){
                result.append(")");
                result.append(" ");
            }
        }
        for(int i = 3; i < numbers.length; i++){
            result.append(numbers[i]);
            if (i == 5) {
                result.append("-");
            }
        }
        System.out.println(result);
        return result.toString();

    }
}

//Ide hasznalhato a String.format metódus: %d will print integer as it is.
//public class Kata {
//  public static String createPhoneNumber(int[] numbers) {
//    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
//  }
//}
