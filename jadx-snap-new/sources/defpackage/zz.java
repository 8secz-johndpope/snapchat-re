package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import defpackage.zm.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: zz */
public final class zz implements zm<InputStream> {
    private final Uri a;
    private final aab b;
    private InputStream c;

    /* renamed from: zz$a */
    public static class a implements aaa {
        private static final String[] b = new String[]{ohk.d};
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: zz$b */
    public static class b implements aaa {
        private static final String[] b = new String[]{ohk.d};
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    private zz(Uri uri, aab aab) {
        this.a = uri;
        this.b = aab;
    }

    public static zz a(Context context, Uri uri, aaa aaa) {
        return new zz(uri, new aab(yh.a(context).c.a(), aaa, yh.a(context).d, context.getContentResolver()));
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void a(yk ykVar, a<? super InputStream> aVar) {
        try {
            InputStream b = this.b.b(this.a);
            int a = b != null ? this.b.a(this.a) : -1;
            if (a != -1) {
                b = new zp(b, a);
            }
            this.c = b;
            aVar.a(this.c);
        } catch (FileNotFoundException e) {
            String str = "MediaStoreThumbFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to find thumbnail file", e);
            }
            aVar.a(e);
        }
    }

    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void c() {
    }

    public final yx d() {
        return yx.LOCAL;
    }
}
