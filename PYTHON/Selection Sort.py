def Selectionsort(arr):
    for i in range(len(arr)):
        mini = i
        for j in range(i+1,len(arr)):
            if(arr[j]<arr[mini]):
                mini = j
        arr[i],arr[mini] = arr[mini],arr[i]
    return arr


arr = [2,5,1,3,5,7,2]
arr = Selectionsort(arr)
print(arr)