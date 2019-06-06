package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.snap.ui.view.ObscurableView;
import com.snap.ui.view.SnapFontTextView;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akly;
import defpackage.gqt;
import defpackage.idd;
import defpackage.pql;
import defpackage.qgx;
import defpackage.zke;
import java.util.Arrays;

public final class ChatTextItemView extends SnapFontTextView implements ObscurableView<CharSequence> {
    public ClickableSpan[] b;
    private zke c;
    private final ajxe d = ajxh.a(a.a);

    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return pql.j.callsite("ChatTextItemView");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ChatTextItemView.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public ChatTextItemView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    private final ClickableSpan[] a(MotionEvent motionEvent, Spannable spannable) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        int lineForVertical = layout.getLineForVertical(y);
        try {
            y = layout.getOffsetForHorizontal(lineForVertical, (float) x);
            return (ClickableSpan[]) spannable.getSpans(y, y, ClickableSpan.class);
        } catch (IndexOutOfBoundsException e) {
            StringBuilder stringBuilder = new StringBuilder("IndexOutOfBoundsException when getting offset for spans {x=");
            stringBuilder.append(x);
            stringBuilder.append(", y=");
            stringBuilder.append(y);
            stringBuilder.append(", line=");
            stringBuilder.append(lineForVertical);
            stringBuilder.append("}.");
            String stringBuilder2 = stringBuilder.toString();
            zke zke = this.c;
            if (zke != null) {
                zke.a(new qgx(gqt.NORMAL, stringBuilder2, e, (idd) this.d.b()));
            }
            return null;
        }
    }

    public final void a(zke zke) {
        akcr.b(zke, "eventDispatcher");
        this.c = zke;
    }

    public final ClickableSpan[] a() {
        ClickableSpan[] clickableSpanArr = this.b;
        if (clickableSpanArr == null) {
            return null;
        }
        Object copyOf = Arrays.copyOf(clickableSpanArr, clickableSpanArr.length);
        akcr.a(copyOf, "java.util.Arrays.copyOf(this, size)");
        return (ClickableSpan[]) copyOf;
    }

    public final /* synthetic */ Object obscureView() {
        Object text = getText();
        setText(akly.a('X', text.length()));
        akcr.a(text, "currentContent");
        return text;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        if (getText() instanceof Spannable) {
            CharSequence text = getText();
            if (text != null) {
                Spannable spannable = (Spannable) text;
                if (motionEvent.getAction() == 0) {
                    this.b = a(motionEvent, spannable);
                    Selection.removeSelection(spannable);
                }
            } else {
                throw new ajxt("null cannot be cast to non-null type android.text.Spannable");
            }
        }
        return false;
    }

    public final /* synthetic */ void unobscureView(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        akcr.b(charSequence, "previous");
        setText(charSequence);
    }
}
