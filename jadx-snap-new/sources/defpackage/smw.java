package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Strings;
import com.snapchat.android.R;
import defpackage.tbm.3;
import net.sqlcipher.database.SQLiteDatabase;
import org.opencv.imgproc.Imgproc;

/* renamed from: smw */
public class smw extends slm {
    boolean a;
    boolean b;
    private final tbm c;
    private final Runnable d;

    /* renamed from: smw$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            smw smw = smw.this;
            smw.a = false;
            smw.b = false;
            if (smw.K) {
                smw.this.z().c(srb.ENTER_BACKGROUND);
            }
        }
    }

    smw(Context context) {
        this(new tbm(context));
    }

    private smw(tbm tbm) {
        this.d = new 1();
        this.c = tbm;
        tbm = this.c;
        tbm.f = tbm.b.inflate(R.layout.app_install_longform, null);
        tbm.h = (TextView) tbm.f.findViewById(R.id.app_install_title_view);
        tbm.g = (ImageView) tbm.f.findViewById(R.id.app_install_icon_view);
        this.a = false;
        this.b = false;
    }

    public final void B_() {
        tbm tbm = this.c;
        tbm.d = null;
        tbm.e = null;
        super.B_();
    }

    public final boolean F() {
        return false;
    }

    public final void a(sit sit, sju sju) {
        super.a(sit, sju);
        tbm tbm = this.c;
        skh C = C();
        siw D = D();
        tbm.d = C;
        tbm.e = D;
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.c.a(this.H);
    }

    public final void a(szw szw) {
        if (!this.a) {
            tbm tbm = this.c;
            String str = (String) tbm.i.a(sqh.bc);
            if (!Strings.isNullOrEmpty(str)) {
                Uri parse = Uri.parse(tbm.a(str));
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.addFlags(Imgproc.FLOODFILL_FIXED_RANGE);
                tbm.f.postDelayed(new 3(parse, intent), 180);
            }
            this.a = true;
        }
        if (!this.b) {
            this.c.f.postDelayed(this.d, 1000);
            this.b = true;
        }
    }

    public final void ae_() {
        tbm tbm = this.c;
        tbm.e.a(R.drawable.app_install_background, tbm.f);
        this.c.a(this.H);
    }

    public final boolean af_() {
        return true;
    }

    public final void b() {
        super.b();
        this.a = false;
        this.b = false;
        this.c.f.removeCallbacks(this.d);
        tbm tbm = this.c;
        tbm.c.b();
        tbm.e.a(tbm.g);
        tbm.f.setBackgroundResource(0);
        tbm.i = null;
    }

    public final View e() {
        return this.c.f;
    }

    public final String f() {
        return "APP_INSTALL";
    }

    public final boolean h() {
        return true;
    }
}
