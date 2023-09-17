public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

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
> All things are same as string builder except that string buffer is thread safe.
*/