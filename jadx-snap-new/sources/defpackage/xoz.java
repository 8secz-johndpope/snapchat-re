package defpackage;

import android.content.Context;
import defpackage.yes.b;
import java.io.Closeable;
import java.io.FileInputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: xoz */
public final class xoz implements xfu {
    final ajwy<ygi> a;
    private final ajxe b = ajxh.a(new b(this));
    private final Context c;

    /* renamed from: xoz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xoz$b */
    static final class b extends akcs implements akbk<ygi> {
        private /* synthetic */ xoz a;

        b(xoz xoz) {
            this.a = xoz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ygi) this.a.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xoz.class), "fileManager", "getFileManager()Lcom/snap/storage/filemanager/FileManager;");
        a aVar = new a();
    }

    public xoz(ajwy<ygi> ajwy, Context context) {
        akcr.b(ajwy, "fileManagerProvider");
        akcr.b(context, "context");
        this.a = ajwy;
        this.c = context;
    }

    public static String a(String str, String str2) {
        CharSequence charSequence = str2;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append("_");
            str2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        return akgb.a(str, ":", "", false);
    }

    private static xjh a(xdf xdf) {
        switch (xpa.a[xdf.ordinal()]) {
            case 1:
                return xjh.VIDEO;
            case 2:
                return xjh.PSYCHOMANTIS;
            case 3:
                return xjh.ANALYTICS_FILE;
            case 4:
                return xjh.FIRMWARE_LOG_FILE;
            case 5:
                return xjh.THUMBNAIL;
            case 6:
                return xjh.METADATA;
            case 7:
                return xjh.IMU;
            case 8:
                return xjh.FIRMWARE_UPDATE_BIN;
            case 9:
                StringBuilder stringBuilder = new StringBuilder("spectaclesMediaFileType ");
                stringBuilder.append(xdf);
                stringBuilder.append(" not supported");
                throw new IllegalStateException(stringBuilder.toString());
            default:
                throw new ajxk();
        }
    }

    private final boolean a(xjh xjh, String str, List<String> list, String str2) {
        xfv a = a(xjh.FILE_ZIP, str, str2);
        if (a == null) {
            return false;
        }
        Closeable zipOutputStream = new ZipOutputStream(a.c());
        try {
            ZipOutputStream zipOutputStream2 = (ZipOutputStream) zipOutputStream;
            for (String str3 : list) {
                zipOutputStream2.putNextEntry(new ZipEntry(str3));
                zipOutputStream2.write(c(xjh, str3, str2));
                zipOutputStream2.closeEntry();
            }
            a.a(86400000);
            akax.a(zipOutputStream, null);
            for (String a2 : list) {
                a().f(xjh, xoz.a(a2, str2));
            }
            return true;
        } catch (Throwable th) {
            akax.a(zipOutputStream, th);
        }
    }

    private final xfv h(xjh xjh, String str, String str2) {
        b e = a().e(xjh, xoz.a(str, str2));
        return e != null ? new xoy(e) : null;
    }

    private final boolean i(xjh xjh, String str, String str2) {
        return a().d((ygp) xjh, xoz.a(str, str2)) != null;
    }

    private final byte[] j(xjh xjh, String str, String str2) {
        yeu d = a().d(xjh, xoz.a(str, str2));
        if (d != null) {
            FileInputStream d2 = d.d();
            if (d2 != null) {
                byte[] a = akaw.a(d2);
                if (a != null) {
                    return a;
                }
            }
        }
        return new byte[0];
    }

    private final FileInputStream k(xjh xjh, String str, String str2) {
        yeu d = a().d(xjh, xoz.a(str, str2));
        return d != null ? d.d() : null;
    }

    private final long l(xjh xjh, String str, String str2) {
        yeu d = a().d(xjh, xoz.a(str, str2));
        return d != null ? d.f() : 0;
    }

    private final boolean m(xjh xjh, String str, String str2) {
        return a().f(xjh, xoz.a(str, str2));
    }

    public final xfv a(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        return h(xjh, str, str2);
    }

    public final ygi a() {
        return (ygi) this.b.b();
    }

    public final boolean a(xdf xdf, String str, List<String> list, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        akcr.b(list, "ids");
        return a(xoz.a(xdf), str, (List) list, str2);
    }

    public final byte[] a(xdf xdf, String str, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        return j(xoz.a(xdf), str, str2);
    }

    public final FileInputStream b(xdf xdf, String str, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        return k(xoz.a(xdf), str, str2);
    }

    public final boolean b(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        return i(xjh, str, str2);
    }

    public final boolean c(xdf xdf, String str, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        return i(xoz.a(xdf), str, str2);
    }

    public final byte[] c(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        return j(xjh, str, str2);
    }

    public final FileInputStream d(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        return k(xjh, str, str2);
    }

    public final boolean d(xdf xdf, String str, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        return m(xoz.a(xdf), str, str2);
    }

    public final long e(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        return l(xjh, str, str2);
    }

    public final xfv e(xdf xdf, String str, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        return h(xoz.a(xdf), str, str2);
    }

    public final long f(xdf xdf, String str, String str2) {
        akcr.b(xdf, "specsMediaFileType");
        akcr.b(str, "id");
        return l(xoz.a(xdf), str, str2);
    }

    public final boolean f(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        return m(xjh, str, str2);
    }

    public final xfv g(xjh xjh, String str, String str2) {
        akcr.b(xjh, "fileType");
        akcr.b(str, "id");
        byte[] c = c(xjh, str, str2);
        xfv a = a(xjh, str, str2);
        if (a != null) {
            a.a(c);
        }
        return a;
    }
}
