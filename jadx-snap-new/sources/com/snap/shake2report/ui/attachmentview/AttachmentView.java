package com.snap.shake2report.ui.attachmentview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.TableLayout;
import defpackage.akcr;
import defpackage.fz;
import defpackage.wvy;
import defpackage.wwm;

public final class AttachmentView extends TableLayout {

    public static final class a implements wvy {
        private final ViewPager a;
        private final fz b;
        private /* synthetic */ ViewPager c;
        private /* synthetic */ wwm d;

        public a(ViewPager viewPager, wwm wwm) {
            this.c = viewPager;
            this.d = wwm;
            this.a = viewPager;
            this.b = wwm.l();
        }

        public final ViewPager a() {
            return this.a;
        }

        public final fz b() {
            return this.b;
        }
    }

    public AttachmentView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }
}
