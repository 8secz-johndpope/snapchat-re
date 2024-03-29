package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            return typeToken.getRawType() == Date.class ? new DateTypeAdapter() : null;
        }
    };
    private final DateFormat enUsFormat = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat localFormat = DateFormat.getDateTimeInstance(2, 2);

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing block: B:7:?, code skipped:
            r3 = r2.enUsFormat.parse(r3);
     */
    /* JADX WARNING: Missing block: B:9:0x0012, code skipped:
            return r3;
     */
    /* JADX WARNING: Missing block: B:11:?, code skipped:
            r3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            return r3;
     */
    /* JADX WARNING: Missing block: B:14:0x001f, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:17:0x0025, code skipped:
            throw new com.google.gson.JsonSyntaxException(r3, r0);
     */
    private synchronized java.util.Date deserializeToDate(java.lang.String r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.localFormat;	 Catch:{ ParseException -> 0x000b }
        r3 = r0.parse(r3);	 Catch:{ ParseException -> 0x000b }
        monitor-exit(r2);
        return r3;
    L_0x0009:
        r3 = move-exception;
        goto L_0x0026;
    L_0x000b:
        r0 = r2.enUsFormat;	 Catch:{ ParseException -> 0x0013 }
        r3 = r0.parse(r3);	 Catch:{ ParseException -> 0x0013 }
        monitor-exit(r2);
        return r3;
    L_0x0013:
        r0 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x001f }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ ParseException -> 0x001f }
        r3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r3, r0);	 Catch:{ ParseException -> 0x001f }
        monitor-exit(r2);
        return r3;
    L_0x001f:
        r0 = move-exception;
        r1 = new com.google.gson.JsonSyntaxException;	 Catch:{ all -> 0x0009 }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x0009 }
        throw r1;	 Catch:{ all -> 0x0009 }
    L_0x0026:
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.DateTypeAdapter.deserializeToDate(java.lang.String):java.util.Date");
    }

    public final Date read(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonToken.NULL) {
            return deserializeToDate(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    public final synchronized void write(JsonWriter jsonWriter, Date date) {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.enUsFormat.format(date));
        }
    }
}
