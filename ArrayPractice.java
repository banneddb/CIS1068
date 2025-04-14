package arraypractice;

public class ArrayPractice {
  public static void initialize(int A[], int initialValue) {
	  for (int x=0; x< A.length; x++) {
      A[x] = initialValue;
    }
  }
  public static int numOccurrences(int A[], int x, int startIndex) {
    int numOccurrences = 0;
    for (int y=startIndex; y<A.length; y++) {
      if (A[y] == x) {
        numOccurrences++;
      }
    }
    return numOccurrences;
  }
  public static void replace(int []A, int x, int y) {
    for (int z=0; z< A.length; z++) {
      if (A[z] == x) {
        A[z] = y;
      }
    }
  }


  public static int find(int A[], int x) {
    for (int y=0; y<A.length; y++) {
      if (A[y] == x) {
       return y; 
      }
    }
    return -1;
  }

  public static int findN(int A[], int item, int n) {
    for (int x=0; x<n; x++) {
      if (A[x] == item) {
        return x;
      }
    }
    return -1;
  }


  public static int findLast(int A[], int x) {
    int lastIndex = -1;
    for (int y=0; y<A.length; y++) {
      if (A[y] == x) {
        lastIndex = y;
      }
    }

    return lastIndex;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
    int indexOfLargest = 0;
    for (int x = 1; x < A.length; x++) {
      if (A[x] > A[indexOfLargest]) {
          indexOfLargest = x;  
      }
  }
  return indexOfLargest;  
  }


  public static int[][] eye(int n) {
    if (n<=0) {
      return null;
    }
    int[][] A = new int[n][n];
    for (int i = 0; i < n; i++) {
      A[i][i] = 1;
  }
  return A;
  }
  
  public static void insert(int A[], int n, int index) {
    if (index < 0 || index >= A.length) {
      return;
    }
    for (int i = A.length - 1; i > index; i--) {
      A[i] = A[i - 1];
    }
    A[index] = n;


  }
  public static int[] copy(int A[]) {
    int B[] = new int[A.length];
    for (int x=0; x<A.length; x++) {
      A[x] = B[x];
    }
    return B;
  }

  public static int[] filter(int A[], int min, int max) {
    int arrayLength = 0;
    for (int x = 0; x < A.length; x++) {
        if (A[x] > min && A[x] < max) {
          arrayLength++;
        }
    }
    int B[] = new int[arrayLength];
    int index = 0;
    for (int x=0; x<A.length; x++) {
      if (A[x]>min && A[x]<max) {
        B[index++] = A[x];
      }
    }
    return B;
  }
  
  public static int[] limit(int A[], int min, int max) {
    int B[] = new int[A.length];
    for (int x=0; x<A.length; x++) {
      if (A[x] < min) {
        B[x] = min;
      }
      else if (A[x] > max) {
        B[x] = max;
      }
      else {
        B[x] = A[x];
      }
    }
    return B;
  }

  public static int[] copyAll(int A[], int B[]) {
    int C[] = new int[A.length + B.length];
    for (int i=0; i<A.length; i++) {
      C[i] = A[i];
    }
    for (int i = 0; i < B.length; i++) {
      C[A.length + i] = B[i];
    }
    return C;
  }


  public static void reverse(int A[]) {
    int start = 0;
    int end = A.length-1;

    while (start<end) {
      int num = A[start];
      A[start] = A[end];
      A[end] = num;
      start++;
      end++;

    }
  }

public static int[] uniques(int A[]) {
    int arrayLength = 0;
    for (int y = 0; y < A.length; y++) {
        int currentElement = A[y];
        boolean isUnique = true;
        for (int z = 0; z < A.length; z++) {
            if (y != z && currentElement == A[z]) {
                isUnique = false; 
                break;
            }
        }
        if (isUnique) {
            arrayLength++;
        }
    }
    int[] result = new int[arrayLength];
    int index = 0;
    for (int y = 0; y < A.length; y++) {
        int currentElement = A[y];
        boolean isUnique = true;
        for (int z = 0; z < A.length; z++) {
            if (y != z && currentElement == A[z]) {
                isUnique = false; 
                break;
            }
        }
        if (isUnique) {
            result[index++] = currentElement;
        }
    }
    return result;
}
}