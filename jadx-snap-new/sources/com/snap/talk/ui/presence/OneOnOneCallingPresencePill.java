package com.snap.talk.ui.presence;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.abjv;
import defpackage.akcr;
import defpackage.zdf;
import defpackage.zdg;
import defpackage.zdh;
import defpackage.zdl;
import defpackage.zdm;
import defpackage.zdz;

public final class OneOnOneCallingPresencePill extends zdh {

    public static final class a extends zdg {
        private /* synthetic */ OneOnOneCallingPresencePill z;

        a(OneOnOneCallingPresencePill oneOnOneCallingPresencePill, Context context, defpackage.zdz.a aVar) {
            this.z = oneOnOneCallingPresencePill;
            super(context, aVar);
        }

        public final /* synthetic */ zdl a(Context context, defpackage.zdz.a aVar) {
            akcr.b(context, "context");
            akcr.b(aVar, "pillView");
            return new zdf(context, aVar);
        }

        public final boolean b() {
            return this.z.m() != null;
        }
    }

    public /* synthetic */ OneOnOneCallingPresencePill(Context context) {
        this(context, null);
    }

    public OneOnOneCallingPresencePill(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    public final String a(abjv abjv) {
        akcr.b(abjv, "user");
        StringBuilder stringBuilder = new StringBuilder("PresencePill{username='");
        stringBuilder.append(abjv.a());
        stringBuilder.append("', displayName='");
        stringBuilder.append(abjv.b());
        stringBuilder.append("', isPresent=");
        stringBuilder.append(((zdm) this.d).d());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final /* synthetic */ zdz a() {
        Object context = getContext();
        akcr.a(context, "context");
        return new a(this, context, this);
    }
}
