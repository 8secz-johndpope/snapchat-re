package defpackage;

import java.util.Set;

/* renamed from: ainx */
public class ainx implements pd {
    private final String sql;
    private final Set<String> tables;

    public ainx(String str, Set<String> set) {
        this.sql = str;
        this.tables = set;
    }

    public void bindTo(pc pcVar) {
    }

    public int getArgCount() {
        throw new UnsupportedOperationException();
    }

    public final String getSql() {
        return this.sql;
    }

    public final Set<String> getTables() {
        return this.tables;
    }
}
