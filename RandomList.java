package randomClass;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) throws InterruptedException{

        ArrayList<Integer>[] list = creatMasive();
        writeFile(list);
        getInfo(list);

    }
    public static ArrayList[] creatMasive(){
        ArrayList<Integer>[] randomList = new ArrayList[35];
        Random random = new Random();

        for(int i = 0; i < randomList.length; i++){
            randomList[i] = new ArrayList<>();
            for(int j = 0; j < randomList.length; j++) randomList[i].add(random.nextInt(100));
        }
        return randomList;
    }
    public static void getInfo(ArrayList<Integer>[] list) throws InterruptedException{
        for(List<Integer> masive: list){
            for(Integer ext_mass: masive){
                System.out.printf("%3d",ext_mass);
            }
            System.out.println();
        }
    }
    public static void writeFile(ArrayList<Integer>[] mass){
        try(FileWriter fileWrite = new FileWriter("c:/test.txt", false)){
            for(ArrayList<Integer> masive: mass){
                for(Integer number: masive){
                    fileWrite.write(String.valueOf(number + " "));
                }
                fileWrite.append('\n');
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
