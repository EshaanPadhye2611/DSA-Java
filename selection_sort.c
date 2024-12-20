#include<stdio.h>
int i;
int j;
void selectionsort(int n , int arr[]){
    for(i=0;i<n-1;i++){
        int min = i;
     for(j=i+1;j<n;j++){
        if(arr[min] > arr[j]){
            min = j;
        }
     }

     if(min !=i){
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

     }

    }
}
void printarr(int arr[],int n){
    for(i=0;i<n;i++){
        printf("%d",arr[i]);
    }
    printf("\n");
}
void main()
{
    int n;
    printf("Enter the number of elements in an array : ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter the %dth element in an array : ", i+1);
    scanf("%d", arr[i]);
    printf("The Unsorted Array is : ");
    printf("\n");
    printarr( arr, n);

    selectionsort(n,arr);
    printf("The Sorted Array is : ");
    printf("\n");
     printarr( arr, n);
}