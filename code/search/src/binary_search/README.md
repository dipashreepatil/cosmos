# Binary search
The binary search algorithm is used for finding an element in a sorted array. It has the average performance O(log n).
Binary search approach is normally preffered for larger N and sorted array elements. 

## Procedure
1. Find middle element of the array.
2. Compare the value of the middle element with the target value.
3. If they match, it is returned. 
4. If the value is less or greater than the target, the search continues in the lower or upper half of the array.  
5. The same procedure as in step 2-4 continues, but with a smaller part of the array. This continues until the target element is found or until there are no elements left. 

## Pseudocode (Recursive approach)
```
// initially called with low = 0, high = N-1
BinarySearch(A[0..N-1], value, low, high) {
  // invariants: value > A[i] for all i < low
                     value < A[i] for all i > high
  if (high < low)
    return not_found // value would be inserted at index "low"
  mid = (low + high) / 2
  if (A[mid] > value)
    return BinarySearch(A, value, low, mid-1)
  else if (A[mid] < value)
    return BinarySearch(A, value, mid+1, high)
  else
    return mid
}
```

## Pseudocode (Iterative approach)
//initially set low = 0 (starting index) , high=N-1
BinarySearch(A[0,1,...N-1],value,low,high)
{
  loop while low < high 
      mid=(low+high)/2;
    //compare value with the middle element of array
          Check if value==A[mid] yes then 
              return mid;
          else check if value > A[mid]
              set low = N+1
          else
              set high = N-1
      
      
}

Collaborative effort by [OpenGenus](https://github.com/opengenus)
