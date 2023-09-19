package ru.korepanov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.korepanov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.korepanov.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import ru.korepanov.MySecondTestAppSpringBoot.model.Request;
import ru.korepanov.MySecondTestAppSpringBoot.model.Response;

@Service
public class RequestValidationService implements ValidationService{
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
        if (bindingResult.getFieldValue("uid").equals("123")){
            throw new UnsupportedCodeException("UnsupportedCodeException");
        }

    }
}
