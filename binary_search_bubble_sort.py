def binary_search(arr,low,high,x):
    while low <= high:
        mid =  (high + low) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    return -1

def bubble_sort(arr):
    n=len(arr)
    for i in range(n):
        swap = False

        for j in range(0,n-i-1):
            if arr[j] > arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]
            swap = True
        if swap == False:
            break

n = int(input("Enter the number of terms = "))
arr = []
for i in range(n):
    y = int(input(f"Enter the {i}th term in an array = "))
    arr.append(y)
print(arr)
bubble_sort(arr)
print("The sorted array is ",arr)
low = 0
high = len(arr) - 1
x =int(input("Enter the number to be search = "))
result = binary_search(arr,low,high,x)

if result != -1:
    print("Number found at index",result)
else:
    print("Number not found ")


 