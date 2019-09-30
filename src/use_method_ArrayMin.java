public class use_method_ArrayMin {
    public static int valueMin(int []array){
        int min = array[0];
        int index = 0;
        for(int i =0 ;i<array.length;i++){
            if(array[i] <min){
                min =array[i];
                index =i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] ={ 4,12,7,8,1,6,9};
        int  index = valueMin(arr);
        System.out.println("The smallest element in the array is :"+arr[index]);
    }
}
