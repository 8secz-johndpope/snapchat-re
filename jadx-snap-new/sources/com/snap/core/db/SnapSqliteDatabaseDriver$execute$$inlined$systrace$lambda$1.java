package com.snap.core.db;

import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;

final class SnapSqliteDatabaseDriver$execute$$inlined$systrace$lambda$1 extends akcs implements akbk<T> {
    final /* synthetic */ akbl $binders$inlined;
    final /* synthetic */ akbk $createStatement$inlined;
    final /* synthetic */ Object $default$inlined;
    final /* synthetic */ Integer $identifier$inlined;
    final /* synthetic */ akbl $result$inlined;
    final /* synthetic */ SnapSqliteDatabaseDriver this$0;

    SnapSqliteDatabaseDriver$execute$$inlined$systrace$lambda$1(SnapSqliteDatabaseDriver snapSqliteDatabaseDriver, Integer num, akbk akbk, akbl akbl, akbl akbl2, Object obj) {
        this.this$0 = snapSqliteDatabaseDriver;
        this.$identifier$inlined = num;
        this.$createStatement$inlined = akbk;
        this.$binders$inlined = akbl;
        this.$result$inlined = akbl2;
        this.$default$inlined = obj;
        super(0);
    }

    public final T invoke() {
        Object obj = this.$identifier$inlined != null ? (AndroidStatement) this.this$0.statements.remove(this.$identifier$inlined) : null;
        if (obj == null) {
            obj = (AndroidStatement) this.$createStatement$inlined.invoke();
        }
        try {
            if (this.$binders$inlined != null) {
                this.$binders$inlined.invoke(obj);
            }
            T invoke = this.$result$inlined.invoke(obj);
            return invoke;
        } finally {
            if (this.$identifier$inlined != null) {
                AndroidStatement androidStatement = (AndroidStatement) this.this$0.statements.put(this.$identifier$inlined, obj);
                if (androidStatement != null) {
                    androidStatement.close();
                }
            }
        }
    }
}
