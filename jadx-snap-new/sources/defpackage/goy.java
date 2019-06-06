package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: goy */
public final class goy {
	final Set<gox> a = new LinkedHashSet(); // sessions
	final ihh b; // clock
	final zfw c; // schedulers
	final gou d; // screenshotDetector

	/* renamed from: goy$a */
	// Subclass implementing ObservableOnSubscribe
	static final class a<T> implements ajdr<T> {
		private /* synthetic */ goy a; // parent
		private /* synthetic */ String b; // tag

		/* renamed from: goy$a$a */
		// Extension of ScreenshotSession
		public static final class a extends gox {
			private /* synthetic */ a e; // session
			private /* synthetic */ ajdq f; // emitter

			a(a aVar, ajdq ajdq, ihh ihh, // clock
			  zfw zfw, // schedulers
			  gou gou, // screenshotDetector
			  String str) {
				this.e = aVar; // session
				this.f = ajdq; // emitter
				super(ihh, zfw, gou, str);
			}

			public final void a(ajxm<Long, String> /* Pair<Long, String> */ ajxm) {
				akcr.b(ajxm, "pair");
				ajdq ajdq = this.f;
				akcr.a(ajdq, "emitter");
				if (!ajdq.isDisposed()) {
					this.f.a(ajxm); // emitter.onNext(pair)
				}
			}
		}

		a(goy goy, String str) {
			this.a = goy;
			this.b = str;
		}

		public final void subscribe(ajdq<ajxm<Long, String>> /* ObservableEmitter<Pair<Long, String>> */ ajdq) {
			akcr.b(ajdq, "emitter");
			// Create new ScreenshotSession
			a aVar = new a(this,
				       ajdq, // emitter
				       this.a.b, // clock
				       this.a.c, // schedulers
				       this.a.d, // screenshotDetector
				       this.b); // tag
			this.a.d.a(aVar); // this.parent.screenshotDetector.addSession(session)
			synchronized (this.a.a) {
				this.a.a.add(aVar); // this.parent.sessions.add(session)
			}
		}
	}

	public goy(ihh ihh, zfw zfw, gou gou) {
		akcr.b(ihh, "clock");
		akcr.b(zfw, "schedulers");
		akcr.b(gou, "screenshotDetector");
		this.b = ihh; // clock
		this.c = zfw; // schedulers
		this.d = gou; // screenshotDetector
	}

	public final ajdp<ajxm<Long, String>> /* Observable<Pair<Long, String>> */ a(String str) {
		akcr.b(str, "tag");
		ajdp a = ajdp.a((ajdr) new a(this, str)); // Observable.create(new a(this, str))
		akcr.a(a, "Observable.create { emit…)\n            }\n        }");
		return a;
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0025 in {6, 9, 12} preds:[]
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
	public final void a() {
		/*
		  r3 = this;
		  r0 = r3.a;
		  monitor-enter(r0);
		  r1 = r3.a;	 Catch:{ all -> 0x0022 }
		  r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0022 }
		  r1 = r1.iterator();	 Catch:{ all -> 0x0022 }
		  r2 = r1.hasNext();	 Catch:{ all -> 0x0022 }
		  if (r2 == 0) goto L_0x001b;	 Catch:{ all -> 0x0022 }
		  r2 = r1.next();	 Catch:{ all -> 0x0022 }
		  r2 = (defpackage.gox) r2;	 Catch:{ all -> 0x0022 }
		  r2.a();	 Catch:{ all -> 0x0022 }
		  goto L_0x000b;	 Catch:{ all -> 0x0022 }
		  r1 = r3.a;	 Catch:{ all -> 0x0022 }
		  r1.clear();	 Catch:{ all -> 0x0022 }
		  monitor-exit(r0);
		  return;
		  r1 = move-exception;
		  monitor-exit(r0);
		  throw r1;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.goy.a():void");
	}
}
