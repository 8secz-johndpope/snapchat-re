package com.snap.core.db.migrate;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import defpackage.akax;
import defpackage.akcr;
import defpackage.pa;
import defpackage.ppy;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class MigrateDB_1036_6Kt {
    public static final void upgradeSequenceNumbers(pa paVar) {
        String str = ppy.d;
        akcr.b(paVar, "db");
        Map linkedHashMap = new LinkedHashMap();
        Closeable a;
        try {
            MigrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers;
            a = paVar.a("SELECT feedRowId, username, sequenceNumber, kind FROM SequenceNumber", new Object[0]);
            Cursor cursor = (Cursor) a;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Object string = cursor.getString(1);
                long j2 = cursor.getLong(2);
                int i = cursor.getInt(3);
                Long valueOf = Long.valueOf(j);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new LinkedHashMap();
                    linkedHashMap.put(valueOf, obj);
                }
                Map map = (Map) obj;
                akcr.a(string, "username");
                Object obj2 = map.get(string);
                if (obj2 == null) {
                    obj2 = new MigrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers();
                    map.put(string, obj2);
                }
                migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers = (MigrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers) obj2;
                if (i == 0) {
                    migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.setServerLatest(Long.valueOf(j2));
                } else if (i == 1) {
                    migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.setUpdate(Long.valueOf(j2));
                } else if (i == 2) {
                    migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.setServerEarliest(Long.valueOf(j2));
                } else if (i == 3) {
                    migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.setProcessedLatest(Long.valueOf(j2));
                } else if (i == 4) {
                    migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.setProcessedEarliest(Long.valueOf(j2));
                }
            }
            akax.a(a, null);
            MigrateDB_1036_6Kt$upgradeSequenceNumbers$2 migrateDB_1036_6Kt$upgradeSequenceNumbers$2 = MigrateDB_1036_6Kt$upgradeSequenceNumbers$2.INSTANCE;
            for (Entry entry : linkedHashMap.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                for (Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers = (MigrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers) entry2.getValue();
                    StringBuilder stringBuilder = new StringBuilder("\n                INSERT INTO SequenceNumbers(feedRowId, username, serverLatest, serverEarliest, processedLatest, processedEarliest, updateNumber)\n                VALUES (");
                    stringBuilder.append(longValue);
                    stringBuilder.append(", '");
                    stringBuilder.append(str2);
                    stringBuilder.append("', ");
                    stringBuilder.append(migrateDB_1036_6Kt$upgradeSequenceNumbers$2.invoke(migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.getServerLatest()));
                    stringBuilder.append(str);
                    stringBuilder.append(migrateDB_1036_6Kt$upgradeSequenceNumbers$2.invoke(migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.getServerEarliest()));
                    stringBuilder.append(str);
                    stringBuilder.append(migrateDB_1036_6Kt$upgradeSequenceNumbers$2.invoke(migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.getProcessedLatest()));
                    stringBuilder.append(str);
                    stringBuilder.append(migrateDB_1036_6Kt$upgradeSequenceNumbers$2.invoke(migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.getProcessedEarliest()));
                    stringBuilder.append(str);
                    stringBuilder.append(migrateDB_1036_6Kt$upgradeSequenceNumbers$2.invoke(migrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers.getUpdate()));
                    stringBuilder.append(")\n                ");
                    paVar.c(stringBuilder.toString());
                }
            }
            paVar.c("DROP TABLE SequenceNumber");
        } catch (SQLiteException unused) {
        } catch (Throwable th) {
            akax.a(a, th);
        }
    }
}
