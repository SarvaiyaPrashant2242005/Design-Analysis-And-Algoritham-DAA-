def lenerar(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1 
    
arr = [5, 8, 9, 10, 22, 45, 34]
target = 22
print(lenerar(arr, target)) 
