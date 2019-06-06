package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: hb */
// Loader
public class hb<D> {
	public int d; // mId
	public b<D> e; // mListener
	protected Context f; // mContext
	boolean g = false; // mStarted
	public boolean h = false; // mAbandoned
	boolean i = true; // mReset
	boolean j = false; // mContentChanged
	boolean k = false; // mProcessingChange

	/* renamed from: hb$b */
	public interface b<D> {
		void c(D d);
	}

	/* renamed from: hb$a */
	/**
	 * An implementation of a ContentObserver that takes care of connecting
	 * it to the Loader to have the loader re-load its data when the observer
	 * is told it has changed.  You do not normally need to use this yourself;
	 * it is used for you by {@link CursorLoader} to take care of executing
	 * an update when the cursor's backing data changes.
	 */
	// ForceLoadContentObserver
	public final class a extends ContentObserver {
		// ForceLoadContentObserver
		public a() {
			super(new Handler());
		}

		public final boolean deliverSelfNotifications() {
			return true;
		}

		// z: selfChange
		public final void onChange(boolean z) {
			hb.this.n();
		}
	}

	/**
	 * Stores away the application context associated with context.
	 * Since Loaders can be used across multiple activities it's dangerous to
	 * store the context directly; always use {@link #getContext()} to retrieve
	 * the Loader's Context, don't use the constructor argument directly.
	 * The Context returned by {@link #getContext} is safe to use across
	 * Activity instances.
	 *
	 * @param context used to retrieve the application context.
	 */
	// Loader
	public hb(Context context) {
		this.f = context.getApplicationContext();
	}

	/* Access modifiers changed, original: protected */
	public void a() {
	}

	public final void a(b<D> bVar) {
		b<D> bVar2 = this.e;
		if (bVar2 == null) {
			throw new IllegalStateException("No listener register");
		} else if (bVar2 == bVar) {
			this.e = null;
		} else {
			throw new IllegalArgumentException("Attempting to unregister the wrong listener");
		}
	}

	/**
	 * Print the Loader's state into the given stream.
	 *
	 * @param prefix Text to print at the front of each line.
	 * @param fd The raw file descriptor that the dump is being sent to.
	 * @param writer A PrintWriter to which the dump is to be set.
	 * @param args Additional arguments to the dump request.
	 */
	// dump
	public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
		printWriter.print(str);
		printWriter.print("mId=");
		printWriter.print(this.d);
		printWriter.print(" mListener=");
		printWriter.println(this.e);
		if (this.g || this.j || this.k) {
			printWriter.print(str);
			printWriter.print("mStarted=");
			printWriter.print(this.g);
			printWriter.print(" mContentChanged=");
			printWriter.print(this.j);
			printWriter.print(" mProcessingChange=");
			printWriter.println(this.k);
		}
		if (this.h || this.i) {
			printWriter.print(str);
			printWriter.print("mAbandoned=");
			printWriter.print(this.h);
			printWriter.print(" mReset=");
			printWriter.println(this.i);
		}
	}

	public void b(D d) {
		b bVar = this.e;
		if (bVar != null) {
			bVar.c(d);
		}
	}

	/* Access modifiers changed, original: protected */
	/**
	 * Subclasses must implement this to take care of requests to {@link #cancelLoad()}.
	 * This will always be called from the process's main thread.
	 *
	 * @return Returns <tt>false</tt> if the task could not be canceled,
	 * typically because it has already completed normally, or
	 * because {@link #startLoading()} hasn't been called; returns
	 * <tt>true</tt> otherwise.  When <tt>true</tt> is returned, the task
	 * is still running and the {@link OnLoadCanceledListener} will be called
	 * when the task completes.
	 */
	// onCancelLoad
	public boolean b() {
		return false;
	}

	/* Access modifiers changed, original: protected */
	public void f() {
	}

	/* Access modifiers changed, original: protected */
	public void g() {
	}

	/* Access modifiers changed, original: protected */
	public void h() {
	}

	public final void i() {
		this.g = true;
		this.i = false;
		this.h = false;
		f();
	}

	public final boolean j() {
		return b();
	}

	public final void k() {
		a();
	}

	public final void l() {
		this.g = false;
		g();
	}

	public final void m() {
		h();
		this.i = true;
		this.g = false;
		this.h = false;
		this.j = false;
		this.k = false;
	}

	// onContentChanged
	public final void n() {
		if (this.g) {
			a();
		} else {
			this.j = true;
		}
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(64);
		iy.a(this, stringBuilder);
		stringBuilder.append(" id=");
		stringBuilder.append(this.d);
		stringBuilder.append("}");
		return stringBuilder.toString();
	}
}
