public class Array {
    static int[] arr_2(int [] x){
        int[] arr = new int[2*x.length];
        for(int i=0;i<x.length;++i){
            arr[2*i] = x[i];
            arr[2*i+1] = x[i];
        }
        return arr;
    }

    public static void main(String args[]){
        int a[] = new int[]{1,2,3};
        int a2[] = arr_2(a);

        for(int i=0;i<a2.length;++i){
            System.out.print(a2[i]+" ");
        }
    }
}
