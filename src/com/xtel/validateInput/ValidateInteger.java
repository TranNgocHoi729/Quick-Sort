
package com.xtel.validateInput;

import org.apache.log4j.Logger;

/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public interface ValidateInteger {
    public int getPossitiveNumber();
    public int getPossitiveNumber(int maxLimit);
        public Logger getLogger();
  
}
