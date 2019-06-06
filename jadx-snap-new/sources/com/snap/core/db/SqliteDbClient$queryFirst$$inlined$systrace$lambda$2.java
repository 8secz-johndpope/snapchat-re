package com.snap.core.db;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.akax;
import defpackage.akbk;
import defpackage.akcs;
import defpackage.in;
import java.io.Closeable;

final class SqliteDbClient$queryFirst$$inlined$systrace$lambda$2 extends akcs implements akbk<R> {
    final /* synthetic */ Object $defaultValue$inlined;
    final /* synthetic */ ainw $mapper$inlined;
    final /* synthetic */ ainx $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$queryFirst$$inlined$systrace$lambda$2(SqliteDbClient sqliteDbClient, ainx ainx, ainw ainw, Object obj) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = ainx;
        this.$mapper$inlined = ainw;
        this.$defaultValue$inlined = obj;
        super(0);
    }

    public final R invoke() {
        String str = "";
        Closeable query = this.this$0.query(this.$statement$inlined);
        try {
            Cursor cursor = (Cursor) query;
            in.a(str);
            R map;
            try {
                if (cursor.moveToFirst()) {
                    in.a(str);
                    map = this.$mapper$inlined.map(cursor);
                    in.a();
                    akax.a(query, null);
                    return map;
                }
                map = this.$defaultValue$inlined;
                in.a();
                akax.a(query, null);
                return map;
            } catch (Throwable th) {
                map = th;
            } finally {
                in.a();
            }
        } catch (Throwable th2) {
            try {
            } catch (Throwable th3) {
                akax.a(query, th2);
            }
        }
    }
}
