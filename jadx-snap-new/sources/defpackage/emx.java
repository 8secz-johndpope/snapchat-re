package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.ely.a;
import defpackage.ely.b;

/* renamed from: emx */
public final class emx implements b {
    public Activity a;
    public ViewFinder b;
    public emw c;
    private a d;

    private static void a(Activity activity, int i, int i2, OnClickListener onClickListener) {
        Builder builder = new Builder(activity);
        builder.setCancelable(true);
        builder.setNegativeButton(R.string.cancel, -$$Lambda$emx$e7zI7OqDclIH235rSJtxozT-COE.INSTANCE);
        builder.setMessage(i);
        builder.setPositiveButton(i2, onClickListener);
        builder.show();
    }

    private /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.d.d();
        dialogInterface.dismiss();
    }

    public final void a() {
        Activity activity = this.a;
        if (activity != null && !activity.isFinishing()) {
            emx.a(this.a, R.string.camera_permission_denied, R.string.open_mobile_settings, new -$$Lambda$emx$LHgrCSw5vesrTh5-g8DhnJAztiM(this));
        }
    }

    public final /* synthetic */ void a(dqa dqa) {
        a aVar = (a) dqa;
        this.b.findViewById(R.id.gesture_detection_view).setOnTouchListener(new emv(this.a, -$$Lambda$emx$Z-dBw756vWXOHOidT9HxfqaFJlM.INSTANCE, this.c));
        this.d = aVar;
    }

    public final void b() {
        Activity activity = this.a;
        if (activity != null && !activity.isFinishing()) {
            emx.a(this.a, R.string.could_not_open_camera, R.string.exit, -$$Lambda$emx$n7l5Zm0nniNlgwCp-RGclHcYD80.INSTANCE);
        }
    }
}
