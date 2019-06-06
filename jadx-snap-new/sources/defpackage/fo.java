package defpackage;

/* renamed from: fo */
public final class fo {
    public static int a = 1;

    /* renamed from: fo$a */
    public interface a {
        boolean a(fp fpVar, int i);
    }

    /* JADX WARNING: Missing block: B:10:0x0018, code skipped:
            if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Missing block: B:14:0x0027, code skipped:
            if (r3 != null) goto L_0x002c;
     */
    public static android.view.inputmethod.InputConnection a(android.view.inputmethod.InputConnection r2, android.view.inputmethod.EditorInfo r3, final defpackage.fo.a r4) {
        /*
        if (r2 == 0) goto L_0x0046;
    L_0x0002:
        if (r3 == 0) goto L_0x003e;
    L_0x0004:
        if (r4 == 0) goto L_0x0036;
    L_0x0006:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 25;
        if (r0 < r1) goto L_0x0012;
    L_0x000c:
        r3 = new fo$1;
        r3.<init>(r2, r4);
        return r3;
    L_0x0012:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r1) goto L_0x001b;
    L_0x0016:
        r3 = r3.contentMimeTypes;
        if (r3 == 0) goto L_0x002a;
    L_0x001a:
        goto L_0x002c;
    L_0x001b:
        r0 = r3.extras;
        if (r0 == 0) goto L_0x002a;
    L_0x001f:
        r3 = r3.extras;
        r0 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
        r3 = r3.getStringArray(r0);
        if (r3 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002c;
    L_0x002a:
        r3 = defpackage.fn.a;
    L_0x002c:
        r3 = r3.length;
        if (r3 != 0) goto L_0x0030;
    L_0x002f:
        return r2;
    L_0x0030:
        r3 = new fo$2;
        r3.<init>(r2, r4);
        return r3;
    L_0x0036:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "onCommitContentListener must be non-null";
        r2.<init>(r3);
        throw r2;
    L_0x003e:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "editorInfo must be non-null";
        r2.<init>(r3);
        throw r2;
    L_0x0046:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "inputConnection must be non-null";
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.a(android.view.inputmethod.InputConnection, android.view.inputmethod.EditorInfo, fo$a):android.view.inputmethod.InputConnection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    static boolean a(java.lang.String r7, android.os.Bundle r8, defpackage.fo.a r9) {
        /*
        r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
        r7 = android.text.TextUtils.equals(r0, r7);
        r0 = 0;
        if (r7 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        if (r8 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r7 = 0;
        r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        r1 = r8.getParcelable(r1);	 Catch:{ all -> 0x004a }
        r1 = (android.os.ResultReceiver) r1;	 Catch:{ all -> 0x004a }
        r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
        r2 = r8.getParcelable(r2);	 Catch:{ all -> 0x0048 }
        r2 = (android.net.Uri) r2;	 Catch:{ all -> 0x0048 }
        r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
        r3 = r8.getParcelable(r3);	 Catch:{ all -> 0x0048 }
        r3 = (android.content.ClipDescription) r3;	 Catch:{ all -> 0x0048 }
        r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        r4 = r8.getParcelable(r4);	 Catch:{ all -> 0x0048 }
        r4 = (android.net.Uri) r4;	 Catch:{ all -> 0x0048 }
        r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        r5 = r8.getInt(r5);	 Catch:{ all -> 0x0048 }
        r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        r8.getParcelable(r6);	 Catch:{ all -> 0x0048 }
        r8 = new fp;	 Catch:{ all -> 0x0048 }
        r8.<init>(r2, r3, r4);	 Catch:{ all -> 0x0048 }
        r8 = r9.a(r8, r5);	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x0047;
    L_0x0044:
        r1.send(r8, r7);
    L_0x0047:
        return r8;
    L_0x0048:
        r8 = move-exception;
        goto L_0x004c;
    L_0x004a:
        r8 = move-exception;
        r1 = r7;
    L_0x004c:
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.send(r0, r7);
    L_0x0051:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.a(java.lang.String, android.os.Bundle, fo$a):boolean");
    }
}
