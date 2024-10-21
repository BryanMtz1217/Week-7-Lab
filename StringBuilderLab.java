public class StringBuilderLab {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        // append()
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb.toString());

        // insert()
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb.toString());

        // delete()
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("After delete: " + sb.toString());

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
    }
}