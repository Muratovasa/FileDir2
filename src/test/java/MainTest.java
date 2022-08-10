import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class MainTest {

   @Test
    public void testCreate() throws IOException {
        File file=new File("tmp.txt");
        file.createNewFile();
       Assertions.assertTrue(file.exists());
   }

    @Test
    public void contentCatalogTest(){
        String test="Cоздан каталог";
        String programm="Cоздан каталог";
        Assertions.assertSame(test,programm);
    }

    @Test
    public void writeFileTest() throws IOException{
       FileWriter fw = new FileWriter("file", true);
      fw.write("something");
      Assertions.assertNotNull(fw);
    }
}