package com.snapchat.android.framework.ui.views;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.common.util.concurrent.AtomicDouble;
import defpackage.abmr;
import defpackage.abuw;

public class ScWebView extends WebView {
    private static final String a;
    private static final String c;
    public final AtomicDouble b = new AtomicDouble();

    static {
        StringBuilder stringBuilder = new StringBuilder("; Android ");
        stringBuilder.append(VERSION.RELEASE);
        String str = "#";
        stringBuilder.append(str);
        stringBuilder.append(VERSION.INCREMENTAL);
        stringBuilder.append(str);
        stringBuilder.append(VERSION.SDK_INT);
        a = stringBuilder.toString();
        stringBuilder = new StringBuilder(" (");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(a);
        stringBuilder.append("; gzip)");
        c = stringBuilder.toString();
    }

    public ScWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode() && abuw.a) {
            abuw.a = false;
            if (VERSION.SDK_INT >= 21) {
                WebView.enableSlowWholeDocumentDraw();
            }
        }
        b();
        String packageName = context.getPackageName();
        if (packageName.startsWith("com.snapchat.") || packageName.startsWith("com.snap.")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                WebSettings settings = getSettings();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getSettings().getUserAgentString());
                stringBuilder.append(" Snapchat/");
                stringBuilder.append(packageInfo.versionName);
                stringBuilder.append(c);
                settings.setUserAgentString(stringBuilder.toString());
            } catch (NameNotFoundException unused) {
            }
        }
    }

    public final int a() {
        double contentHeight = (double) getContentHeight();
        double d = this.b.get();
        Double.isNaN(contentHeight);
        return (int) (contentHeight * d);
    }

    public final void b() {
        this.b.set((double) getResources().getDisplayMetrics().density);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        abmr.a();
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
