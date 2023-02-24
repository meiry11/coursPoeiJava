package classinterface;

public class AreaCalculator {


       public static double SumArea(Surface[]surfaces){
           double sum =0;
           for (Surface s: surfaces) {
               sum += s.getArea();
           }
           return sum;
       }

   }

