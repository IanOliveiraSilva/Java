package Application;

import java.io.File;
import java.util.Scanner;

public class FolderList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path:  ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        /* LISTANDO PASTAS */
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders){
            System.out.println(folder);

        }

        /* LISTANDO ARQUIVOS */
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        /* CRIANDO PASTAS */
        boolean sucess = new File(strPath + "\\pastaTeste").mkdir();
        System.out.println("Directory created successfully: " + sucess);

        sc.close();
    }
}
