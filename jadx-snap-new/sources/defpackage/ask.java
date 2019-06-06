package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: ask */
final class ask {
    private final String a;
    private final aitb b;

    public ask(String str, aitb aitb) {
        this.a = str;
        this.b = aitb;
    }

    public final boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            aiqr a = aiqj.a();
            StringBuilder stringBuilder = new StringBuilder("Error creating marker: ");
            stringBuilder.append(this.a);
            a.c("CrashlyticsCore", stringBuilder.toString(), e);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final File b() {
        return new File(this.b.a(), this.a);
    }
}
