def bubblesort(arr):
    for intent in range (len(arr)-1,0,-1):
        for i in range(intent):
            if(arr[i] > arr[i+1]):
                arr[i],arr[i+1] = arr[i+1],arr[i]
            
arr = [5,4,3,2,1]
print("Original Array : ",arr)
bubblesort(arr)
print("Bubble sort : ",arr)
