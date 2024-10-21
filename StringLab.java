public class StringLab {
    public static void main(String[] args) {
        String str = " Welcome to the Java String Lab! ";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring()
        System.out.println("Substring 'Java': " + str.substring(15, 19));

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // contains()
        System.out.println("Contains 'Lab': " + str.contains("Lab"));

        // replace()
        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        // split()
        String[] words = str.split(" ");
        System.out.println("Split by spaces:");
        for (String word : words) {
            System.out.println(word);
        }

        // trim()
        System.out.println("Trimmed string: '" + str.trim() + "'");

        // equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals 'java string lab!': " + str.equals(compareStr));
        System.out.println("EqualsIgnoreCase 'java string lab!': " + str.equalsIgnoreCase(compareStr));
    }
}