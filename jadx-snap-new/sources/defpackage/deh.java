package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.net.Uri;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Set;

@ftr(a = "silhouette/*")
/* renamed from: deh */
public final class deh extends ggm {
    private final Config a = Config.ARGB_8888;
    private final int b = 85;
    private final jwa c = this.f.a(ddg.l);
    private final Context d;
    private final deg e;
    private final jwb f;
    private final gee g;

    public deh(Context context, deg deg, jwb jwb, gee gee) {
        akcr.b(context, "context");
        akcr.b(deg, "silhouetteUriContentType");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(gee, "contentManager");
        this.d = context;
        this.e = deg;
        this.f = jwb;
        this.g = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object lastPathSegment = uri.getLastPathSegment();
        akcr.a(lastPathSegment, "username");
        String concat = "sil_".concat(String.valueOf(ddu.a(lastPathSegment)));
        gee gee = this.g;
        geo geo = this.e;
        dee dee = new dee(this.d, lastPathSegment);
        dee.a(Callback.DEFAULT_DRAG_ANIMATION_DURATION, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        lastPathSegment = this.c.a((int) Callback.DEFAULT_DRAG_ANIMATION_DURATION, (int) Callback.DEFAULT_DRAG_ANIMATION_DURATION, this.a, "silhouette");
        akcr.a(lastPathSegment, "bitmapFactory.createBitm…mat, URI_PATH_SILHOUETTE)");
        Bitmap a = jwz.a(lastPathSegment);
        dee.a(new Canvas(a));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a.compress(CompressFormat.PNG, 85, byteArrayOutputStream);
        lastPathSegment.dispose();
        lastPathSegment = gee.a(new gew(concat, null, gem.a((InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), "media"), null, geo, set, set2, 276)).a(z);
        akcr.a(lastPathSegment, "contentManager.submit(De…tResult(closeOnTerminate)");
        return lastPathSegment;
    }
}
