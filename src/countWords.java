// Count all words in the sentence: The dog jumped over the fence
// (use String.split(" ") method).
public class countWords {
    public static void main(String[]args){
        // given
        String s = "The dog jumped over the fence";
        System.out.println("How many words are in the sentence, '" + s + "'?");
        String[] words = s.split(" ");

        // call method countWords
        int numWords = countWords(words);
        System.out.println("There are " + numWords + " words in that sentence.");

    }

    public static int countWords(String[]w){
        int num = 0;
        num = w.length;
        return num;
    }
}
