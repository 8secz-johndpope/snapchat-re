package defpackage;

import defpackage.abq.b;
import java.io.File;

/* renamed from: aag */
final class aag<DataType> implements b {
    private final za<DataType> a;
    private final DataType b;
    private final zf c;

    aag(za<DataType> zaVar, DataType dataType, zf zfVar) {
        this.a = zaVar;
        this.b = dataType;
        this.c = zfVar;
    }

    public final boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
