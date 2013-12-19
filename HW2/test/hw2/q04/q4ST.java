package hw2.q04;

import hw2.common.TreeValidator;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baxte141
 */
public class q4ST {

   /**
     * Test of deserialize method, of class FileSystem.
     */
    @Test
    public void testDeserialize() {

        List<String> xml = new ArrayList();

xml.add("<directory>");
xml.add("    <name>" );
xml.add("        Movies and Pictures" );
xml.add("    </name>" );
xml.add("    <directory>") ;
xml.add("        <name>");
xml.add("            Movies" );
xml.add("        </name>" );
xml.add("        <file>" );
xml.add("            <name>" );
xml.add("                Harry Potter.mov" );
xml.add("            </name>"  );
xml.add("            <date>" );
xml.add("                20130602" );
xml.add("            </date>" );
xml.add("            <size>" );
xml.add("                1400123" );
xml.add("            </size>" );
xml.add("        </file>" );
xml.add("        <file>" );
xml.add("            <name>" );
xml.add("                Dodgeball.avi" );
xml.add("            </name>" );
xml.add("            <date>" );
xml.add("                11111111" );
xml.add("            </date>" );
xml.add("            <size>" );
xml.add("                5000000" );
xml.add("            </size>" );
xml.add("        </file>" );
xml.add("        <file>" );
xml.add("            <name>" );
xml.add("                The Dark Knight.mpeg" );
xml.add("            </name>"  );
xml.add("            <date>" );
xml.add("                55555555" );
xml.add("            </date>" );
xml.add("            <size>" );
xml.add("                7657657");
xml.add("            </size>" );
xml.add("        </file>"             );
xml.add("    </directory>" );
xml.add("    <directory>" );
xml.add("        <name>" );
xml.add("            Pictures" );
xml.add("        </name>"  );
xml.add("        <file>" );
xml.add("            <name>" );
xml.add("                Mountain.png" );
xml.add("            </name>"  );
xml.add("            <date>" );
xml.add("                20000000" );
xml.add("            </date>" );
xml.add("            <size>" );
xml.add("                190000" );
xml.add("            </size>" );
xml.add("        </file>" );
xml.add("        <file>" );
xml.add("            <name>" );
xml.add("                Flower.jpg" );
xml.add("            </name>"  );
xml.add("            <date>" );
xml.add("                140000" );
xml.add("            </date>" );
xml.add("            <size>" );
xml.add("                7657657" );
xml.add("            </size>" );
xml.add("        </file>" );
xml.add("        <file>" );
xml.add("            <name>" );
xml.add("                Wildlife.jpeg" );
xml.add("            </name>"  );
xml.add("            <date>" );
xml.add("                90000000" );
xml.add("            </date>" );
xml.add("            <size>" );
xml.add("                250000" );
xml.add("            </size>" );
xml.add("        </file>" );
xml.add("    </directory>" );
xml.add("</directory>");

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */

        FileSystem sys = new FileSystem();
        sys.deserialize(xml);

        String expected = "|-- directory" + System.lineSeparator() +
"    |-- name" + System.lineSeparator() +
"        |-- Movies and Pictures" + System.lineSeparator() +
"    |-- directory" + System.lineSeparator() +
"        |-- name" + System.lineSeparator() +
"            |-- Movies" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Harry Potter.mov" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 20130602" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 1400123" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Dodgeball.avi" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 11111111" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 5000000" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- The Dark Knight.mpeg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 55555555" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 7657657" + System.lineSeparator() +
"    |-- directory" + System.lineSeparator() +
"        |-- name" + System.lineSeparator() +
"            |-- Pictures" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Mountain.png" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 20000000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 190000" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Flower.jpg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 140000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 7657657" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Wildlife.jpeg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 90000000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 250000" + System.lineSeparator();
        
                String actual = sys.getTreeStructure();
                assertEquals(expected, actual);

    }


        /**
     * Test of getDirectories method, of class FileSystem.
     */
    @Test
    public void testGetDirectories() {

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        FileSystem sys = new FileSystem();
        sys.root = n1;

        List<String> l = sys.getDirectories();
        boolean expected;
        boolean actual;

        expected = true;
        assertEquals(expected, l.contains("Movies and Pictures"));
        expected = true;
        assertEquals(expected, l.contains("Movies"));
        expected = true;
        assertEquals(expected, l.contains("Pictures"));
        expected = false;
        assertEquals(expected, l.contains("Harry Potter.mov"));
        expected = false;
        assertEquals(expected, l.contains("Dodgeball.avi"));
        expected = false;
        assertEquals(expected, l.contains("directory"));

    }

        /**
     * Test of getFiles method, of class FileSystem.
     */
    @Test
    public void testGetFiles() {

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        FileSystem sys = new FileSystem();
        sys.root = n1;

        List<String> l = sys.getFiles();
        boolean expected;
        boolean actual;

        expected = true;
        assertEquals(expected, l.contains("Harry Potter.mov"));
        expected = true;
        assertEquals(expected, l.contains("Dodgeball.avi"));
        expected = true;
        assertEquals(expected, l.contains("Mountain.png"));
        expected = false;
        assertEquals(expected, l.contains("file"));
        expected = false;
        assertEquals(expected, l.contains("Movies"));
        expected = false;
        assertEquals(expected, l.contains("Pictures"));

    }
            /**
     * Test of getFilesLargerThan method, of class FileSystem.
     */
    @Test
    public void testGetFilesLargerThan() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        List<String> l = sys.getFilesLargerThan(4000000);
        boolean expected;
        boolean actual;

        expected = true;
        assertEquals(expected, l.contains("The Dark Knight.mpeg"));
        expected = true;
        assertEquals(expected, l.contains("Dodgeball.avi"));
        expected = true;
        assertEquals(expected, l.contains("Flower.jpg"));
        expected = false;
        assertEquals(expected, l.contains("Harry Potter.mov"));
        expected = false;
        assertEquals(expected, l.contains("file"));
        expected = false;
        assertEquals(expected, l.contains("Mountain.png"));

    }

       /**
     * Test of getFilesNewerThan method, of class FileSystem.
     */
    @Test
    public void testGetFilesNewerThan() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        List<String> l = sys.getFilesNewerThan(20000050);
        boolean expected;
        boolean actual;

        expected = true;
        assertEquals(expected, l.contains("The Dark Knight.mpeg"));
        expected = true;
        assertEquals(expected, l.contains("Harry Potter.mov"));
        expected = true;
        assertEquals(expected, l.contains("Wildlife.jpeg"));
        expected = false;
        assertEquals(expected, l.contains("Flower.jpg"));
        expected = false;
        assertEquals(expected, l.contains("file"));
        expected = false;
        assertEquals(expected, l.contains("Mountain.png"));

    }

       /**
     * Test of getNestingLevel method, of class FileSystem.
     */
    @Test
    public void testGetNestingLevel() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual = sys.getNestingLevel();

        expected = 2;
        assertEquals(expected, actual);


    }

       /**
     * Test of getNumberOfDirectories method, of class FileSystem.
     */
    @Test
    public void testGetNumberOfDirectories() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 3;
        actual = sys.getNumberOfDirectories();
        assertEquals(expected, actual);


    }

       /**
     * Test of getNumberOfFiles method, of class FileSystem.
     */
    @Test
    public void testGetNumberOfFiles() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 6;
        actual = sys.getNumberOfFiles();
        assertEquals(expected, actual);


    }

       /**
     * Test of getNumberOfFilesLargerThan method, of class FileSystem.
     */
    @Test
    public void testGetNumberOfFilesLargerThan() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 5;
        actual = sys.getNumberOfFilesLargerThan(200000);
        assertEquals(expected, actual);


    }

    	/**
	 * Test of getNumberOfFilesNewerThan method, of class FileSystem.
	 */
	@Test
	public void testGetNumberOfFilesNewerThan()
	{
		FileSystemNode n1 = new FileSystemNode("directory");

		FileSystemNode n2 = new FileSystemNode("name");
		FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

		FileSystemNode n4 = new FileSystemNode("directory");
		FileSystemNode n5 = new FileSystemNode("name");
		FileSystemNode n6 = new FileSystemNode("Movies");
		FileSystemNode n7 = new FileSystemNode("file");
		FileSystemNode n8 = new FileSystemNode("name");
		FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
		FileSystemNode n10 = new FileSystemNode("date");
		FileSystemNode n11 = new FileSystemNode("20130602");
		FileSystemNode n12 = new FileSystemNode("size");
		FileSystemNode n13 = new FileSystemNode("1400123");
		FileSystemNode n14 = new FileSystemNode("file");
		FileSystemNode n15 = new FileSystemNode("name");
		FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
		FileSystemNode n17 = new FileSystemNode("date");
		FileSystemNode n18 = new FileSystemNode("11111111");
		FileSystemNode n19 = new FileSystemNode("size");
		FileSystemNode n20 = new FileSystemNode("5000000");
		FileSystemNode n21 = new FileSystemNode("file");
		FileSystemNode n22 = new FileSystemNode("name");
		FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
		FileSystemNode n24 = new FileSystemNode("date");
		FileSystemNode n25 = new FileSystemNode("55555555");
		FileSystemNode n26 = new FileSystemNode("size");
		FileSystemNode n27 = new FileSystemNode("7657657");


		FileSystemNode n28 = new FileSystemNode("directory");
		FileSystemNode n29 = new FileSystemNode("name");
		FileSystemNode n30 = new FileSystemNode("Pictures");
		FileSystemNode n31 = new FileSystemNode("file");
		FileSystemNode n32 = new FileSystemNode("name");
		FileSystemNode n33 = new FileSystemNode("Mountain.png");
		FileSystemNode n34 = new FileSystemNode("date");
		FileSystemNode n35 = new FileSystemNode("20000000");
		FileSystemNode n36 = new FileSystemNode("size");
		FileSystemNode n37 = new FileSystemNode("190000");
		FileSystemNode n38 = new FileSystemNode("file");
		FileSystemNode n39 = new FileSystemNode("name");
		FileSystemNode n40 = new FileSystemNode("Flower.jpg");
		FileSystemNode n41 = new FileSystemNode("date");
		FileSystemNode n42 = new FileSystemNode("140000");
		FileSystemNode n43 = new FileSystemNode("size");
		FileSystemNode n44 = new FileSystemNode("7657657");
		FileSystemNode n45 = new FileSystemNode("file");
		FileSystemNode n46 = new FileSystemNode("name");
		FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
		FileSystemNode n48 = new FileSystemNode("date");
		FileSystemNode n49 = new FileSystemNode("90000000");
		FileSystemNode n50 = new FileSystemNode("size");
		FileSystemNode n51 = new FileSystemNode("250000");



		n1.children.add(n2);
		n1.children.add(n4);
		n1.children.add(n28);

		n2.children.add(n3);

		n4.children.add(n5);
		n4.children.add(n7);
		n4.children.add(n14);
		n4.children.add(n21);

		n5.children.add(n6);

		n7.children.add(n8);
		n7.children.add(n10);
		n7.children.add(n12);
		n8.children.add(n9);
		n10.children.add(n11);
		n12.children.add(n13);

		n14.children.add(n15);
		n14.children.add(n17);
		n14.children.add(n19);
		n15.children.add(n16);
		n17.children.add(n18);
		n19.children.add(n20);

		n21.children.add(n22);
		n21.children.add(n24);
		n21.children.add(n26);
		n22.children.add(n23);
		n24.children.add(n25);
		n26.children.add(n27);

		n28.children.add(n29);
		n28.children.add(n31);
		n28.children.add(n38);
		n28.children.add(n45);

		n29.children.add(n30);

		n31.children.add(n32);
		n31.children.add(n34);
		n31.children.add(n36);
		n32.children.add(n33);
		n34.children.add(n35);
		n36.children.add(n37);

		n38.children.add(n39);
		n38.children.add(n41);
		n38.children.add(n43);
		n39.children.add(n40);
		n41.children.add(n42);
		n43.children.add(n44);

		n45.children.add(n46);
		n45.children.add(n48);
		n45.children.add(n50);
		n46.children.add(n47);
		n48.children.add(n49);
		n50.children.add(n51);

		/*
		 *
		 |-- directory
		 |-- name
		 |-- Movies and Pictures
		 |-- directory
		 |-- name
		 |-- Movies
		 |-- file
		 |-- name
		 |-- Harry Potter.mov
		 |-- date
		 |-- 20130602
		 |-- size
		 |-- 1400123
		 |-- file
		 |-- name
		 |-- Dodgeball.avi
		 |-- date
		 |-- 11111111
		 |-- size
		 |-- 5000000
		 |-- file
		 |-- name
		 |-- The Dark Knight.mpeg
		 |-- date
		 |-- 55555555
		 |-- size
		 |-- 7657657
		 |-- directory
		 |-- name
		 |-- Pictures
		 |-- file
		 |-- name
		 |-- Mountain.png
		 |-- date
		 |-- 20000000
		 |-- size
		 |-- 190000
		 |-- file
		 |-- name
		 |-- Flower.jpg
		 |-- date
		 |-- 140000
		 |-- size
		 |-- 7657657
		 |-- file
		 |-- name
		 |-- Wildlife.jpeg
		 |-- date
		 |-- 90000000
		 |-- size
		 |-- 250000

		 */


		FileSystem sys = new FileSystem();
		sys.root = n1;

		int expected;
		int actual;

		expected = 3;
		actual = sys.getNumberOfFilesNewerThan(20000005);
		assertEquals(expected, actual);

	}

           /**
     * Test of getNumberMoviesn method, of class FileSystem.
     */
    @Test
    public void testGetNumberOfMovies() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 3;
        actual = sys.getNumberOfMovies();
        assertEquals(expected, actual);

    }

       /**
     * Test of getNumberOfMoviesNewerThan method, of class FileSystem.
     */
    @Test
    public void testGetNumberOfMoviesNewerThan() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 2;
        actual = sys.getNumberOfMoviesNewerThan(20000000);
        assertEquals(expected, actual);

    }

      /**
     * Test of getNumberOfPictures method, of class FileSystem.
     */
    @Test
    public void testGetNumberOfPictures() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 3;
        actual = sys.getNumberOfPictures();
        assertEquals(expected, actual);

    }

       /**
     * Test of getTreeStructure method, of class FileSystem.
     */
    @Test
    public void testGetTreeStructure() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        String expected;
        String actual;

		expected = "|-- directory" + System.lineSeparator() +
"    |-- name" + System.lineSeparator() +
"        |-- Movies and Pictures" + System.lineSeparator() +
"    |-- directory" + System.lineSeparator() +
"        |-- name" + System.lineSeparator() +
"            |-- Movies" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Harry Potter.mov" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 20130602" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 1400123" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Dodgeball.avi" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 11111111" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 5000000" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- The Dark Knight.mpeg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 55555555" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 7657657" + System.lineSeparator() +
"    |-- directory" + System.lineSeparator() +
"        |-- name" + System.lineSeparator() +
"            |-- Pictures" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Mountain.png" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 20000000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 190000" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Flower.jpg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 140000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 7657657" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Wildlife.jpeg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 90000000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 250000" + System.lineSeparator();
        actual = sys.getTreeStructure();
        assertEquals(expected, actual);

    }

      /**
     * Test of insertVirus method, of class FileSystem.
     */
    @Test
    public void testInsertVirus() {



        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        int expected;
        int actual;

        expected = 0;
        actual = sys.getNumberOfFilesLargerThan(1000000000);
        assertEquals(expected, actual);

        sys.insertVirus("Harry Potter.mov", "", 2000000000);
        sys.insertVirus("Wildlife.jpeg", "", 1500000000);
        
        System.out.println("actual " +sys);
        expected = 2;
        actual = sys.getNumberOfFilesLargerThan(1000000000);
        assertEquals(expected, actual);

    }

       /**
     * Test of rename method, of class FileSystem.
     */
    @Test
    public void testRename()
	{
        FileSystemNode n1 = new FileSystemNode("directory");

         FileSystemNode n2 = new FileSystemNode("name");
          FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

         FileSystemNode n4 = new FileSystemNode("directory");
          FileSystemNode n5 = new FileSystemNode("name");
           FileSystemNode n6 = new FileSystemNode("Movies");
          FileSystemNode n7 = new FileSystemNode("file");
           FileSystemNode n8 = new FileSystemNode("name");
            FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
           FileSystemNode n10 = new FileSystemNode("date");
            FileSystemNode n11 = new FileSystemNode("20130602");
           FileSystemNode n12 = new FileSystemNode("size");
            FileSystemNode n13 = new FileSystemNode("1400123");
          FileSystemNode n14 = new FileSystemNode("file");
           FileSystemNode n15 = new FileSystemNode("name");
            FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
           FileSystemNode n17 = new FileSystemNode("date");
            FileSystemNode n18 = new FileSystemNode("11111111");
           FileSystemNode n19 = new FileSystemNode("size");
            FileSystemNode n20 = new FileSystemNode("5000000");
          FileSystemNode n21 = new FileSystemNode("file");
           FileSystemNode n22 = new FileSystemNode("name");
            FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
           FileSystemNode n24 = new FileSystemNode("date");
            FileSystemNode n25 = new FileSystemNode("55555555");
           FileSystemNode n26 = new FileSystemNode("size");
            FileSystemNode n27 = new FileSystemNode("7657657");


         FileSystemNode n28 = new FileSystemNode("directory");
          FileSystemNode n29 = new FileSystemNode("name");
           FileSystemNode n30 = new FileSystemNode("Pictures");
          FileSystemNode n31 = new FileSystemNode("file");
           FileSystemNode n32 = new FileSystemNode("name");
            FileSystemNode n33 = new FileSystemNode("Mountain.png");
           FileSystemNode n34 = new FileSystemNode("date");
            FileSystemNode n35 = new FileSystemNode("20000000");
           FileSystemNode n36 = new FileSystemNode("size");
            FileSystemNode n37 = new FileSystemNode("190000");
          FileSystemNode n38 = new FileSystemNode("file");
           FileSystemNode n39 = new FileSystemNode("name");
            FileSystemNode n40 = new FileSystemNode("Flower.jpg");
           FileSystemNode n41 = new FileSystemNode("date");
            FileSystemNode n42 = new FileSystemNode("140000");
           FileSystemNode n43 = new FileSystemNode("size");
            FileSystemNode n44 = new FileSystemNode("7657657");
          FileSystemNode n45 = new FileSystemNode("file");
           FileSystemNode n46 = new FileSystemNode("name");
            FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
           FileSystemNode n48 = new FileSystemNode("date");
            FileSystemNode n49 = new FileSystemNode("90000000");
           FileSystemNode n50 = new FileSystemNode("size");
            FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem sys = new FileSystem();
        sys.root = n1;

        boolean expected;
        boolean actual;

        sys.rename("Harry Potter.mov", "Harry Potter 1.mov");
        sys.rename("Wildlife.jpeg", "Bear.jpeg");

        List<String> l = sys.getFiles();

        expected = true;
        actual = l.contains("Harry Potter 1.mov");
		assertEquals("HP movie", expected, actual);
        expected = true;
        actual = l.contains("Bear.jpeg");
		assertEquals("bear", expected, actual);
        expected = false;
        actual = l.contains("Wildlife.jpeg");
		assertEquals("wildlife", expected, actual);
    }

       /**
     * Test of serialize method, of class FileSystem.
     */
    @Test
    public void testSerialize() {

        FileSystemNode n1 = new FileSystemNode("directory");

		FileSystemNode n2 = new FileSystemNode("name");
		 FileSystemNode n3 = new FileSystemNode("Movies and Pictures");

		FileSystemNode n4 = new FileSystemNode("directory");
		 FileSystemNode n5 = new FileSystemNode("name");
		  FileSystemNode n6 = new FileSystemNode("Movies");
		 FileSystemNode n7 = new FileSystemNode("file");
		  FileSystemNode n8 = new FileSystemNode("name");
		   FileSystemNode n9 = new FileSystemNode("Harry Potter.mov");
		  FileSystemNode n10 = new FileSystemNode("date");
		   FileSystemNode n11 = new FileSystemNode("20130602");
		  FileSystemNode n12 = new FileSystemNode("size");
		   FileSystemNode n13 = new FileSystemNode("1400123");
		 FileSystemNode n14 = new FileSystemNode("file");
		  FileSystemNode n15 = new FileSystemNode("name");
		   FileSystemNode n16 = new FileSystemNode("Dodgeball.avi");
		  FileSystemNode n17 = new FileSystemNode("date");
		   FileSystemNode n18 = new FileSystemNode("11111111");
		  FileSystemNode n19 = new FileSystemNode("size");
		   FileSystemNode n20 = new FileSystemNode("5000000");
		 FileSystemNode n21 = new FileSystemNode("file");
		  FileSystemNode n22 = new FileSystemNode("name");
		   FileSystemNode n23 = new FileSystemNode("The Dark Knight.mpeg");
		  FileSystemNode n24 = new FileSystemNode("date");
		   FileSystemNode n25 = new FileSystemNode("55555555");
		  FileSystemNode n26 = new FileSystemNode("size");
		   FileSystemNode n27 = new FileSystemNode("7657657");


		FileSystemNode n28 = new FileSystemNode("directory");
		 FileSystemNode n29 = new FileSystemNode("name");
		  FileSystemNode n30 = new FileSystemNode("Pictures");
		 FileSystemNode n31 = new FileSystemNode("file");
		  FileSystemNode n32 = new FileSystemNode("name");
		   FileSystemNode n33 = new FileSystemNode("Mountain.png");
		  FileSystemNode n34 = new FileSystemNode("date");
		   FileSystemNode n35 = new FileSystemNode("20000000");
		  FileSystemNode n36 = new FileSystemNode("size");
		   FileSystemNode n37 = new FileSystemNode("190000");
		 FileSystemNode n38 = new FileSystemNode("file");
		  FileSystemNode n39 = new FileSystemNode("name");
		   FileSystemNode n40 = new FileSystemNode("Flower.jpg");
		  FileSystemNode n41 = new FileSystemNode("date");
		   FileSystemNode n42 = new FileSystemNode("140000");
		  FileSystemNode n43 = new FileSystemNode("size");
		   FileSystemNode n44 = new FileSystemNode("7657657");
		 FileSystemNode n45 = new FileSystemNode("file");
		  FileSystemNode n46 = new FileSystemNode("name");
		   FileSystemNode n47 = new FileSystemNode("Wildlife.jpeg");
		  FileSystemNode n48 = new FileSystemNode("date");
		   FileSystemNode n49 = new FileSystemNode("90000000");
		  FileSystemNode n50 = new FileSystemNode("size");
		   FileSystemNode n51 = new FileSystemNode("250000");



        n1.children.add(n2);
        n1.children.add(n4);
        n1.children.add(n28);

        n2.children.add(n3);

        n4.children.add(n5);
        n4.children.add(n7);
        n4.children.add(n14);
        n4.children.add(n21);

        n5.children.add(n6);

        n7.children.add(n8);
        n7.children.add(n10);
        n7.children.add(n12);
        n8.children.add(n9);
        n10.children.add(n11);
        n12.children.add(n13);

        n14.children.add(n15);
        n14.children.add(n17);
        n14.children.add(n19);
        n15.children.add(n16);
        n17.children.add(n18);
        n19.children.add(n20);

        n21.children.add(n22);
        n21.children.add(n24);
        n21.children.add(n26);
        n22.children.add(n23);
        n24.children.add(n25);
        n26.children.add(n27);

        n28.children.add(n29);
        n28.children.add(n31);
        n28.children.add(n38);
        n28.children.add(n45);

        n29.children.add(n30);

        n31.children.add(n32);
        n31.children.add(n34);
        n31.children.add(n36);
        n32.children.add(n33);
        n34.children.add(n35);
        n36.children.add(n37);

        n38.children.add(n39);
        n38.children.add(n41);
        n38.children.add(n43);
        n39.children.add(n40);
        n41.children.add(n42);
        n43.children.add(n44);

        n45.children.add(n46);
        n45.children.add(n48);
        n45.children.add(n50);
        n46.children.add(n47);
        n48.children.add(n49);
        n50.children.add(n51);

        /*
         *
|-- directory
    |-- name
        |-- Movies and Pictures
    |-- directory
        |-- name
            |-- Movies
        |-- file
            |-- name
                |-- Harry Potter.mov
            |-- date
                |-- 20130602
            |-- size
                |-- 1400123
        |-- file
            |-- name
                |-- Dodgeball.avi
            |-- date
                |-- 11111111
            |-- size
                |-- 5000000
        |-- file
            |-- name
                |-- The Dark Knight.mpeg
            |-- date
                |-- 55555555
            |-- size
                |-- 7657657
    |-- directory
        |-- name
            |-- Pictures
        |-- file
            |-- name
                |-- Mountain.png
            |-- date
                |-- 20000000
            |-- size
                |-- 190000
        |-- file
            |-- name
                |-- Flower.jpg
            |-- date
                |-- 140000
            |-- size
                |-- 7657657
        |-- file
            |-- name
                |-- Wildlife.jpeg
            |-- date
                |-- 90000000
            |-- size
                |-- 250000

         */


        FileSystem originalTree = new FileSystem();
        originalTree.root = n1;

        List<String> state = originalTree.serialize();

//        originalTree.deserialize(state);
		FileSystem rehydratedTree = new FileSystem();
		rehydratedTree.deserialize(state);

		String expected = "|-- directory" + System.lineSeparator() +
"    |-- name" + System.lineSeparator() +
"        |-- Movies and Pictures" + System.lineSeparator() +
"    |-- directory" + System.lineSeparator() +
"        |-- name" + System.lineSeparator() +
"            |-- Movies" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Harry Potter.mov" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 20130602" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 1400123" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Dodgeball.avi" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 11111111" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 5000000" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- The Dark Knight.mpeg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 55555555" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 7657657" + System.lineSeparator() +
"    |-- directory" + System.lineSeparator() +
"        |-- name" + System.lineSeparator() +
"            |-- Pictures" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Mountain.png" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 20000000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 190000" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Flower.jpg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 140000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 7657657" + System.lineSeparator() +
"        |-- file" + System.lineSeparator() +
"            |-- name" + System.lineSeparator() +
"                |-- Wildlife.jpeg" + System.lineSeparator() +
"            |-- date" + System.lineSeparator() +
"                |-- 90000000" + System.lineSeparator() +
"            |-- size" + System.lineSeparator() +
"                |-- 250000" + System.lineSeparator();
                String actual = originalTree.getTreeStructure();
                assertEquals(expected, actual);

		boolean areEquivalent = TreeValidator.areEqual(originalTree, rehydratedTree);
		assertTrue(areEquivalent);
    }
}
