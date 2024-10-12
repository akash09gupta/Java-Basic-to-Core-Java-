public class StringOperations {
    public static void main(String[] args) {
        String Name="Akash Gupta";
        String Add="Bareilly";
        System.out.println(Name.length()); //returns length of string
        System.out.println(Name.charAt(2)); //returns character of that index
        System.out.println(Name.substring(5)); //returns substring of that index to end
        System.out.println(Name.substring(1,5)); //returns substring on start index to end index
        System.out.println(Name.concat(" "+Add)); // returns concating (Adding) two string with each other
        System.out.println(Name.indexOf("Gupta")); //returns starting index of that sub string
        System.out.println(Name.lastIndexOf("a")); //returns last index of that character
        System.out.println(Add.equals("Bareilly")); //returns boolean true if that string equal else returns false
        System.out.println(Name.toLowerCase()); //returns coverted string into lowercase
        System.out.println(Name.toUpperCase()); //returns coverted string into uppercase
        System.out.println(Name.trim()); //returns an string after removing whitespace
        System.out.println(Name.replace('h', 'a')); //returns an string with updating charecter
    }
}
