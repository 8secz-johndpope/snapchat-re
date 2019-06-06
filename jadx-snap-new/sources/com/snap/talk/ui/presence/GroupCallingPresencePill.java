package com.snap.talk.ui.presence;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import defpackage.abiy;
import defpackage.abjv;
import defpackage.abry;
import defpackage.abrz;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.zdg;
import defpackage.zdh;
import defpackage.zdk;
import defpackage.zdl;
import defpackage.zdz;

public final class GroupCallingPresencePill extends zdh {
    final Typeface a;

    public static final class a extends zdg {
        private /* synthetic */ GroupCallingPresencePill z;

        a(GroupCallingPresencePill groupCallingPresencePill, Context context, defpackage.zdz.a aVar) {
            this.z = groupCallingPresencePill;
            super(context, aVar);
        }

        public final /* synthetic */ zdl a(Context context, defpackage.zdz.a aVar) {
            akcr.b(context, "context");
            akcr.b(aVar, "pillView");
            Object obj = this.z.a;
            akcr.a(obj, "presencePillFont");
            return new zdk(context, aVar, obj);
        }

        public final boolean b() {
            abiy m = this.z.m();
            return m != null ? m.g() : false;
        }
    }

    public /* synthetic */ GroupCallingPresencePill(Context context) {
        this(context, null);
    }

    public GroupCallingPresencePill(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Object obj = abry.a;
        akcr.a(obj, "ScTypeface.AVENIR_NEXT");
        this.a = abrz.a(context, obj.a());
    }

    public final String a(abjv abjv) {
        akcr.b(abjv, "user");
        Object b = abjv.b();
        akcr.a(b, "user.displayName");
        if (b != null) {
            b = b.toUpperCase();
            akcr.a(b, "(this as java.lang.String).toUpperCase()");
            return b;
        }
        throw new ajxt("null cannot be cast to non-null type java.lang.String");
    }

    public final /* synthetic */ zdz a() {
        Object context = getContext();
        akcr.a(context, "context");
        return new a(this, context, this);
    }
}
