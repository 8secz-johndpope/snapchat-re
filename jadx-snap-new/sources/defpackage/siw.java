package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.view.View;
import android.widget.ImageView;

/* renamed from: siw */
public interface siw {

    /* renamed from: siw$c */
    public interface c extends b {
        Bitmap c();
    }

    /* renamed from: siw$b */
    public interface b {
        boolean a();

        void b();
    }

    /* renamed from: siw$a */
    public interface a {
        void a(String str, ImageView imageView, int i, int i2, c cVar);

        void a(String str, ImageView imageView, Exception exception);
    }

    b a(String str, abnb abnb, int i, int i2, a aVar);

    b a(String str, abnb abnb, ImageView imageView, int i, int i2, a aVar);

    b a(String str, abnb abnb, ImageView imageView, a aVar);

    b a(String str, abnb abnb, a aVar);

    b a(String str, View view, a aVar);

    c a(int i, int i2, Config config);

    void a(int i, View view);

    void a(ImageView imageView);
}
