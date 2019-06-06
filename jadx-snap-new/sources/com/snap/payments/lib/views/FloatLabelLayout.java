package com.snap.payments.lib.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.kh;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FloatLabelLayout extends LinearLayout {
    public EditText a;
    final TextView b;
    CharSequence c;
    public c d;
    final a e;
    b f;
    private final Interpolator g;
    private List<OnFocusChangeListener> h;

    public class a extends Observable {
        public boolean a = false;
        public int b = -1;

        public final void a(boolean z) {
            FloatLabelLayout floatLabelLayout;
            Resources resources;
            int i;
            this.a = z;
            if (z) {
                floatLabelLayout = FloatLabelLayout.this;
                resources = floatLabelLayout.getResources();
                i = R.color.error_red;
            } else {
                floatLabelLayout = FloatLabelLayout.this;
                resources = floatLabelLayout.getResources();
                i = R.color.black;
            }
            floatLabelLayout.a(resources.getColor(i));
            setChanged();
            notifyObservers();
        }
    }

    public static class b extends Observable {
        public String a = "";
        public final int b;

        b(int i) {
            this.b = i;
        }

        public final void a(String str) {
            this.a = str;
            setChanged();
            notifyObservers();
        }
    }

    public interface c {
        boolean a();

        boolean a(String str);
    }

    public FloatLabelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private FloatLabelLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.tjh.a.a);
        this.c = obtainStyledAttributes.getText(0);
        this.b = (TextView) View.inflate(context, R.layout.float_label_text_view, null);
        this.b.setVisibility(8);
        this.b.setText(this.c);
        this.b.setPivotY(MapboxConstants.MINIMUM_ZOOM);
        TextView textView = this.b;
        int resourceId = obtainStyledAttributes.getResourceId(5, 11);
        if (!isInEditMode()) {
            if (VERSION.SDK_INT >= 23) {
                textView.setTextAppearance(resourceId);
            } else {
                textView.setTextAppearance(textView.getContext(), resourceId);
            }
        }
        obtainStyledAttributes.recycle();
        addView(this.b, -1, -2);
        this.g = AnimationUtils.loadInterpolator(context, VERSION.SDK_INT >= 21 ? 17563661 : 17432582);
        this.e = new a();
        setOnClickListener(new -$$Lambda$FloatLabelLayout$QqgMro1h1hdQjE78IE1ZMC_yGn0(this));
    }

    private /* synthetic */ void a(View view, boolean z) {
        a(true);
        if (!z) {
            if (c() && d()) {
                this.e.a(false);
            } else {
                this.e.a(true);
            }
        }
        List<OnFocusChangeListener> list = this.h;
        if (list != null) {
            for (OnFocusChangeListener onFocusChange : list) {
                onFocusChange.onFocusChange(view, z);
            }
        }
    }

    private void b(boolean z) {
        if (this.a != null) {
            this.b.setTextColor(getResources().getColor(R.color.dark_grey));
            if (z) {
                this.b.setVisibility(0);
                TextView textView = this.b;
                textView.setTranslationY(((float) textView.getHeight()) / 2.0f);
                float textSize = this.a.getTextSize() / this.b.getTextSize();
                this.b.setScaleX(textSize);
                this.b.setScaleY(textSize);
                kb.b(this.b).b((float) MapboxConstants.MINIMUM_ZOOM).c(1.0f).b().a(300).a(null).a(this.g).d();
            } else {
                this.b.setVisibility(0);
            }
            this.a.setHint(null);
        }
    }

    private void c(boolean z) {
        EditText editText = this.a;
        if (editText != null) {
            if (z) {
                float textSize = editText.getTextSize() / this.b.getTextSize();
                this.b.setScaleX(1.0f);
                this.b.setScaleY(1.0f);
                this.b.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                kb.b(this.b).b(((float) this.b.getHeight()) / 2.0f).a(300).c(textSize).a(new kh() {
                    public final void onAnimationEnd(View view) {
                        FloatLabelLayout.this.b.setVisibility(8);
                        FloatLabelLayout.this.a.setHint(FloatLabelLayout.this.c);
                    }
                }).a(this.g).d();
                return;
            }
            this.b.setVisibility(8);
            this.a.setHint(this.c);
        }
    }

    public final void a() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setHint(null);
            this.b.setVisibility(0);
            this.a.requestFocus();
        }
    }

    public final void a(int i) {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTextColor(i);
        }
    }

    public final void a(TextWatcher textWatcher) {
        EditText editText = this.a;
        if (editText != null) {
            editText.addTextChangedListener(textWatcher);
        }
    }

    public final void a(OnFocusChangeListener onFocusChangeListener) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(onFocusChangeListener);
    }

    public final void a(CharSequence charSequence) {
        this.c = charSequence;
        this.b.setText(charSequence);
    }

    public final void a(Observer observer) {
        this.e.addObserver(observer);
        b bVar = this.f;
        if (bVar != null) {
            bVar.addObserver(observer);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        EditText editText = this.a;
        if (editText != null) {
            int isEmpty = TextUtils.isEmpty(editText.getText()) ^ 1;
            boolean isFocused = this.a.isFocused();
            this.b.setActivated(isFocused);
            if (isEmpty != 0 || isFocused) {
                if (this.b.getVisibility() != 0) {
                    b(z);
                }
            } else if (this.b.getVisibility() == 0) {
                c(z);
            }
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (editText != null) {
                if (this.a == null) {
                    this.a = editText;
                    this.f = new b(editText.getId());
                    a(false);
                    this.a.addTextChangedListener(new TextWatcher() {
                        public final void afterTextChanged(Editable editable) {
                            a aVar;
                            FloatLabelLayout.this.f.a(editable.toString());
                            boolean z = true;
                            FloatLabelLayout.this.a(true);
                            if (!FloatLabelLayout.this.d() || FloatLabelLayout.this.c()) {
                                aVar = FloatLabelLayout.this.e;
                                z = false;
                            } else {
                                aVar = FloatLabelLayout.this.e;
                            }
                            aVar.a(z);
                        }

                        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                    this.a.setOnFocusChangeListener(new -$$Lambda$FloatLabelLayout$g6nXm5fURrP8ZZ4ThtNvYgon1W0(this));
                    if (TextUtils.isEmpty(this.c)) {
                        a(this.a.getHint());
                    }
                    if (TextUtils.isEmpty(this.a.getContentDescription())) {
                        this.a.setContentDescription(this.c);
                    }
                    this.e.b = getId();
                } else {
                    throw new IllegalArgumentException("We already have an EditText, can only have one");
                }
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        a aVar;
        boolean z;
        if (d() && c()) {
            aVar = this.e;
            z = false;
        } else {
            aVar = this.e;
            z = true;
        }
        aVar.a(z);
    }

    public final void b(CharSequence charSequence) {
        if (this.a != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                b(true);
            }
            this.a.setText(charSequence);
        }
    }

    public final boolean c() {
        EditText editText = this.a;
        if (editText != null) {
            c cVar = this.d;
            if (cVar != null) {
                editText.getText();
                if (!cVar.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d() {
        EditText editText = this.a;
        if (editText != null) {
            c cVar = this.d;
            if (!(cVar == null || cVar.a(editText.getText().toString()))) {
                return false;
            }
        }
        return true;
    }
}
