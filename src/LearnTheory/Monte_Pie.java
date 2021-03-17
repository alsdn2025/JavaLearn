package LearnTheory;

import IO.ScannerClass.Main;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Random;

/**
* @class : Monte_Pie.java
* @modifyed : 2021-03-17 오후 8:22
* @usage : To Learn MonteCarlo Simulation By  Calculation of Principal Ratio
**/
public class Monte_Pie {

    private static class Point{
        public final double x;
        public final double y;

        public boolean isInCircle;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

    }


    public static BigDecimal cal_Monte_pie(int sampleNumber){
        Point[] points = new Point[sampleNumber];
        Random r = new Random();
        int numOfInCirclePoints = 0;

        for(int i = 0; i < sampleNumber; i++){
            points[i] = new Point(r.nextDouble(),r.nextDouble());
            BigDecimal x = new BigDecimal(points[i].x);
            BigDecimal y = new BigDecimal(points[i].y);
//            System.out.println(x+","+y);

            BigDecimal sqfSum = (x.multiply(x).add(y.multiply(y)));
            if(sqfSum.doubleValue() <= 1){
                numOfInCirclePoints++;
            }
        }

        BigDecimal bdNumOfInCircle = new BigDecimal(numOfInCirclePoints);
        BigDecimal bdSampleNum = new BigDecimal(sampleNumber);


        return bdNumOfInCircle.divide(bdSampleNum);
    }

    public static void main(String[] args){
        int samplingNum = 10;
        testAndPrintResult(samplingNum);
        samplingNum = 100;
        testAndPrintResult(samplingNum);
        samplingNum = 1000;
        testAndPrintResult(samplingNum);
        samplingNum = 10000;
        testAndPrintResult(samplingNum);
        samplingNum = 100000;
        testAndPrintResult(samplingNum);
        samplingNum = 1000000;
        testAndPrintResult(samplingNum);

    }

    public static void testAndPrintResult(int samplingNum){
        System.out.println("Sampling Number : "+samplingNum);
        System.out.println("Circle Area : " + Math.PI / 4);
        System.out.println("MonteCarlo Simulation Result : " + cal_Monte_pie(samplingNum));
    }
}
