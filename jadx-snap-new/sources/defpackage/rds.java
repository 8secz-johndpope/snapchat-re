package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;

/* renamed from: rds */
public final class rds extends zly<ral, ref> {
    private ImageView a;
    private SnapFontTextView b;
    private SnapFontTextView c;
    private SnapFontTextView d;

    /* renamed from: rds$b */
    static final class b implements OnClickListener {
        private /* synthetic */ rds a;

        b(rds rds) {
            this.a = rds;
        }

        public final void onClick(View view) {
            rds rds = this.a;
            zke eventDispatcher = rds.getEventDispatcher();
            zmy model = rds.getModel();
            if (model == null) {
                akcr.a();
            }
            eventDispatcher.a(new rca(((ref) model).c.a));
        }
    }

    /* renamed from: rds$a */
    static final class a implements OnClickListener {
        private /* synthetic */ rds a;

        a(rds rds) {
            this.a = rds;
        }

        public final void onClick(View view) {
            rds rds = this.a;
            zke eventDispatcher = rds.getEventDispatcher();
            zmy model = rds.getModel();
            if (model == null) {
                akcr.a();
            }
            eventDispatcher.a(new rbz(((ref) model).c.a));
        }
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((ral) zlx, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.dismiss_prompt_button);
        akcr.a(findViewById, "itemView.findViewById(R.id.dismiss_prompt_button)");
        this.a = (ImageView) findViewById;
        findViewById = view.findViewById(R.id.prompt_description);
        akcr.a(findViewById, "itemView.findViewById(R.id.prompt_description)");
        this.b = (SnapFontTextView) findViewById;
        findViewById = view.findViewById(R.id.prompt_icon);
        akcr.a(findViewById, "itemView.findViewById(R.id.prompt_icon)");
        this.d = (SnapFontTextView) findViewById;
        findViewById = view.findViewById(R.id.prompt_title);
        akcr.a(findViewById, "itemView.findViewById(R.id.prompt_title)");
        this.c = (SnapFontTextView) findViewById;
        ImageView imageView = this.a;
        if (imageView == null) {
            akcr.a("dismissButton");
        }
        imageView.setOnClickListener(new b(this));
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        ref ref = (ref) zmy;
        akcr.b(ref, MapboxEvent.KEY_MODEL);
        SnapFontTextView snapFontTextView = this.b;
        if (snapFontTextView == null) {
            akcr.a("promptDescription");
        }
        snapFontTextView.setText(ref.b);
        snapFontTextView = this.d;
        if (snapFontTextView == null) {
            akcr.a("promptIcon");
        }
        snapFontTextView.setText(ref.c.b);
        snapFontTextView = this.c;
        if (snapFontTextView == null) {
            akcr.a("promptTitle");
        }
        snapFontTextView.setText(ref.a);
        getItemView().setOnClickListener(new a(this));
        getEventDispatcher().a(new rby(ref.c.a));
    }
}
