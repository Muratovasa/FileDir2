import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String contentCatalog = "Cоздан каталог";
        String contentFile = "Создан файл";
        File fileTemp = new File("/Users/svetlanapustovit/Games/temp");
        addCatalog(fileTemp, contentCatalog);
        File fileTempTxt = new File("/Users/svetlanapustovit/Games/temp/temp.txt");
        addFile(fileTempTxt, contentFile);
        writeFile(fileTempTxt, contentFile);
        File scr = new File("/Users/svetlanapustovit/Games/src");
        addCatalog(scr, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File scrMain = new File("/Users/svetlanapustovit/Games/src/main");
        addCatalog(scrMain, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File scrMainJava = new File("/Users/svetlanapustovit/Games/src/main/Main.java");
        addFile(scrMainJava, contentFile);
        writeFile(fileTempTxt, contentFile);
        File scrMainUtil = new File("/Users/svetlanapustovit/Games/src/main/Utils.java");
        addFile(scrMainUtil, contentFile);
        writeFile(fileTempTxt, contentFile);
        File scrTest = new File("/Users/svetlanapustovit/Games/src/test");
        addCatalog(scrTest, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File res = new File("/Users/svetlanapustovit/Games/res");
        addCatalog(res, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File resDrawables = new File("/Users/svetlanapustovit/Games/res/drawables");
        addCatalog(resDrawables, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File resVectors = new File("/Users/svetlanapustovit/Games/res/vectors");
        addCatalog(resVectors, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File resIcons = new File("/Users/svetlanapustovit/Games/res/icons");
        addCatalog(resIcons, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);
        File savegames = new File("/Users/svetlanapustovit/Games/savegames");
        addCatalog(savegames, contentCatalog);
        writeFile(fileTempTxt, contentCatalog);

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/svetlanapustovit/Games/temp/temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void addCatalog(File file,String name) throws IOException {
        file.mkdir();
    }

    private static void addFile(File file, String name) throws IOException {
        file.createNewFile();
    }

    private static void writeFile(File file, String content)throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            bw.newLine();
            bw.flush();
        }
    }
}
