package com.hilleljavaelementary;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatabaseValidator {

    public static boolean isRegNumberValidated (String reg) {
        return isValidated("(^[A-Z]{2}\\d{4}[A-Z]{2}$)|(^[А-Я]{2}\\d{4}[А-Я]{2}$)", reg);
    }

    public static boolean isStringEmpty (String string) {
        return (Objects.isNull(string) || string.length() == 0);
    }

    public static boolean isNameValidated (String name) {
        return isValidated("(^[A-Z]{1}[a-z]{1,15}\\s[A-Z]{1}[a-z]{1,15}\\s[A-Z]{1}[a-z]{1,15}[a-z]$)|([А-ЯЁ]{1}[а-яё]{1,15}\\s[А-ЯЁ]{1}[а-яё]{1,15}\\s[А-ЯЁ]{1}[а-яё]{1,15}[а-яё]$)",name);
    }

    public static boolean isVINValidated (String vin) {
        return isValidated("^\\d{1}[A-Z]{4}\\d{2}[A-Z]{4}\\d{6}",vin);
    }

    public static boolean isValidated (String regex, String object) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        matcher = pattern.matcher(object);
        return matcher.find(0);
    }

    public static boolean isCollectionEmpty (Map collection) {
        return (Objects.isNull(collection) || collection.isEmpty());
    }
}
