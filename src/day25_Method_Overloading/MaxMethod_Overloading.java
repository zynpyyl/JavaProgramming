package day25_Method_Overloading;

public class MaxMethod_Overloading {

    public static int max(int[] arr){
        int max=arr[0];
        for (int i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }
    public static double max(double[] arr){
        double max=arr[0];
        for (double i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }
    public static long max(long[] arr){
        long max=arr[0];
        for (long i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }
    public static short max(short[] arr){
        short max=arr[0];
        for (short i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }
    public static float max(float[] arr){
        float max=arr[0];
        for (float i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }
    public static byte max(byte[] arr){
        byte max=arr[0];
        for (byte i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }   

}
