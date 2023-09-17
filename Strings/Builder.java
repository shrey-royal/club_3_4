public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello Royal technosoft");
        System.out.println(sb);
        System.out.println("sb.length(): " + sb.length());
        System.out.println("sb.capacity(): " + sb.capacity());

        sb.append(" is a software company.");
        System.out.println(sb);
        System.out.println("sb.length(): " + sb.length());
        System.out.println("sb.capacity(): " + sb.capacity());

        sb.ensureCapacity(100); // increases the capacity of the string builder.
        System.out.println("sb.capacity(): " + sb.capacity());

        sb.delete(0, 6); // deletes the characters from the string builder.
        System.out.println(sb);

        sb.deleteCharAt(0); // deletes the character at the specified index.
        System.out.println(sb);

    }
}

/*
> We use String builder class when we want to modify a string multiple times.
> String builder is mutable, it means we can modify the string multiple times.
> String builder is not thread safe, it means it is not synchronized.
> String builder is faster than string buffer because it is not thread safe.
> The default capacity of string builder is 16.
> and if we want to increase the capacity of the string builder, we can use ensureCapacity() method. using formula: (current capacity * 2) + 2.


Methods:

here are the methods that is included with stringbuilder class: (excluding the methods that are also included in string class)

1. capacity(): returns the current capacity of the string builder.
2. delete(): deletes the characters from the string builder.
3. deleteCharAt(): deletes the character at the specified index.
4. ensureCapacity(): increases the capacity of the string builder.

*/