package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    private static final String PHONENUMBER_REGEX = "^\\S([0-9]{2}\\S)-\\S(0+[0-9]{9}\\S)$";

    public PhoneNumberRegex() {
    }

    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
