package Day_twentytwo;

public class StudentTest {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        ArrayUtil.printArr(arr);
        double[] arr1 = {34.5,43.5,78.3,12.9,20};
       double res =  ArrayUtil.getAvg(arr1);
        System.out.printf("%.2f",res);
    }
}
