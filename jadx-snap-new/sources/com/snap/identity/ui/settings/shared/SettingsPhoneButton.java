package com.snap.identity.ui.settings.shared;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.SnapFontTextView;
import com.snap.ui.view.StatefulView;
import com.snap.ui.view.button.ScButton;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.akcr;
import defpackage.akrz;

public final class SettingsPhoneButton extends StatefulView {
    private final String a;
    private akrz b;
    private final ajxe<ScButton> c;
    private final ajxe<ScButton> d;
    private final ajxe<ScButton> e;
    private final ajxe<ScButton> f;
    private final ajxe<ScButton> g;
    private final ajxe<ScButton> h;

    public static final class a {
        public final int a;
        final akrz b;

        private /* synthetic */ a() {
            Object obj = akrz.a;
            akcr.a(obj, "Seconds.ZERO");
            this(0, obj);
        }

        public a(int i, akrz akrz) {
            akcr.b(akrz, "countdownSecondsRemaining");
            this.a = i;
            this.b = akrz;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) == null || !akcr.a(this.b, aVar.b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a * 31;
            akrz akrz = this.b;
            return i + (akrz != null ? akrz.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ButtonState(state=");
            stringBuilder.append(this.a);
            stringBuilder.append(", countdownSecondsRemaining=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        b bVar = new b();
    }

    public SettingsPhoneButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.a = context.getString(R.string.phone_verification_verify_code_button_retry);
        Object obj = akrz.a;
        akcr.a(obj, "Seconds.ZERO");
        this.b = obj;
        Builder backgroundColors = new Builder().backgroundColors(context.getResources().getColor(R.color.regular_green), Integer.valueOf(context.getResources().getColor(R.color.dark_green)));
        Object string = context.getString(R.string.settings_mobile_number_verify);
        String str = "context.getString(R.stri…ngs_mobile_number_verify)";
        akcr.a(string, str);
        this.c = backgroundColors.text(string).rectangular().buildLazy(context);
        this.d = new Builder().backgroundColors(context.getResources().getColor(R.color.dark_grey), null).disabled().spinner().rectangular().buildLazy(context);
        backgroundColors = new Builder().backgroundColors(context.getResources().getColor(R.color.dark_grey), null);
        Object string2 = context.getString(R.string.settings_mobile_number_verify);
        akcr.a(string2, str);
        this.e = backgroundColors.text(string2).disabled().rectangular().buildLazy(context);
        backgroundColors = new Builder().backgroundColors(context.getResources().getColor(R.color.dark_grey), null);
        string2 = context.getString(R.string.phone_verification_verify_code_button_retry);
        String str2 = "context.getString(R.stri…verify_code_button_retry)";
        akcr.a(string2, str2);
        this.f = backgroundColors.text(string2).disabled().rectangular().buildLazy(context);
        backgroundColors = new Builder().backgroundColors(context.getResources().getColor(R.color.dark_grey), null);
        string2 = context.getString(R.string.phone_verification_verify_code_button_retry);
        akcr.a(string2, str2);
        this.g = backgroundColors.text(string2).disabled().rectangular().buildLazy(context);
        backgroundColors = new Builder().backgroundColors(context.getResources().getColor(R.color.regular_green), null);
        Object string3 = context.getString(R.string.phone_verification_verify_code_button_retry);
        akcr.a(string3, str2);
        this.h = backgroundColors.text(string3).rectangular().buildLazy(context);
        addState(1, this.c);
        addState(2, this.d);
        addState(0, this.e);
        addState(4, this.f);
        addState(5, this.g);
        addState(6, this.h);
    }

    public final void a(a aVar) {
        akcr.b(aVar, "buttonState");
        if (aVar.a == 4 && (akcr.a(aVar.b, this.b) ^ 1) != 0) {
            SnapFontTextView textView = ((ScButton) this.f.b()).getTextView();
            akrz akrz = aVar.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(" ");
            stringBuilder.append(String.valueOf(akrz.c()));
            textView.setText(stringBuilder.toString());
        }
        super.setState(aVar.a);
    }
}
