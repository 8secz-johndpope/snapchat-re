package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.pa;
import defpackage.pc;
import defpackage.pd;
import java.util.LinkedHashMap;
import java.util.Map;

final class AndroidQuery implements AndroidStatement, pd {
    private final int argCount;
    private final Map<Integer, akbl<pc, ajxw>> binds = new LinkedHashMap();
    private final pa database;
    private final String sql;

    public AndroidQuery(String str, pa paVar, int i) {
        akcr.b(str, "sql");
        akcr.b(paVar, "database");
        this.sql = str;
        this.database = paVar;
        this.argCount = i;
    }

    public final void bindBytes(int i, byte[] bArr) {
        this.binds.put(Integer.valueOf(i), new AndroidQuery$bindBytes$1(bArr, i));
    }

    public final void bindDouble(int i, Double d) {
        this.binds.put(Integer.valueOf(i), new AndroidQuery$bindDouble$1(d, i));
    }

    public final void bindLong(int i, Long l) {
        this.binds.put(Integer.valueOf(i), new AndroidQuery$bindLong$1(l, i));
    }

    public final void bindString(int i, String str) {
        this.binds.put(Integer.valueOf(i), new AndroidQuery$bindString$1(str, i));
    }

    public final void bindTo(pc pcVar) {
        akcr.b(pcVar, "statement");
        for (akbl invoke : this.binds.values()) {
            invoke.invoke(pcVar);
        }
    }

    public final void close() {
    }

    public final Void execute() {
        throw new UnsupportedOperationException();
    }

    public final AndroidCursor executeQuery() {
        Object a = this.database.a((pd) this);
        akcr.a(a, "database.query(this)");
        return new AndroidCursor(a);
    }

    public final int getArgCount() {
        return this.argCount;
    }

    public final String getSql() {
        return this.sql;
    }

    public final String toString() {
        return this.sql;
    }
}
