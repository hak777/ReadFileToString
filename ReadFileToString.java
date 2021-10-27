import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class ReadFileToString 
{
    public static void main(String[] args) 
    {
        String filePath = "/tmp/data";
 
        System.out.println( "Number of running root processes " + readAllBytesJava7( filePath ) );
    }
 
    //Read file content into string with - Files.readAllBytes(Path path)

private static String readAllBytesJava7(String filePath) 
    {
        String content = "";
 
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
 
        return content;
    }
}
