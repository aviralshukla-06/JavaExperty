package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateWrite {

    public void createFile() {
        try {
            File myFile = new File("D:\\JavaDevelopment\\FileHandling\\try.txt");
            if (myFile.createNewFile()) {
                System.out.println("Created a textfile in present working directory" + myFile.getName());
            } else {
                System.out.println("There's an existing file already.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public void writeMyFile() {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter myInput = new FileWriter("try.txt");
            System.out.println("Enter the data you want to write.");
            String input = sc.nextLine();
            myInput.write(input);
            myInput.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public void deleteFile() {
        try {
            File fileToDelete = new File("D:\\JavaDevelopment\\linkedList\\CreateList.java");
            if (fileToDelete.delete()) {
                System.out.println("Successfully deleted " + fileToDelete.getName());
            } else {
                System.out.println("File did not exist");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // CreateWrite myObj1 = new CreateWrite();
        // CreateWrite myObj2 = new CreateWrite();
        CreateWrite myObj3 = new CreateWrite();
        // myObj1.createFile();
        // myObj2.writeMyFile();
        myObj3.deleteFile();
    }
}