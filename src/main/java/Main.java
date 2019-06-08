import wrappers.Class;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    private static void saveToFile(String path, String body) {

        try {
            File outFile = new File(path);
            if (!outFile.exists()) {
                if (outFile.createNewFile()) {
                    FileOutputStream fout = new FileOutputStream(outFile);
                    fout.write(body.getBytes());
                    fout.close();
                }
            } else {
                FileOutputStream fout = new FileOutputStream(outFile);
                fout.write(body.getBytes());
                fout.close();
            }
        } catch (IOException e) {
            System.err.println("saving to file :" + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception{


        MyVisitor visitor = new MyVisitor();
        Class test = visitor.parse("C:\\Users\\Leslie\\IdeaProjects\\TestCompilers\\src\\main\\resources\\test.txt");


        System.out.println(test);
        System.out.println(test.parse());

        saveToFile("C:\\Users\\Leslie\\IdeaProjects\\TestCompilers\\src\\main\\java\\" + test.getName() + ".java", test.parse());
    }
}
