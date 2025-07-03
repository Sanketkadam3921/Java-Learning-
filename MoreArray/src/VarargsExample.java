public class VarargsExample {

    public static void prinitWords(String... words){
        for ( String word : words){
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        System.out.println("Multiplle");
        prinitWords("Hello","Java","World");

        System.out.println("\nSingle");
        prinitWords("Onlyone");

        System.out.println("\nNone");
        prinitWords();
    }
}
