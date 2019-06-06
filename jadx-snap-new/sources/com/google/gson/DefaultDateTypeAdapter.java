package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class DefaultDateTypeAdapter implements JsonDeserializer<Date>, JsonSerializer<Date> {
    private final DateFormat enUsFormat;
    private final DateFormat localFormat;

    DefaultDateTypeAdapter() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    DefaultDateTypeAdapter(int i) {
        this(DateFormat.getDateInstance(i, Locale.US), DateFormat.getDateInstance(i));
    }

    public DefaultDateTypeAdapter(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    DefaultDateTypeAdapter(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    DefaultDateTypeAdapter(DateFormat dateFormat, DateFormat dateFormat2) {
        this.enUsFormat = dateFormat;
        this.localFormat = dateFormat2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            r5 = r4.enUsFormat.parse(r5.getAsString());
     */
    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            return r5;
     */
    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r5.getAsString(), new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Missing block: B:17:0x002c, code skipped:
            return r5;
     */
    /* JADX WARNING: Missing block: B:18:0x002d, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0037, code skipped:
            throw new com.google.gson.JsonSyntaxException(r5.getAsString(), r1);
     */
    private java.util.Date deserializeToDate(com.google.gson.JsonElement r5) {
        /*
        r4 = this;
        r0 = r4.localFormat;
        monitor-enter(r0);
        r1 = r4.localFormat;	 Catch:{ ParseException -> 0x0011 }
        r2 = r5.getAsString();	 Catch:{ ParseException -> 0x0011 }
        r5 = r1.parse(r2);	 Catch:{ ParseException -> 0x0011 }
        monitor-exit(r0);	 Catch:{ all -> 0x000f }
        return r5;
    L_0x000f:
        r5 = move-exception;
        goto L_0x0038;
    L_0x0011:
        r1 = r4.enUsFormat;	 Catch:{ ParseException -> 0x001d }
        r2 = r5.getAsString();	 Catch:{ ParseException -> 0x001d }
        r5 = r1.parse(r2);	 Catch:{ ParseException -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x000f }
        return r5;
    L_0x001d:
        r1 = r5.getAsString();	 Catch:{ ParseException -> 0x002d }
        r2 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x002d }
        r3 = 0;
        r2.<init>(r3);	 Catch:{ ParseException -> 0x002d }
        r5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r1, r2);	 Catch:{ ParseException -> 0x002d }
        monitor-exit(r0);	 Catch:{ all -> 0x000f }
        return r5;
    L_0x002d:
        r1 = move-exception;
        r2 = new com.google.gson.JsonSyntaxException;	 Catch:{ all -> 0x000f }
        r5 = r5.getAsString();	 Catch:{ all -> 0x000f }
        r2.<init>(r5, r1);	 Catch:{ all -> 0x000f }
        throw r2;	 Catch:{ all -> 0x000f }
    L_0x0038:
        monitor-exit(r0);	 Catch:{ all -> 0x000f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.DefaultDateTypeAdapter.deserializeToDate(com.google.gson.JsonElement):java.util.Date");
    }

    public final Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement instanceof JsonPrimitive) {
            Date deserializeToDate = deserializeToDate(jsonElement);
            if (type == Date.class) {
                return deserializeToDate;
            }
            if (type == Timestamp.class) {
                return new Timestamp(deserializeToDate.getTime());
            }
            if (type == java.sql.Date.class) {
                return new java.sql.Date(deserializeToDate.getTime());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass());
            stringBuilder.append(" cannot deserialize to ");
            stringBuilder.append(type);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new JsonParseException("The date should be a string value");
    }

    public final JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonPrimitive jsonPrimitive;
        synchronized (this.localFormat) {
            jsonPrimitive = new JsonPrimitive(this.enUsFormat.format(date));
        }
        return jsonPrimitive;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(DefaultDateTypeAdapter.class.getSimpleName());
        stringBuilder.append('(');
        stringBuilder.append(this.localFormat.getClass().getSimpleName());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
