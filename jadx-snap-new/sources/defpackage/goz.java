package defpackage;

import com.brightcove.player.event.Event;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: goz */
// ScreenshotWatchman
public final class goz {
	public AtomicBoolean a = new AtomicBoolean(false);
	// tag = "Screenshot"
	final zfw b = zgb.a(gow.a.callsite("Screenshot"));
	final ihh c; // clock
	public final gou d; // screenshotDetector
	public final gl e; // loaderManager
	public final ifs f; // permissionHelper

	/* renamed from: goz$a */
	static final class a<T> implements ajdr<T> /* ObservableOnSubscribe */ {
		private /* synthetic */ goz a; // screenshotWatchman

		/* renamed from: goz$a$a */
		public static final class a extends gox /* ScreenshotSession */ {
			private /* synthetic */ a e; // parent
			private /* synthetic */ ajdq f; // emitter

			a(a aVar, // parent
			  ajdq ajdq, // observableEmitter
			  ihh ihh, // clock
			  zfw zfw, // schedulers
			  gou gou) { // screenshotDetector
				this.e = aVar; // parent
				this.f = ajdq; // emitter
				super(ihh, zfw, gou);
			}

			// Emit the specified pair to the observers
			public final void a(ajxm<Long, String> /* Pair<Long, String> */ ajxm) {
				akcr.b(ajxm, "pair");
				Object obj = this.f; // emitter
				akcr.a(obj, Event.EMITTER);
				if (!obj.isDisposed()) {
					this.f.a((Object) ajxm); // this.emitter.onNext(pair)
				}
			}
		}

		a(goz goz) {
			this.a = goz;
		}

		// Called for each Observer registered to observe this Observable
		public final void subscribe(ajdq<ajxm<Long, String>> /* ObservableEmitter<Pair<Long, String>> */ ajdq) {
			akcr.b(ajdq, Event.EMITTER); // "emitter"
			// create new screenshot watchman session
			final a aVar = new a(this,
					     ajdq, // observableEmitter
					     this.a.c, // loaderManager
					     this.a.b, // schedulers
					     this.a.d); // screenshotDetector
			// set emitter to end session on dispose
			ajdq.a( // emitter.setDisposable(
				ajek.a( // Disposables.fromAction(
					(ajev) new ajev() {
							public final void run() {
								aVar.a(); // session.endSession()
							}
						}
					));
			// add session to screenshot detector
			this.a.d.a((gox) aVar); // this.screenshotWatchman.screenshotDetector.addSession(session)
		}
	}

	public goz(ihh ihh, gou gou, gl glVar, ifs ifs, zgb zgb) {
		akcr.b(ihh, "clock");
		akcr.b(gou, "screenshotDetector");
		akcr.b(glVar, "loaderManager");
		akcr.b(ifs, "permissionHelper");
		akcr.b(zgb, "schedulersProvider");
		this.c = ihh; // clock
		this.d = gou; // screenshotDetector
		this.e = glVar; // loaderManager
		this.f = ifs; // permissionHelper
	}

	// Get an observer
	public final ajdp<ajxm<Long, String>> /* Observable<Pair<Long, String>> */ a() {
		Object a = ajdp.a((ajdr) new a(this)); // Observable.create(new a(this))
		akcr.a(a, "Observable.create { emit…ession(session)\n        }");
		return a;
	}

	public final goy b() {
		return new goy(this.c, // clock
			       this.b, // callsite
			       this.d); // screenshotDetector
	}
}
