package defpackage;

/* renamed from: ainy */
public abstract class ainy implements pe {
    private final pe program;
    private final String table;

    protected ainy(String str, pe peVar) {
        this.table = str;
        this.program = peVar;
    }

    public final void bindBlob(int i, byte[] bArr) {
        this.program.bindBlob(i, bArr);
    }

    public final void bindDouble(int i, double d) {
        this.program.bindDouble(i, d);
    }

    public final void bindLong(int i, long j) {
        this.program.bindLong(i, j);
    }

    public final void bindNull(int i) {
        this.program.bindNull(i);
    }

    public final void bindString(int i, String str) {
        this.program.bindString(i, str);
    }

    public final void clearBindings() {
        this.program.clearBindings();
    }

    public final void close() {
        this.program.close();
    }

    public final void execute() {
        this.program.execute();
    }

    public final long executeInsert() {
        return this.program.executeInsert();
    }

    public final int executeUpdateDelete() {
        return this.program.executeUpdateDelete();
    }

    public final String getTable() {
        return this.table;
    }

    public final long simpleQueryForLong() {
        return this.program.simpleQueryForLong();
    }

    public final String simpleQueryForString() {
        return this.program.simpleQueryForString();
    }
}
