package com.snap.core.db.api;

import defpackage.ajyi;
import defpackage.akcr;
import java.util.Arrays;

public final class IndexSpecKt {
    public static final String dropIndexQuery(IndexSpec indexSpec) {
        akcr.b(indexSpec, "receiver$0");
        StringBuilder stringBuilder = new StringBuilder("DROP INDEX IF EXISTS ");
        stringBuilder.append(indexSpec.getIndexName());
        Object format = String.format(stringBuilder.toString(), Arrays.copyOf(new Object[0], 0));
        akcr.a(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String getCreateIndexQuery(IndexSpec indexSpec) {
        akcr.b(indexSpec, "receiver$0");
        String str = indexSpec.getUnique() ? "UNIQUE INDEX" : "INDEX";
        StringBuilder stringBuilder = new StringBuilder("CREATE ");
        stringBuilder.append(str);
        stringBuilder.append(" IF NOT EXISTS ");
        stringBuilder.append(indexSpec.getIndexName());
        stringBuilder.append(" ON ");
        stringBuilder.append(indexSpec.getTable().getTableName());
        stringBuilder.append('(');
        stringBuilder.append(ajyi.a((Object[]) indexSpec.getIndexColumns(), null, null, null, 0, null, null, 63));
        stringBuilder.append(')');
        Object format = String.format(stringBuilder.toString(), Arrays.copyOf(new Object[0], 0));
        akcr.a(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
