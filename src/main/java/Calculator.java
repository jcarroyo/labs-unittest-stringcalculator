//http://osherove.com/tdd-kata-1/
public class Calculator {
    int Add(String numbers){
        int accumulativeSum = 0;

        if(numbers.length() == 0){
            return accumulativeSum;
        }

        String[] numberList = numbers.split(",");
        for(String number: numberList){
            accumulativeSum += Integer.parseInt(number);
        }
        return accumulativeSum;
    }
}
