package Files;

import Utils.AppUtils;

import java.io.*;

public class BufferedReaderSample {

    public static void main(String[] args) {

        try(
                InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader bufferReader = new BufferedReader(reader);
                FileWriter Writer = new FileWriter(AppUtils.App_Asset_Location+"\\test.txt")
                ){
            String input = bufferReader.readLine();
            Writer.write(input);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());

        }
    }
}
