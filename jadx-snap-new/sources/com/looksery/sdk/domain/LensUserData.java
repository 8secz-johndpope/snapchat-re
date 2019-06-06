package com.looksery.sdk.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LensUserData {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
    private final String mActionmoji;
    private final String mBirthDate;
    private final String mCountryCode;
    private final String mDisplayName;
    private final int mScore;
    private final String mUsername;

    public LensUserData(String str, String str2, int i, Date date, String str3, String str4) {
        this.mUsername = str;
        this.mDisplayName = str2;
        this.mScore = i;
        this.mBirthDate = date != null ? DATE_FORMAT.format(date) : null;
        this.mActionmoji = str3;
        this.mCountryCode = str4;
    }

    public String getActionmoji() {
        return this.mActionmoji;
    }

    public String getBirthDate() {
        return this.mBirthDate;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public int getScore() {
        return this.mScore;
    }

    public String getUsername() {
        return this.mUsername;
    }
}
