package day25_Method_Overloading;

public class MinMethod {
    public static int min(int[] arr){
        int min=arr[0];
        for (int i : arr) {
            if(i>min)
                min=i;
        }
        return min;
    }
    public static double min(double[] arr){
        double min=arr[0];
        for (double i : arr) {
            if(i>min)
                min=i;
        }
        return min;
    }
    public static long min(long[] arr){
        long min=arr[0];
        for (long i : arr) {
            if(i>min)
                min=i;
        }
        return min;
    }
    public static short min(short[] arr){
        short min=arr[0];
        for (short i : arr) {
            if(i>min)
                min=i;
        }
        return min;
    }
    public static float min(float[] arr){
        float min=arr[0];
        for (float i : arr) {
            if(i>min)
                min=i;
        }
        return min;
    }
    public static byte min(byte[] arr){
        byte min=arr[0];
        for (byte i : arr) {
            if(i>min)
                min=i;
        }
        return min;
    }

}
