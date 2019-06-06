package defpackage;

import defpackage.gdx.a;
import defpackage.gdx.b;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: gjb */
public final class gjb implements b {
    private int a;
    private final String b;
    private final b c;
    private final int d;

    public gjb(a aVar, int i) {
        akcr.b(aVar, "cacheEntry");
        this(aVar.b, aVar.a.a(aVar.b, aVar.c, i), i);
    }

    private gjb(String str, b bVar, int i) {
        akcr.b(str, "key");
        this.b = str;
        this.c = bVar;
        this.d = i;
    }

    public final OutputStream a() {
        b bVar = this.c;
        StringBuilder stringBuilder;
        if (bVar != null) {
            int i = this.a;
            this.a = i + 1;
            if (i != this.d) {
                return bVar.a();
            }
            stringBuilder = new StringBuilder("Only ");
            stringBuilder.append(this.d);
            stringBuilder.append(" output streams are allowed for ");
            stringBuilder.append(this.b);
            throw new IOException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("Unable to create editor for ");
        stringBuilder.append(this.b);
        throw new IOException(stringBuilder.toString());
    }

    public final gez b() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.b();
        }
        StringBuilder stringBuilder = new StringBuilder("Editor has not been created yet for ");
        stringBuilder.append(this.b);
        throw new IOException(stringBuilder.toString());
    }

    public final void c() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.c();
        }
    }
}
