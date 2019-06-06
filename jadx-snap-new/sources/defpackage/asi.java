package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.widget.ScrollView;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.asg.2;
import defpackage.asg.3;
import defpackage.asx.a;
import defpackage.asz.1;
import defpackage.atj.b;
import defpackage.atj.c;
import defpackage.atj.d;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: asi */
final class asi {
    static final FilenameFilter a = new 11();
    static final FileFilter b = new 18();
    static final Pattern c = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static FilenameFilter q = new d("BeginSession") {
        public final boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    };
    private static Comparator<File> r = new 19();
    private static Comparator<File> s = new 20();
    private static final Map<String, String> t = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", SCamera.CAMERA_ID_FRONT);
    private static final String[] u = new String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    final AtomicInteger d = new AtomicInteger(0);
    final asj e;
    final ash f;
    final atf g;
    final arz h;
    final asx i;
    final c j;
    final b k;
    final ast l;
    final String m;
    final asa n;
    final arh o;
    aso p;
    private final aisx v;
    private final airm w;
    private aitb x;
    private g y;
    private final atm z;

    /* renamed from: asi$i */
    final class i implements c {
        private i() {
        }

        /* synthetic */ i(asi asi, byte b) {
            this();
        }

        public final File[] a() {
            return asi.this.b();
        }

        public final File[] b() {
            return asi.this.f().listFiles();
        }

        public final File[] c() {
            asi asi = asi.this;
            return asi.a(asi.e().listFiles(asi.b));
        }
    }

    /* renamed from: asi$d */
    static class d implements FilenameFilter {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: asi$11 */
    static class 11 implements FilenameFilter {
        11() {
        }

        public final boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* renamed from: asi$18 */
    static class 18 implements FileFilter {
        18() {
        }

        public final boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    }

    /* renamed from: asi$19 */
    static class 19 implements Comparator<File> {
        19() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }

    /* renamed from: asi$20 */
    static class 20 implements Comparator<File> {
        20() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    }

    /* renamed from: asi$g */
    static final class g implements a {
        private final aitb a;

        public g(aitb aitb) {
            this.a = aitb;
        }

        public final File a() {
            File file = new File(this.a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: asi$j */
    final class j implements b {
        private j() {
        }

        /* synthetic */ j(asi asi, byte b) {
            this();
        }

        public final boolean a() {
            return asi.this.d();
        }
    }

    /* renamed from: asi$4 */
    class 4 implements Callable<Void> {
        4() {
        }

        public final /* synthetic */ Object call() {
            asi.a(asi.this);
            return null;
        }
    }

    /* renamed from: asi$21 */
    class 21 implements aso.a {
        21() {
        }

        public final void a(aso.b bVar, Thread thread, Throwable th, boolean z) {
            asi.this.a(bVar, thread, th, z);
        }
    }

    /* renamed from: asi$c */
    static final class c implements aso.b {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final aity a() {
            return aitv.a.a.a();
        }
    }

    /* renamed from: asi$3 */
    class 3 implements Callable<Void> {
        private /* synthetic */ Map a;

        3(Map map) {
            this.a = map;
        }

        private Void a() {
            Closeable bufferedWriter;
            Throwable e;
            String str = "Failed to close key/value metadata file.";
            String a = asi.this.a();
            asz asz = new asz(asi.this.e());
            Map map = this.a;
            File file = asz.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("keys.meta");
            File file2 = new File(file, stringBuilder.toString());
            Closeable closeable = null;
            try {
                String jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), asz.a));
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter = null;
                try {
                    aiqj.a().c("CrashlyticsCore", "Error serializing key/value metadata.", e);
                    airf.a(bufferedWriter, str);
                    return null;
                } catch (Throwable th) {
                    e = th;
                    closeable = bufferedWriter;
                    airf.a(closeable, str);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                airf.a(closeable, str);
                throw e;
            }
            airf.a(bufferedWriter, str);
            return null;
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: asi$b */
    interface b {
        void a(ase ase);
    }

    /* renamed from: asi$e */
    interface e {
        void a(FileOutputStream fileOutputStream);
    }

    /* renamed from: asi$6 */
    class 6 implements Runnable {
        6() {
        }

        public final void run() {
            String str;
            asi asi = asi.this;
            File[] a = asi.a(new f());
            HashSet hashSet = new HashSet();
            int length = a.length;
            int i = 0;
            while (true) {
                str = "CrashlyticsCore";
                if (i >= length) {
                    break;
                }
                File file = a[i];
                aiqj.a().a(str, "Found invalid session part file: ".concat(String.valueOf(file)));
                hashSet.add(asi.a(file));
                i++;
            }
            if (!hashSet.isEmpty()) {
                File f = asi.f();
                if (!f.exists()) {
                    f.mkdir();
                }
                for (Object obj : asi.a(new 7(hashSet))) {
                    aiqj.a().a(str, "Moving session file: ".concat(String.valueOf(obj)));
                    if (!obj.renameTo(new File(f, obj.getName()))) {
                        aiqj.a().a(str, "Could not move session file. Deleting ".concat(String.valueOf(obj)));
                        obj.delete();
                    }
                }
                asi.c();
            }
        }
    }

    /* renamed from: asi$f */
    static class f implements FilenameFilter {
        f() {
        }

        public final boolean accept(File file, String str) {
            return asd.a.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: asi$5 */
    class 5 implements Callable<Boolean> {
        private /* synthetic */ aitu a;

        5(aitu aitu) {
            this.a = aitu;
        }

        public final /* synthetic */ Object call() {
            String str = "CrashlyticsCore";
            if (asi.this.d()) {
                aiqj.a().a(str, "Skipping session finalization because a crash has already occurred.");
                return Boolean.FALSE;
            }
            aiqj.a().a(str, "Finalizing previously open sessions.");
            asi.this.a(this.a, true);
            aiqj.a().a(str, "Closed all previously open sessions");
            return Boolean.TRUE;
        }
    }

    /* renamed from: asi$a */
    static class a implements FilenameFilter {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final boolean accept(File file, String str) {
            return !asi.a.accept(file, str) && asi.c.matcher(str).matches();
        }
    }

    /* renamed from: asi$l */
    static class l implements FilenameFilter {
        private final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean accept(File file, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(".cls");
            return (str.equals(stringBuilder.toString()) || !str.contains(this.a) || str.endsWith(".cls_temp")) ? false : true;
        }
    }

    /* renamed from: asi$23 */
    class 23 implements Callable<Void> {
        private /* synthetic */ long a;
        private /* synthetic */ String b;

        23(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            if (!asi.this.d()) {
                asx asx = asi.this.i;
                asx.a.a(this.a, this.b);
            }
            return null;
        }
    }

    /* renamed from: asi$24 */
    class 24 implements Runnable {
        private /* synthetic */ Date a;
        private /* synthetic */ Thread b;
        private /* synthetic */ Throwable c;

        24(Date date, Thread thread, Throwable th) {
            this.a = date;
            this.b = thread;
            this.c = th;
        }

        public final void run() {
            Throwable e;
            Throwable th;
            String str = "Failed to close non-fatal file output stream.";
            String str2 = "Failed to flush to non-fatal file.";
            if (!asi.this.d()) {
                asi asi = asi.this;
                Date date = this.a;
                Thread thread = this.b;
                Throwable th2 = this.c;
                String a = asi.a();
                Flushable flushable = null;
                String str3 = "CrashlyticsCore";
                if (a == null) {
                    aiqj.a().c(str3, "Tried to write a non-fatal exception while no session was open.", null);
                    return;
                }
                String name = th2.getClass().getName();
                if (((aqu) aiqj.a(aqu.class)) == null) {
                    aiqj.a().a(str3, "Answers is not available");
                } else {
                    airg.b bVar = new airg.b(a, name);
                }
                Closeable asd;
                try {
                    aiqr a2 = aiqj.a();
                    StringBuilder stringBuilder = new StringBuilder("Crashlytics is logging non-fatal exception \"");
                    stringBuilder.append(th2);
                    stringBuilder.append("\" from thread ");
                    stringBuilder.append(thread.getName());
                    a2.a(str3, stringBuilder.toString());
                    if (asi.d.getAndIncrement() >= 0) {
                        name = String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(asi.d.getAndIncrement())}).replace(' ', '0');
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(a);
                        stringBuilder.append("SessionEvent");
                        stringBuilder.append(name);
                        asd = new asd(asi.e(), stringBuilder.toString());
                        try {
                            Flushable a3 = ase.a((OutputStream) asd);
                            try {
                                asi.a(a3, date, thread, th2, "error", false);
                                airf.a(a3, str2);
                            } catch (Exception e2) {
                                e = e2;
                                flushable = a3;
                                try {
                                    aiqj.a().c(str3, "An error occurred in the non-fatal exception logger", e);
                                    airf.a(flushable, str2);
                                    airf.a(asd, str);
                                    asi.a(a, 64);
                                } catch (Throwable th3) {
                                    th = th3;
                                    airf.a(flushable, str2);
                                    airf.a(asd, str);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                flushable = a3;
                                airf.a(flushable, str2);
                                airf.a(asd, str);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            aiqj.a().c(str3, "An error occurred in the non-fatal exception logger", e);
                            airf.a(flushable, str2);
                            airf.a(asd, str);
                            asi.a(a, 64);
                        }
                        airf.a(asd, str);
                        try {
                            asi.a(a, 64);
                        } catch (Exception e4) {
                            aiqj.a().c(str3, "An error occurred when trimming non-fatal files.", e4);
                        }
                    } else {
                        throw new IllegalArgumentException("value must be zero or greater");
                    }
                } catch (Exception e5) {
                    e = e5;
                    asd = null;
                    aiqj.a().c(str3, "An error occurred in the non-fatal exception logger", e);
                    airf.a(flushable, str2);
                    airf.a(asd, str);
                    asi.a(a, 64);
                } catch (Throwable th5) {
                    th = th5;
                    asd = null;
                    airf.a(flushable, str2);
                    airf.a(asd, str);
                    throw th;
                }
            }
        }
    }

    /* renamed from: asi$2 */
    class 2 implements Callable<Void> {
        private /* synthetic */ String a = null;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        2(String str, String str2, String str3) {
            this.b = str2;
            this.c = str3;
        }

        private Void a() {
            Closeable bufferedWriter;
            Throwable e;
            String str = "Failed to close user metadata file.";
            String a = asi.this.a();
            asz asz = new asz(asi.this.e());
            atp atp = new atp(this.a, this.b, this.c);
            File b = asz.b(a);
            Closeable closeable = null;
            try {
                String 1 = new 1(atp).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), asz.a));
                try {
                    bufferedWriter.write(1);
                    bufferedWriter.flush();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter = null;
                try {
                    aiqj.a().c("CrashlyticsCore", "Error serializing user metadata.", e);
                    airf.a(bufferedWriter, str);
                    return null;
                } catch (Throwable th) {
                    e = th;
                    closeable = bufferedWriter;
                    airf.a(closeable, str);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                airf.a(closeable, str);
                throw e;
            }
            airf.a(bufferedWriter, str);
            return null;
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: asi$7 */
    class 7 implements FilenameFilter {
        private /* synthetic */ Set a;

        7(Set set) {
            this.a = set;
        }

        public final boolean accept(File file, String str) {
            return str.length() < 35 ? false : this.a.contains(str.substring(0, 35));
        }
    }

    /* renamed from: asi$k */
    static final class k implements Runnable {
        private final Context a;
        private final ati b;
        private final atj c;

        public k(Context context, ati ati, atj atj) {
            this.a = context;
            this.b = ati;
            this.c = atj;
        }

        public final void run() {
            if (airf.h(this.a)) {
                aiqj.a().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.c.a(this.b);
            }
        }
    }

    /* renamed from: asi$h */
    static final class h implements d {
        final atf a;
        private final aiqo b;
        private final aitt c;

        /* renamed from: asi$h$1 */
        class 1 implements asg.a {
            1() {
            }

            public final void a() {
                atf atf = h.this.a;
                atf.a.a(atf.a.b().putBoolean("always_send_reports_opt_in", true));
            }
        }

        public h(aiqo aiqo, atf atf, aitt aitt) {
            this.b = aiqo;
            this.a = atf;
            this.c = aitt;
        }

        public final boolean a() {
            aiqj aiqj = this.b.d;
            Activity activity = aiqj.c != null ? (Activity) aiqj.c.get() : null;
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            1 1 = new 1();
            aitt aitt = this.c;
            asg.b bVar = new asg.b();
            asu asu = new asu(activity, aitt);
            Builder builder = new Builder(activity);
            String a = asu.a("com.crashlytics.CrashSubmissionPromptMessage", asu.a.b);
            float f = activity.getResources().getDisplayMetrics().density;
            int i = (int) (5.0f * f);
            TextView textView = new TextView(activity);
            textView.setAutoLinkMask(15);
            textView.setText(a);
            textView.setTextAppearance(activity, 16973892);
            textView.setPadding(i, i, i, i);
            textView.setFocusable(false);
            ScrollView scrollView = new ScrollView(activity);
            scrollView.setPadding((int) (14.0f * f), (int) (2.0f * f), (int) (10.0f * f), (int) (f * 12.0f));
            scrollView.addView(textView);
            builder.setView(scrollView).setTitle(asu.a("com.crashlytics.CrashSubmissionPromptTitle", asu.a.a)).setCancelable(false).setNeutralButton(asu.a("com.crashlytics.CrashSubmissionSendTitle", asu.a.c), new asg.1(bVar));
            if (aitt.d) {
                builder.setNegativeButton(asu.a("com.crashlytics.CrashSubmissionCancelTitle", asu.a.e), new 2(bVar));
            }
            if (aitt.f) {
                builder.setPositiveButton(asu.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", asu.a.g), new 3(1, bVar));
            }
            final asg asg = new asg(builder, bVar);
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    asg.b.show();
                }
            });
            aiqj.a().a("CrashlyticsCore", "Waiting for user opt-in.");
            try {
                asg.a.b.await();
            } catch (InterruptedException unused) {
            }
            return asg.a.a;
        }
    }

    asi(asj asj, ash ash, aisx aisx, airm airm, atf atf, aitb aitb, arz arz, ato ato, asa asa, arh arh) {
        this.e = asj;
        this.f = ash;
        this.v = aisx;
        this.w = airm;
        this.g = atf;
        this.x = aitb;
        this.h = arz;
        this.m = ato.a();
        this.n = asa;
        this.o = arh;
        Context context = asj.f;
        this.y = new g(aitb);
        this.i = new asx(context, this.y);
        this.j = new i(this, (byte) 0);
        this.k = new j(this, (byte) 0);
        this.l = new ast(context);
        this.z = new ata(new ath(10));
    }

    static String a(File file) {
        return file.getName().substring(0, 35);
    }

    private static void a(asd asd) {
        if (asd != null) {
            try {
                asd.a();
            } catch (IOException e) {
                aiqj.a().c("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    private static void a(ase ase, File file) {
        Throwable th;
        String str = "Failed to close file input stream.";
        if (file.exists()) {
            Closeable fileInputStream;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    asi.a((InputStream) fileInputStream, ase, (int) file.length());
                    airf.a(fileInputStream, str);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    airf.a(fileInputStream, str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                airf.a(fileInputStream, str);
                throw th;
            }
        }
        aiqr a = aiqj.a();
        StringBuilder stringBuilder = new StringBuilder("Tried to include a file that doesn't exist: ");
        stringBuilder.append(file.getName());
        a.c("CrashlyticsCore", stringBuilder.toString(), null);
    }

    private void a(ase ase, String str) {
        String[] strArr = u;
        for (int i = 0; i < 4; i++) {
            String str2 = strArr[i];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(".cls");
            File[] a = a(new d(stringBuilder.toString()));
            String str3 = " data for session ID ";
            String str4 = "CrashlyticsCore";
            if (a.length == 0) {
                aiqr a2 = aiqj.a();
                stringBuilder = new StringBuilder("Can't find ");
                stringBuilder.append(str2);
                stringBuilder.append(str3);
                stringBuilder.append(str);
                a2.c(str4, stringBuilder.toString(), null);
            } else {
                aiqr a3 = aiqj.a();
                StringBuilder stringBuilder2 = new StringBuilder("Collecting ");
                stringBuilder2.append(str2);
                stringBuilder2.append(str3);
                stringBuilder2.append(str);
                a3.a(str4, stringBuilder2.toString());
                asi.a(ase, a[0]);
            }
        }
    }

    private static void a(ase ase, File[] fileArr, String str) {
        String str2 = "CrashlyticsCore";
        Arrays.sort(fileArr, airf.a);
        for (File name : fileArr) {
            try {
                aiqj.a().a(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, name.getName()}));
                asi.a(ase, name);
            } catch (Exception e) {
                aiqj.a().c(str2, "Error writting non-fatal to session.", e);
            }
        }
    }

    private static void a(InputStream inputStream, ase ase, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        int length = bArr.length;
        if (4096 - ase.c >= length) {
            System.arraycopy(bArr, 0, ase.a, ase.c, length);
            ase.c += length;
            return;
        }
        i2 = 4096 - ase.c;
        System.arraycopy(bArr, 0, ase.a, ase.c, i2);
        length -= i2;
        ase.c = 4096;
        ase.a();
        if (length <= 4096) {
            System.arraycopy(bArr, i2, ase.a, 0, length);
            ase.c = length;
            return;
        }
        ase.d.write(bArr, i2, length);
    }

    private void a(String str) {
        for (File delete : a(new l(str))) {
            delete.delete();
        }
    }

    private void a(String str, String str2, b bVar) {
        Throwable th;
        StringBuilder stringBuilder;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        Flushable flushable = null;
        Closeable asd;
        try {
            File e = e();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            asd = new asd(e, stringBuilder2.toString());
            try {
                flushable = ase.a((OutputStream) asd);
                bVar.a(flushable);
                StringBuilder stringBuilder3 = new StringBuilder(str4);
                stringBuilder3.append(str2);
                stringBuilder3.append(str5);
                airf.a(flushable, stringBuilder3.toString());
                stringBuilder3 = new StringBuilder(str3);
                stringBuilder3.append(str2);
                stringBuilder3.append(str5);
                airf.a(asd, stringBuilder3.toString());
            } catch (Throwable th2) {
                th = th2;
                stringBuilder = new StringBuilder(str4);
                stringBuilder.append(str2);
                stringBuilder.append(str5);
                airf.a(flushable, stringBuilder.toString());
                stringBuilder = new StringBuilder(str3);
                stringBuilder.append(str2);
                stringBuilder.append(str5);
                airf.a(asd, stringBuilder.toString());
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            asd = null;
            stringBuilder = new StringBuilder(str4);
            stringBuilder.append(str2);
            stringBuilder.append(str5);
            airf.a(flushable, stringBuilder.toString());
            stringBuilder = new StringBuilder(str3);
            stringBuilder.append(str2);
            stringBuilder.append(str5);
            airf.a(asd, stringBuilder.toString());
            throw th;
        }
    }

    private void a(String str, String str2, e eVar) {
        Throwable th;
        StringBuilder stringBuilder;
        String str3 = " file.";
        String str4 = "Failed to close ";
        Closeable closeable = null;
        try {
            File e = e();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            Closeable fileOutputStream = new FileOutputStream(new File(e, stringBuilder2.toString()));
            try {
                eVar.a(fileOutputStream);
                StringBuilder stringBuilder3 = new StringBuilder(str4);
                stringBuilder3.append(str2);
                stringBuilder3.append(str3);
                airf.a(fileOutputStream, stringBuilder3.toString());
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream;
                stringBuilder = new StringBuilder(str4);
                stringBuilder.append(str2);
                stringBuilder.append(str3);
                airf.a(closeable, stringBuilder.toString());
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            stringBuilder = new StringBuilder(str4);
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            airf.a(closeable, stringBuilder.toString());
            throw th;
        }
    }

    private void a(File[] fileArr, int i, int i2) {
        Throwable e;
        File[] fileArr2 = fileArr;
        int i3 = i2;
        String str = "Failed to close CLS file";
        String str2 = "Error flushing session file stream";
        String str3 = "CrashlyticsCore";
        aiqj.a().a(str3, "Closing open sessions.");
        int i4 = i;
        while (i4 < fileArr2.length) {
            File file = fileArr2[i4];
            String a = asi.a(file);
            aiqj.a().a(str3, "Closing session: ".concat(String.valueOf(a)));
            aiqj.a().a(str3, "Collecting session parts for ID ".concat(String.valueOf(a)));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("SessionCrash");
            File[] a2 = a(new d(stringBuilder.toString()));
            boolean z = a2 != null && a2.length > 0;
            aiqj.a().a(str3, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{a, Boolean.valueOf(z)}));
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(a);
            String str4 = "SessionEvent";
            stringBuilder2.append(str4);
            File[] a3 = a(new d(stringBuilder2.toString()));
            boolean z2 = a3 != null && a3.length > 0;
            int i5 = i4;
            aiqj.a().a(str3, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{a, Boolean.valueOf(z2)}));
            if (z || z2) {
                if (a3.length > i3) {
                    aiqj.a().a(str3, String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i2)}));
                    a(a, i3);
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(a);
                    stringBuilder3.append(str4);
                    a3 = a(new d(stringBuilder3.toString()));
                }
                File file2 = z ? a2[0] : null;
                boolean z3 = file2 != null;
                File i6 = z3 ? i() : j();
                if (!i6.exists()) {
                    i6.mkdirs();
                }
                Closeable asd;
                try {
                    asd = new asd(i6, a);
                    try {
                        Flushable a4 = ase.a((OutputStream) asd);
                        aiqj.a().a(str3, "Collecting SessionStart data for session ID ".concat(String.valueOf(a)));
                        asi.a((ase) a4, file);
                        a4.a(4, new Date().getTime() / 1000);
                        a4.a(5, z3);
                        a4.a(11, 1);
                        a4.b(12, 3);
                        a((ase) a4, a);
                        asi.a((ase) a4, a3, a);
                        if (z3) {
                            asi.a((ase) a4, file2);
                        }
                        airf.a(a4, str2);
                        airf.a(asd, str);
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            aiqj.a().c(str3, "Failed to write session file for session ID: ".concat(String.valueOf(a)), e);
                            airf.a(null, str2);
                            asi.a((asd) asd);
                            aiqj.a().a(str3, "Removing session part files for ID ".concat(String.valueOf(a)));
                            a(a);
                            i4 = i5 + 1;
                            fileArr2 = fileArr;
                        } catch (Throwable th) {
                            e = th;
                            airf.a(null, str2);
                            airf.a(asd, str);
                            throw e;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    asd = null;
                    aiqj.a().c(str3, "Failed to write session file for session ID: ".concat(String.valueOf(a)), e);
                    airf.a(null, str2);
                    asi.a((asd) asd);
                    aiqj.a().a(str3, "Removing session part files for ID ".concat(String.valueOf(a)));
                    a(a);
                    i4 = i5 + 1;
                    fileArr2 = fileArr;
                } catch (Throwable th2) {
                    e = th2;
                    asd = null;
                    airf.a(null, str2);
                    airf.a(asd, str);
                    throw e;
                }
            }
            aiqj.a().a(str3, "No events present for session ID ".concat(String.valueOf(a)));
            aiqj.a().a(str3, "Removing session part files for ID ".concat(String.valueOf(a)));
            a(a);
            i4 = i5 + 1;
            fileArr2 = fileArr;
        }
    }

    private static void a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            aiqr a;
            String str;
            String name = file.getName();
            Matcher matcher = c.matcher(name);
            String str2 = "CrashlyticsCore";
            if (!matcher.matches()) {
                a = aiqj.a();
                name = String.valueOf(name);
                str = "Deleting unknown file: ";
            } else if (set.contains(matcher.group(1))) {
            } else {
                a = aiqj.a();
                name = String.valueOf(name);
                str = "Trimming session file: ";
            }
            a.a(str2, str.concat(name));
            file.delete();
        }
    }

    private static File[] a(File file, FilenameFilter filenameFilter) {
        return asi.a(file.listFiles(filenameFilter));
    }

    static File[] a(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    static boolean g() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private File[] h() {
        File[] a = a(q);
        Arrays.sort(a, r);
        return a;
    }

    private File i() {
        return new File(e(), "fatal-sessions");
    }

    private File j() {
        return new File(e(), "nonfatal-sessions");
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        File[] h = h();
        return h.length > 0 ? asi.a(h[0]) : null;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        i -= atq.a(i(), i, s);
        atq.a(e(), a, i - atq.a(j(), i, s), s);
    }

    /* Access modifiers changed, original: final */
    public final void a(aitu aitu, boolean z) {
        int i = z + 8;
        Set hashSet = new HashSet();
        File[] h = h();
        i = Math.min(i, h.length);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(asi.a(h[i2]));
        }
        this.i.a(hashSet);
        asi.a(a(new a()), hashSet);
        File[] h2 = h();
        String str = "CrashlyticsCore";
        if (h2.length <= z) {
            aiqj.a().a(str, "No open sessions to be closed.");
            return;
        }
        String a = asi.a(h2[z]);
        final atp atp = d() ? new atp(null, this.e.h(), this.e.g()) : new asz(e()).a(a);
        a(a, "SessionUser", new b() {
            public final void a(ase ase) {
                String str = atp.b;
                String str2 = atp.c;
                String str3 = atp.d;
                if (str == null) {
                    str = "";
                }
                asb a = asb.a(str);
                asb a2 = atk.a(str2);
                asb a3 = atk.a(str3);
                int b = ase.b(1, a) + 0;
                if (str2 != null) {
                    b += ase.b(2, a2);
                }
                if (str3 != null) {
                    b += ase.b(3, a3);
                }
                ase.e(6, 2);
                ase.c(b);
                ase.a(1, a);
                if (str2 != null) {
                    ase.a(2, a2);
                }
                if (str3 != null) {
                    ase.a(3, a3);
                }
            }
        });
        if (aitu == null) {
            aiqj.a().a(str, "Unable to close session. Settings are not loaded.");
        } else {
            a(h2, (int) z, aitu.a);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ase ase, Date date, Thread thread, Throwable th, String str, boolean z) {
        StackTraceElement[] stackTraceElementArr;
        Thread[] threadArr;
        RunningAppProcessInfo runningAppProcessInfo;
        TreeMap unmodifiableMap;
        ase ase2 = ase;
        atn atn = new atn(th, this.z);
        Context context = this.e.f;
        long time = date.getTime() / 1000;
        Float a = airf.a(context);
        boolean z2 = this.l.h;
        Float a2 = airf.a(context);
        int i = (!z2 || a2 == null) ? 1 : ((double) a2.floatValue()) >= 99.0d ? 3 : ((double) a2.floatValue()) < 99.0d ? 2 : 0;
        z2 = (airf.b(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
        int i2 = context.getResources().getConfiguration().orientation;
        long a3 = airf.a();
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService(Event.ACTIVITY)).getMemoryInfo(memoryInfo);
        long j = a3 - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = (long) statFs.getBlockSize();
        int i3 = i2;
        blockSize = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        RunningAppProcessInfo a4 = airf.a(context.getPackageName(), context);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr2 = atn.c;
        String str2 = this.h.b;
        boolean z3 = z2;
        String str3 = this.w.d;
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            stackTraceElementArr = stackTraceElementArr2;
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            int i4 = 0;
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr2[i4] = (Thread) entry.getKey();
                threadArr = threadArr2;
                runningAppProcessInfo = a4;
                linkedList.add(this.z.a((StackTraceElement[]) entry.getValue()));
                i4++;
                threadArr2 = threadArr;
                a4 = runningAppProcessInfo;
            }
            threadArr = threadArr2;
            runningAppProcessInfo = a4;
        } else {
            stackTraceElementArr = stackTraceElementArr2;
            runningAppProcessInfo = a4;
            threadArr = new Thread[0];
        }
        if (airf.a(context, "com.crashlytics.CollectCustomKeys", true)) {
            unmodifiableMap = Collections.unmodifiableMap(this.e.a);
            if (unmodifiableMap != null && unmodifiableMap.size() > 1) {
                unmodifiableMap = new TreeMap(unmodifiableMap);
            }
        } else {
            unmodifiableMap = new TreeMap();
        }
        asx asx = this.i;
        asb a5 = asb.a(str3);
        asb a6 = str2 == null ? null : asb.a(str2.replace("-", ""));
        asb a7 = asx.a.a();
        if (a7 == null) {
            aiqj.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        asx.a.c();
        ase2.e(10, 2);
        int b = (ase.b(1, time) + 0) + ase.b(2, asb.a(str));
        LinkedList linkedList2 = linkedList;
        int i5 = i3;
        long j2 = blockSize;
        int a8 = atk.a(atn, thread, stackTraceElementArr, threadArr, linkedList2, a5, a6, unmodifiableMap, runningAppProcessInfo, i5);
        b += (ase.d(24) + ase.d(a8)) + a8;
        a8 = atk.a(a, i, i5, j, j2);
        b += (ase.d(40) + ase.d(a8)) + a8;
        if (a7 != null) {
            a8 = ase.b(1, a7);
            b += (ase.d(48) + ase.d(a8)) + a8;
        }
        ase2.c(b);
        ase2.a(1, time);
        ase2.a(2, asb.a(str));
        ase2.e(3, 2);
        ase2.c(atk.a(atn, thread, stackTraceElementArr, threadArr, linkedList2, a5, a6, unmodifiableMap, runningAppProcessInfo, i5));
        Map map = unmodifiableMap;
        asb asb = a7;
        boolean z4 = z3;
        int i6 = i;
        long j3 = j;
        atk.a(ase, atn, thread, stackTraceElementArr, threadArr, (List) linkedList2, a5, a6);
        if (!(map == null || map.isEmpty())) {
            atk.a(ase2, map);
        }
        RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        if (runningAppProcessInfo2 != null) {
            ase2.a(3, runningAppProcessInfo2.importance != 100);
        }
        int i7 = i5;
        ase2.a(4, i7);
        ase2.e(5, 2);
        int i8 = i6;
        z2 = z4;
        asb asb2 = asb;
        ase2.c(atk.a(a, i6, i7, j3, j2));
        if (a != null) {
            float floatValue = a.floatValue();
            ase2.e(1, 5);
            a8 = Float.floatToRawIntBits(floatValue);
            ase2.a((byte) a8);
            ase2.a((byte) (a8 >> 8));
            ase2.a((byte) (a8 >> 16));
            ase2.a((byte) (a8 >>> 24));
        }
        ase2.a(i8);
        ase2.a(3, z2);
        ase2.a(4, i7);
        ase2.a(5, j3);
        ase2.a(6, j2);
        if (asb2 != null) {
            ase2.e(6, 2);
            ase2.c(ase.b(1, asb2));
            ase2.a(1, asb2);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(aso.b bVar, Thread thread, Throwable th, boolean z) {
        StringBuilder stringBuilder = new StringBuilder("Crashlytics is handling uncaught exception \"");
        stringBuilder.append(th);
        stringBuilder.append("\" from thread ");
        stringBuilder.append(thread.getName());
        aiqj.a().a("CrashlyticsCore", stringBuilder.toString());
        ast ast = this.l;
        if (ast.d.getAndSet(false)) {
            ast.e.unregisterReceiver(ast.g);
            ast.e.unregisterReceiver(ast.f);
        }
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final aso.b bVar2 = bVar;
        final boolean z2 = z;
        this.f.a(new Callable<Void>() {
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:81:0x0184 in {6, 7, 9, 11, 17, 23, 25, 31, 33, 35, 37, 39, 41, 42, 44, 45, 48, 51, 52, 56, 57, 58, 61, 64, 65, 68, 69, 72, 75, 77, 78, 80} preds:[]
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
                	at java.lang.Iterable.forEach(Iterable.java:75)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
                	at jadx.core.ProcessClass.process(ProcessClass.java:37)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            private java.lang.Void a() {
                /*
                r16 = this;
                r1 = r16;
                r2 = "Failed to close fatal exception file output stream.";
                r3 = "Failed to flush to session begin file.";
                r4 = "CrashlyticsCore";
                r0 = defpackage.asi.this;
                r0 = r0.e;
                r0 = r0.c;
                r0.a();
                r5 = defpackage.asi.this;
                r7 = r2;
                r8 = r3;
                r9 = r4;
                r13 = 1;
                r14 = 0;
                r0 = r5.a();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                if (r0 != 0) goto L_0x003a;
                r0 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x0036, all -> 0x0032 }
                r5 = "Tried to write a fatal exception while no session was open.";	 Catch:{ Exception -> 0x0036, all -> 0x0032 }
                r0.c(r4, r5, r14);	 Catch:{ Exception -> 0x0036, all -> 0x0032 }
                defpackage.airf.a(r14, r3);
                defpackage.airf.a(r14, r2);
                goto L_0x00f0;
                r0 = move-exception;
                r5 = r14;
                goto L_0x017d;
                r0 = move-exception;
                r5 = r14;
                goto L_0x00e1;
                r6 = r9.getClass();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r6 = r6.getName();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = defpackage.aqu.class;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = defpackage.aiqj.a(r10);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = (defpackage.aqu) r10;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                if (r10 != 0) goto L_0x0056;
                r6 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x0036, all -> 0x0032 }
                r10 = "Answers is not available";	 Catch:{ Exception -> 0x0036, all -> 0x0032 }
                r6.a(r4, r10);	 Catch:{ Exception -> 0x0036, all -> 0x0032 }
                goto L_0x00a0;
                r11 = new airg$a;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r11.<init>(r0, r6);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r6 = r10.a;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                if (r6 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r6 = r10.a;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = r11.a;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r11 = r11.b;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r15 = android.os.Looper.myLooper();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r14 = android.os.Looper.getMainLooper();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                if (r15 == r14) goto L_0x0098;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r14 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r15 = "Answers";	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12 = "Logged crash";	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r14.a(r15, r12);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r6 = r6.b;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12 = "sessionId";	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = java.util.Collections.singletonMap(r12, r10);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12 = new aru$a;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r14 = defpackage.aru.b.CRASH;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12.<init>(r14);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12.c = r10;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = "exceptionName";	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = java.util.Collections.singletonMap(r10, r11);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12.d = r10;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = 0;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r6.a(r12, r13, r10);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                goto L_0x00a0;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r0 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r5 = "onCrash called from main thread!!!";	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r0.<init>(r5);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                throw r0;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r14 = new asd;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r6 = r5.e();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10.<init>();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10.append(r0);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r0 = "SessionCrash";	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r10.append(r0);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r0 = r10.toString();	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r14.<init>(r6, r0);	 Catch:{ Exception -> 0x00de, all -> 0x00d9 }
                r12 = defpackage.ase.a(r14);	 Catch:{ Exception -> 0x00d6, all -> 0x00d3 }
                r10 = "crash";	 Catch:{ Exception -> 0x00cf, all -> 0x00ca }
                r11 = 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00ca }
                r6 = r12;	 Catch:{ Exception -> 0x00cf, all -> 0x00ca }
                r5.a(r6, r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x00cf, all -> 0x00ca }
                defpackage.airf.a(r12, r3);
                goto L_0x002d;
                r0 = move-exception;
                r5 = r14;
                r14 = r12;
                goto L_0x017d;
                r0 = move-exception;
                r5 = r14;
                r14 = r12;
                goto L_0x00e1;
                r0 = move-exception;
                r5 = r14;
                goto L_0x00db;
                r0 = move-exception;
                r5 = r14;
                goto L_0x00e0;
                r0 = move-exception;
                r5 = 0;
                r14 = 0;
                goto L_0x017d;
                r0 = move-exception;
                r5 = 0;
                r14 = 0;
                r6 = defpackage.aiqj.a();	 Catch:{ all -> 0x017c }
                r7 = "An error occurred in the fatal exception logger";	 Catch:{ all -> 0x017c }
                r6.c(r4, r7, r0);	 Catch:{ all -> 0x017c }
                defpackage.airf.a(r14, r3);
                defpackage.airf.a(r5, r2);
                r0 = r5;
                r0 = r0.a();
                if (r0 == 0) goto L_0x00fd;
                r14 = r0.b;
                r2 = r0.d;
                goto L_0x00ff;
                r2 = 0;
                r14 = 0;
                if (r2 == 0) goto L_0x0108;
                r2 = r2.d;
                if (r2 == 0) goto L_0x0106;
                goto L_0x0108;
                r2 = 0;
                goto L_0x0109;
                r2 = 1;
                if (r2 != 0) goto L_0x010f;
                r2 = r6;
                if (r2 == 0) goto L_0x0159;
                r2 = defpackage.asi.this;
                r3 = r2;
                r5 = r3.getTime();
                r3 = defpackage.asi.g();
                if (r3 == 0) goto L_0x0127;
                r2 = defpackage.aiqj.a();
                r3 = "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists";
                r2.a(r4, r3);
                goto L_0x0159;
                r3 = r2.o;
                if (r3 == 0) goto L_0x0152;
                r3 = defpackage.aiqj.a();
                r7 = "Logging Crashlytics event to Firebase";
                r3.a(r4, r7);
                r3 = new android.os.Bundle;
                r3.<init>();
                r4 = "_r";
                r3.putInt(r4, r13);
                r4 = "fatal";
                r3.putInt(r4, r13);
                r4 = "timestamp";
                r3.putLong(r4, r5);
                r2 = r2.o;
                r4 = "clx";
                r5 = "_ae";
                r2.a(r4, r5, r3);
                goto L_0x0159;
                r2 = defpackage.aiqj.a();
                r3 = "Skipping logging Crashlytics event to Firebase, no Firebase Analytics";
                goto L_0x0123;
                r2 = defpackage.asi.this;
                r3 = 0;
                r2.a(r14, r3);
                r2 = defpackage.asi.this;
                defpackage.asi.a(r2);
                if (r14 == 0) goto L_0x016d;
                r2 = defpackage.asi.this;
                r3 = r14.b;
                r2.a(r3);
                r2 = defpackage.asi.this;
                r2 = r2.a(r0);
                if (r2 != 0) goto L_0x017a;
                r2 = defpackage.asi.this;
                defpackage.asi.a(r2, r0);
                r2 = 0;
                return r2;
                r0 = move-exception;
                defpackage.airf.a(r14, r3);
                defpackage.airf.a(r5, r2);
                throw r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.asi$22.a():java.lang.Void");
            }

            public final /* synthetic */ Object call() {
                return a();
            }
        });
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, int i) {
        File e = e();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("SessionEvent");
        atq.a(e, new d(stringBuilder.toString()), i, s);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2) {
        this.f.b(new 2(null, str, str2));
    }

    /* Access modifiers changed, original: final */
    public final boolean a(aity aity) {
        if (aity != null && aity.d.a) {
            atf atf = this.g;
            String str = "preferences_migration_complete";
            String str2 = "always_send_reports_opt_in";
            if (!atf.a.a().contains(str)) {
                aite aite = new aite(atf.b);
                Object obj = (atf.a.a().contains(str2) || !aite.a().contains(str2)) ? null : 1;
                if (obj != null) {
                    atf.a.a(atf.a.b().putBoolean(str2, aite.a().getBoolean(str2, false)));
                }
                atf.a.a(atf.a.b().putBoolean(str, true));
            }
            if (!atf.a.a().getBoolean(str2, false)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final File[] a(FilenameFilter filenameFilter) {
        return asi.a(e(), filenameFilter);
    }

    /* Access modifiers changed, original: final */
    public final asq b(String str, String str2) {
        String d = airf.d(this.e.f, "com.crashlytics.ApiEndpoint");
        return new asf(new ass(this.e, d, str, this.v), new atc(this.e, d, str2, this.v));
    }

    /* Access modifiers changed, original: final */
    public final File[] b() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, asi.a(i(), a));
        Collections.addAll(linkedList, asi.a(j(), a));
        Collections.addAll(linkedList, asi.a(e(), a));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        File f = f();
        if (f.exists()) {
            File[] a = asi.a(f, new f());
            Arrays.sort(a, Collections.reverseOrder());
            Set hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(asi.a(a[i]));
            }
            asi.a(asi.a(f.listFiles()), hashSet);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        aso aso = this.p;
        return aso != null && aso.a.get();
    }

    /* Access modifiers changed, original: final */
    public final File e() {
        return this.x.a();
    }

    /* Access modifiers changed, original: final */
    public final File f() {
        return new File(e(), "invalidClsFiles");
    }
}
