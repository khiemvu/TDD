package TestStringCal;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/31/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String DELIMITER = ",";
    public int cal(String numbers) {
       if(numbers.isEmpty()){
            return 0;
        }else if(numbers.contains(DELIMITER)){
           return calSum(getAllNumber(numbers));
        }

        else
            return convertToInt(numbers);

    }
    public int convertToInt(String number){
        return Integer.parseInt(number);
    }
    public String[] getAllNumber(String number) {
        String[] allNumber = new String[0];
        if (number.isEmpty()) {
            return new String[0];
        } else if (number.contains(DELIMITER))
            allNumber = number.split(DELIMITER);
        return allNumber;

    }
    public int calSum(String[]number){
        int sum = 0;
        for (String num : number){
            sum+= convertToInt(num);
        }
        return sum;
    }
}
