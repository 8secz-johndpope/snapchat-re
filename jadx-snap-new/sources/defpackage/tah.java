package defpackage;

import android.net.Uri;
import defpackage.taj.d;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: tah */
public final class tah {
    public String a;
    private final ExecutorService b;
    private String c;
    private taj d;

    /* renamed from: tah$a */
    public interface a {
        void onDecryptionFinished(spq spq);
    }

    public tah() {
        this(tal.e);
    }

    private tah(ExecutorService executorService) {
        this.b = executorService;
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        try {
            aklc.a(inputStream, outputStream, 16384);
            outputStream.close();
        } finally {
            aklc.a((Closeable) outputStream);
            aklc.a((Closeable) inputStream);
        }
    }

    private /* synthetic */ void a(String str, String str2, a aVar, spq spq) {
        if (spq.b != null) {
            this.c = null;
        } else {
            this.a = spq.a;
        }
        aVar.onDecryptionFinished(spq);
    }

    private static boolean a(String str, String str2) {
        return (str == null || str2 == null) ? Objects.equals(str, str2) : Uri.parse(str).buildUpon().scheme(null).authority(null).build().equals(Uri.parse(str2).buildUpon().scheme(null).authority(null).build());
    }

    public final void a() {
        String str = this.a;
        if (!(str == null || tah.a(str, this.c))) {
            taj taj = this.d;
            if (taj != null) {
                taj.a();
                this.d = null;
            }
            this.b.execute(new -$$Lambda$tah$fEZ44C1mfCqTwbABv3EhHJc3cSU(new File(this.a)));
        }
        this.a = null;
        this.c = null;
    }

    public final void a(String str, abnb abnb, a aVar, String str2, tai tai) {
        String str3 = this.c;
        if (str3 == null || !tah.a(str3, str)) {
            this.c = str;
            this.a = null;
            if (this.d == null) {
                this.d = new taj(tai, this.b);
            }
            taj taj = this.d;
            -$$Lambda$tah$nsBb1wmq_GhDqjTIMJRtzXToFC0 -__lambda_tah_nsbb1wmq_ghdqjtimjrtzxtofc0 = new -$$Lambda$tah$nsBb1wmq_GhDqjTIMJRtzXToFC0(this, str, str2, aVar);
            akcr.b(str, "originalFilePath");
            akcr.b(abnb, "encryptionAlgorithm");
            akcr.b(str2, "asyncLoggingCorrelationId");
            akcr.b(-__lambda_tah_nsbb1wmq_ghdqjtimjrtzxtofc0, "callback");
            taj.a();
            taj.b = taj.d.submit(new d(taj, str, abnb, str2, -__lambda_tah_nsbb1wmq_ghdqjtimjrtzxtofc0));
        }
    }
}
