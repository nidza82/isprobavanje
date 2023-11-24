public class Zadatak2_02 {
    public static void main(String[] args) {
        String ulaz = "1 2   4      17 23   28";
        String [] izlaz = ulaz.split(" ");
        for(String s : izlaz ) {
            System.out.println(s);
        }
        System.out.println("**************");
        izlaz = ulaz.split("\\s+");
        for(String s : izlaz ) {
            System.out.println(s);
        }

    }
}
