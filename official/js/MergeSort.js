//to split the array into two halves and call merge sort on both halves recursively
const MergeSort = (arr, l, r) => {
  if (l < r) {
    let m = Math.floor((l + r) / 2);
    MergeSort(arr, l, m);
    MergeSort(arr, m + 1, r);
    Merge(arr, l, m, r);
  }
};

//to merge the two halves of the array in sorted order and push to the main array
const Merge = (arr, l, m, r) => {
  //establish the size of the two halves
  let n1 = m - l + 1;
  let n2 = r - m;
  //create two empty arrays to store the two halves
  let L = [];
  let R = [];
  //fill the two halves with the elements from the main array that we split into left and right halves
  for (let i = 0; i < n1; i++) {
    L[i] = arr[l + i];
  }
  for (let j = 0; j < n2; j++) {
    R[j] = arr[m + 1 + j];
  }
  //initialize the traversers of the two halves and the main array
  let i = 0;
  let j = 0;
  let k = l;

  //compare the elements of the two halves and push the smaller element to the main array
  //break when one of the halves is exhausted
  while (i < n1 && j < n2) {
    if (L[i] <= R[j]) {
      arr[k] = L[i];
      i++;
    } else {
      arr[k] = R[j];
      j++;
    }
    k++;
  }

  //push the remaining elements of the two halves to the main array
  while (i < n1) {
    arr[k] = L[i];
    i++;
    k++;
  }
  while (j < n2) {
    arr[k] = R[j];
    j++;
    k++;
  }
};

let arr = [5, 3, 8, 4, 2];
let arr2 = [23, 10, 3, 30, 14, 123, 1, 2, 0, 20];

MergeSort(arr, 0, arr.length - 1);
MergeSort(arr2, 0, arr2.length - 1);
console.log(arr);
console.log(arr2);
