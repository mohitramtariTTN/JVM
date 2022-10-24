package com.spring.ThirdSpringAssignment.Internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MessageController {

    /** MessageSource is an interface which provides support for internationalization and parameterization of the messages **/
    private MessageSource messageSource;
    MessageController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    /**Taking input of username from url , and using @PathVariable annotation to use it **/
    @GetMapping(path = "/message/{username}")
    public String WelcomeI18n(@PathVariable String username){

        /*** getLocale method is used to get the current locale **/
        Locale locale = LocaleContextHolder.getLocale();

        /** Making an array of String, this array is passed to the messages bundle in resources folder**/
        String name[] = new String[]{username};

        /** getMessage is used to get the message from the correct 'messages' file**/
        /** messages file is dependent on the locale file **/
        /** In the method, I am passing "welcome.text", which means i want to access the value of welcome.text **/
        return messageSource.getMessage("welcome.text",name,"Default Message",locale);
    }
}
