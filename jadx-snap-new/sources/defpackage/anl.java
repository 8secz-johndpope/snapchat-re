package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;

/* renamed from: anl */
public final class anl implements anm<Bitmap, amd> {
    private final Resources a;
    private final ajr b;

    public anl(Resources resources, ajr ajr) {
        this.a = resources;
        this.b = ajr;
    }

    public final ajn<amd> a(ajn<Bitmap> ajn) {
        return new ame(new amd(this.a, (Bitmap) ajn.a()), this.b);
    }

    public final String a() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
