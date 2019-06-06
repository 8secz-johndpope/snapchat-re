package com.snap.imageloading.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import defpackage.avf;
import defpackage.awn;
import defpackage.awp;
import defpackage.awq;
import defpackage.axg.b;
import defpackage.axm;
import defpackage.axn;
import defpackage.axr;
import defpackage.axs;
import defpackage.axx;
import defpackage.ayu;
import defpackage.ayv;
import defpackage.ayw;
import defpackage.azk;
import defpackage.azl;
import defpackage.azm;
import defpackage.idl;
import defpackage.jvx;
import defpackage.jvy;
import defpackage.jvy.a;
import defpackage.jwq;
import java.util.Map;

public class SnapAnimatedImageView extends axx implements jvy {
    private static final Map<ScaleType, b> i = ImmutableMap.builder().put(ScaleType.CENTER, b.e).put(ScaleType.CENTER_CROP, b.g).put(ScaleType.CENTER_INSIDE, b.f).put(ScaleType.FIT_CENTER, b.c).put(ScaleType.FIT_END, b.d).put(ScaleType.FIT_START, b.b).put(ScaleType.FIT_XY, b.a).build();
    int c;
    final ayv d;
    private final Supplier<azm> e;
    private azl f;
    private awq<avf> g;
    private jvy.b h;
    private Uri j;

    public SnapAnimatedImageView(Context context) {
        this(context, null);
    }

    public SnapAnimatedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SnapAnimatedImageView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, null);
    }

    public SnapAnimatedImageView(Context context, AttributeSet attributeSet, ScaleType scaleType) {
        super(context, attributeSet, 0);
        this.h = a;
        this.c = -1;
        this.j = null;
        this.d = new ayw() {
            public final void a(int i) {
                SnapAnimatedImageView.this.c = i;
            }
        };
        a(b);
        this.e = ((jwq) Preconditions.checkNotNull(jvx.a().d)).b();
        ScaleType scaleType2 = getScaleType();
        b bVar = (b) (scaleType2 != null ? i.get(scaleType2) : i.get(scaleType));
        axm a = axn.a(context, attributeSet);
        a.a(bVar);
        a((axs) a.a());
    }

    private synchronized azl d() {
        if (this.f == null) {
            this.f = ((azm) this.e.get()).get();
        }
        return this.f;
    }

    public final axr a() {
        return super.a();
    }

    public final void a(Uri uri, idl idl) {
        if (!uri.equals(this.j)) {
            this.j = uri;
            azl a = ((azl) d().a((Object) idl)).a(uri);
            a.e = this.h.b;
            a.c = this.h.a;
            awn a2 = ((azl) a.a(super.a())).a();
            if (a2 instanceof azk) {
                ((azk) a2).a(this.g);
            }
            super.a((axr) a2);
        }
    }

    public final void a(axr axr) {
        super.a(axr);
    }

    public final void a(final a aVar) {
        this.g = new awp<avf>() {
            public final /* bridge */ /* synthetic */ void a(String str, Object obj, Animatable animatable) {
                aVar.a();
                if (animatable instanceof ayu) {
                    ((ayu) animatable).b = SnapAnimatedImageView.this.d;
                }
            }

            public final void b(String str, Throwable th) {
                aVar.a(th);
            }
        };
    }

    public final void a(jvy.b bVar) {
        this.h = (jvy.b) Preconditions.checkNotNull(bVar);
    }

    public final void b() {
        super.b();
        if (super.a() instanceof azk) {
            ((azk) super.a()).g();
        }
    }

    public final boolean c() {
        axr a = super.a();
        if (a != null) {
            Animatable e = a.e();
            if (e != null) {
                if (e.isRunning()) {
                    e.stop();
                }
                return true;
            }
        }
        return false;
    }

    public final void setImageMatrix(Matrix matrix) {
        throw new UnsupportedOperationException("Please use request options");
    }

    public final void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("Please use setImageUri(Uri, UiPage)");
    }
}
