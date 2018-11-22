import java.io.*;
import java.util.*;

public class Compute {

    public void readRectanglePosition(int [] rectanglePoints){
        int counter=0;
        try (Scanner scan = new Scanner(new File("../Coordinates"))){
            while(scan.hasNextInt()){
                rectanglePoints[counter]=scan.nextInt();
            counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void readDotPosition(int[] dotPoints){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            dotPoints[0]=Integer.parseInt(reader.readLine());
            dotPoints[1]=Integer.parseInt(reader.readLine());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void rectangleContainsDot(int[] recP, int[] dotP){
        if((recP[0]<dotP[0]&&dotP[0]<recP[4])&&(recP[1]<dotP[1]&&dotP[1]<recP[5])){
            System.out.println("Точка внутри четырехугольника"); return;
        }
        if((recP[0]==dotP[0]&&recP[1]==dotP[1])||
                (recP[2]==dotP[0]&&recP[3]==dotP[1])||
                        (recP[4]==dotP[0]&&recP[5]==dotP[1])||
                                (recP[6]==dotP[0]&&recP[7]==dotP[1])){
            System.out.println("Точка- вершина четырехугольника"); return;
        }
        if((dotP[0]-recP[0]/recP[2]-dotP[0])==(dotP[1]-recP[0]/recP[3]-dotP[0])||
                (dotP[0]-recP[2]/recP[4]-dotP[0])==(dotP[1]-recP[3]/recP[5]-dotP[0])||
                (dotP[0]-recP[4]/recP[6]-dotP[0])==(dotP[1]-recP[5]/recP[7]-dotP[0])||
                (dotP[0]-recP[6]/recP[0]-dotP[0])==(dotP[1]-recP[7]/recP[1]-dotP[0])){
        System.out.println("Точка- лежит на сторонах четырехугольника"); return;
    }
        System.out.println("Точка снаружи четырехугольника");
    }
}
