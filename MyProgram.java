package randomClass;

import exception.MyExceptionTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MyProgram {
    private static int i = 5;

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        MyProgram.i = i;
    }

    public static void main(String[] args) throws Exception{

        getInfoMass(listRandom());

    }
    public static ArrayList<Integer> listRandom(){
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < 1000; i++){
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }
    public static ArrayList<Integer> createMass() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++) list.add(Integer.parseInt(reader.readLine()));
        return list;
    }
    public static ArrayList<Integer> doubleNumber(ArrayList<Integer> list){
        ArrayList<Integer> list_double_number = new ArrayList<Integer>();
        int count = 1;
        int iterator = 0;
        for(int ext_i = iterator; ext_i < list.size(); ext_i++){
            for(int i = iterator; i < list.size() - 1; i++){
                iterator++;
                if(list.get(i).equals(list.get(i + 1))){
                    count++;
                }else
                    break;
            }
            if(count > 1){
                list_double_number.add(count);
                count = 1;
            }
        }
        return list_double_number;
    }
    public static ArrayList<Integer> sortedListNumber(ArrayList<Integer> sorted_list){
        for(int e1 = sorted_list.size(); e1 > 1; e1++){
            boolean sorted = true;
            for(int e2 = 0; e2 < sorted_list.size() - 1; e2++){
                if(sorted_list.get(e2) > sorted_list.get(e2 + 1)){
                    sorted_list.add(e2 + 1, sorted_list.remove(e2));
                    sorted = false;
                }
            }if(sorted) break;
        }
        return sorted_list;
    }
    public static void getInfoMass(ArrayList<Integer> infoList){
            for(int i = 0; i < infoList.size(); i++){
                System.out.printf("%3d",infoList.get(i));
                if(i == 50) System.out.println();
                if(i == 101) System.out.println();
                if(i == 152) System.out.println();
                if(i == 203) System.out.println();
                if(i == 254) System.out.println();
                if(i == 305) System.out.println();
                if(i == 356) System.out.println();
                if(i == 407) System.out.println();
                if(i == 458) System.out.println();
                if(i == 509) System.out.println();
                if(i == 560) System.out.println();
                if(i == 611) System.out.println();
                if(i == 662) System.out.println();
                if(i == 713) System.out.println();
                if(i == 764) System.out.println();
                if(i == 815) System.out.println();
                if(i == 866) System.out.println();
                if(i == 917) System.out.println();
                if(i == 968) System.out.println();
                if(i == 1019) System.out.println();
            }
    }
    public static void writeFile(ArrayList<Integer> list) {
        try(FileWriter fileWrite = new FileWriter("c:/test.txt")){
            for(int i = 0; i < list.size(); i++){
                for(int j = 0; j < 30; j++){
                    fileWrite.write(String.valueOf(list.get(j) + " "));
                }
                fileWrite.append('\n');
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
