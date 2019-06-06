package defpackage;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.BigTextStyle;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: go */
public final class go {

    /* renamed from: go$f */
    public static abstract class f {
        protected c a;
        private boolean b = false;

        private static float a(float f) {
            return f < 1.0f ? 1.0f : f > 1.3f ? 1.3f : f;
        }

        private Bitmap a(int i, int i2, int i3) {
            Drawable drawable = this.a.a.getResources().getDrawable(i);
            int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap a(int i, int i2, int i3, int i4) {
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap a = a(R.drawable.notification_icon_background, i4, i2);
            Canvas canvas = new Canvas(a);
            Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            i2 = (i2 - i3) / 2;
            i3 += i2;
            mutate.setBounds(i2, i2, i3, i3);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
            mutate.draw(canvas);
            return a;
        }

        private static void a(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        private int d() {
            Resources resources = this.a.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float a = (f.a(resources.getConfiguration().fontScale) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - a) * ((float) dimensionPixelSize)) + (a * ((float) dimensionPixelSize2)));
        }

        public final Bitmap a(int i, int i2) {
            return a(i, i2, 0);
        }

        public RemoteViews a() {
            return null;
        }

        public final void a(RemoteViews remoteViews, RemoteViews remoteViews2) {
            f.a(remoteViews);
            remoteViews.removeAllViews(R.id.notification_main_column);
            remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.notification_main_column, 0);
            if (VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(R.id.notification_main_column_container, 0, d(), 0, 0);
            }
        }

        public void a(gn gnVar) {
        }

        public final void a(c cVar) {
            if (this.a != cVar) {
                this.a = cVar;
                cVar = this.a;
                if (cVar != null) {
                    cVar.a(this);
                }
            }
        }

        public RemoteViews b() {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:59:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
        public final android.widget.RemoteViews c() {
            /*
            r11 = this;
            r0 = r11.a;
            r0 = r0.a;
            r0 = r0.getResources();
            r1 = new android.widget.RemoteViews;
            r2 = r11.a;
            r2 = r2.a;
            r2 = r2.getPackageName();
            r3 = 2131559113; // 0x7f0d02c9 float:1.874356E38 double:1.05313013E-314;
            r1.<init>(r2, r3);
            r2 = r11.a;
            r2 = r2.i;
            r3 = -1;
            r4 = 1;
            r5 = 0;
            if (r2 >= r3) goto L_0x0023;
        L_0x0021:
            r2 = 1;
            goto L_0x0024;
        L_0x0023:
            r2 = 0;
        L_0x0024:
            r6 = android.os.Build.VERSION.SDK_INT;
            r7 = 16;
            r8 = 21;
            r9 = 2131428677; // 0x7f0b0545 float:1.8479005E38 double:1.053065686E-314;
            if (r6 < r7) goto L_0x0050;
        L_0x002f:
            r6 = android.os.Build.VERSION.SDK_INT;
            if (r6 >= r8) goto L_0x0050;
        L_0x0033:
            r6 = 2131429279; // 0x7f0b079f float:1.8480226E38 double:1.0530659833E-314;
            r10 = "setBackgroundResource";
            if (r2 == 0) goto L_0x0044;
        L_0x003a:
            r2 = 2131231938; // 0x7f0804c2 float:1.8079971E38 double:1.052968484E-314;
            r1.setInt(r6, r10, r2);
            r2 = 2131231949; // 0x7f0804cd float:1.8079993E38 double:1.0529684893E-314;
            goto L_0x004d;
        L_0x0044:
            r2 = 2131231937; // 0x7f0804c1 float:1.807997E38 double:1.0529684834E-314;
            r1.setInt(r6, r10, r2);
            r2 = 2131231948; // 0x7f0804cc float:1.8079991E38 double:1.052968489E-314;
        L_0x004d:
            r1.setInt(r9, r10, r2);
        L_0x0050:
            r2 = r11.a;
            r2 = r2.f;
            r6 = 8;
            if (r2 == 0) goto L_0x00aa;
        L_0x0058:
            r2 = android.os.Build.VERSION.SDK_INT;
            if (r2 < r7) goto L_0x0067;
        L_0x005c:
            r1.setViewVisibility(r9, r5);
            r2 = r11.a;
            r2 = r2.f;
            r1.setImageViewBitmap(r9, r2);
            goto L_0x006a;
        L_0x0067:
            r1.setViewVisibility(r9, r6);
        L_0x006a:
            r2 = r11.a;
            r2 = r2.w;
            r2 = r2.icon;
            if (r2 == 0) goto L_0x00eb;
        L_0x0072:
            r2 = 2131167070; // 0x7f07075e float:1.7948403E38 double:1.052936435E-314;
            r2 = r0.getDimensionPixelSize(r2);
            r7 = 2131167074; // 0x7f070762 float:1.7948411E38 double:1.052936437E-314;
            r7 = r0.getDimensionPixelSize(r7);
            r7 = r7 << r4;
            r7 = r2 - r7;
            r9 = android.os.Build.VERSION.SDK_INT;
            r10 = 2131429803; // 0x7f0b09ab float:1.848129E38 double:1.053066242E-314;
            if (r9 < r8) goto L_0x0099;
        L_0x008a:
            r3 = r11.a;
            r3 = r3.w;
            r3 = r3.icon;
            r9 = r11.a;
            r9 = r9.r;
            r2 = r11.a(r3, r2, r7, r9);
            goto L_0x00a3;
        L_0x0099:
            r2 = r11.a;
            r2 = r2.w;
            r2 = r2.icon;
            r2 = r11.a(r2, r3, r5);
        L_0x00a3:
            r1.setImageViewBitmap(r10, r2);
            r1.setViewVisibility(r10, r5);
            goto L_0x00eb;
        L_0x00aa:
            r2 = r11.a;
            r2 = r2.w;
            r2 = r2.icon;
            if (r2 == 0) goto L_0x00eb;
        L_0x00b2:
            r1.setViewVisibility(r9, r5);
            r2 = android.os.Build.VERSION.SDK_INT;
            if (r2 < r8) goto L_0x00de;
        L_0x00b9:
            r2 = 2131167060; // 0x7f070754 float:1.7948383E38 double:1.05293643E-314;
            r2 = r0.getDimensionPixelSize(r2);
            r3 = 2131167052; // 0x7f07074c float:1.7948367E38 double:1.052936426E-314;
            r3 = r0.getDimensionPixelSize(r3);
            r2 = r2 - r3;
            r3 = 2131167075; // 0x7f070763 float:1.7948413E38 double:1.0529364373E-314;
            r3 = r0.getDimensionPixelSize(r3);
            r7 = r11.a;
            r7 = r7.w;
            r7 = r7.icon;
            r10 = r11.a;
            r10 = r10.r;
            r2 = r11.a(r7, r2, r3, r10);
            goto L_0x00e8;
        L_0x00de:
            r2 = r11.a;
            r2 = r2.w;
            r2 = r2.icon;
            r2 = r11.a(r2, r3, r5);
        L_0x00e8:
            r1.setImageViewBitmap(r9, r2);
        L_0x00eb:
            r2 = r11.a;
            r2 = r2.c;
            if (r2 == 0) goto L_0x00fb;
        L_0x00f1:
            r2 = 2131430706; // 0x7f0b0d32 float:1.848312E38 double:1.0530666883E-314;
            r3 = r11.a;
            r3 = r3.c;
            r1.setTextViewText(r2, r3);
        L_0x00fb:
            r2 = r11.a;
            r2 = r2.d;
            if (r2 == 0) goto L_0x010d;
        L_0x0101:
            r2 = 2131430631; // 0x7f0b0ce7 float:1.8482968E38 double:1.0530666513E-314;
            r3 = r11.a;
            r3 = r3.d;
            r1.setTextViewText(r2, r3);
            r2 = 1;
            goto L_0x010e;
        L_0x010d:
            r2 = 0;
        L_0x010e:
            r3 = android.os.Build.VERSION.SDK_INT;
            if (r3 >= r8) goto L_0x011a;
        L_0x0112:
            r3 = r11.a;
            r3 = r3.f;
            if (r3 == 0) goto L_0x011a;
        L_0x0118:
            r3 = 1;
            goto L_0x011b;
        L_0x011a:
            r3 = 0;
        L_0x011b:
            r7 = r11.a;
            r7 = r7.g;
            r8 = 2131428743; // 0x7f0b0587 float:1.847914E38 double:1.0530657185E-314;
            if (r7 == 0) goto L_0x0131;
        L_0x0124:
            r0 = r11.a;
            r0 = r0.g;
        L_0x0128:
            r1.setTextViewText(r8, r0);
            r1.setViewVisibility(r8, r5);
            r2 = 1;
            r3 = 1;
            goto L_0x015d;
        L_0x0131:
            r7 = r11.a;
            r7 = r7.h;
            if (r7 <= 0) goto L_0x015a;
        L_0x0137:
            r2 = 2131492893; // 0x7f0c001d float:1.860925E38 double:1.053097413E-314;
            r2 = r0.getInteger(r2);
            r3 = r11.a;
            r3 = r3.h;
            if (r3 <= r2) goto L_0x014c;
        L_0x0144:
            r2 = 2131889948; // 0x7f120f1c float:1.9414574E38 double:1.053293584E-314;
            r0 = r0.getString(r2);
            goto L_0x0128;
        L_0x014c:
            r0 = java.text.NumberFormat.getIntegerInstance();
            r2 = r11.a;
            r2 = r2.h;
            r2 = (long) r2;
            r0 = r0.format(r2);
            goto L_0x0128;
        L_0x015a:
            r1.setViewVisibility(r8, r6);
        L_0x015d:
            r0 = r11.a;
            r7 = r0.f();
            r9 = 0;
            r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
            if (r0 == 0) goto L_0x017b;
        L_0x0169:
            r0 = 2131430696; // 0x7f0b0d28 float:1.84831E38 double:1.0530666834E-314;
            r1.setViewVisibility(r0, r5);
            r3 = r11.a;
            r7 = r3.f();
            r3 = "setTime";
            r1.setLong(r0, r3, r7);
            r3 = 1;
        L_0x017b:
            r0 = 2131429804; // 0x7f0b09ac float:1.8481291E38 double:1.0530662427E-314;
            if (r3 == 0) goto L_0x0182;
        L_0x0180:
            r3 = 0;
            goto L_0x0184;
        L_0x0182:
            r3 = 8;
        L_0x0184:
            r1.setViewVisibility(r0, r3);
            r0 = 2131428925; // 0x7f0b063d float:1.8479508E38 double:1.0530658084E-314;
            if (r2 == 0) goto L_0x018d;
        L_0x018c:
            goto L_0x018f;
        L_0x018d:
            r5 = 8;
        L_0x018f:
            r1.setViewVisibility(r0, r5);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.go$f.c():android.widget.RemoteViews");
        }
    }

    /* renamed from: go$c */
    public static class c {
        private int A;
        public Context a;
        public ArrayList<a> b;
        CharSequence c;
        CharSequence d;
        public PendingIntent e;
        Bitmap f;
        CharSequence g;
        int h;
        int i;
        boolean j;
        int k;
        int l;
        boolean m;
        String n;
        public boolean o;
        String p;
        Bundle q;
        public int r;
        int s;
        RemoteViews t;
        RemoteViews u;
        public String v;
        public Notification w;
        @Deprecated
        public ArrayList<String> x;
        private f y;
        private int z;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.b = new ArrayList();
            this.j = true;
            this.o = false;
            this.r = 0;
            this.s = 0;
            this.z = 0;
            this.A = 0;
            this.w = new Notification();
            this.a = context;
            this.v = str;
            this.w.when = System.currentTimeMillis();
            this.w.audioStreamType = -1;
            this.i = 0;
            this.x = new ArrayList();
        }

        private void a(int i, boolean z) {
            Notification notification;
            if (z) {
                notification = this.w;
                i |= notification.flags;
            } else {
                notification = this.w;
                i = (i ^ -1) & notification.flags;
            }
            notification.flags = i;
        }

        protected static CharSequence e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public final c a() {
            Notification notification = this.w;
            notification.ledARGB = -256;
            notification.ledOnMS = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
            notification.ledOffMS = MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS;
            int i = (notification.ledOnMS == 0 || this.w.ledOffMS == 0) ? 0 : 1;
            Notification notification2 = this.w;
            notification2.flags = i | (notification2.flags & -2);
            return this;
        }

        public final c a(int i) {
            this.w.icon = i;
            return this;
        }

        public final c a(int i, int i2, boolean z) {
            this.k = i;
            this.l = i2;
            this.m = z;
            return this;
        }

        public final c a(long j) {
            this.w.when = j;
            return this;
        }

        public final c a(PendingIntent pendingIntent) {
            this.e = pendingIntent;
            return this;
        }

        public final c a(Bitmap bitmap) {
            this.f = bitmap;
            return this;
        }

        public final c a(Uri uri, int i) {
            Notification notification = this.w;
            notification.sound = uri;
            notification.audioStreamType = i;
            if (VERSION.SDK_INT >= 21) {
                this.w.audioAttributes = new Builder().setContentType(4).setLegacyStreamType(i).build();
            }
            return this;
        }

        public final c a(Bundle bundle) {
            Bundle bundle2 = this.q;
            if (bundle2 == null) {
                this.q = new Bundle(bundle);
            } else {
                bundle2.putAll(bundle);
            }
            return this;
        }

        public final c a(RemoteViews remoteViews) {
            this.t = remoteViews;
            return this;
        }

        public final c a(e eVar) {
            eVar.a(this);
            return this;
        }

        public final c a(f fVar) {
            if (this.y != fVar) {
                this.y = fVar;
                fVar = this.y;
                if (fVar != null) {
                    fVar.a(this);
                }
            }
            return this;
        }

        public final c a(CharSequence charSequence) {
            this.c = c.e(charSequence);
            return this;
        }

        public final c a(CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(charSequence, pendingIntent));
            return this;
        }

        public final c a(String str) {
            this.p = str;
            return this;
        }

        public final c a(boolean z) {
            a(2, z);
            return this;
        }

        public final c a(long[] jArr) {
            this.w.vibrate = jArr;
            return this;
        }

        public final c b() {
            a(16, true);
            return this;
        }

        public final c b(int i) {
            this.h = i;
            return this;
        }

        public final c b(PendingIntent pendingIntent) {
            this.w.deleteIntent = pendingIntent;
            return this;
        }

        public final c b(CharSequence charSequence) {
            this.d = c.e(charSequence);
            return this;
        }

        public final c b(String str) {
            this.n = str;
            return this;
        }

        public final c c() {
            this.w.defaults = 1;
            return this;
        }

        public final c c(int i) {
            this.i = i;
            return this;
        }

        public final c c(CharSequence charSequence) {
            this.g = c.e(charSequence);
            return this;
        }

        public final c c(String str) {
            this.v = str;
            return this;
        }

        public final c d() {
            this.s = -1;
            return this;
        }

        public final c d(int i) {
            this.r = i;
            return this;
        }

        public final c d(CharSequence charSequence) {
            this.w.tickerText = c.e(charSequence);
            return this;
        }

        /* JADX WARNING: Missing block: B:17:0x004a, code skipped:
            if (r0.d != null) goto L_0x004c;
     */
        /* JADX WARNING: Missing block: B:25:0x006f, code skipped:
            if (r0.d != null) goto L_0x004c;
     */
        /* JADX WARNING: Missing block: B:35:0x009e, code skipped:
            if (r0.d != null) goto L_0x004c;
     */
        /* JADX WARNING: Missing block: B:51:0x00f2, code skipped:
            if (r0.d != null) goto L_0x004c;
     */
        public final android.app.Notification e() {
            /*
            r11 = this;
            r0 = new gp;
            r0.<init>(r11);
            r1 = r0.b;
            r1 = r1.y;
            if (r1 == 0) goto L_0x000e;
        L_0x000b:
            r1.a(r0);
        L_0x000e:
            if (r1 == 0) goto L_0x0015;
        L_0x0010:
            r2 = r1.a();
            goto L_0x0016;
        L_0x0015:
            r2 = 0;
        L_0x0016:
            r3 = android.os.Build.VERSION.SDK_INT;
            r4 = 26;
            r5 = 16;
            if (r3 < r4) goto L_0x0026;
        L_0x001e:
            r3 = r0.a;
            r3 = r3.build();
            goto L_0x00fc;
        L_0x0026:
            r3 = android.os.Build.VERSION.SDK_INT;
            r4 = 24;
            if (r3 < r4) goto L_0x002d;
        L_0x002c:
            goto L_0x001e;
        L_0x002d:
            r3 = android.os.Build.VERSION.SDK_INT;
            r4 = 21;
            if (r3 < r4) goto L_0x0052;
        L_0x0033:
            r3 = r0.a;
            r4 = r0.f;
            r3.setExtras(r4);
            r3 = r0.a;
            r3 = r3.build();
            r4 = r0.c;
            if (r4 == 0) goto L_0x0048;
        L_0x0044:
            r4 = r0.c;
            r3.contentView = r4;
        L_0x0048:
            r4 = r0.d;
            if (r4 == 0) goto L_0x00fc;
        L_0x004c:
            r4 = r0.d;
            r3.bigContentView = r4;
            goto L_0x00fc;
        L_0x0052:
            r3 = android.os.Build.VERSION.SDK_INT;
            r4 = 20;
            if (r3 < r4) goto L_0x0072;
        L_0x0058:
            r3 = r0.a;
            r4 = r0.f;
            r3.setExtras(r4);
            r3 = r0.a;
            r3 = r3.build();
            r4 = r0.c;
            if (r4 == 0) goto L_0x006d;
        L_0x0069:
            r4 = r0.c;
            r3.contentView = r4;
        L_0x006d:
            r4 = r0.d;
            if (r4 == 0) goto L_0x00fc;
        L_0x0071:
            goto L_0x004c;
        L_0x0072:
            r3 = android.os.Build.VERSION.SDK_INT;
            r4 = 19;
            r6 = "android.support.actionExtras";
            if (r3 < r4) goto L_0x00a1;
        L_0x007a:
            r3 = r0.e;
            r3 = defpackage.gq.a(r3);
            if (r3 == 0) goto L_0x0087;
        L_0x0082:
            r4 = r0.f;
            r4.putSparseParcelableArray(r6, r3);
        L_0x0087:
            r3 = r0.a;
            r4 = r0.f;
            r3.setExtras(r4);
            r3 = r0.a;
            r3 = r3.build();
            r4 = r0.c;
            if (r4 == 0) goto L_0x009c;
        L_0x0098:
            r4 = r0.c;
            r3.contentView = r4;
        L_0x009c:
            r4 = r0.d;
            if (r4 == 0) goto L_0x00fc;
        L_0x00a0:
            goto L_0x004c;
        L_0x00a1:
            r3 = android.os.Build.VERSION.SDK_INT;
            if (r3 < r5) goto L_0x00f6;
        L_0x00a5:
            r3 = r0.a;
            r3 = r3.build();
            r4 = defpackage.go.a(r3);
            r7 = new android.os.Bundle;
            r8 = r0.f;
            r7.<init>(r8);
            r8 = r0.f;
            r8 = r8.keySet();
            r8 = r8.iterator();
        L_0x00c0:
            r9 = r8.hasNext();
            if (r9 == 0) goto L_0x00d6;
        L_0x00c6:
            r9 = r8.next();
            r9 = (java.lang.String) r9;
            r10 = r4.containsKey(r9);
            if (r10 == 0) goto L_0x00c0;
        L_0x00d2:
            r7.remove(r9);
            goto L_0x00c0;
        L_0x00d6:
            r4.putAll(r7);
            r4 = r0.e;
            r4 = defpackage.gq.a(r4);
            if (r4 == 0) goto L_0x00e8;
        L_0x00e1:
            r7 = defpackage.go.a(r3);
            r7.putSparseParcelableArray(r6, r4);
        L_0x00e8:
            r4 = r0.c;
            if (r4 == 0) goto L_0x00f0;
        L_0x00ec:
            r4 = r0.c;
            r3.contentView = r4;
        L_0x00f0:
            r4 = r0.d;
            if (r4 == 0) goto L_0x00fc;
        L_0x00f4:
            goto L_0x004c;
        L_0x00f6:
            r3 = r0.a;
            r3 = r3.getNotification();
        L_0x00fc:
            if (r2 == 0) goto L_0x0101;
        L_0x00fe:
            r3.contentView = r2;
            goto L_0x010d;
        L_0x0101:
            r2 = r0.b;
            r2 = r2.t;
            if (r2 == 0) goto L_0x010d;
        L_0x0107:
            r0 = r0.b;
            r0 = r0.t;
            r3.contentView = r0;
        L_0x010d:
            r0 = android.os.Build.VERSION.SDK_INT;
            if (r0 < r5) goto L_0x011b;
        L_0x0111:
            if (r1 == 0) goto L_0x011b;
        L_0x0113:
            r0 = r1.b();
            if (r0 == 0) goto L_0x011b;
        L_0x0119:
            r3.bigContentView = r0;
        L_0x011b:
            r0 = android.os.Build.VERSION.SDK_INT;
            if (r0 < r5) goto L_0x0124;
        L_0x011f:
            if (r1 == 0) goto L_0x0124;
        L_0x0121:
            defpackage.go.a(r3);
        L_0x0124:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.go$c.e():android.app.Notification");
        }

        public final long f() {
            return this.j ? this.w.when : 0;
        }
    }

    /* renamed from: go$b */
    public static class b extends f {
        private CharSequence b;

        public final b a(CharSequence charSequence) {
            this.b = c.e(charSequence);
            return this;
        }

        public final void a(gn gnVar) {
            if (VERSION.SDK_INT >= 16) {
                new BigTextStyle(gnVar.a()).setBigContentTitle(null).bigText(this.b);
            }
        }
    }

    /* renamed from: go$a */
    public static class a {
        final Bundle a;
        boolean b;
        public int c;
        public CharSequence d;
        public PendingIntent e;
        private gt[] f;
        private gt[] g;

        private a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            this.c = 0;
            this.d = c.e(charSequence);
            this.e = pendingIntent;
            this.a = bundle;
            this.f = null;
            this.g = null;
            this.b = true;
        }

        public a(CharSequence charSequence, PendingIntent pendingIntent) {
            this(0, charSequence, pendingIntent, new Bundle());
        }
    }

    /* renamed from: go$e */
    public interface e {
        c a(c cVar);
    }

    /* renamed from: go$d */
    public static class d extends f {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
        private android.widget.RemoteViews a(android.widget.RemoteViews r6, boolean r7) {
            /*
            r5 = this;
            r0 = r5.c();
            r1 = 2131427381; // 0x7f0b0035 float:1.8476377E38 double:1.0530650456E-314;
            r0.removeAllViews(r1);
            r2 = 0;
            if (r7 == 0) goto L_0x003b;
        L_0x000d:
            r7 = r5.a;
            r7 = r7.b;
            if (r7 == 0) goto L_0x003b;
        L_0x0013:
            r7 = r5.a;
            r7 = r7.b;
            r7 = r7.size();
            r3 = 3;
            r7 = java.lang.Math.min(r7, r3);
            if (r7 <= 0) goto L_0x003b;
        L_0x0022:
            r3 = 0;
        L_0x0023:
            if (r3 >= r7) goto L_0x0039;
        L_0x0025:
            r4 = r5.a;
            r4 = r4.b;
            r4 = r4.get(r3);
            r4 = (defpackage.go.a) r4;
            r4 = r5.a(r4);
            r0.addView(r1, r4);
            r3 = r3 + 1;
            goto L_0x0023;
        L_0x0039:
            r7 = 1;
            goto L_0x003c;
        L_0x003b:
            r7 = 0;
        L_0x003c:
            if (r7 == 0) goto L_0x003f;
        L_0x003e:
            goto L_0x0041;
        L_0x003f:
            r2 = 8;
        L_0x0041:
            r0.setViewVisibility(r1, r2);
            r7 = 2131427355; // 0x7f0b001b float:1.8476324E38 double:1.0530650327E-314;
            r0.setViewVisibility(r7, r2);
            r5.a(r0, r6);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.go$d.a(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
        }

        private RemoteViews a(a aVar) {
            Object obj = aVar.e == null ? 1 : null;
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), obj != null ? R.layout.notification_action_tombstone : R.layout.notification_action);
            remoteViews.setImageViewBitmap(R.id.action_image, a(aVar.c, this.a.a.getResources().getColor(R.color.notification_action_color_filter)));
            remoteViews.setTextViewText(R.id.action_text, aVar.d);
            if (obj == null) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, aVar.e);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(R.id.action_container, aVar.d);
            }
            return remoteViews;
        }

        public final RemoteViews a() {
            return (VERSION.SDK_INT < 24 && this.a.t != null) ? a(this.a.t, false) : null;
        }

        public final void a(gn gnVar) {
            if (VERSION.SDK_INT >= 24) {
                gnVar.a().setStyle(new DecoratedCustomViewStyle());
            }
        }

        public final RemoteViews b() {
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews = this.a.u;
            if (remoteViews == null) {
                remoteViews = this.a.t;
            }
            return remoteViews == null ? null : a(remoteViews, true);
        }
    }

    /* renamed from: go$g */
    public static final class g implements e {
        private ArrayList<a> a = new ArrayList();
        private int b = 1;
        private PendingIntent c;
        private ArrayList<Notification> d = new ArrayList();
        private Bitmap e;
        private int f;
        private int g = 8388613;
        private int h = -1;
        private int i = 0;
        private int j;
        private int k = 80;
        private int l;
        private String m;
        private String n;

        public final c a(c cVar) {
            ArrayList arrayList;
            Bundle bundle = new Bundle();
            if (!this.a.isEmpty()) {
                String str = "actions";
                if (VERSION.SDK_INT >= 16) {
                    arrayList = new ArrayList(this.a.size());
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        String str2 = "android.support.allowGeneratedReplies";
                        Bundle bundle2;
                        if (VERSION.SDK_INT >= 20) {
                            Action.Builder builder = new Action.Builder(aVar.c, aVar.d, aVar.e);
                            bundle2 = aVar.a != null ? new Bundle(aVar.a) : new Bundle();
                            bundle2.putBoolean(str2, aVar.b);
                            if (VERSION.SDK_INT >= 24) {
                                builder.setAllowGeneratedReplies(aVar.b);
                            }
                            builder.addExtras(bundle2);
                            arrayList.add(builder.build());
                        } else if (VERSION.SDK_INT >= 16) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("icon", aVar.c);
                            bundle3.putCharSequence("title", aVar.d);
                            bundle3.putParcelable("actionIntent", aVar.e);
                            bundle2 = aVar.a != null ? new Bundle(aVar.a) : new Bundle();
                            bundle2.putBoolean(str2, aVar.b);
                            bundle3.putBundle("extras", bundle2);
                            bundle3.putParcelableArray("remoteInputs", null);
                            arrayList.add(bundle3);
                        }
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                } else {
                    bundle.putParcelableArrayList(str, null);
                }
            }
            int i = this.b;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.d.isEmpty()) {
                arrayList = this.d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList.toArray(new Notification[arrayList.size()]));
            }
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            i = this.f;
            if (i != 0) {
                bundle.putInt("contentIcon", i);
            }
            i = this.g;
            if (i != 8388613) {
                bundle.putInt("contentIconGravity", i);
            }
            i = this.h;
            if (i != -1) {
                bundle.putInt("contentActionIndex", i);
            }
            i = this.i;
            if (i != 0) {
                bundle.putInt("customSizePreset", i);
            }
            i = this.j;
            if (i != 0) {
                bundle.putInt("customContentHeight", i);
            }
            i = this.k;
            if (i != 80) {
                bundle.putInt("gravity", i);
            }
            i = this.l;
            if (i != 0) {
                bundle.putInt("hintScreenTimeout", i);
            }
            String str3 = this.m;
            if (str3 != null) {
                bundle.putString("dismissalId", str3);
            }
            str3 = this.n;
            if (str3 != null) {
                bundle.putString("bridgeTag", str3);
            }
            if (cVar.q == null) {
                cVar.q = new Bundle();
            }
            cVar.q.putBundle("android.wearable.EXTENSIONS", bundle);
            return cVar;
        }

        public final g a(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public final /* synthetic */ Object clone() {
            g gVar = new g();
            gVar.a = new ArrayList(this.a);
            gVar.b = this.b;
            gVar.c = this.c;
            gVar.d = new ArrayList(this.d);
            gVar.e = this.e;
            gVar.f = this.f;
            gVar.g = this.g;
            gVar.h = this.h;
            gVar.i = this.i;
            gVar.j = this.j;
            gVar.k = this.k;
            gVar.l = this.l;
            gVar.m = this.m;
            gVar.n = this.n;
            return gVar;
        }
    }

    public static Bundle a(Notification notification) {
        return VERSION.SDK_INT >= 19 ? notification.extras : VERSION.SDK_INT >= 16 ? gq.a(notification) : null;
    }
}
