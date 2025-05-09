# Searching a specific element in an Array.

## How to search for an element in an Array using Linear and Binary Search.

### Linear Search

- Goes throguh each line

```
### Algorithm for Linear Search.

- Problem: simple search to find a target value within a list by checking elements sequentially until the target is found or the list ends.

1. Start from the first element (index 0) for the collection/array/dataS.
2. Compare the current element with the target value.
3. if the current element matches the target value, return the position (success).
4. if not, move to the next element and repeat step 2.
5. if you reach the end of the collection/array without finding the target, return "not found" or -1;


- looping
- condition
```

### Binary Search

```
1. intialize two pointer:
   a. left pointer.
   - left = 0;
     b. right pointer.
   - right = array.length - 1
2. Repeat while left <= right
   a. Compute the middle part.
   - middle = left + (right - left) / 2;
     b. Compare the middle element with the target.
   - if (arr[mid] == target) return mid; (success scenario).
   - if (arr[mid] < target), move the search to the right half:
   - left = mid + 1;
   - if (arr[mid] > target), move the search to the left half:
   - right = mid - 1;
3. if the loop ends and we didn't find the target, return -1;
```

### Complexity

### Linear vs Binary
