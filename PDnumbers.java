package randomClass;

import java.util.ArrayList;
import java.util.Random;

public class PDnumbers {
    public static void main(String[] args){


        for(int i = 0; i < 25; i++){

            System.out.print(i + " = " + countDoubleNumber(randomListNumbers(), i) + " ");
        }



    }
    public static ArrayList<Integer> randomListNumbers(){
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            randomList.add(random.nextInt(25));
        }
        return randomList;
    }
    public static ArrayList<Integer> createMass(){
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for(int i = 0; i < 25; i++){
            listNumbers.add(i);
        }
        return listNumbers;
    }
    public static ArrayList<Integer> countDoubleNumber(ArrayList<Integer> countList, int number){
        ArrayList<Integer> copyCountList = new ArrayList<Integer>();

        int countDouble = 0;
        for(int i = 0; i < countList.size() - 1; i++){
            if(countList.get(i).equals(number)){
                countDouble++;
            }
        }
        copyCountList.add(countDouble);
        return copyCountList;
    }
    public static ArrayList<Integer> doubleNumbers(ArrayList<Integer> doubleList){


        return doubleList;
    }
    public static void getInfo(ArrayList<Integer> listInfo){
        for(Integer masive: listInfo){
            System.out.printf("%3d", masive);
        }
    }

}
