
package javaapplication12;


public class JavaApplication12 {

    void sort(int arr[])
    {
        int n= arr.length;
        for(int i=0;i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
           JavaApplication12 p = new JavaApplication12(); 
        int arr[] = {1,68,54,6,35,43,68,4,85,6};
        p.sort(arr);
        System.out.println("Arreglo ordenado");
        p.printArray(arr);
        
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
    }
    
}
