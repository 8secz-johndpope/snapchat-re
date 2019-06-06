package defpackage;

import defpackage.airo.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.opencv.imgproc.Imgproc;

/* renamed from: atg */
final class atg implements asv {
    private final File a;
    private final int b = Imgproc.FLOODFILL_FIXED_RANGE;
    private airo c;

    /* renamed from: atg$a */
    public class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public atg(File file) {
        this.a = file;
    }

    private a d() {
        if (!this.a.exists()) {
            return null;
        }
        e();
        airo airo = this.c;
        if (airo == null) {
            return null;
        }
        final int[] iArr = new int[]{0};
        final byte[] bArr = new byte[airo.a()];
        try {
            this.c.a(new c() {
                public final void a(InputStream inputStream, int i) {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            aiqj.a().c("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new a(bArr, iArr[0]);
    }

    private void e() {
        if (this.c == null) {
            try {
                this.c = new airo(this.a);
            } catch (IOException e) {
                aiqr a = aiqj.a();
                StringBuilder stringBuilder = new StringBuilder("Could not open log file: ");
                stringBuilder.append(this.a);
                a.c("CrashlyticsCore", stringBuilder.toString(), e);
            }
        }
    }

    public final asb a() {
        a d = d();
        if (d == null) {
            return null;
        }
        byte[] bArr = d.a;
        int i = d.b;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new asb(bArr2);
    }

    public final void a(long j, String str) {
        String str2 = " ";
        e();
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > 16384) {
                    StringBuilder stringBuilder = new StringBuilder("...");
                    stringBuilder.append(str.substring(str.length() - 16384));
                    str = stringBuilder.toString();
                }
                str = str.replaceAll("\r", str2).replaceAll("\n", str2);
                byte[] bytes = String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str}).getBytes("UTF-8");
                this.c.a(bytes, bytes.length);
                while (!this.c.b() && this.c.a() > Imgproc.FLOODFILL_FIXED_RANGE) {
                    this.c.c();
                }
            } catch (IOException e) {
                aiqj.a().c("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    public final void b() {
        airf.a(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    public final void c() {
        b();
        this.a.delete();
    }
}
