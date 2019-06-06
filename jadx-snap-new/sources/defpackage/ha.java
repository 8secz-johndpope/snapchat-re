package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: ha */
public class ha extends ContentProvider {
    private static final String[] a = new String[]{ohk.b, ohk.c};
    private static final File b = new File("/");
    private static HashMap<String, a> c = new HashMap();
    private a d;

    /* renamed from: ha$b */
    static class b implements a {
        final HashMap<String, File> a = new HashMap();
        private final String b;

        b(String str) {
            this.b = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00c2 in {9, 10, 14, 15, 17, 19, 22} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final android.net.Uri a(java.io.File r6) {
            /*
            r5 = this;
            r6 = r6.getCanonicalPath();	 Catch:{ IOException -> 0x00b2 }
            r0 = 0;
            r1 = r5.a;
            r1 = r1.entrySet();
            r1 = r1.iterator();
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0043;
            r2 = r1.next();
            r2 = (java.util.Map.Entry) r2;
            r3 = r2.getValue();
            r3 = (java.io.File) r3;
            r3 = r3.getPath();
            r4 = r6.startsWith(r3);
            if (r4 == 0) goto L_0x000f;
            if (r0 == 0) goto L_0x0041;
            r3 = r3.length();
            r4 = r0.getValue();
            r4 = (java.io.File) r4;
            r4 = r4.getPath();
            r4 = r4.length();
            if (r3 <= r4) goto L_0x000f;
            r0 = r2;
            goto L_0x000f;
            if (r0 == 0) goto L_0x00a2;
            r1 = r0.getValue();
            r1 = (java.io.File) r1;
            r1 = r1.getPath();
            r2 = "/";
            r3 = r1.endsWith(r2);
            if (r3 == 0) goto L_0x005c;
            r1 = r1.length();
            goto L_0x0062;
            r1 = r1.length();
            r1 = r1 + 1;
            r6 = r6.substring(r1);
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r0 = r0.getKey();
            r0 = (java.lang.String) r0;
            r0 = android.net.Uri.encode(r0);
            r1.append(r0);
            r0 = 47;
            r1.append(r0);
            r6 = android.net.Uri.encode(r6, r2);
            r1.append(r6);
            r6 = r1.toString();
            r0 = new android.net.Uri$Builder;
            r0.<init>();
            r1 = "content";
            r0 = r0.scheme(r1);
            r1 = r5.b;
            r0 = r0.authority(r1);
            r6 = r0.encodedPath(r6);
            r6 = r6.build();
            return r6;
            r0 = new java.lang.IllegalArgumentException;
            r6 = java.lang.String.valueOf(r6);
            r1 = "Failed to find configured root that contains ";
            r6 = r1.concat(r6);
            r0.<init>(r6);
            throw r0;
            r0 = new java.lang.IllegalArgumentException;
            r6 = java.lang.String.valueOf(r6);
            r1 = "Failed to resolve canonical path for ";
            r6 = r1.concat(r6);
            r0.<init>(r6);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ha$b.a(java.io.File):android.net.Uri");
        }

        public final File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            encodedPath = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.a.get(decode);
            if (file != null) {
                Object file2 = new File(file, encodedPath);
                try {
                    file2 = file2.getCanonicalFile();
                    if (file2.getPath().startsWith(file.getPath())) {
                        return file2;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: ha$a */
    interface a {
        Uri a(File file);

        File a(Uri uri);
    }

    public static Uri a(Context context, String str, File file) {
        return ha.a(context, str).a(file);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:71:0x010a in {14, 17, 20, 23, 28, 33, 40, 47, 50, 52, 55, 58, 62, 65, 67, 70} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static defpackage.ha.a a(android.content.Context r11, java.lang.String r12) {
        /*
        r0 = c;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x0107 }
        r1 = r1.get(r12);	 Catch:{ all -> 0x0107 }
        r1 = (defpackage.ha.a) r1;	 Catch:{ all -> 0x0107 }
        if (r1 != 0) goto L_0x0105;
        r1 = new ha$b;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r1.<init>(r12);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r2 = r11.getPackageManager();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r2 = r2.resolveContentProvider(r12, r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = r11.getPackageManager();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r4 = "android.support.FILE_PROVIDER_PATHS";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r2 = r2.loadXmlMetaData(r3, r4);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r2 == 0) goto L_0x00eb;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = r2.next();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r4 = 1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r3 == r4) goto L_0x00e5;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r5 = 2;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r3 != r5) goto L_0x0028;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = r2.getName();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r5 = "name";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = 0;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r5 = r2.getAttributeValue(r6, r5);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r7 = "path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r7 = r2.getAttributeValue(r6, r7);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "root-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r9 = 0;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 == 0) goto L_0x004f;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = b;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "files-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 == 0) goto L_0x005c;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = r11.getFilesDir();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "cache-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 == 0) goto L_0x0069;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = r11.getCacheDir();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "external-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 == 0) goto L_0x0076;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "external-files-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 == 0) goto L_0x0088;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = android.support.v4.content.ContextCompat.getExternalFilesDirs(r11, r6);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r3.length;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 <= 0) goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = r3[r9];	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "external-cache-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 == 0) goto L_0x009a;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = android.support.v4.content.ContextCompat.getExternalCacheDirs(r11);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r3.length;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 <= 0) goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = r3[r9];	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r10 = 21;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 < r10) goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = "external-media-path";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = r8.equals(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r3 == 0) goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = r11.getExternalMediaDirs();	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r8 = r3.length;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r8 <= 0) goto L_0x00b1;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r6 = r3[r9];	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r6 == 0) goto L_0x0028;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = new java.lang.String[r4];	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3[r9] = r7;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r3 = defpackage.ha.a(r6, r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r4 = android.text.TextUtils.isEmpty(r5);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        if (r4 != 0) goto L_0x00dd;
        r3 = r3.getCanonicalFile();	 Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x00f3 }
        r4 = r1.a;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r4.put(r5, r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        goto L_0x0028;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r11 = move-exception;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r1 = "Failed to resolve canonical path for ";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r2 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r1 = r1.concat(r2);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r12.<init>(r1, r11);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        throw r12;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r11 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r12 = "Name must not be empty";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r11.<init>(r12);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        throw r11;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r11 = c;	 Catch:{ all -> 0x0107 }
        r11.put(r12, r1);	 Catch:{ all -> 0x0107 }
        goto L_0x0105;
        r11 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r12 = "Missing android.support.FILE_PROVIDER_PATHS meta-data";	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r11.<init>(r12);	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        throw r11;	 Catch:{ IOException -> 0x00fc, XmlPullParserException -> 0x00f3 }
        r11 = move-exception;
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0107 }
        r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";	 Catch:{ all -> 0x0107 }
        r12.<init>(r1, r11);	 Catch:{ all -> 0x0107 }
        throw r12;	 Catch:{ all -> 0x0107 }
        r11 = move-exception;	 Catch:{ all -> 0x0107 }
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0107 }
        r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";	 Catch:{ all -> 0x0107 }
        r12.<init>(r1, r11);	 Catch:{ all -> 0x0107 }
        throw r12;	 Catch:{ all -> 0x0107 }
        monitor-exit(r0);	 Catch:{ all -> 0x0107 }
        return r1;	 Catch:{ all -> 0x0107 }
        r11 = move-exception;	 Catch:{ all -> 0x0107 }
        monitor-exit(r0);	 Catch:{ all -> 0x0107 }
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha.a(android.content.Context, java.lang.String):ha$a");
    }

    private static File a(File file, String... strArr) {
        File file2 = file;
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file2 = new File(file2, str);
            }
        }
        return file2;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.d = ha.a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.d.a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        File a = this.d.a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a = this.d.a(uri);
        if ("r".equals(str)) {
            i = SQLiteDatabase.CREATE_IF_NECESSARY;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
        }
        return ParcelFileDescriptor.open(a, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File a = this.d.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i = 0;
        for (Object obj : strArr) {
            int i2;
            String str3 = ohk.b;
            if (str3.equals(obj)) {
                strArr3[i] = str3;
                i2 = i + 1;
                objArr[i] = a.getName();
            } else {
                str3 = ohk.c;
                if (str3.equals(obj)) {
                    strArr3[i] = str3;
                    i2 = i + 1;
                    objArr[i] = Long.valueOf(a.length());
                } else {
                }
            }
            i = i2;
        }
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
