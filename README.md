# LEETCODE---Java-Solutions-
The issue with your swap method lies in how Java handles method parameters, specifically with primitive data types like char.

In Java, when you pass primitive data types (such as char) to a method, it passes them by value, not by reference. This means that within the swap method, the char variables ch and ch2 are local copies of the original variables, and swapping these local copies does not affect the original array.

To swap the characters in the array itself, you need to pass the array and the indices of the elements you want to swap. This way, you can modify the array directly.

Here's your original code with comments highlighting the issue


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
