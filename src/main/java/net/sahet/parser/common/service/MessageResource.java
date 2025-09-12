package net.sahet.parser.common.service;

import lombok.experimental.UtilityClass;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

@UtilityClass
public class MessageResource {

    public static String getMessage(String key) {
        return ResourceBundle.getBundle("messages").getString(key);
    }

    public static String getMessage(String key, String langCode) {
        if (null != langCode && !langCode.isBlank()) {
            Locale.setDefault(new Locale(langCode, langCode));
        }

        return getMessage(key);
    }

    public String getMessage(String key, Object... parameters) {
        try {
            return String.format(getMessage(key), parameters);
        } catch (MissingResourceException e) {
            return key;
        }
    }


    //JSON-RPC
    //Get from settings.json
}

