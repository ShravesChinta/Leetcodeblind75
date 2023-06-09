public class BubbleSort {
    public static void main(String[] args) {
        int[] array={3,60,35,2,45,320,5};
        System.out.println("array before bubble sort");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ",");
        }
        bubbleSort(array);
        System.out.println("array after bubble sort");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ",");
        }
    }

    public static void bubbleSort(int[] array)
    {
       for(int i=0;i<array.length-1;i++)
       {
           for(int j=0;j<array.length-i-1;j++)
           {
               if(array[j]>array[j+1])
               {
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
           }
       }

    }
}
