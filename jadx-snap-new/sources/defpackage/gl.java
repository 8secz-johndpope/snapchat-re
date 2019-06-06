package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: gl */
// LoaderManager
public abstract class gl {

	/* renamed from: gl$a */
	// LoaderCallbacks
	public interface a<D> {
		hb<D> a();

		// onLoaderReset
		void a(hb<D> hbVar);

		// onLoadFinished
		void a(hb<D> hbVar, D d);
	}

	public abstract <D> hb<D> a(a<D> aVar);

	public abstract void a();

	// dump
	public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
