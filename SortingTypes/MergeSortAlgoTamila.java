package SortingTypes;

import java.util.*;
public class MergeSortAlgoTamila
{
    public static void main(String args[])
    {
        System.out.println("hello");

        int[] arr = new int[]{5,3,2,1};
        System.out.println("Before Sorting!");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr,0,arr.length - 1,"0");

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int left,int right,String methodNo)
    {
        System.out.println("methodNo is "+methodNo);

        if(left >=  right)
            return;

        int mid = left + (right - left)/2;
        System.out.println("mid is "+mid);

        mergeSort(arr,left,mid,"1");
        System.out.println("mid1 is "+mid);
        System.out.println("right1 is "+right);
        mergeSort(arr,mid + 1,right,"2");

        int leftArrayStarting = left;
        int rightArrayStarting = mid + 1;

        System.out.println("leftArrayStarting is "+leftArrayStarting);
        System.out.println("rightArrayStarting is"+rightArrayStarting);

        int leftHalf[] = new int[mid - left + 1];//A
        int rightHalf[] = new int[right - mid];//B

         /*Copy data to temp arrays*/
        for (int i = 0; i < leftHalf.length; ++i)
            leftHalf[i] = arr[leftArrayStarting + i];

        for (int j = 0; j < rightHalf.length; ++j)
            rightHalf[j] = arr[rightArrayStarting + j];

        int index =left;
        int p1 = 0;
        int p2 = 0;
        while(p1 < leftHalf.length && p2 < rightHalf.length)
        {
            if(leftHalf[p1] <= rightHalf[p2])
            {
                arr[index++] = leftHalf[p1];
                p1++;
            }
            else
            {
                arr[index++] = rightHalf[p2];
                p2++;
            }
        }
        while(p1 < leftHalf.length)
        {
            arr[index++] = leftHalf[p1];
            p1++;
        }
        while(p2< rightHalf.length)
        {

            arr[index++] = rightHalf[p2];
            p2++;
        }

        System.out.println("Array values "+Arrays.toString(arr));
        


    }
}
