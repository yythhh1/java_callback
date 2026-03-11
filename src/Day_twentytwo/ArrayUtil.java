package Day_twentytwo;

public class ArrayUtil {

    //工具类
    //私有化构造方法，目的是不让外界创建该类的对象
    private ArrayUtil(){

    }

    //提供一个工具类printArr，用于返回整数数组的全部内容，格式为[1,2,3]
    public static void printArr(int[] arr){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ",");
            }
        }
    }

    //提供一个工具类printArr,用于返回浮点型数组的平均值
    public static double getAvg(double[] arr){
        double sum = 0;
        for(double num : arr){
            sum += num;
        }
        double average = sum / arr.length;
        return average;
    }
}
