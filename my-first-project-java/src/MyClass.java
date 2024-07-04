public class MyClass {
    public static String insertName (String firstName, String lastName){

        return firstName.concat(" ").concat(lastName);
    }


    public static void main(String[] args){
        String firstName = "Matheus";
        String lastName = "Salvador";

        String fullName = insertName (firstName,lastName);
        System.out.println(fullName);
    }
}
