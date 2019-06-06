package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: azo */
public final class azo {
    private final Context a;
    private final avz b;

    public azo(Context context, avz avz) {
        this.a = context;
        this.b = avz;
    }

    public final ave a() {
        Object fileInputStream;
        int i = this.b.b;
        if (i == 2 || i == 3) {
            try {
                fileInputStream = new FileInputStream(this.b.a());
            } catch (FileNotFoundException unused) {
                return null;
            }
        } else if (i == 6) {
            try {
                fileInputStream = this.a.getResources().openRawResource(Integer.parseInt(this.b.a.getPath().substring(1)));
            } catch (NotFoundException unused2) {
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("Unsupported uri scheme for encoded image fetch! Uri is: ");
            stringBuilder.append(this.b.a);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return fileInputStream == null ? null : new ave(auj.a(fileInputStream));
    }
}
