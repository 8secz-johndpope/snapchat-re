package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.snap.ui.view.TakeSnapButton;
import defpackage.ay.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: hg */
public final class hg {

	/* renamed from: hg$a */
	public interface a {
	}

	/* renamed from: hg$c */
	public static final class c {
		public final String a;
		public int b;
		public boolean c;
		public int d;

		public c(String str, int i, boolean z, int i2) {
			this.a = str;
			this.b = i;
			this.c = z;
			this.d = i2;
		}
	}

	/* renamed from: hg$b */
	public static final class b implements a {
		public final c[] a;

		public b(c[] cVarArr) {
			this.a = cVarArr;
		}
	}

	/* renamed from: hg$d */
	public static final class d implements a {
		public final io a;
		public final int b;
		public final int c;

		public d(io ioVar, int i, int i2) {
			this.a = ioVar;
			this.c = i;
			this.b = i2;
		}
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x002d in {3, 8, 10, 12} preds:[]
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
	public static defpackage.hg.a a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
		/*
		  r0 = r3.next();
		  r1 = 2;
		  if (r0 == r1) goto L_0x000a;
		  r2 = 1;
		  if (r0 != r2) goto L_0x0000;
		  if (r0 != r1) goto L_0x0025;
		  r0 = "font-family";
		  r2 = 0;
		  r3.require(r1, r2, r0);
		  r1 = r3.getName();
		  r0 = r1.equals(r0);
		  if (r0 == 0) goto L_0x0021;
		  r3 = defpackage.hg.b(r3, r4);
		  return r3;
		  defpackage.hg.a(r3);
		  return r2;
		  r3 = new org.xmlpull.v1.XmlPullParserException;
		  r4 = "No start tag found";
		  r3.<init>(r4);
		  throw r3;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.hg.a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):hg$a");
	}

	public static List<List<byte[]>> a(Resources resources, int i) {
		List<List<byte[]>> list = null;
		if (i != 0) {
			TypedArray obtainTypedArray = resources.obtainTypedArray(i);
			if (obtainTypedArray.length() > 0) {
				list = new ArrayList();
				if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : null) != null) {
					for (i = 0; i < obtainTypedArray.length(); i++) {
						list.add(hg.a(resources.getStringArray(obtainTypedArray.getResourceId(i, 0))));
					}
				} else {
					list.add(hg.a(resources.getStringArray(i)));
				}
			}
			obtainTypedArray.recycle();
		}
		return list != null ? list : Collections.emptyList();
	}

	private static List<byte[]> a(String[] strArr) {
		ArrayList arrayList = new ArrayList();
		for (String decode : strArr) {
			arrayList.add(Base64.decode(decode, 0));
		}
		return arrayList;
	}

	private static void a(XmlPullParser xmlPullParser) {
		int i = 1;
		while (i > 0) {
			int next = xmlPullParser.next();
			if (next == 2) {
				i++;
			} else if (next == 3) {
				i--;
			}
		}
	}

	private static a b(XmlPullParser xmlPullParser, Resources resources) {
		TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.a);
		String string = obtainAttributes.getString(0);
		String string2 = obtainAttributes.getString(4);
		String string3 = obtainAttributes.getString(5);
		int resourceId = obtainAttributes.getResourceId(1, 0);
		int integer = obtainAttributes.getInteger(2, 1);
		int integer2 = obtainAttributes.getInteger(3, TakeSnapButton.LONG_PRESS_TIME);
		obtainAttributes.recycle();
		if (string == null || string2 == null || string3 == null) {
			ArrayList arrayList = new ArrayList();
			while (xmlPullParser.next() != 3) {
				if (xmlPullParser.getEventType() == 2) {
					if (xmlPullParser.getName().equals("font")) {
						arrayList.add(hg.c(xmlPullParser, resources));
					} else {
						hg.a(xmlPullParser);
					}
				}
			}
			return arrayList.isEmpty() ? null : new b((c[]) arrayList.toArray(new c[arrayList.size()]));
		} else {
			while (xmlPullParser.next() != 3) {
				hg.a(xmlPullParser);
			}
			return new d(new io(string, string2, string3, hg.a(resources, resourceId)), integer, integer2);
		}
	}

	private static c c(XmlPullParser xmlPullParser, Resources resources) {
		TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.b);
		int i = 5;
		boolean z = true;
		if (!obtainAttributes.hasValue(5)) {
			i = 1;
		}
		i = obtainAttributes.getInt(i, 400);
		int i2 = 4;
		if (!obtainAttributes.hasValue(4)) {
			i2 = 2;
		}
		if (1 != obtainAttributes.getInt(i2, 0)) {
			z = false;
		}
		int i3 = obtainAttributes.hasValue(3) ? 3 : 0;
		int resourceId = obtainAttributes.getResourceId(i3, 0);
		String string = obtainAttributes.getString(i3);
		obtainAttributes.recycle();
		while (xmlPullParser.next() != 3) {
			hg.a(xmlPullParser);
		}
		return new c(string, i, z, resourceId);
	}
}
