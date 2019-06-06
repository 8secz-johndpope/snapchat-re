package com.snap.stickers.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.BackInterceptableEditText;
import com.snapchat.android.R;
import defpackage.abuc;
import defpackage.abuc.b;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.akgb;
import java.util.ArrayList;
import java.util.Locale;

public final class StickerSearchTextView extends BackInterceptableEditText {
    private defpackage.abuc.a a;

    public static final class a implements defpackage.abuc.a {
        private /* synthetic */ StickerSearchTextView a;

        a(StickerSearchTextView stickerSearchTextView) {
            this.a = stickerSearchTextView;
        }

        public final void a(CharSequence charSequence) {
            akcr.b(charSequence, "charSequence");
            this.a.setHint(charSequence);
        }

        public final boolean a() {
            return this.a.isAttachedToWindow();
        }

        public final void b() {
            this.a.invalidate();
        }
    }

    public StickerSearchTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StickerSearchTextView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        Object resources = getResources();
        this.a = new a(this);
        Object obj = Locale.getDefault();
        akcr.a(obj, "Locale.getDefault()");
        int a = akgb.a("en", obj.getLanguage(), true) ^ 1;
        akcr.a(resources, "res");
        if (a != 0) {
            str = "%s";
        } else {
            str = resources.getString(R.string.scrolling_search_hint);
            akcr.a((Object) str, "res.getString(R.string.scrolling_search_hint)");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("");
        arrayList.add(resources.getString(a != 0 ? R.string.scrolling_full_search_giphy : R.string.scrolling_search_giphy));
        arrayList.add(resources.getString(a != 0 ? R.string.scrolling_full_search_bitmoji : R.string.scrolling_search_bitmoji));
        arrayList.add(resources.getString(a != 0 ? R.string.scrolling_full_search_stickers : R.string.scrolling_search_stickers));
        defpackage.abuc.a aVar = this.a;
        if (aVar == null) {
            akcr.a("scrollingTextAdapter");
        }
        b a2 = abuc.a(aVar);
        Object[] toArray = arrayList.toArray(new String[0]);
        if (toArray != null) {
            a2.a(str, (String[]) toArray);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
