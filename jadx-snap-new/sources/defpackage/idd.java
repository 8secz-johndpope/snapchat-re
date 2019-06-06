package defpackage;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: idd */
// Call site
// Feature & tag
public class idd {
	public final ide a; // feature
	public final List<String> b; // breadcrumbs
	public final Set<idh> c; // labels
	private final ajxe d;
	private final ajxe e;

	/* renamed from: idd$a */
	static final class a extends akcs implements akbk<String> {
		private /* synthetic */ idd a;

		a(idd idd) {
			this.a = idd;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return (((Collection) this.a.b).isEmpty() ^ 1) != 0 ? (String) this.a.b.get(0) : this.a.a.getName();
		}
	}

	/* renamed from: idd$b */
	// Lambda with zero arity
	// Closure contains call site
	static final class b extends akcs implements akbk<String> {
		private /* synthetic */ idd a;

		b(idd idd) {
			this.a = idd;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(this.a.a.getName());
			stringBuilder.append('.');
			stringBuilder.append(Joiner.on('.').join((Iterable) this.a.b));
			return stringBuilder.toString();
		}
	}

	static {
		aken[] akenArr = new aken[]{new akdc(akde.a(idd.class), "shortStringRepresentation", "getShortStringRepresentation()Ljava/lang/String;"), new akdc(akde.a(idd.class), "stringRepresentation", "getStringRepresentation()Ljava/lang/String;")};
	}

	public idd(ide ide, String str) {
		akcr.b(ide, "feature");
		akcr.b(str, "breadcrumb");
		this(ide, // feature
		     ajyl.a(str), // singleton containing tag
		     ajyy.a); // empty set (labels)
	}

	public idd(ide ide, List<String> list) {
		akcr.b(ide, "feature");
		akcr.b(list, "breadcrumbs");
		this(ide,
		     list,
		     ajyy.a); // empty set
	}

	public idd(ide ide, List<String> list, Set<? extends idh> set) {
		akcr.b(ide, "feature");
		akcr.b(list, "breadcrumbs");
		akcr.b(set, "labels");
		this.a = ide;
		this.b = list;
		this.c = set;
		this.d = ajxh.a(new a(this));
		this.e = ajxh.a(new b(this));
	}

	public idd(idl idl) {
		akcr.b(idl, "uiPage");
		this(idl.getFeature(), idl.getHierarchy(), ajyy.a);
	}

	private final String c() {
		return (String) this.e.b();
	}

	public final idd a(String str) {
		akcr.b(str, "breadcrumb");
		ide ide = this.a;
		ArrayList arrayList = new ArrayList(this.b);
		arrayList.add(str);
		return new idd(ide, arrayList, this.c);
	}

	public final idd a(idh... idhArr) {
		akcr.b(idhArr, "newLabels");
		ide ide = this.a;
		List list = this.b;
		HashSet hashSet = new HashSet();
		hashSet.addAll(this.c);
		ajyr.a((Collection) hashSet, (Object[]) idhArr);
		return new idd(ide, list, hashSet);
	}

	public final String a() {
		return (String) ajyu.h(this.b);
	}

	public final boolean a(idh idh) {
		akcr.b(idh, "label");
		return this.c.contains(idh);
	}

	public final String b() {
		return (String) this.d.b();
	}

	public boolean equals(Object obj) {
		return ((idd) this) == obj ? true : !(obj instanceof idd) ? false : akcr.a(c(), ((idd) obj).c());
	}

	public int hashCode() {
		return c().hashCode();
	}

	public String toString() {
		return c();
	}
}
