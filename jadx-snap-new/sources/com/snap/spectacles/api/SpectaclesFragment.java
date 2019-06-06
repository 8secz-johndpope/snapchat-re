package com.snap.spectacles.api;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.snap.ui.deck.MainPageFragment;
import defpackage.aipx;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.zjj;
import defpackage.zjq;
import defpackage.zkq;

public abstract class SpectaclesFragment extends MainPageFragment implements zjj, zjq {
    public zkq c;
    public final ajei d = new ajei();

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = rect.top;
                marginLayoutParams.bottomMargin = rect.bottom;
                this.a.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public long S_() {
        return -1;
    }

    public final zkq b() {
        zkq zkq = this.c;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        return zkq;
    }

    public final boolean d() {
        return false;
    }

    public void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public void onDestroy() {
        super.onDestroy();
        this.d.dispose();
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        zkq zkq = this.c;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajej f = zkq.a().b(ajef.a()).f((ajfb) new a(view));
        akcr.a((Object) f, "insetsDetector.windowRec…ms = lp\n                }");
        ajvv.a(f, this.d);
    }
}
