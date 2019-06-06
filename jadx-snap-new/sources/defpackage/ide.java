package defpackage;

import java.util.Arrays;

/* renamed from: ide */
// app feature
// name & Project pairing
public abstract class ide {
	static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(ide.class), "page", "getPage()Lcom/snap/framework/attribution/StaticUiPage;"), new akdc(akde.a(ide.class), "pageFactory", "getPageFactory()Lcom/snap/framework/attribution/TypedUiPageFactory;")};
	private final String name;
	private final ajxe page$delegate = ajxh.a(new a(this));
	private final ajxe pageFactory$delegate = ajxh.a(new b(this));
	private final idi project;

	/* renamed from: ide$a */
	static final class a extends akcs implements akbk<idj> {
		private /* synthetic */ ide a;

		a(ide ide) {
			this.a = ide;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			ide ide = this.a;
			return new idj(ide, ide.getName(), (byte) 0);
		}
	}

	/* renamed from: ide$b */
	static final class b extends akcs implements akbk<idk> {
		private /* synthetic */ ide a;

		b(ide ide) {
			this.a = ide;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			ide ide = this.a;
			return new idk(ide, ide.getName(), this.a.getPage());
		}
	}

	public ide(String str, idi idi) {
		akcr.b(str, "name");
		akcr.b(idi, "project");
		this.name = str;
		this.project = idi;
	}

	private final idk getPageFactory() {
		return (idk) this.pageFactory$delegate.b();
	}

	public final idd callsite(String str) {
		akcr.b(str, "tag");
		return new idd(this, str);
	}

	public idl getAttributionFor(String str) {
		akcr.b(str, "callsite");
		return getPageFactory().a(str);
	}

	public final String getName() {
		return this.name;
	}

	public idj getPage() {
		return (idj) this.page$delegate.b();
	}

	public final idi getProject() {
		return this.project;
	}

	/* Access modifiers changed, original: protected|final|varargs */
	public final idj typedUiPage(idl idl, String... strArr) {
		akcr.b(idl, "uiPage");
		akcr.b(strArr, "subTypes");
		return new idj(ajym.b((Object[]) (String[]) Arrays.copyOf(strArr, strArr.length)), idl);
	}

	public final idl typedUiPage(idk idk, String... strArr) {
		akcr.b(idk, "typedUiPageFactory");
		akcr.b(strArr, "subTypes");
		return idk.a((String[]) Arrays.copyOf(strArr, strArr.length));
	}
}
