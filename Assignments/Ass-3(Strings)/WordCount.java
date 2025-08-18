public class WordCount
{
    public static void main(String[] args) {
        String str="Hello world java";
        // int wc=0;
        String[] words=str.split(" ");
        System.out.println("word count : "+words.length);
    }
}
