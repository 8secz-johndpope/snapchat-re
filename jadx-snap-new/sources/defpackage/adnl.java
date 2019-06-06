package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;

/* renamed from: adnl */
public final class adnl {

    /* renamed from: adnl$c */
    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ MediaMetadataRetriever a;
        private /* synthetic */ FileDescriptor b;

        c(MediaMetadataRetriever mediaMetadataRetriever, FileDescriptor fileDescriptor) {
            this.a = mediaMetadataRetriever;
            this.b = fileDescriptor;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.setDataSource(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: adnl$d */
    static final class d extends akcs implements akbk<Boolean> {
        private /* synthetic */ FileDescriptor a;

        d(FileDescriptor fileDescriptor) {
            this.a = fileDescriptor;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.valid());
        }
    }

    /* renamed from: adnl$a */
    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ FileInputStream a;
        private /* synthetic */ adnl b;
        private /* synthetic */ MediaMetadataRetriever c;
        private /* synthetic */ File d;

        a(FileInputStream fileInputStream, adnl adnl, MediaMetadataRetriever mediaMetadataRetriever, File file) {
            this.a = fileInputStream;
            this.b = adnl;
            this.c = mediaMetadataRetriever;
            this.d = file;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.c.setDataSource(this.a.getFD());
            return ajxw.a;
        }
    }

    /* renamed from: adnl$b */
    static final class b extends akcs implements akbk<Boolean> {
        private /* synthetic */ adnl a;
        private /* synthetic */ MediaMetadataRetriever b;
        private /* synthetic */ File c;

        b(adnl adnl, MediaMetadataRetriever mediaMetadataRetriever, File file) {
            this.a = adnl;
            this.b = mediaMetadataRetriever;
            this.c = file;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.c.exists());
        }
    }

    /* renamed from: adnl$e */
    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ MediaMetadataRetriever a;
        private /* synthetic */ Context b;
        private /* synthetic */ Uri c;

        e(MediaMetadataRetriever mediaMetadataRetriever, Context context, Uri uri) {
            this.a = mediaMetadataRetriever;
            this.b = context;
            this.c = uri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.setDataSource(this.b, this.c);
            return ajxw.a;
        }
    }

    /* renamed from: adnl$f */
    static final class f extends akcs implements akbk<Boolean> {
        private /* synthetic */ Uri a;

        f(Uri uri) {
            this.a = uri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CharSequence path = this.a.getPath();
            int i = (path == null || path.length() == 0) ? 1 : 0;
            return Boolean.valueOf(i ^ 1);
        }
    }

    static void a(akbk<ajxw> akbk, akbk<Boolean> akbk2) {
        try {
            akbk.invoke();
        } catch (RuntimeException e) {
            boolean booleanValue = ((Boolean) akbk2.invoke()).booleanValue();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e.getMessage());
            stringBuilder.append(" with file valid = ");
            stringBuilder.append(booleanValue);
            throw new adkf(stringBuilder.toString(), e, booleanValue);
        }
    }

    public static void a(MediaMetadataRetriever mediaMetadataRetriever, FileDescriptor fileDescriptor) {
        akcr.b(mediaMetadataRetriever, "mediaMetadataRetriever");
        akcr.b(fileDescriptor, "fileDescriptor");
        adnl.a((akbk) new c(mediaMetadataRetriever, fileDescriptor), (akbk) new d(fileDescriptor));
    }
}
