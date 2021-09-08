package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassnameCheck {
    private static final String CLASSNAME_REGEX = "^[_ACP]+[0-9]{4}[GHIKLM]$";
     public ClassnameCheck() {
     }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
