package com.fvd2.customerdetailsservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;


@Target({ METHOD, FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CreditCardExpirationDateValidator.class)
public @interface CreditCardExpirationDateValidation {
    String message() default "Expiration Date is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
