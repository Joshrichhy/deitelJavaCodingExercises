package Files;

import Utils.AppUtils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriterSample {
    public static void main(String[] args) {
        String [] words = {"I am", "Going", "to", "be", "a", "great", "programmer"};
        try(
                OutputStreamWriter writer = new OutputStreamWriter(
                        new FileOutputStream(AppUtils.App_Asset_Location+"output.txt"));
                BufferedWriter bufferedWriter = new BufferedWriter(writer)
        ){
            bufferedWriter.write(words[0]);

        }
        catch (IOException exception){

        }
    }
}
