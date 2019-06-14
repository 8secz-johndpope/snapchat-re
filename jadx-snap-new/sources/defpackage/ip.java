package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import defpackage.iq.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ip */
public final class ip {
	static final jb<String, Typeface> a = new jb(16);
	static final Object b = new Object();
	static final jh<String, ArrayList<a<c>>> c = new jh();
	private static final iq d = new iq("fonts");
	private static final Comparator<byte[]> e = new 4();

	/* renamed from: ip$4 */
	static class 4 implements Comparator<byte[]> {
		4() {
		}

		public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
			int length;
			int length2;
			byte[] bArr = (byte[]) obj;
			byte[] bArr2 = (byte[]) obj2;
			if (bArr.length != bArr2.length) {
				length = bArr.length;
				length2 = bArr2.length;
			} else {
				int i = 0;
				while (i < bArr.length) {
					if (bArr[i] != bArr2[i]) {
						length = bArr[i];
						length2 = bArr2[i];
					} else {
						i++;
					}
				}
				return 0;
			}
			return length - length2;
		}
	}

	/* renamed from: ip$a */
	public static class a {
		final int a;
		final b[] b;

		public a(int i, b[] bVarArr) {
			this.a = i;
			this.b = bVarArr;
		}
	}

	/* renamed from: ip$b */
	public static class b {
		public final Uri a;
		public final int b;
		public final int c;
		public final boolean d;
		final int e;

		public b(Uri uri, int i, int i2, boolean z, int i3) {
			this.a = (Uri) jg.a(uri);
			this.b = i;
			this.c = i2;
			this.d = z;
			this.e = i3;
		}
	}

	/* renamed from: ip$c */
	static final class c {
		final Typeface a;
		final int b;

		c(Typeface typeface, int i) {
			this.a = typeface;
			this.b = i;
		}
	}

	/* JADX WARNING: Missing block: B:35:0x0079, code skipped:
	   return null;
	*/
	/* JADX WARNING: Missing block: B:39:0x008a, code skipped:
	   r2 = d;
	   r2.a(new defpackage.iq.2(r2, r1, new android.os.Handler(), new defpackage.ip.3()));
	*/
	/* JADX WARNING: Missing block: B:40:0x009e, code skipped:
	   return null;
	*/
	public static android.graphics.Typeface a(final android.content.Context r2, final defpackage.io r3, final defpackage.hh.a r4, android.os.Handler r5, boolean r6, int r7, final int r8) {
		/*
		  r5 = new java.lang.StringBuilder;
		  r5.<init>();
		  r0 = r3.e;
		  r5.append(r0);
		  r0 = "-";
		  r5.append(r0);
		  r5.append(r8);
		  r5 = r5.toString();
		  r0 = a;
		  r0 = r0.a(r5);
		  r0 = (android.graphics.Typeface) r0;
		  if (r0 == 0) goto L_0x0026;
		  L_0x0020:
		  if (r4 == 0) goto L_0x0025;
		  L_0x0022:
		  r4.a(r0);
		  L_0x0025:
		  return r0;
		  L_0x0026:
		  r0 = 0;
		  if (r6 == 0) goto L_0x0044;
		  L_0x0029:
		  r1 = -1;
		  if (r7 != r1) goto L_0x0044;
		  L_0x002c:
		  r2 = defpackage.ip.a(r2, r3, r8);
		  if (r4 == 0) goto L_0x0041;
		  L_0x0032:
		  r3 = r2.b;
		  if (r3 != 0) goto L_0x003c;
		  L_0x0036:
		  r3 = r2.a;
		  r4.a(r3, r0);
		  goto L_0x0041;
		  L_0x003c:
		  r3 = r2.b;
		  r4.a(r3, r0);
		  L_0x0041:
		  r2 = r2.a;
		  return r2;
		  L_0x0044:
		  r1 = new ip$1;
		  r1.<init>(r2, r3, r8, r5);
		  if (r6 == 0) goto L_0x0057;
		  L_0x004b:
		  r2 = d;	 Catch:{ InterruptedException -> 0x0056 }
		  r2 = r2.a(r1, r7);	 Catch:{ InterruptedException -> 0x0056 }
		  r2 = (defpackage.ip.c) r2;	 Catch:{ InterruptedException -> 0x0056 }
		  r2 = r2.a;	 Catch:{ InterruptedException -> 0x0056 }
		  return r2;
		  L_0x0056:
		  return r0;
		  L_0x0057:
		  if (r4 != 0) goto L_0x005b;
		  L_0x0059:
		  r2 = r0;
		  goto L_0x0060;
		  L_0x005b:
		  r2 = new ip$2;
		  r2.<init>(r4, r0);
		  L_0x0060:
		  r3 = b;
		  monitor-enter(r3);
		  r4 = c;	 Catch:{ all -> 0x009f }
		  r4 = r4.containsKey(r5);	 Catch:{ all -> 0x009f }
		  if (r4 == 0) goto L_0x007a;
		  L_0x006b:
		  if (r2 == 0) goto L_0x0078;
		  L_0x006d:
		  r4 = c;	 Catch:{ all -> 0x009f }
		  r4 = r4.get(r5);	 Catch:{ all -> 0x009f }
		  r4 = (java.util.ArrayList) r4;	 Catch:{ all -> 0x009f }
		  r4.add(r2);	 Catch:{ all -> 0x009f }
		  L_0x0078:
		  monitor-exit(r3);	 Catch:{ all -> 0x009f }
		  return r0;
		  L_0x007a:
		  if (r2 == 0) goto L_0x0089;
		  L_0x007c:
		  r4 = new java.util.ArrayList;	 Catch:{ all -> 0x009f }
		  r4.<init>();	 Catch:{ all -> 0x009f }
		  r4.add(r2);	 Catch:{ all -> 0x009f }
		  r2 = c;	 Catch:{ all -> 0x009f }
		  r2.put(r5, r4);	 Catch:{ all -> 0x009f }
		  L_0x0089:
		  monitor-exit(r3);	 Catch:{ all -> 0x009f }
		  r2 = d;
		  r3 = new ip$3;
		  r3.<init>(r5);
		  r4 = new android.os.Handler;
		  r4.<init>();
		  r5 = new iq$2;
		  r5.<init>(r1, r4, r3);
		  r2.a(r5);
		  return r0;
		  L_0x009f:
		  r2 = move-exception;
		  monitor-exit(r3);	 Catch:{ all -> 0x009f }
		  throw r2;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.ip.a(android.content.Context, io, hh$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
	}

	static c a(Context context, io ioVar, int i) {
		try {
			PackageManager packageManager = context.getPackageManager();
			Resources resources = context.getResources();
			String str = ioVar.a;
			ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
			if (resolveContentProvider == null) {
				throw new NameNotFoundException("No package found for authority: ".concat(String.valueOf(str)));
			} else if (resolveContentProvider.packageName.equals(ioVar.b)) {
				int i2;
				List a = ip.a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
				Collections.sort(a, e);
				List a2 = ioVar.d != null ? ioVar.d : hg.a(resources, 0);
				for (i2 = 0; i2 < a2.size(); i2++) {
					ArrayList arrayList = new ArrayList((Collection) a2.get(i2));
					Collections.sort(arrayList, e);
					if (ip.a(a, arrayList)) {
						break;
					}
				}
				resolveContentProvider = null;
				a aVar = resolveContentProvider == null ? new a(1, null) : new a(0, ip.a(context, ioVar, resolveContentProvider.authority));
				i2 = -3;
				if (aVar.a == 0) {
					Typeface a3 = hl.a.a(context, aVar.b, i);
					if (a3 != null) {
						i2 = 0;
					}
					return new c(a3, i2);
				}
				if (aVar.a == 1) {
					i2 = -2;
				}
				return new c(null, i2);
			} else {
				StringBuilder stringBuilder = new StringBuilder("Found content provider ");
				stringBuilder.append(str);
				stringBuilder.append(", but package was not ");
				stringBuilder.append(ioVar.b);
				throw new NameNotFoundException(stringBuilder.toString());
			}
		} catch (NameNotFoundException unused) {
			return new c(null, -1);
		}
	}

	private static List<byte[]> a(Signature[] signatureArr) {
		ArrayList arrayList = new ArrayList();
		for (Signature toByteArray : signatureArr) {
			arrayList.add(toByteArray.toByteArray());
		}
		return arrayList;
	}

	public static Map<Uri, ByteBuffer> a(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
		HashMap hashMap = new HashMap();
		for (b bVar : bVarArr) {
			if (bVar.e == 0) {
				Uri uri = bVar.a;
				if (!hashMap.containsKey(uri)) {
					hashMap.put(uri, hq.a(context, null, uri));
				}
			}
		}
		return Collections.unmodifiableMap(hashMap);
	}

	// bytesEq
	private static boolean a(List<byte[]> list, List<byte[]> list2) {
		if (list.size() != list2.size()) {
			return false;
		}
		for (int i = 0; i < list.size(); i++) {
			if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
				return false;
			}
		}
		return true;
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x0122 in {4, 5, 15, 16, 18, 19, 21, 22, 25, 26, 30, 31, 33, 35, 37, 40, 41} preds:[]
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
	    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
	    at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
	    at java.util.ArrayList.forEach(ArrayList.java:1257)
	    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	    at jadx.core.ProcessClass.process(ProcessClass.java:32)
	    at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
	    at java.lang.Iterable.forEach(Iterable.java:75)
	    at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
	    at jadx.core.ProcessClass.process(ProcessClass.java:37)
	    at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	    at jadx.api.JavaClass.decompile(JavaClass.java:62)
	    at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	*/
	private static defpackage.ip.b[] a(android.content.Context r21, defpackage.io r22, java.lang.String r23) {
		/*
		  r0 = r22;
		  r1 = r23;
		  r2 = new java.util.ArrayList;
		  r2.<init>();
		  r3 = new android.net.Uri$Builder;
		  r3.<init>();
		  r4 = "content";
		  r3 = r3.scheme(r4);
		  r3 = r3.authority(r1);
		  r3 = r3.build();
		  r5 = new android.net.Uri$Builder;
		  r5.<init>();
		  r4 = r5.scheme(r4);
		  r1 = r4.authority(r1);
		  r4 = "file";
		  r1 = r1.appendPath(r4);
		  r1 = r1.build();
		  r4 = 0;
		  r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x011b }
		  r6 = 16;	 Catch:{ all -> 0x011b }
		  r12 = 1;	 Catch:{ all -> 0x011b }
		  r13 = 0;	 Catch:{ all -> 0x011b }
		  if (r5 <= r6) goto L_0x0062;	 Catch:{ all -> 0x011b }
		  r5 = r21.getContentResolver();	 Catch:{ all -> 0x011b }
		  r14 = "_id";	 Catch:{ all -> 0x011b }
		  r15 = "file_id";	 Catch:{ all -> 0x011b }
		  r16 = "font_ttc_index";	 Catch:{ all -> 0x011b }
		  r17 = "font_variation_settings";	 Catch:{ all -> 0x011b }
		  r18 = "font_weight";	 Catch:{ all -> 0x011b }
		  r19 = "font_italic";	 Catch:{ all -> 0x011b }
		  r20 = "result_code";	 Catch:{ all -> 0x011b }
		  r7 = new java.lang.String[]{r14, r15, r16, r17, r18, r19, r20};	 Catch:{ all -> 0x011b }
		  r8 = "query = ?";	 Catch:{ all -> 0x011b }
		  r9 = new java.lang.String[r12];	 Catch:{ all -> 0x011b }
		  r0 = r0.c;	 Catch:{ all -> 0x011b }
		  r9[r13] = r0;	 Catch:{ all -> 0x011b }
		  r10 = 0;	 Catch:{ all -> 0x011b }
		  r11 = 0;	 Catch:{ all -> 0x011b }
		  r6 = r3;	 Catch:{ all -> 0x011b }
		  r0 = r5.query(r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x011b }
		  goto L_0x0086;	 Catch:{ all -> 0x011b }
		  r5 = r21.getContentResolver();	 Catch:{ all -> 0x011b }
		  r14 = "_id";	 Catch:{ all -> 0x011b }
		  r15 = "file_id";	 Catch:{ all -> 0x011b }
		  r16 = "font_ttc_index";	 Catch:{ all -> 0x011b }
		  r17 = "font_variation_settings";	 Catch:{ all -> 0x011b }
		  r18 = "font_weight";	 Catch:{ all -> 0x011b }
		  r19 = "font_italic";	 Catch:{ all -> 0x011b }
		  r20 = "result_code";	 Catch:{ all -> 0x011b }
		  r7 = new java.lang.String[]{r14, r15, r16, r17, r18, r19, r20};	 Catch:{ all -> 0x011b }
		  r8 = "query = ?";	 Catch:{ all -> 0x011b }
		  r9 = new java.lang.String[r12];	 Catch:{ all -> 0x011b }
		  r0 = r0.c;	 Catch:{ all -> 0x011b }
		  r9[r13] = r0;	 Catch:{ all -> 0x011b }
		  r10 = 0;	 Catch:{ all -> 0x011b }
		  r6 = r3;	 Catch:{ all -> 0x011b }
		  r0 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x011b }
		  r4 = r0;	 Catch:{ all -> 0x011b }
		  if (r4 == 0) goto L_0x010d;	 Catch:{ all -> 0x011b }
		  r0 = r4.getCount();	 Catch:{ all -> 0x011b }
		  if (r0 <= 0) goto L_0x010d;	 Catch:{ all -> 0x011b }
		  r0 = "result_code";	 Catch:{ all -> 0x011b }
		  r0 = r4.getColumnIndex(r0);	 Catch:{ all -> 0x011b }
		  r2 = new java.util.ArrayList;	 Catch:{ all -> 0x011b }
		  r2.<init>();	 Catch:{ all -> 0x011b }
		  r5 = "_id";	 Catch:{ all -> 0x011b }
		  r5 = r4.getColumnIndex(r5);	 Catch:{ all -> 0x011b }
		  r6 = "file_id";	 Catch:{ all -> 0x011b }
		  r6 = r4.getColumnIndex(r6);	 Catch:{ all -> 0x011b }
		  r7 = "font_ttc_index";	 Catch:{ all -> 0x011b }
		  r7 = r4.getColumnIndex(r7);	 Catch:{ all -> 0x011b }
		  r8 = "font_weight";	 Catch:{ all -> 0x011b }
		  r8 = r4.getColumnIndex(r8);	 Catch:{ all -> 0x011b }
		  r9 = "font_italic";	 Catch:{ all -> 0x011b }
		  r9 = r4.getColumnIndex(r9);	 Catch:{ all -> 0x011b }
		  r10 = r4.moveToNext();	 Catch:{ all -> 0x011b }
		  if (r10 == 0) goto L_0x010d;	 Catch:{ all -> 0x011b }
		  r10 = -1;	 Catch:{ all -> 0x011b }
		  if (r0 == r10) goto L_0x00c8;	 Catch:{ all -> 0x011b }
		  r11 = r4.getInt(r0);	 Catch:{ all -> 0x011b }
		  r19 = r11;	 Catch:{ all -> 0x011b }
		  goto L_0x00ca;	 Catch:{ all -> 0x011b }
		  r19 = 0;	 Catch:{ all -> 0x011b }
		  if (r7 == r10) goto L_0x00d3;	 Catch:{ all -> 0x011b }
		  r11 = r4.getInt(r7);	 Catch:{ all -> 0x011b }
		  r16 = r11;	 Catch:{ all -> 0x011b }
		  goto L_0x00d5;	 Catch:{ all -> 0x011b }
		  r16 = 0;	 Catch:{ all -> 0x011b }
		  if (r6 != r10) goto L_0x00e0;	 Catch:{ all -> 0x011b }
		  r14 = r4.getLong(r5);	 Catch:{ all -> 0x011b }
		  r11 = android.content.ContentUris.withAppendedId(r3, r14);	 Catch:{ all -> 0x011b }
		  goto L_0x00e8;	 Catch:{ all -> 0x011b }
		  r14 = r4.getLong(r6);	 Catch:{ all -> 0x011b }
		  r11 = android.content.ContentUris.withAppendedId(r1, r14);	 Catch:{ all -> 0x011b }
		  r15 = r11;	 Catch:{ all -> 0x011b }
		  if (r8 == r10) goto L_0x00f2;	 Catch:{ all -> 0x011b }
		  r11 = r4.getInt(r8);	 Catch:{ all -> 0x011b }
		  r17 = r11;	 Catch:{ all -> 0x011b }
		  goto L_0x00f6;	 Catch:{ all -> 0x011b }
		  r11 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ all -> 0x011b }
		  r17 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ all -> 0x011b }
		  if (r9 == r10) goto L_0x0101;	 Catch:{ all -> 0x011b }
		  r10 = r4.getInt(r9);	 Catch:{ all -> 0x011b }
		  if (r10 != r12) goto L_0x0101;	 Catch:{ all -> 0x011b }
		  r18 = 1;	 Catch:{ all -> 0x011b }
		  goto L_0x0103;	 Catch:{ all -> 0x011b }
		  r18 = 0;	 Catch:{ all -> 0x011b }
		  r10 = new ip$b;	 Catch:{ all -> 0x011b }
		  r14 = r10;	 Catch:{ all -> 0x011b }
		  r14.<init>(r15, r16, r17, r18, r19);	 Catch:{ all -> 0x011b }
		  r2.add(r10);	 Catch:{ all -> 0x011b }
		  goto L_0x00b8;
		  if (r4 == 0) goto L_0x0112;
		  r4.close();
		  r0 = new defpackage.ip.b[r13];
		  r0 = r2.toArray(r0);
		  r0 = (defpackage.ip.b[]) r0;
		  return r0;
		  r0 = move-exception;
		  if (r4 == 0) goto L_0x0121;
		  r4.close();
		  throw r0;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.ip.a(android.content.Context, io, java.lang.String):ip$b[]");
	}
}
