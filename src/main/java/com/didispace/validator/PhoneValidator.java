/**
* 
* @author Mity1299
*/
package com.didispace.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Mity1299
 *
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {
    
    private Pattern pattern = 
            Pattern.compile("^\\d{11}$");

    @Override
    public void initialize(Phone constraintAnnotation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return pattern.matcher(value).matches();
    }
    
}
