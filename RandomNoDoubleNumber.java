package randomClass;

import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNoDoubleNumber {
    private StringBuilder randomNumber;

    public StringBuilder getRandomNumber() {
        return randomNumber;
    }

    public RandomNoDoubleNumber(int lengthNumber){
        Set<Integer> setNumber = new LinkedHashSet<>();
        randomNumber = new StringBuilder();

        boolean check = true;
        while(check){
            setNumber.add((int)(Math.random()*9));
            if(setNumber.size() == lengthNumber) check = false;
        }
        for(Integer mass: setNumber) randomNumber.append(mass);
        randomNumber.substring(0, lengthNumber);
    }

    public static void main(String[] args){

        for(int i = 0; i < 5000; i++) {
            try{
                Thread.sleep(500);
                System.out.println(new RandomNoDoubleNumber(9).getRandomNumber());
            } catch (Exception error){
                System.out.println("Error");
            }
        }
    }
}
