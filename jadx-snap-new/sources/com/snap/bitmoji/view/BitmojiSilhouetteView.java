package com.snap.bitmoji.view;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import com.snap.imageloading.view.SnapImageView;
import defpackage.dee;
import defpackage.idl;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.jxj.a;

public class BitmojiSilhouetteView extends SnapImageView {
    protected boolean a = true;
    boolean b;
    private final dee e;

    public BitmojiSilhouetteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new dee(context, null);
        setRequestListener(new a() {
            public final void onFailure(jwl jwl) {
                BitmojiSilhouetteView bitmojiSilhouetteView = BitmojiSilhouetteView.this;
                bitmojiSilhouetteView.a = true;
                bitmojiSilhouetteView.b = false;
                bitmojiSilhouetteView.invalidate();
            }

            public final void onImageReady(jwv jwv) {
                BitmojiSilhouetteView bitmojiSilhouetteView = BitmojiSilhouetteView.this;
                bitmojiSilhouetteView.a = false;
                bitmojiSilhouetteView.b = true;
                bitmojiSilhouetteView.invalidate();
            }
        });
    }

    public final void a() {
        a(null, null);
    }

    public final void a(Uri uri, idl idl) {
        a(null, uri, null, idl);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    public final void a(java.lang.String r4, android.net.Uri r5, java.lang.Integer r6, defpackage.idl r7) {
        /*
        r3 = this;
        r0 = "teamsnapchat";
        r0 = android.text.TextUtils.equals(r4, r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0009:
        r3.clear();
        r3.a = r1;
        r4 = 2131232661; // 0x7f080795 float:1.8081438E38 double:1.052968841E-314;
        r3.setImageResource(r4);
        return;
    L_0x0015:
        if (r6 == 0) goto L_0x0020;
    L_0x0017:
        r0 = r3.e;
        r6 = r6.intValue();
        r0.a = r6;
        goto L_0x0025;
    L_0x0020:
        r6 = r3.e;
        r6.a(r4);
    L_0x0025:
        r6 = "customize_icon";
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x002f;
    L_0x002d:
        r3.a = r1;
    L_0x002f:
        r6 = 1;
        if (r5 != 0) goto L_0x0046;
    L_0x0032:
        r3.a = r6;
        r3.clear();
        r4 = r3.getResources();
        r5 = 17170445; // 0x106000d float:2.461195E-38 double:8.483327E-317;
        r4 = r4.getColor(r5);
        r3.setBackgroundColor(r4);
        goto L_0x009d;
    L_0x0046:
        r0 = r3.getImageUri();
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0057;
    L_0x0050:
        r0 = r3.b;
        if (r0 == 0) goto L_0x0057;
    L_0x0054:
        r3.a = r1;
        goto L_0x009d;
    L_0x0057:
        r3.b = r1;
        r0 = r3.getImageUri();
        if (r0 == 0) goto L_0x0071;
    L_0x005f:
        r0 = defpackage.dds.a(r0);
        if (r0 == 0) goto L_0x0071;
    L_0x0065:
        r2 = defpackage.dds.a(r5);
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0071;
    L_0x006f:
        r0 = 1;
        goto L_0x0072;
    L_0x0071:
        r0 = 0;
    L_0x0072:
        if (r0 == 0) goto L_0x0087;
    L_0x0074:
        r3.a = r1;
        r4 = r3.getRequestOptions();
        r4 = r4.a();
        r4 = r4.f(r6);
    L_0x0082:
        r4 = r4.b();
        goto L_0x0097;
    L_0x0087:
        r4 = r4 ^ r6;
        r3.a = r4;
        r4 = r3.getRequestOptions();
        r4 = r4.a();
        r4 = r4.f(r1);
        goto L_0x0082;
    L_0x0097:
        r3.setRequestOptions(r4);
        r3.setImageUri(r5, r7);
    L_0x009d:
        r3.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.bitmoji.view.BitmojiSilhouetteView.a(java.lang.String, android.net.Uri, java.lang.Integer, idl):void");
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a) {
            this.e.a(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e.a(getMeasuredWidth(), getMeasuredHeight());
    }
}
