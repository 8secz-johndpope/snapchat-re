package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    private static final String UTC_ID = "UTC";

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder stringBuilder = new StringBuilder(((z ? 4 : 0) + 19) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(stringBuilder, gregorianCalendar.get(1), 4);
        char c = '-';
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(5), 2);
        stringBuilder.append('T');
        padInt(stringBuilder, gregorianCalendar.get(11), 2);
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(12), 2);
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(13), 2);
        if (z) {
            stringBuilder.append('.');
            padInt(stringBuilder, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            i = Math.abs(i % 60);
            if (offset >= 0) {
                c = '+';
            }
            stringBuilder.append(c);
            padInt(stringBuilder, abs, 2);
            stringBuilder.append(':');
            padInt(stringBuilder, i, 2);
        } else {
            stringBuilder.append('Z');
        }
        return stringBuilder.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder stringBuilder, int i, int i2) {
        String num = Integer.toString(i);
        for (i2 -= num.length(); i2 > 0; i2--) {
            stringBuilder.append('0');
        }
        stringBuilder.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a5 A:{Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc A:{Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }} */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) {
        /*
        r1 = r18;
        r2 = r19;
        r3 = "'";
        r0 = r19.getIndex();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = r0 + 4;
        r0 = parseInt(r1, r0, r4);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = 45;
        r6 = checkOffset(r1, r4, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r6 == 0) goto L_0x001a;
    L_0x0018:
        r4 = r4 + 1;
    L_0x001a:
        r6 = r4 + 2;
        r4 = parseInt(r1, r4, r6);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r7 = checkOffset(r1, r6, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r7 == 0) goto L_0x0028;
    L_0x0026:
        r6 = r6 + 1;
    L_0x0028:
        r7 = r6 + 2;
        r6 = parseInt(r1, r6, r7);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r8 = 84;
        r8 = checkOffset(r1, r7, r8);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r9 = 1;
        if (r8 != 0) goto L_0x004b;
    L_0x0037:
        r10 = r18.length();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r10 > r7) goto L_0x004b;
    L_0x003d:
        r5 = new java.util.GregorianCalendar;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = r4 - r9;
        r5.<init>(r0, r4, r6);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r2.setIndex(r7);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = r5.getTime();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        return r0;
    L_0x004b:
        r10 = 43;
        r11 = 90;
        r13 = 2;
        if (r8 == 0) goto L_0x00c1;
    L_0x0052:
        r7 = r7 + 1;
        r8 = r7 + 2;
        r7 = parseInt(r1, r7, r8);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r14 = 58;
        r15 = checkOffset(r1, r8, r14);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r15 == 0) goto L_0x0064;
    L_0x0062:
        r8 = r8 + 1;
    L_0x0064:
        r15 = r8 + 2;
        r8 = parseInt(r1, r8, r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r14 = checkOffset(r1, r15, r14);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r14 == 0) goto L_0x0072;
    L_0x0070:
        r15 = r15 + 1;
    L_0x0072:
        r14 = r18.length();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r14 <= r15) goto L_0x00bf;
    L_0x0078:
        r14 = r1.charAt(r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r14 == r11) goto L_0x00bf;
    L_0x007e:
        if (r14 == r10) goto L_0x00bf;
    L_0x0080:
        if (r14 == r5) goto L_0x00bf;
    L_0x0082:
        r14 = r15 + 2;
        r15 = parseInt(r1, r15, r14);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r12 = 59;
        if (r15 <= r12) goto L_0x0093;
    L_0x008c:
        r12 = 63;
        if (r15 >= r12) goto L_0x0093;
    L_0x0090:
        r12 = 59;
        goto L_0x0094;
    L_0x0093:
        r12 = r15;
    L_0x0094:
        r15 = 46;
        r15 = checkOffset(r1, r14, r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r15 == 0) goto L_0x00bc;
    L_0x009c:
        r14 = r14 + 1;
        r15 = r14 + 1;
        r15 = indexOfNonDigit(r1, r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = r14 + 3;
        r5 = java.lang.Math.min(r15, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r17 = parseInt(r1, r14, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = r5 - r14;
        if (r5 == r9) goto L_0x00b7;
    L_0x00b1:
        if (r5 == r13) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b9;
    L_0x00b4:
        r17 = r17 * 10;
        goto L_0x00b9;
    L_0x00b7:
        r17 = r17 * 100;
    L_0x00b9:
        r5 = r17;
        goto L_0x00c6;
    L_0x00bc:
        r15 = r14;
        r5 = 0;
        goto L_0x00c6;
    L_0x00bf:
        r5 = 0;
        goto L_0x00c5;
    L_0x00c1:
        r15 = r7;
        r5 = 0;
        r7 = 0;
        r8 = 0;
    L_0x00c5:
        r12 = 0;
    L_0x00c6:
        r14 = r18.length();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r14 <= r15) goto L_0x01a5;
    L_0x00cc:
        r14 = r1.charAt(r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r13 = 5;
        if (r14 != r11) goto L_0x00d8;
    L_0x00d3:
        r10 = TIMEZONE_UTC;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r15 = r15 + r9;
        goto L_0x0173;
    L_0x00d8:
        if (r14 == r10) goto L_0x00f6;
    L_0x00da:
        r10 = 45;
        if (r14 != r10) goto L_0x00df;
    L_0x00de:
        goto L_0x00f6;
    L_0x00df:
        r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = "Invalid time zone indicator '";
        r4.<init>(r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4.append(r14);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = r4.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0.<init>(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
    L_0x00f6:
        r10 = r1.substring(r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r11 = r10.length();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r11 < r13) goto L_0x0101;
    L_0x0100:
        goto L_0x0112;
    L_0x0101:
        r11 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r11.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r11.append(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r10 = "00";
        r11.append(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r10 = r11.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
    L_0x0112:
        r11 = r10.length();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r15 = r15 + r11;
        r11 = "+0000";
        r11 = r11.equals(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r11 != 0) goto L_0x0171;
    L_0x011f:
        r11 = "+00:00";
        r11 = r11.equals(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r11 == 0) goto L_0x0128;
    L_0x0127:
        goto L_0x0171;
    L_0x0128:
        r11 = "GMT";
        r10 = java.lang.String.valueOf(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r10 = r11.concat(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r11 = java.util.TimeZone.getTimeZone(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r14 = r11.getID();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r16 = r14.equals(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r16 != 0) goto L_0x016f;
    L_0x0140:
        r13 = ":";
        r9 = "";
        r9 = r14.replace(r13, r9);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r9 = r9.equals(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        if (r9 == 0) goto L_0x014f;
    L_0x014e:
        goto L_0x016f;
    L_0x014f:
        r0 = new java.lang.IndexOutOfBoundsException;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = "Mismatching time zone indicator: ";
        r4.<init>(r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4.append(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = " given, resolves to ";
        r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r5 = r11.getID();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4.append(r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = r4.toString();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0.<init>(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
    L_0x016f:
        r10 = r11;
        goto L_0x0173;
    L_0x0171:
        r10 = TIMEZONE_UTC;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
    L_0x0173:
        r9 = new java.util.GregorianCalendar;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r9.<init>(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r10 = 0;
        r9.setLenient(r10);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r10 = 1;
        r9.set(r10, r0);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = r4 - r10;
        r0 = 2;
        r9.set(r0, r4);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = 5;
        r9.set(r0, r6);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = 11;
        r9.set(r0, r7);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = 12;
        r9.set(r0, r8);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = 13;
        r9.set(r0, r12);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = 14;
        r9.set(r0, r5);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r2.setIndex(r15);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r0 = r9.getTime();	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        return r0;
    L_0x01a5:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        r4 = "No time zone indicator";
        r0.<init>(r4);	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x01b1, NumberFormatException -> 0x01af, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        goto L_0x01b2;
    L_0x01af:
        r0 = move-exception;
        goto L_0x01b2;
    L_0x01b1:
        r0 = move-exception;
    L_0x01b2:
        if (r1 != 0) goto L_0x01b6;
    L_0x01b4:
        r1 = 0;
        goto L_0x01c7;
    L_0x01b6:
        r4 = new java.lang.StringBuilder;
        r5 = "\"";
        r4.<init>(r5);
        r4.append(r1);
        r4.append(r3);
        r1 = r4.toString();
    L_0x01c7:
        r3 = r0.getMessage();
        if (r3 == 0) goto L_0x01d3;
    L_0x01cd:
        r4 = r3.isEmpty();
        if (r4 == 0) goto L_0x01ee;
    L_0x01d3:
        r3 = new java.lang.StringBuilder;
        r4 = "(";
        r3.<init>(r4);
        r4 = r0.getClass();
        r4 = r4.getName();
        r3.append(r4);
        r4 = ")";
        r3.append(r4);
        r3 = r3.toString();
    L_0x01ee:
        r4 = new java.text.ParseException;
        r5 = new java.lang.StringBuilder;
        r6 = "Failed to parse date [";
        r5.<init>(r6);
        r5.append(r1);
        r1 = "]: ";
        r5.append(r1);
        r5.append(r3);
        r1 = r5.toString();
        r2 = r19.getIndex();
        r4.<init>(r1, r2);
        r4.initCause(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0068 in {8, 10, 11, 15, 17, 19, 21} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static int parseInt(java.lang.String r5, int r6, int r7) {
        /*
        if (r6 < 0) goto L_0x0062;
        r0 = r5.length();
        if (r7 > r0) goto L_0x0062;
        if (r6 > r7) goto L_0x0062;
        r0 = 0;
        r1 = "Invalid number: ";
        r2 = 10;
        if (r6 >= r7) goto L_0x0035;
        r0 = r6 + 1;
        r3 = r5.charAt(r6);
        r3 = java.lang.Character.digit(r3, r2);
        if (r3 < 0) goto L_0x001f;
        r3 = -r3;
        goto L_0x0037;
        r0 = new java.lang.NumberFormatException;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r5 = r5.substring(r6, r7);
        r2.append(r5);
        r5 = r2.toString();
        r0.<init>(r5);
        throw r0;
        r0 = r6;
        r3 = 0;
        if (r0 >= r7) goto L_0x0060;
        r4 = r0 + 1;
        r0 = r5.charAt(r0);
        r0 = java.lang.Character.digit(r0, r2);
        if (r0 < 0) goto L_0x004a;
        r3 = r3 * 10;
        r3 = r3 - r0;
        r0 = r4;
        goto L_0x0037;
        r0 = new java.lang.NumberFormatException;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r5 = r5.substring(r6, r7);
        r2.append(r5);
        r5 = r2.toString();
        r0.<init>(r5);
        throw r0;
        r5 = -r3;
        return r5;
        r6 = new java.lang.NumberFormatException;
        r6.<init>(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parseInt(java.lang.String, int, int):int");
    }
}
