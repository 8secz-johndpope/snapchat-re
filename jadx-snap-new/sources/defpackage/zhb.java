package defpackage;

import android.view.KeyEvent;
import android.view.KeyEvent.Callback;

/* renamed from: zhb */
public class zhb extends zhc<Callback> implements Callback {
    private String b;

    /* renamed from: zhb$a */
    public static class a implements Callback {
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            return false;
        }

        public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
            return false;
        }

        public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
            return false;
        }

        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            return false;
        }
    }

    private void a(Callback callback) {
        String name = callback.getClass().getName();
        if (!name.equals(this.b)) {
            this.b = name;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (Callback callback : this.a) {
            if (callback.onKeyDown(i, keyEvent)) {
                a(callback);
                return true;
            }
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        for (Callback callback : this.a) {
            if (callback.onKeyLongPress(i, keyEvent)) {
                a(callback);
                return true;
            }
        }
        return false;
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        for (Callback callback : this.a) {
            if (callback.onKeyMultiple(i, i2, keyEvent)) {
                a(callback);
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        for (Callback callback : this.a) {
            if (callback.onKeyUp(i, keyEvent)) {
                a(callback);
                return true;
            }
        }
        return false;
    }
}
