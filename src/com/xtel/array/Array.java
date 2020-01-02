
package com.xtel.array;

import com.xtel.validateInput.ValidateInput;
import com.xtel.validateInput.ValidateInteger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import org.apache.log4j.Logger;

/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public class Array implements IArray{

    ValidateInteger validate;
    int[] array;
    public static Logger logger ;
    public Array(ValidateInteger validate) {
        logger = validate.getLogger();
    }

    @Override
    public int[] addArray() {
        String data = getDataFromFile();
        String []result = data.split(" ");
        array = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            try {
                array[i] = Integer.parseInt(result[i]);
            } catch (NumberFormatException e) {
                java.util.logging.Logger.getLogger(Array.class.getName()).log(Level.SEVERE, null, e);
                array[i] = 0;
            }
        }
        return array;
        
    }
    
    private String getDataFromFile(){
        File file = null;
        String getData="";
        try {
            file = new File("./input/inputFile.txt");
            FileInputStream fileIn = new FileInputStream(file);
            int readAnCharacter = fileIn.read();
            while (readAnCharacter != -1){
                getData += (char) readAnCharacter;
                readAnCharacter =  fileIn.read();
            }
         } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getData;
    }

    
    @Override
    public void printAray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
   
}
