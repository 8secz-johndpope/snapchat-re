package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Joiner;
import com.snapchat.android.R;
import defpackage.siw.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: tbm */
public final class tbm {
    final Context a;
    public final LayoutInflater b;
    public final sjc c;
    public skh d;
    public siw e;
    public View f;
    public ImageView g;
    public TextView h;
    public szw i;
    private final int j;

    /* renamed from: tbm$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            tbm tbm = tbm.this;
            float height = ((float) tbm.f.getHeight()) / tbm.a((int) R.dimen.app_install_background_height);
            int a = (int) (tbm.a((int) R.dimen.app_install_icon_dimen) * (((float) tbm.f.getWidth()) / tbm.a((int) R.dimen.app_install_background_width)));
            int a2 = (int) (tbm.a((int) R.dimen.app_install_icon_dimen) * height);
            int a3 = (int) (tbm.a((int) R.dimen.app_install_icon_margin_top) * height);
            LayoutParams layoutParams = tbm.g.getLayoutParams();
            layoutParams.height = a2;
            layoutParams.width = a;
            tbm.g.setLayoutParams(layoutParams);
            tbm.g.setTop(a3);
        }
    }

    /* renamed from: tbm$3 */
    public class 3 implements Runnable {
        private /* synthetic */ Uri a;
        private /* synthetic */ Intent b;

        public 3(Uri uri, Intent intent) {
            this.a = uri;
            this.b = intent;
        }

        public final void run() {
            if (tbm.this.d != null) {
                szw szw = new szw();
                szw.b(skj.J, this.a.toString());
                tbm.this.d.a("APP_STORE_OPENED", tbm.this.i, szw);
            }
            tbm.this.a.startActivity(this.b);
        }
    }

    /* renamed from: tbm$1 */
    class 1 extends siz {
        1() {
        }

        public final void a(c cVar) {
            tbm.this.c.b(cVar);
        }
    }

    public tbm(Context context) {
        this(context, LayoutInflater.from(context));
    }

    private tbm(Context context, LayoutInflater layoutInflater) {
        this.j = 180;
        this.a = context;
        this.b = layoutInflater;
        this.c = new sjc("AppStoreViewController");
    }

    /* Access modifiers changed, original: final */
    public final float a(int i) {
        return this.a.getResources().getDimension(i);
    }

    public final String a(String str) {
        String format = String.format("market://details?id=%s", new Object[]{str});
        Map map = (Map) this.i.a(sqh.bd);
        if (!(map == null || map.isEmpty())) {
            String join = Joiner.on('&').withKeyValueSeparator("=").join(map);
            try {
                return String.format("market://details?id=%s&referrer=%s", new Object[]{str, URLEncoder.encode(join, "UTF-8")});
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return format;
    }

    public final void a(szw szw) {
        this.i = szw;
        String d = szw.d(sqh.ba);
        if (TextUtils.isEmpty(d)) {
            this.h.setText("");
        } else {
            this.h.setText(d);
        }
        sqf sqf = (sqf) szw.a(sqh.bb);
        if (sqf != null) {
            this.c.a(this.e.a(sqf.a, sqf.b, this.g, new 1()));
            this.f.post(new 2());
            return;
        }
        this.c.a();
        this.e.a(this.g);
    }
}
