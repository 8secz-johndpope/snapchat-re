package com.snap.core.db.api;

import defpackage.akcr;

public final class ConstraintSpec {
    private final ConstraintType constraintType;
    private final String sqlStatement;
    private final String tableName;

    public ConstraintSpec(String str, String str2, ConstraintType constraintType) {
        akcr.b(str, "tableName");
        akcr.b(str2, "sqlStatement");
        akcr.b(constraintType, "constraintType");
        this.tableName = str;
        this.sqlStatement = str2;
        this.constraintType = constraintType;
    }

    public static /* synthetic */ ConstraintSpec copy$default(ConstraintSpec constraintSpec, String str, String str2, ConstraintType constraintType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = constraintSpec.tableName;
        }
        if ((i & 2) != 0) {
            str2 = constraintSpec.sqlStatement;
        }
        if ((i & 4) != 0) {
            constraintType = constraintSpec.constraintType;
        }
        return constraintSpec.copy(str, str2, constraintType);
    }

    public final String component1() {
        return this.tableName;
    }

    public final String component2() {
        return this.sqlStatement;
    }

    public final ConstraintType component3() {
        return this.constraintType;
    }

    public final ConstraintSpec copy(String str, String str2, ConstraintType constraintType) {
        akcr.b(str, "tableName");
        akcr.b(str2, "sqlStatement");
        akcr.b(constraintType, "constraintType");
        return new ConstraintSpec(str, str2, constraintType);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.constraintType, r3.constraintType) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.core.db.api.ConstraintSpec;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.core.db.api.ConstraintSpec) r3;
        r0 = r2.tableName;
        r1 = r3.tableName;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.sqlStatement;
        r1 = r3.sqlStatement;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.constraintType;
        r3 = r3.constraintType;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.ConstraintSpec.equals(java.lang.Object):boolean");
    }

    public final ConstraintType getConstraintType() {
        return this.constraintType;
    }

    public final String getSqlStatement() {
        return this.sqlStatement;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final int hashCode() {
        String str = this.tableName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sqlStatement;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ConstraintType constraintType = this.constraintType;
        if (constraintType != null) {
            i = constraintType.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConstraintSpec(tableName=");
        stringBuilder.append(this.tableName);
        stringBuilder.append(", sqlStatement=");
        stringBuilder.append(this.sqlStatement);
        stringBuilder.append(", constraintType=");
        stringBuilder.append(this.constraintType);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
