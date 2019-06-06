package com.snap.composer.attributes.impl;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.views.ComposerEditText;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import org.opencv.imgproc.Imgproc;

public final class EditTextAttributesBinder implements AttributesBinder<ComposerEditText> {
    private final ajxe a = ajxh.a(new b(this));
    private final ajxe b = ajxh.a(new c(this));
    private final Context c;
    private final TextViewAttributesBinder d;

    static final class a implements OnEditorActionListener {
        private /* synthetic */ ComposerAction a;

        a(ComposerAction composerAction) {
            this.a = composerAction;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.a.perform(new Object[0]);
            return true;
        }
    }

    static final class b extends akcs implements akbk<InputMethodManager> {
        private /* synthetic */ EditTextAttributesBinder a;

        b(EditTextAttributesBinder editTextAttributesBinder) {
            this.a = editTextAttributesBinder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.c.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        }
    }

    static final class c extends akcs implements akbk<ComposerEditText> {
        private /* synthetic */ EditTextAttributesBinder a;

        c(EditTextAttributesBinder editTextAttributesBinder) {
            this.a = editTextAttributesBinder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ComposerEditText(this.a.c);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(EditTextAttributesBinder.class), "inputManager", "getInputManager()Landroid/view/inputmethod/InputMethodManager;"), new akdc(akde.a(EditTextAttributesBinder.class), "placeholderView", "getPlaceholderView()Lcom/snap/composer/views/ComposerEditText;")};
    }

    public EditTextAttributesBinder(Context context, TextViewAttributesBinder textViewAttributesBinder) {
        akcr.b(context, "context");
        akcr.b(textViewAttributesBinder, "textViewAttributesBinder");
        this.c = context;
        this.d = textViewAttributesBinder;
    }

    private final InputMethodManager a() {
        return (InputMethodManager) this.a.b();
    }

    private final void a(ComposerEditText composerEditText) {
        if (composerEditText.hasFocus()) {
            composerEditText.clearFocus();
            InputMethodManager a = a();
            if (a != null) {
                a.hideSoftInputFromWindow(composerEditText.getWindowToken(), 0);
            }
        }
    }

    public static final /* synthetic */ void access$applyClosesWhenReturnKeyPressed(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, boolean z, ComposerAnimator composerAnimator) {
    }

    public static final /* synthetic */ void access$applyEnabled(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, boolean z, ComposerAnimator composerAnimator) {
        composerEditText.setFocusable(z);
        composerEditText.setFocusableInTouchMode(z);
    }

    public static final /* synthetic */ void access$applyFocus(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, boolean z, ComposerAnimator composerAnimator) {
        if (z) {
            if (!composerEditText.hasFocus()) {
                composerEditText.requestFocus();
                composerEditText.setFocusableInTouchMode(true);
            }
            InputMethodManager a = editTextAttributesBinder.a();
            if (a != null) {
                a.showSoftInput(composerEditText, 0);
            }
            return;
        }
        editTextAttributesBinder.a(composerEditText);
    }

    public static final /* synthetic */ void access$applyNumberOfLines(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, int i, ComposerAnimator composerAnimator) {
        composerEditText.setInputType(i > 1 ? composerEditText.getInputType() | Imgproc.FLOODFILL_MASK_ONLY : composerEditText.getInputType() & -131073);
        editTextAttributesBinder.d.applyNumberOfLines(composerEditText, i, composerAnimator);
    }

    public static final /* synthetic */ void access$applyReturnKeyText(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, String str, ComposerAnimator composerAnimator) {
    }

    public static final /* synthetic */ void access$resetClosesWhenReturnKeyPressed(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, ComposerAnimator composerAnimator) {
    }

    public static final /* synthetic */ void access$resetEnabled(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, ComposerAnimator composerAnimator) {
        composerEditText.setFocusable(true);
        composerEditText.setFocusableInTouchMode(true);
    }

    public static final /* synthetic */ void access$resetNumberOfLines(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, ComposerAnimator composerAnimator) {
        composerEditText.setInputType(composerEditText.getInputType() & -131073);
        editTextAttributesBinder.d.resetNumberOfLines(composerEditText, composerAnimator);
    }

    public static final /* synthetic */ void access$resetReturnKeyText(EditTextAttributesBinder editTextAttributesBinder, ComposerEditText composerEditText, ComposerAnimator composerAnimator) {
    }

    public final void bindAttributes(AttributesBindingContext<ComposerEditText> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
        attributesBindingContext.getBindingContext().bindStringAttribute("placeholder", true, new EditTextAttributesBinder$bindAttributes$$inlined$bindStringAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("focused", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("enabled", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindUntypedAttribute("onChange", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindActionAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindUntypedAttribute("onDone", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindActionAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("horizontalScroll", true, new EditTextAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$3(this, this));
        attributesBindingContext.getBindingContext().bindIntAttribute("numberOfLines", true, new EditTextAttributesBinder$bindAttributes$$inlined$bindIntAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindStringAttribute("textValue", true, new EditTextAttributesBinder$bindAttributes$$inlined$bindStringAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindIntAttribute("characterLimit", true, new EditTextAttributesBinder$bindAttributes$$inlined$bindIntAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("closesWhenReturnKeyPressed", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$4(this, this));
        attributesBindingContext.getBindingContext().bindStringAttribute("returnKeyText", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindStringAttribute$3(this, this));
        attributesBindingContext.getBindingContext().bindStringAttribute("immutablePrefix", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindStringAttribute$4(this, this));
        attributesBindingContext.getBindingContext().bindColorAttribute("placeholderColor", false, new EditTextAttributesBinder$bindAttributes$$inlined$bindColorAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("ignoreNewlines", true, new EditTextAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$5(this, this));
    }

    public final ComposerEditText getMeasurerPlaceholderView() {
        return (ComposerEditText) this.b.b();
    }

    public final Class<ComposerEditText> getViewClass() {
        return ComposerEditText.class;
    }
}
