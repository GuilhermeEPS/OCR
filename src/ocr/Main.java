package ocr;

import java.io.File;
import net.sourceforge.tess4j.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Guilherme Esteves
 *
 * Script cappable of converting embedded image texts into editable text 
 * Tess4J v3.4.8
 *
 */

public class Main {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File image = chooser.getSelectedFile();
        Tesseract instance = new Tesseract();

        try {
            String result = instance.doOCR(image);
            System.out.println(result);

        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }

}
