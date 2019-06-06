package defpackage;

import android.content.res.AssetFileDescriptor;
import defpackage.yes.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ygi */
public final class ygi extends ygm<ygk, ygh> {
    public final ygg a;
    private final aipn<ilv> j;
    private final ygx k;

    public ygi(ScheduledExecutorService scheduledExecutorService, aipn<ilv> aipn, ygg ygg, ygx ygx, ajwy<yex> ajwy, ajwy<yex> ajwy2) {
        akcr.b(scheduledExecutorService, "executor");
        akcr.b(aipn, "graphene");
        akcr.b(ygg, "config");
        akcr.b(ygx, "storageStateMonitorRx");
        akcr.b(ajwy, "journalFactory");
        akcr.b(ajwy2, "recoveryJournalFactory");
        super(scheduledExecutorService, ygg, ajwy, ajwy2);
        this.j = aipn;
        this.a = ygg;
        this.k = ygx;
    }

    public final AssetFileDescriptor a(ygk ygk, String str) {
        akcr.b(ygk, "fileType");
        akcr.b(str, "key");
        yeu c = c(ygk, str);
        if (c == null) {
            return null;
        }
        try {
            AssetFileDescriptor b = c.b();
            return b;
        } finally {
            abqt.a((Closeable) c);
        }
    }

    public final AssetFileDescriptor a(ygk ygk, String str, akkv akkv) {
        Closeable a;
        Throwable th;
        Throwable th2;
        akcr.b(ygk, "fileType");
        akcr.b(str, "key");
        akcr.b(akkv, "source");
        ygp ygp = ygk;
        b a2 = a(ygp, str, 1);
        Object a3;
        if (a2 != null) {
            Closeable a4;
            try {
                a4 = akko.a(akkv);
                a = akko.a(akko.a((OutputStream) a2.d()));
                try {
                    ((akkf) a4).a((akku) (akke) a);
                    akax.a(a, null);
                    akax.a(a4, null);
                    a2.e();
                    a3 = a2.a();
                    akcr.a(a3, "it.newAssetDescriptor()");
                    a2.h();
                    return a3;
                } catch (Throwable th22) {
                    Throwable th3 = th22;
                    th22 = th;
                    th = th3;
                }
            } catch (Throwable th4) {
                a2.h();
            }
        } else {
            a3 = a(ygp);
            akcr.a(a3, "getFileGroup(fileType)");
            ygh ygh = (ygh) a3;
            StringBuilder stringBuilder = new StringBuilder("Unable to edit file for group ");
            stringBuilder.append(ygh.e());
            stringBuilder.append(", key ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
        akax.a(a, th22);
        throw th;
    }
}
