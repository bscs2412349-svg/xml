package xml;


public class Binary {
    public static void main(String[] args) {
        int[] arr = {10, 20 , 45, 49 , 55, 60};

        int index = binary(arr , 45);
        System.out.println(index);

    }

    static int binary(int[] arr , int target){
        int start = 0;
        int end  = arr.length - 1;

        while(start <= end){
            int mid = (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;

    }
}
