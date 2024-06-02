# LEETCODE---Java-Solutions-
The issue with your swap method lies in how Java handles method parameters, specifically with primitive data types like char.

In Java, when you pass primitive data types (such as char) to a method, it passes them by value, not by reference. This means that within the swap method, the char variables ch and ch2 are local copies of the original variables, and swapping these local copies does not affect the original array.

To swap the characters in the array itself, you need to pass the array and the indices of the elements you want to swap. This way, you can modify the array directly.

Here's your original code with comments highlighting the issue

```
// This swap method swaps only the local copies of ch and ch2
    public void swap(char ch, char ch2) {
        char temp = ch;
        ch = ch2;
        ch2 = temp;
    }
correct is 
public void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
```
# sorting in 2d matrix 
Ascending Order: (a, b) -> a[1] - b[1]

If a[1] is less than b[1], a comes before b.
If a[1] is greater than b[1], a comes after b.
Descending Order: (a, b) -> b[1] - a[1]

If b[1] is less than a[1], a comes before b.
If b[1] is greater than a[1], a comes after b.

```
// it will sort according to the 1st index 
Arrays.sort(B, (a, b) -> a[1] - b[1]);
```
#comprator 
decscentding
```
class Item {
  int value, weight;
  Item(int x, int y) {
    this.value = x;
    this.weight = y;
  }
}

class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}
public class solve{
    static double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, new itemComparator());
```

