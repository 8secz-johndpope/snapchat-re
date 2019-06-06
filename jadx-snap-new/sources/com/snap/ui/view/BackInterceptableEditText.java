package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;

public class BackInterceptableEditText extends SnapFontEditText {
    private InputMethodManager mInputMethodManager;
    private WeakReference<OnBackPressedListener> mOnBackPressedListenerWkRef;

    public interface OnBackPressedListener {
        void onBackPressedOnSoftKeyboard();
    }

    public BackInterceptableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BackInterceptableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
    }

    public void onEditorAction(int i) {
        super.onEditorAction(i);
        if (i == 3) {
            this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 4) {
            WeakReference weakReference = this.mOnBackPressedListenerWkRef;
            if (weakReference != null) {
                OnBackPressedListener onBackPressedListener = (OnBackPressedListener) weakReference.get();
                if (onBackPressedListener != null) {
                    onBackPressedListener.onBackPressedOnSoftKeyboard();
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setOnBackPressedListenerWeakRef(OnBackPressedListener onBackPressedListener) {
        this.mOnBackPressedListenerWkRef = new WeakReference(onBackPressedListener);
    }
}
