package defpackage;

import java.util.Iterator;

/* renamed from: akgb */
public class akgb extends akga {
	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0074 in {2, 3, 15, 17, 20, 22, 23, 25, 26, 28} preds:[]
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
	public static final java.lang.String a(java.lang.CharSequence r4, int r5) {
		/*
		  r0 = "receiver$0";
		  defpackage.akcr.b(r4, r0);
		  r0 = 0;
		  r1 = 1;
		  if (r5 < 0) goto L_0x000b;
		  r2 = 1;
		  goto L_0x000c;
		  r2 = 0;
		  if (r2 == 0) goto L_0x0055;
		  r2 = "";
		  if (r5 == 0) goto L_0x0054;
		  if (r5 == r1) goto L_0x004f;
		  r3 = r4.length();
		  if (r3 == 0) goto L_0x004e;
		  if (r3 == r1) goto L_0x003a;
		  r0 = new java.lang.StringBuilder;
		  r2 = r4.length();
		  r2 = r2 * r5;
		  r0.<init>(r2);
		  if (r5 <= 0) goto L_0x0030;
		  r0.append(r4);
		  if (r1 == r5) goto L_0x0030;
		  r1 = r1 + 1;
		  goto L_0x0028;
		  r4 = r0.toString();
		  r5 = "sb.toString()";
		  defpackage.akcr.a(r4, r5);
		  return r4;
		  r4 = r4.charAt(r0);
		  r5 = new char[r5];
		  r1 = r5.length;
		  if (r0 >= r1) goto L_0x0048;
		  r5[r0] = r4;
		  r0 = r0 + 1;
		  goto L_0x0041;
		  r4 = new java.lang.String;
		  r4.<init>(r5);
		  return r4;
		  return r2;
		  r4 = r4.toString();
		  return r4;
		  return r2;
		  r4 = new java.lang.StringBuilder;
		  r0 = "Count 'n' must be non-negative, but was ";
		  r4.<init>(r0);
		  r4.append(r5);
		  r5 = 46;
		  r4.append(r5);
		  r4 = r4.toString();
		  r5 = new java.lang.IllegalArgumentException;
		  r4 = r4.toString();
		  r5.<init>(r4);
		  r5 = (java.lang.Throwable) r5;
		  throw r5;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.akgb.a(java.lang.CharSequence, int):java.lang.String");
	}

	public static final String a(String str, char c, char c2) {
		akcr.b(str, "receiver$0");
		Object replace = str.replace(c, c2);
		akcr.a(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
		return replace;
	}

	public static final String a(String str, String str2, String str3, boolean z) {
		akcr.b(str, "receiver$0");
		akcr.b(str2, "oldValue");
		akcr.b(str3, "newValue");
		return akfh.a(akgc.a((CharSequence) str, new String[]{str2}, z, 4), (CharSequence) str3, null, null, 0, null, null, 62);
	}

	public static final boolean a(CharSequence charSequence) {
		akcr.b(charSequence, "receiver$0");
		if (charSequence.length() != 0) {
			Object obj;
			Iterator it = akgc.c(charSequence).iterator();
			while (it.hasNext()) {
				if (!akfn.a(charSequence.charAt(((ajzg) it).a()))) {
					obj = null;
					break;
				}
			}
			obj = 1;
			return obj != null;
		}
	}

	public static final boolean a(String str, int i, String str2, int i2, int i3, boolean z) {
		akcr.b(str, "receiver$0");
		akcr.b(str2, "other");
		return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
	}

	public static final boolean a(String str, String str2, boolean z) {
		return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
	}

	// startsWith() when !z
	public static final boolean b(String str, String str2, boolean z) {
		akcr.b(str, "receiver$0");
		akcr.b(str2, "prefix");
		if (!z) {
			return str.startsWith(str2);
		}
		return akgb.a(str, 0, str2, 0, str2.length(), z);
	}

	public static final boolean c(String str, String str2) {
		akcr.b(str, "receiver$0");
		akcr.b(str2, "suffix");
		return str.endsWith(str2);
	}

	public static final String h(String str) {
		akcr.b(str, "receiver$0");
		if ((((CharSequence) str).length() > 0 ? 1 : null) == null || !Character.isLowerCase(str.charAt(0))) {
			return str;
		}
		StringBuilder stringBuilder = new StringBuilder();
		Object substring = str.substring(0, 1);
		akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
		if (substring != null) {
			substring = substring.toUpperCase();
			akcr.a(substring, "(this as java.lang.String).toUpperCase()");
			stringBuilder.append(substring);
			Object substring2 = str.substring(1);
			akcr.a(substring2, "(this as java.lang.String).substring(startIndex)");
			stringBuilder.append(substring2);
			return stringBuilder.toString();
		}
		throw new ajxt("null cannot be cast to non-null type java.lang.String");
	}
}
