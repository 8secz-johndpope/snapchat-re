package com.snap.messaging.chat.features.input;

import android.content.Context;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.style.SuggestionSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView.BufferType;
import com.snap.ui.view.SnapFontEditText;
import defpackage.aesf;
import defpackage.ajwo;
import defpackage.akcr;
import defpackage.fn;
import defpackage.fo;
import defpackage.fp;
import defpackage.ii;
import defpackage.odm;
import defpackage.qan;

public final class InputBarEditText extends SnapFontEditText {
    public final ajwo<odm> a;

    final class a implements SpanWatcher {
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if ((obj instanceof UnderlineSpan) || (obj instanceof SuggestionSpan) || (obj instanceof ForegroundColorSpan)) {
                InputBarEditText.this.getEditableText().removeSpan(obj);
            }
        }

        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        }

        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        }
    }

    static final class b implements defpackage.fo.a {
        private /* synthetic */ InputBarEditText a;

        b(InputBarEditText inputBarEditText) {
            this.a = inputBarEditText;
        }

        public final boolean a(fp fpVar, int i) {
            if (ii.a() && (i & fo.a) != 0) {
                try {
                    fpVar.c();
                } catch (Exception unused) {
                    return false;
                }
            }
            akcr.a((Object) fpVar, "inputContentInfo");
            Object b = fpVar.b();
            akcr.a(b, "inputContentInfo.description");
            aesf aesf = b.hasMimeType(qan.a) ? aesf.GIF : b.hasMimeType(qan.b) ? aesf.IMAGE : aesf.UNRECOGNIZED_VALUE;
            if (aesf == aesf.UNRECOGNIZED_VALUE) {
                return false;
            }
            this.a.a.a(new odm(fpVar, aesf, System.currentTimeMillis()));
            return true;
        }
    }

    public InputBarEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private InputBarEditText(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<ExternalKeyboardImage>()");
        this.a = ajwo;
        setInputType(49153);
        setHorizontallyScrolling(false);
        setMaxLines(5);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (editorInfo == null) {
            akcr.a();
        }
        fn.a(editorInfo, qan.c);
        Object a = fo.a(onCreateInputConnection, editorInfo, (defpackage.fo.a) new b(this));
        akcr.a(a, "InputConnectionCompat.cr…e\n            }\n        }");
        return a;
    }

    public final void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        Editable editableText = getEditableText();
        for (Object removeSpan : (a[]) editableText.getSpans(0, editableText.length(), a.class)) {
            editableText.removeSpan(removeSpan);
        }
        editableText.setSpan(new a(), 0, editableText.length(), 6553618);
    }
}
