package com.fvd2.customerdetailsservice.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;

import static java.lang.Integer.parseInt;

public class CreditCardExpirationDateValidator implements ConstraintValidator<CreditCardExpirationDateValidation, String> {
    @Override
    public void initialize(CreditCardExpirationDateValidation annotation) {}

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // validate:
        // if string adheres to ##/## format and if entered month is between 1 and 12
        // if entered expiration date is valid (i.e. entered MM/YY equals or is higher than current MM/YY)
        boolean expirationDateStructureIsValid = value.matches("[0-9]{2}/[0-9]{2}");
        if (expirationDateStructureIsValid) {
            String[] splitStr = value.split("/", 2);
            int month = parseInt(splitStr[0]);
            int year = 2000+parseInt(splitStr[1]);
            LocalDate date = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
            if (month > 0 && month <= 12) {
                if (year == date.getYear()) {
                    return month >= date.getMonthValue();
                }
                return year > date.getYear();
            } else return false;
        } else {
            return false;
        }
    }

}
