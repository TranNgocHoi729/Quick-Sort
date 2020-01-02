/*
 * This class use to validate Variable for all module  
 */
package com.xtel.validateInput;

import java.io.File;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public class ValidateInput implements ValidateInteger{

    Scanner scanner;
    
    public static Logger logger ;
    public ValidateInput() {
        scanner = new Scanner(System.in);
        File fileXML = new File("./config/log4j.xml");
        DOMConfigurator.configureAndWatch(fileXML.getPath());
        logger = LogManager.getLogger(ValidateInput.class);
    }

   

    
    
    @Override
    public int getPossitiveNumber() {
        String inputNumberypeString = "";
        int inputNumberTypeInt;
        while (true) {
            try {
                inputNumberypeString = scanner.nextLine().trim();
                inputNumberTypeInt = Integer.parseInt(inputNumberypeString);
                return inputNumberTypeInt;
            } catch (NumberFormatException e) {
                logger.error(e);
                System.out.println("Re-Enter : ");
            }
        }
    }
    
    @Override
    // call this function when you want to get an integer in ranger 0 - your limit
    public int getPossitiveNumber(int maxLimit) {
        int inputNumberTypeInt;
        while (true) {
            inputNumberTypeInt = getPossitiveNumber();
            if (inputNumberTypeInt >= 0 && inputNumberTypeInt <= maxLimit) {
                return inputNumberTypeInt;
            }
                logger.info("Value out Of range : "+ inputNumberTypeInt);
                System.out.println("Re-Enter : ");
        }
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

    
}
