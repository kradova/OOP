package file_handling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        String line;
//        BufferedReader reader = null;

//        try {
//            reader = new BufferedReader(new FileReader("myFile.txt"));
//            line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("================================");
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }

//        try (BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"))) {
//            line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        String text = "Hello World";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myFile2.txt", false))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File f = new File("myFile.txt");
        File nf = new File("myNewFile.txt");

       f.renameTo(nf);

    }//main
}//class FileHandlingDemo
