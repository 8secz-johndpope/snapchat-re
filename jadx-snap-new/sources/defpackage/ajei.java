package defpackage;

import java.util.ArrayList;

/* renamed from: ajei */
// io.reactivex.internal.disposables.ListCompositeDisposable
public final class ajei implements ajej, ajfo {
	private ajuw<ajej> a; // resources
	private volatile boolean b;

	public ajei(Iterable<? extends ajej> iterable) {
		ajfv.a((Object) iterable, "resources is null");
		this.a = new ajuw();
		for (Object obj : iterable) {
			ajfv.a(obj, "Disposable item is null");
			this.a.a(obj);
		}
	}

	public ajei(ajej... ajejArr) {
		ajfv.a((Object) ajejArr, "resources is null"); // null check
		this.a = new ajuw(ajejArr.length + 1);
		for (Object obj : ajejArr) {
			ajfv.a(obj, "Disposable item is null");
			this.a.a(obj);
		}
	}

	// dispose
	private static void a(ajuw<ajej> ajuw) {
		if (ajuw != null) {
			Iterable iterable = null;
			for (Object obj : ajuw.c) {
				if (obj instanceof ajej) {
					try {
						((ajej) obj).dispose();
					} catch (Throwable th) {
						ajep.a(th);
						if (iterable == null) {
							iterable = new ArrayList();
						}
						iterable.add(th);
					}
				}
			}
			if (iterable == null) {
				return;
			}
			if (iterable.size() == 1) {
				throw ajur.a((Throwable) iterable.get(0));
			}
			throw new ajeo(iterable);
		}
	}

	// dispose
	public final void a() {
		if (!this.b) {
			synchronized (this) {
				if (this.b) {
					return;
				}
				ajuw ajuw = this.a;
				this.a = null;
				ajei.a(ajuw);
			}
		}
	}

	// add
	public final boolean a(ajej ajej) {
		ajfv.a((Object) ajej, "d is null");
		if (!this.b) {
			synchronized (this) {
				if (!this.b) {
					ajuw ajuw = this.a;
					if (ajuw == null) {
						ajuw = new ajuw();
						this.a = ajuw;
					}
					ajuw.a((Object) ajej);
					return true;
				}
			}
		}
		ajej.dispose();
		return false;
	}

	// addAll
	public final boolean a(ajej... ajejArr) {
		ajfv.a((Object) ajejArr, "ds is null");
		int i = 0;
		if (!this.b) {
			synchronized (this) {
				if (!this.b) {
					ajuw ajuw = this.a;
					if (ajuw == null) {
						ajuw = new ajuw(ajejArr.length + 1);
						this.a = ajuw;
					}
					int length = ajejArr.length;
					while (i < length) {
						Object obj = ajejArr[i];
						ajfv.a(obj, "d is null");
						ajuw.a(obj);
						i++;
					}
					return true;
				}
			}
		}
		for (ajej dispose : ajejArr) {
			dispose.dispose();
		}
		return false;
	}

	/* JADX WARNING: Missing block: B:13:0x0014, code skipped:
	   return r1;
	*/
	public final int b() {
		/*
		  r2 = this;
		  r0 = r2.b;
		  r1 = 0;
		  if (r0 == 0) goto L_0x0006;
		  L_0x0005:
		  return r1;
		  L_0x0006:
		  monitor-enter(r2);
		  r0 = r2.b;	 Catch:{ all -> 0x0015 }
		  if (r0 == 0) goto L_0x000d;
		  L_0x000b:
		  monitor-exit(r2);	 Catch:{ all -> 0x0015 }
		  return r1;
		  L_0x000d:
		  r0 = r2.a;	 Catch:{ all -> 0x0015 }
		  if (r0 == 0) goto L_0x0013;
		  L_0x0011:
		  r1 = r0.b;	 Catch:{ all -> 0x0015 }
		  L_0x0013:
		  monitor-exit(r2);	 Catch:{ all -> 0x0015 }
		  return r1;
		  L_0x0015:
		  r0 = move-exception;
		  monitor-exit(r2);	 Catch:{ all -> 0x0015 }
		  throw r0;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.ajei.b():int");
	}

	public final boolean b(ajej ajej) {
		if (!c(ajej)) {
			return false;
		}
		ajej.dispose();
		return true;
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x004d in {2, 8, 13, 16, 19, 22, 24, 26, 28, 31} preds:[]
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
	public final boolean c(defpackage.ajej r8) {
		/*
		  r7 = this;
		  r0 = "Disposable item is null";
		  defpackage.ajfv.a(r8, r0);
		  r0 = r7.b;
		  r1 = 0;
		  if (r0 == 0) goto L_0x000b;
		  return r1;
		  monitor-enter(r7);
		  r0 = r7.b;	 Catch:{ all -> 0x004a }
		  if (r0 == 0) goto L_0x0012;	 Catch:{ all -> 0x004a }
		  monitor-exit(r7);	 Catch:{ all -> 0x004a }
		  return r1;	 Catch:{ all -> 0x004a }
		  r0 = r7.a;	 Catch:{ all -> 0x004a }
		  if (r0 == 0) goto L_0x0048;	 Catch:{ all -> 0x004a }
		  r2 = r0.c;	 Catch:{ all -> 0x004a }
		  r3 = r0.a;	 Catch:{ all -> 0x004a }
		  r4 = r8.hashCode();	 Catch:{ all -> 0x004a }
		  r4 = defpackage.ajuw.a(r4);	 Catch:{ all -> 0x004a }
		  r4 = r4 & r3;	 Catch:{ all -> 0x004a }
		  r5 = r2[r4];	 Catch:{ all -> 0x004a }
		  r6 = 1;	 Catch:{ all -> 0x004a }
		  if (r5 != 0) goto L_0x002a;	 Catch:{ all -> 0x004a }
		  r8 = 0;	 Catch:{ all -> 0x004a }
		  goto L_0x0043;	 Catch:{ all -> 0x004a }
		  r5 = r5.equals(r8);	 Catch:{ all -> 0x004a }
		  if (r5 == 0) goto L_0x0035;	 Catch:{ all -> 0x004a }
		  r8 = r0.a(r4, r2, r3);	 Catch:{ all -> 0x004a }
		  goto L_0x0043;	 Catch:{ all -> 0x004a }
		  r4 = r4 + r6;	 Catch:{ all -> 0x004a }
		  r4 = r4 & r3;	 Catch:{ all -> 0x004a }
		  r5 = r2[r4];	 Catch:{ all -> 0x004a }
		  if (r5 != 0) goto L_0x003c;	 Catch:{ all -> 0x004a }
		  goto L_0x0028;	 Catch:{ all -> 0x004a }
		  r5 = r5.equals(r8);	 Catch:{ all -> 0x004a }
		  if (r5 == 0) goto L_0x0035;	 Catch:{ all -> 0x004a }
		  goto L_0x0030;	 Catch:{ all -> 0x004a }
		  if (r8 != 0) goto L_0x0046;	 Catch:{ all -> 0x004a }
		  goto L_0x0048;	 Catch:{ all -> 0x004a }
		  monitor-exit(r7);	 Catch:{ all -> 0x004a }
		  return r6;	 Catch:{ all -> 0x004a }
		  monitor-exit(r7);	 Catch:{ all -> 0x004a }
		  return r1;	 Catch:{ all -> 0x004a }
		  r8 = move-exception;	 Catch:{ all -> 0x004a }
		  monitor-exit(r7);	 Catch:{ all -> 0x004a }
		  throw r8;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.ajei.c(ajej):boolean");
	}

	public final void dispose() {
		if (!this.b) {
			synchronized (this) {
				if (this.b) {
					return;
				}
				this.b = true;
				ajuw ajuw = this.a;
				this.a = null;
				ajei.a(ajuw);
			}
		}
	}

	public final boolean isDisposed() {
		return this.b;
	}
}
