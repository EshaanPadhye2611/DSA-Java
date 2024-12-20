#include<stdio.h>
int i;
int j;
void selectionsort(int n , int arr[]){
   
    for(i=1;i<n;i++){
        int key = arr[i];
        int j=i-1;
      while(j>=0 && arr[j]>key){
          
         arr[j+1] = arr[j];
         j--;
      }
      arr[j+1] = key;
    }
}
void printarr(int arr[],int n){
    for(i=0;i<n;i++){
        printf("%d",arr[i]);
    }
    printf("\n");
}
int main()
{
    int n;
    int i,j;
    printf("Enter the number of elements in an array : ");
    scanf("%d", &n);
    int arr[n];
    for(i=0;i<n;i++){
    printf("Enter the %dth element in an array : ", i+1);
    scanf("%d", &arr[i]);
    }
    printf("The Unsorted Array is : ");
    printf("\n");
    printarr( arr, n);

    selectionsort(n,arr);
    printf("The Sorted Array is : ");
    printf("\n");
     printarr( arr, n);
     return 0;
}