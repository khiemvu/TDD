package TestStringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/30/13
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {

   // private static final String DELIMITERS = ",|\n";
    private String DELIMITERS = ",|\n";
    public int cal(String numbers) {
       /* if(numbers.isEmpty()){
            return 0;
        }
        else if (numbers.contains(DELIMITERS)){
            String[] allNumbers = numbers.split(DELIMITERS);
            int sum = 0;
            for (String number : allNumbers){
                sum += convertToInt(number);
            }
            return sum;

        }else
            return convertToInt(numbers);*/
        Matcher matcher = Pattern.compile("^//(.)\n(.*)").matcher(numbers);
        String numberString = numbers;
        if(matcher.find()){
            //DELIMITERS = matcher.group(1);     //test 6
            DELIMITERS = Pattern.quote(matcher.group(1)); //test 7
            numberString = matcher.group(2);
        }
        return getSum(getAllNumbers(numberString));
    }
    public int convertToInt(String numbers){
        //return Integer.parseInt(numbers);  test 3
        int number = Integer.parseInt(numbers);
        if(number < 0) throw new RuntimeException("negative not allowed " + number);
        return number;
    }
    //test 9
    public int convertToInt(String numbers, StringBuffer error){
        //return Integer.parseInt(numbers);  test 3
        int number = Integer.parseInt(numbers);
        if(number < 0) error.append(" " + number);
        if (number > 1000) number = 0;
        return number;
    }
    public String[] getAllNumbers(String numbers){
        if(numbers.isEmpty()){
            return new String[0];
        }
        else {
            return numbers.split(DELIMITERS);
        }
    }
    public int getSum(String [] allNumbers){
        int sum = 0;
        StringBuffer error = new StringBuffer();    //test 9
        for(String number : allNumbers)
            sum += convertToInt(number, error);
        if(error.length() > 0) throw new RuntimeException("negative not allowed" + error);
        return sum;
    }
}
