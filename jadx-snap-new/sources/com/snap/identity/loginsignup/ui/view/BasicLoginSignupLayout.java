package com.snap.identity.loginsignup.ui.view;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snapchat.android.R;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.List;

public final class BasicLoginSignupLayout extends FrameLayout {
    private final String a;
    private final String b;
    private final AttributeSet c;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A:{Catch:{ all -> 0x0020 }} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b A:{SYNTHETIC, Splitter:B:7:0x001b} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A:{Catch:{ all -> 0x0020 }} */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    public BasicLoginSignupLayout(android.content.Context r4, android.util.AttributeSet r5) {
        /*
        r3 = this;
        r3.<init>(r4, r5);
        r3.c = r5;
        r5 = 0;
        r0 = 0;
        if (r4 == 0) goto L_0x0018;
    L_0x0009:
        r4 = r4.getTheme();
        if (r4 == 0) goto L_0x0018;
    L_0x000f:
        r1 = r3.c;
        r2 = defpackage.jar.a.a;
        r4 = r4.obtainStyledAttributes(r1, r2, r5, r5);
        goto L_0x0019;
    L_0x0018:
        r4 = r0;
    L_0x0019:
        if (r4 == 0) goto L_0x0022;
    L_0x001b:
        r5 = r4.getString(r5);	 Catch:{ all -> 0x0020 }
        goto L_0x0023;
    L_0x0020:
        r5 = move-exception;
        goto L_0x0034;
    L_0x0022:
        r5 = r0;
    L_0x0023:
        r3.a = r5;	 Catch:{ all -> 0x0020 }
        if (r4 == 0) goto L_0x002c;
    L_0x0027:
        r5 = 1;
        r0 = r4.getString(r5);	 Catch:{ all -> 0x0020 }
    L_0x002c:
        r3.b = r0;	 Catch:{ all -> 0x0020 }
        if (r4 == 0) goto L_0x0033;
    L_0x0030:
        r4.recycle();
    L_0x0033:
        return;
    L_0x0034:
        if (r4 == 0) goto L_0x0039;
    L_0x0036:
        r4.recycle();
    L_0x0039:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.view.BasicLoginSignupLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        int i;
        ProgressButton progressButton;
        super.onFinishInflate();
        Object inflate = LayoutInflater.from(getContext()).inflate(R.layout.basic_login_signup_layout, this, false);
        akcr.a(inflate, "LayoutInflater.from(cont…gnup_layout, this, false)");
        List<View> arrayList = new ArrayList();
        int childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            Object childAt = getChildAt(i);
            akcr.a(childAt, "getChildAt(i)");
            arrayList.add(i, childAt);
        }
        for (View removeView : arrayList) {
            removeView(removeView);
        }
        addView(inflate);
        inflate = inflate.findViewById(R.id.content_holder);
        akcr.a(inflate, "newChild.findViewById(R.id.content_holder)");
        ViewGroup viewGroup = (ViewGroup) inflate;
        childCount = arrayList.size();
        for (i = 0; i < childCount; i++) {
            viewGroup.addView((View) arrayList.get(i), i);
        }
        String str = "text";
        String str2 = "findViewById(R.id.continue_button)";
        if (this.a != null) {
            inflate = findViewById(R.id.continue_button);
            akcr.a(inflate, str2);
            progressButton = (ProgressButton) inflate;
            String str3 = this.a;
            akcr.b(str3, str);
            progressButton.a(0, str3);
            progressButton.a(1, str3);
            progressButton.setState(1);
            progressButton.setState(0);
        }
        if (this.b != null) {
            inflate = findViewById(R.id.continue_button);
            akcr.a(inflate, str2);
            progressButton = (ProgressButton) inflate;
            String str4 = this.b;
            akcr.b(str4, str);
            progressButton.a(2, str4);
        }
    }
}
