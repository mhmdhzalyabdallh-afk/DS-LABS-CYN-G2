
package arrays;

import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);

    public void traversal(int []numbers)
    {
        System.out.println("the traversal array elements are:");
        System.out.println("numbers[index] = element.");
        for (int i=0; i<numbers.length;i++)
            System.out.println("numbers["+i+"]"+ "  =  "+numbers[i]);


    }
    public void traversal2(int []numbers)
    {
        System.out.println("the traversal array elements are:");
        for (int num:numbers) {
            System.out.println(num);
        }

    }
    public void revers_traversal(int []numbers)
    {
        System.out.println("the reverse traversal array elements are:");

        System.out.println("numbers[index] = element.");
        for (int i=numbers.length-1; i>=0;i--)
            System.out.println("numbers["+i+"]"+ "  =  "+numbers[i]);


    }
    public void input(int []numbers)
    {
        System.out.println("Please enter "+ numbers.length+" numbers:");
        for (int i=0 ;i<numbers.length;i++ )
            numbers[i]=scanner.nextInt();


    }
    public void update(int a[], int index, int element){
        if(index <0 || index>a.length)
            System.out.println("index "+index+" not found");
        else
            a[index]=element;

    }
    public void delete(int a[], int index){
        if(index <0 || index>a.length)
            System.out.println("index "+index+" not found");
        else
            a[index]=0;

    }
    public void shitLeft_delete(int []a,int index){
        for (int i=index;i<a.length-1;i++)
            a[i]=a[i+1];

        a[a.length-1]=Integer.MIN_VALUE;


    }

    //{1,2,3,4}  //2
    public int LinearSearch(int []a, int value){
        for(int i=0; i<a.length-1;i++){
            if(a[i]==value)
                return i;
        }
        return -1;



    }

    public int BinarySearch(int []a,int findex,int lindex,int svalue)
    {
        //{1,2,3,4,5,6}  s=5   f=3  l=5
        while (findex<=lindex){
            int mid=(findex+lindex)/2;   //m=4
            if (svalue==a[mid])
                return mid;
            if(svalue<a[mid])
                lindex=mid-1;
            if(svalue>a[mid])
                findex=mid+1;
        }

        return -1;

    }



}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Array arr =new Array();
        int []numbers={9,2,3,4,12,7,6,1};

//        Arrays.sort(numbers);
//        arr.traversal(numbers);
//        System.out.println();
//        int result=arr.BinarySearch(numbers,0,numbers.length-1,9);
//        if(result!=-1)
//            System.out.println("your value found at index :"+result);
//        else
//            System.out.println("index not found");

//        arr.shitLeft_delete(numbers,2);
//        arr.traversal(numbers);

//        System.out.println("enter number to search:");
//        int value=scanner.nextInt();

        //  arr.update(numbers,3,7);
        //  arr.delete(numbers,3);
        // int result= arr.LinearSearch(numbers,2);





        //int []numbers=new int[3];
        // arr.input(numbers);
        // arr.traversal2(numbers);

        //arr.traversal(numbers);



        //arr.revers_traversal(numbers);


        //System.out.println(Arrays.toString(numbers));

//        for (int i=0; i<numbers.length;i++)
//            System.out.println(numbers[i]);

//        for(int num :numbers)
//            System.out.println(num);
//


    }
}
