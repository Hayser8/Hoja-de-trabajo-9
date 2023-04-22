import java.io.BufferedReader;
import java.io.FileReader;

public class TextReader {
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static String readText(String filePath){
        try {
            fileReader = new FileReader(filePath);
            if (fileReader.ready()) {
                bufferedReader = new BufferedReader(fileReader); 
                String line;
                String messageToReturn = "";
                while ((line = bufferedReader.readLine()) != null) {
                    messageToReturn += line;
                }
                return messageToReturn;
            } else {
                throw new RuntimeException("The specified file path does not exist.");
            }
        } catch (Exception e) {
            throw new RuntimeException("An unexpected error occurred: "+e);
        }
    }

    public static Tree<String,String> createTranslationTree(String filePath, Tree<String,String> translationTree){
        try {
            fileReader = new FileReader(filePath);
            if (fileReader.ready()) {
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split(",");
                    translationTree.insert(words[1].toLowerCase(), words[0].toLowerCase());
                }
                return translationTree;
            } else {
                throw new RuntimeException("The specified file path does not exist.");
            }
        } catch (Exception e) {
            throw new RuntimeException("An unexpected error occurred: "+e);
        }
    }
}
