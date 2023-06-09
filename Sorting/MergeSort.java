/**Merge sort**/


public class Main {
    public static void main(String[] args) {
        int[] array={38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array before merge sort");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] +" ,");
        }
        System.out.println();
        int start=0;
        int end=array.length-1;
        mergeSortDivide(array,start,end);
        System.out.println("Array after merge sort");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] +" ,");
        }
    }

    public static void mergeSortDivide(int[] array, int start, int end)
    {
        if(start<end)
        {
            int mid=start+(end-start)/2;
            mergeSortDivide(array,start, mid);
            mergeSortDivide(array,mid+1,end);

            mergeArray(array,start,mid,end);
        }
    }

    public static void mergeArray(int[] array, int start,int mid, int end) {
        int l1 = mid - start + 1;
        int l2 = end - (mid) ;

        int l[] = new int[l1];
        int r[] = new int[l2];

        for (int i = 0; i < l1; i++) {
            l[i] = array[start + i];
        }
        for (int j = 0; j < l2; j++) {
            r[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;
        while (i < l1 && j < l2) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            } else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l1) {
            array[k] = l[i];
            i++;
            k++;
        }
        while (j < l2) {
            array[k] = r[j];
            j++;
            k++;
        }
    }
}
