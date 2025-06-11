package oops1;

public class exception {
       
    public static void main(String[] args) {
         int[] numerators  = {10 , 100 ,20 ,50};
         int[] denominators = {2 ,5 ,0 , 10};
       
        for(int i=0;i<4;i++)
        {
            System.out.println(divide(numerators[i] , denominators[i]));
        }

    }

         static public int divide(int a , int b)
         {
            try {
                return a/b;
             } catch (Exception e) {

                System.out.println(e);
                return -1;
             }
            
         }
}
