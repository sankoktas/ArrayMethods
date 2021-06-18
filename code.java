/**This program uses arrays
 * @author (Fikri San Koktas)
 * @version (6 March 2021) **/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class KFS_ArrayMethods_Main
{
    public static void main(String[] args) 
    { 
        int x, temp,i; 
        int ar[]= { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3}; // declare an array
        System.out.println("Original array: " + Arrays.toString(ar));

        x = ar[0]; 
        ar[0] = ar[ar.length - 1];
        ar[ar.length - 1] = x;
        System.out.println("First and last elements swapped: " + Arrays.toString(ar)); //objective a completed

        int ar2[] = { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3};
        temp = ar2[ar2.length-1]; 
        for(i=ar2.length-1; i>0; i--)
        {
            ar2[i]=ar2[i-1];
        }
        ar2[0]=temp;
        System.out.print("Array is shifted by one: ");
        for(i=0; i<ar2.length; i++)
        {
            System.out.print(ar2[i] + " "); 
        }

        int ar3[] = { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3};
        System.out.print("Even elements are replaced by 0: ");
        for(i=0; i<10; i++)
        {
            if (ar3[i]%2 == 0)
            {
                ar3[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ar3)); //objective c completed

        int ar4[] = { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3};
        System.out.print("Every element except the first and last is replaced by the greatest neighbor: ");
        int[] alex = new int[ar4.length];
        for (i = 0; i < ar4.length; ++i) 
        {
            if (i == 0 || i == ar4.length - 1) 
            {
                alex[i] = ar4[i];
            } 
            else 
            {
                alex[i] = Math.max(ar4[i-1], ar4[i+1]);
            }
        }
        System.out.println(Arrays.toString(alex)); //objective d completed 

        int ar5[] = { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3 }; 
        System.out.print("Middle elements removed: ");
        int size = ar5.length;
        if(size % 2 == 0)
        {
            int y = ar5.length/2 - 1;
            for(i = y; i < ar5.length - 2; i++)
            {   
                ar5[i] = ar5[i + 2];
            }
            int a[] = Arrays.copyOf(ar5, ar5.length-2);
            System.out.println(Arrays.toString(a)); //objective e completed
        }
        else
        {
            int z = ar5.length/2;
            for(i = z; i < ar5.length - 1; i++)
            {
                ar5[i] = ar5[i + 1];
            }
            int a[] = Arrays.copyOf(ar5, ar5.length-1);
        }

        int ar6[] = { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3 }; int q = 0; int a = 0;
        System.out.print("Move all even elements to the front, otherwise preserving the order of the elements: ");
        for(i=0; i<ar6.length; i++)
        {
            if(ar6[i]%2 == 0)
            {
                for (int j=i; j>a; j--)
                {
                    q = ar6[j-1];
                    ar6[j-1] = ar6[j];
                    ar6[j] = q;
                }
                a++;
            }
        }
        System.out.println(Arrays.toString(ar6)); //objective f completed

        int ar7[] = { 1, 4, 9, 16, 25, 8, 11, 64, 100, 3 };
        int first, second; int largest = second = Integer.MIN_VALUE; 
        for(i = 0; i < ar7.length; i++)
        {
            largest = Math.max(largest, ar7[i]);
        }
        for(i = 0; i < ar7.length; i++)
        {
            if (ar7[i] != largest)
            {
                second = Math.max(second, ar7[i]);
            }
        }
        if (second == Integer.MIN_VALUE)
        {
            System.out.printf("There is no second " + "largest element\n");
        }
        else
        {
            System.out.printf("The second largest " + "element is %d\n", second); //objective g completed
        }

        System.out.println(check1(ar));  
        System.out.println(check2(ar)); 
        System.out.println(check2(ar));
    }

    public static boolean check1(int[] ar)
    {
        System.out.print("Is the original array sorted in the increasing order? - "); int i; int count = 0;
        for (i = 0; i < ar.length-1; i++) 
        { 
            {
                if (ar[i] < ar[i+1]) 
                {
                    count = count+1;
                }  
            }
            if(count == ar.length-1)
                return true;
            else
                return false; //objective h completed
        }
        return true;
    }
    
    public static boolean check2(int[] ar)
    {
        System.out.print("Does the array contain two adjacent duplicate elements? - "); int i;
        for (i = 0; i < ar.length-1; i++) 
        { 
            if (ar[i] == ar[i + 1]) 
            {
                return true;
            }
            else 
            {
                return false; //objective i completed
            }
        } 
        return true;
    }
        
    public static boolean check3(int[] ar)
    {
        System.out.print("Does the array contain duplicate elements (which need not be adjacent)? - "); int i;
        for (i=0; i<ar.length; i++)
        {
            for (int j=i+1; j<ar.length; j++)
            {
                if (ar[j] == ar[i]) 
                {
                    return true;
                }
                else 
                {
                    return false; //objective j completed
                }
            }
        }
        return true;
    }
}
