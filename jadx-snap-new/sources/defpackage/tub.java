package defpackage;

import android.view.View;
import android.widget.TextView;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;
import defpackage.abry.a;

/* renamed from: tub */
public final class tub extends zly<tqj, tuh> {
    private TextView a;
    private TextView b;

    /* renamed from: tub$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((tqj) zlx, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.streak_view_text_field_count);
        akcr.a(findViewById, "itemView.findViewById(R.…ak_view_text_field_count)");
        this.a = (TextView) findViewById;
        findViewById = view.findViewById(R.id.streak_view_text_field_fire);
        akcr.a(findViewById, "itemView.findViewById(R.…eak_view_text_field_fire)");
        this.b = (TextView) findViewById;
        TextView textView = this.a;
        if (textView == null) {
            akcr.a("streakTextViewCount");
        }
        textView.setTypeface(abrz.a(view.getContext(), a.ALTERNATE_GOT_NO3D));
        textView = this.b;
        String str = "streakTextViewFire";
        if (textView == null) {
            akcr.a(str);
        }
        textView.setTypeface(abrz.a(view.getContext(), a.ALTERNATE_GOT_NO3D));
        textView = this.b;
        if (textView == null) {
            akcr.a(str);
        }
        Object toChars = Character.toChars(128293);
        akcr.a(toChars, "Character.toChars(0x1F525)");
        textView.setText(new String(toChars));
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        tuh tuh = (tuh) zmy;
        akcr.b(tuh, MapboxEvent.KEY_MODEL);
        TextView textView = this.a;
        if (textView == null) {
            akcr.a("streakTextViewCount");
        }
        textView.setText(String.valueOf(tuh.a));
    }
}
