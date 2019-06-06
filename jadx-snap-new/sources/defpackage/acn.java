package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.zm.a;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: acn */
public final class acn implements acq<Uri, File> {
    private final Context a;

    /* renamed from: acn$a */
    public static final class a implements acr<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        public final acq<Uri, File> a(acu acu) {
            return new acn(this.a);
        }
    }

    /* renamed from: acn$b */
    static class b implements zm<File> {
        private static final String[] a = new String[]{ohk.d};
        private final Context b;
        private final Uri c;

        b(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void a(yk ykVar, a<? super File> aVar) {
            Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
            CharSequence charSequence = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        charSequence = query.getString(query.getColumnIndexOrThrow(ohk.d));
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(charSequence)) {
                StringBuilder stringBuilder = new StringBuilder("Failed to find file path for: ");
                stringBuilder.append(this.c);
                aVar.a(new FileNotFoundException(stringBuilder.toString()));
                return;
            }
            aVar.a(new File(charSequence));
        }

        public final void b() {
        }

        public final void c() {
        }

        public final yx d() {
            return yx.LOCAL;
        }
    }

    public acn(Context context) {
        this.a = context;
    }

    public final /* synthetic */ acq.a a(Object obj, int i, int i2, zf zfVar) {
        Uri uri = (Uri) obj;
        return new acq.a(new ahb(uri), new b(this.a, uri));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return zy.a((Uri) obj);
    }
}
