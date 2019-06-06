package com.snap.lenses.camera.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.mga;
import defpackage.mgb;
import defpackage.mgc;
import defpackage.mgd;
import defpackage.mgk;
import defpackage.mgl;
import org.opencv.imgproc.Imgproc;

public final class DefaultTextInputView extends EditText implements mgk {
    boolean a;
    boolean b;
    public a c;
    private final ajxe d;
    private final ajxe e;

    public interface a {
        void a(defpackage.mgk.a aVar);
    }

    static final class c extends akcs implements akbk<InputMethodManager> {
        private /* synthetic */ DefaultTextInputView a;

        c(DefaultTextInputView defaultTextInputView) {
            this.a = defaultTextInputView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.getContext().getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    static final class b extends akcs implements akbk<ajdp<defpackage.mgk.a>> {
        private /* synthetic */ DefaultTextInputView a;

        b(DefaultTextInputView defaultTextInputView) {
            this.a = defaultTextInputView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(new mgl(this.a)).a();
        }
    }

    /* renamed from: com.snap.lenses.camera.textinput.DefaultTextInputView$1 */
    static final class AnonymousClass1 implements OnEditorActionListener {
        private /* synthetic */ DefaultTextInputView a;

        AnonymousClass1(DefaultTextInputView defaultTextInputView) {
            this.a = defaultTextInputView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getAction() == 0) {
                DefaultTextInputView defaultTextInputView = this.a;
                String obj = defaultTextInputView.getText().toString();
                int selectionStart = defaultTextInputView.getSelectionStart();
                int selectionEnd = defaultTextInputView.getSelectionEnd();
                if (defaultTextInputView.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    String str = "null cannot be cast to non-null type java.lang.String";
                    if (obj != null) {
                        Object substring = obj.substring(0, selectionStart);
                        akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        stringBuilder.append(substring);
                        stringBuilder.append("\n");
                        if (obj != null) {
                            Object substring2 = obj.substring(selectionEnd);
                            akcr.a(substring2, "(this as java.lang.String).substring(startIndex)");
                            stringBuilder.append(substring2);
                            obj = stringBuilder.toString();
                            selectionStart++;
                            defaultTextInputView.b = false;
                            defaultTextInputView.setText(obj);
                            defaultTextInputView.setSelection(selectionStart, selectionStart);
                            defaultTextInputView.b = true;
                            selectionEnd = selectionStart;
                        } else {
                            throw new ajxt(str);
                        }
                    }
                    throw new ajxt(str);
                }
                defaultTextInputView.a(obj, selectionStart, selectionEnd, true);
                if (!defaultTextInputView.a) {
                    defaultTextInputView.b();
                }
            }
            return true;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DefaultTextInputView.class), "inputMethodManager", "getInputMethodManager()Landroid/view/inputmethod/InputMethodManager;"), new akdc(akde.a(DefaultTextInputView.class), aqd.a, "getEvents()Lio/reactivex/Observable;")};
    }

    public DefaultTextInputView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultTextInputView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.d = ajxh.a(new c(this));
        this.a = true;
        this.e = ajxh.a(new b(this));
        setOnEditorActionListener(new AnonymousClass1(this));
    }

    private final InputMethodManager c() {
        return (InputMethodManager) this.d.b();
    }

    public final ajdp<defpackage.mgk.a> a() {
        return (ajdp) this.e.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, int i, int i2, boolean z) {
        if (this.b) {
            boolean z2 = !z || this.a;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(new defpackage.mgk.a.b(str, i, i2, z, z2));
            }
        }
    }

    /* renamed from: a */
    public final void accept(defpackage.mgk.b bVar) {
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        if (bVar instanceof defpackage.mgk.b.b) {
            int i;
            boolean z = false;
            this.b = false;
            defpackage.mgk.b.b bVar2 = (defpackage.mgk.b.b) bVar;
            setText(bVar2.a);
            setSelection(bVar2.b, bVar2.c);
            switch (mgb.b[bVar2.e.ordinal()]) {
                case 1:
                    i = 6;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 0;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                    i = 4;
                    break;
                default:
                    throw new ajxk();
            }
            setImeOptions(i);
            if (bVar2.e == mgd.Return && (bVar2.d == mgc.Text || bVar2.d == mgc.Url)) {
                z = true;
            }
            this.a = z;
            setInputType(this.a ? mga.a(bVar2.d) | Imgproc.FLOODFILL_MASK_ONLY : mga.a(bVar2.d));
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.b = true;
            requestFocus();
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(new defpackage.mgk.a.a(true));
            }
        } else if (bVar instanceof defpackage.mgk.b.a) {
            b();
        } else {
            if (bVar instanceof defpackage.mgk.b.c) {
                defpackage.mgk.b.c cVar = (defpackage.mgk.b.c) bVar;
                setSelection(cVar.a, cVar.b);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b = false;
        getText().clear();
        setFocusable(false);
        clearFocus();
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(new defpackage.mgk.a.a(false));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            c().showSoftInput(this, 1);
        } else {
            c().hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent != null && i == 4 && keyEvent.getAction() == 1) {
            b();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (charSequence != null) {
            a(charSequence.toString(), getSelectionStart(), getSelectionEnd(), false);
        }
    }

    public final void setSelection(int i, int i2) {
        if (i > i2) {
            i2 = i;
        }
        int length = getText().length();
        if (i < 0 || r3 < 0 || i > length || r3 > length) {
            i = length;
            i2 = i;
        }
        super.setSelection(i, i2);
    }
}
