package randomClass;

import java.util.ArrayList;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();

        int[][] mass = new int[10000][10000];

        for(int x = 0; x < 50; x++){
            for(int y = 0; y < 50; y++){
                mass[x][y] = random.nextInt(20);
                Thread.sleep(1000);
                System.out.printf("%3d",mass[x][y]);
            }
            System.out.println();
        }
    }
}
