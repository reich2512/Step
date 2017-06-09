package ITStep.homeworks.homework02.conditionalOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by roman on 11.09.2016.
 * Определить какой четверти принадлежит точка с координатами (х,у)
 */
public class homework020102 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x > 0 && y > 0){
            System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит I четверти");
        }else
            if (x < 0 && y > 0){
                System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит II четверти");
            }else
                if (x < 0 && y < 0){
                    System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит III четверти");
                }else
                    if (x > 0 && y < 0){
                        System.out.println("Точка с координатами x = " + x + ", y = " + y + " принадлежит IIII четверти");
                    }else
                        System.out.println("Точка с координатами x = " + x + ", y = " + y + " находится в начале координат");
    }
}
