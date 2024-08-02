import numpy as np
def insertion(arr):
    for i in range(1,len(arr)):
        temp=arr[i]
        j=i-1
        while(temp<arr[j] and j>=0):
            arr[j+1] = arr[j]
            j=j-1
        arr[j+1] = temp
    
    
    
arr=[3,2,5,1,4]
print("Original Array : ",arr)
insertion(arr)
print("Insertion Sort : ",arr)