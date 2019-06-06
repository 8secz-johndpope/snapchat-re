package defpackage;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: tl */
public final class tl {
    private static final Object a = new Object();
    private static DocumentBuilderFactory b = tl.a();

    private static DocumentBuilderFactory a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        newInstance.setExpandEntityReferences(false);
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
        } catch (Throwable unused) {
        }
        return newInstance;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    private static org.w3c.dom.Document a(java.lang.String r3, defpackage.ua r4) {
        /*
        r0 = r4.f();	 Catch:{ ss -> 0x001d }
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = b;	 Catch:{ Throwable -> 0x000e }
        r1 = "http://apache.org/xml/features/disallow-doctype-decl";
        r2 = 1;
        r0.setFeature(r1, r2);	 Catch:{ Throwable -> 0x000e }
    L_0x000e:
        r0 = new org.xml.sax.InputSource;	 Catch:{ ss -> 0x001d }
        r1 = new java.io.StringReader;	 Catch:{ ss -> 0x001d }
        r1.<init>(r3);	 Catch:{ ss -> 0x001d }
        r0.<init>(r1);	 Catch:{ ss -> 0x001d }
        r3 = defpackage.tl.a(r0);	 Catch:{ ss -> 0x001d }
        return r3;
    L_0x001d:
        r0 = move-exception;
        r1 = r0.a;
        r2 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        if (r1 != r2) goto L_0x003e;
    L_0x0024:
        r4 = r4.c();
        if (r4 == 0) goto L_0x003e;
    L_0x002a:
        r4 = new org.xml.sax.InputSource;
        r0 = new tb;
        r1 = new java.io.StringReader;
        r1.<init>(r3);
        r0.<init>(r1);
        r4.<init>(r0);
        r3 = defpackage.tl.a(r4);
        return r3;
    L_0x003e:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.a(java.lang.String, ua):org.w3c.dom.Document");
    }

    private static Document a(InputSource inputSource) {
        try {
            DocumentBuilder newDocumentBuilder = b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (SAXException e) {
            throw new ss("XML parsing failure", 201, e);
        } catch (ParserConfigurationException e2) {
            throw new ss("XML Parser not correctly configured", 0, e2);
        } catch (IOException e3) {
            throw new ss("Error reading the XML-file", 204, e3);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:188:0x046d in {6, 8, 20, 21, 40, 43, 44, 56, 59, 61, 66, 67, 69, 70, 77, 80, 81, 82, 83, 93, 99, 100, 105, 106, 109, 110, 112, 113, 114, 115, 116, 121, 122, 123, 124, 143, 144, 148, 149, 154, 155, 156, 159, 160, 162, 164, 165, 172, 177, 179, 180, 181, 183, 185, 187} preds:[]
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
    public static defpackage.su a(java.lang.Object r19, defpackage.ua r20) {
        /*
        r0 = r19;
        r1 = r20;
        r2 = 4;
        if (r0 == 0) goto L_0x0465;
        r3 = r0 instanceof java.lang.String;
        if (r3 == 0) goto L_0x001d;
        r3 = r0;
        r3 = (java.lang.String) r3;
        r3 = r3.length();
        if (r3 == 0) goto L_0x0015;
        goto L_0x001d;
        r0 = new ss;
        r1 = "Parameter must not be null or empty";
        r0.<init>(r1, r2);
        throw r0;
        r0 = (java.lang.String) r0;
        r0 = defpackage.tl.a(r0, r1);
        r2 = r20.a();
        r3 = 3;
        r3 = new java.lang.Object[r3];
        r0 = defpackage.tl.a(r0, r2, r3);
        if (r0 == 0) goto L_0x045f;
        r2 = 1;
        r3 = r0[r2];
        r4 = a;
        if (r3 != r4) goto L_0x045f;
        r3 = 0;
        r4 = r0[r3];
        r4 = (org.w3c.dom.Node) r4;
        r11 = new tk;
        r11.<init>();
        r5 = r4.hasAttributes();
        if (r5 == 0) goto L_0x0455;
        r5 = r11.a;
        r6 = 0;
        r7 = r4.getChildNodes();
        r7 = r7.getLength();
        if (r6 >= r7) goto L_0x0068;
        r7 = r4.getChildNodes();
        r7 = r7.item(r6);
        r8 = defpackage.te.a(r7);
        if (r8 != 0) goto L_0x0065;
        defpackage.te.a(r11, r5, r7, r2, r1);
        r6 = r6 + 1;
        goto L_0x004a;
        r4 = 2;
        r0 = r0[r4];
        r0 = (java.lang.String) r0;
        r11.b = r0;
        r0 = r20.d();
        if (r0 != 0) goto L_0x0454;
        r0 = r11.a;
        r5 = r11.a;
        r12 = "http://purl.org/dc/elements/1.1/";
        r13 = 0;
        defpackage.tn.a(r5, r12, r13, r2);
        r5 = r11.a;
        r14 = r5.f();
        r5 = r14.hasNext();
        r6 = 5;
        r15 = "x-default";
        if (r5 == 0) goto L_0x02e6;
        r5 = r14.next();
        r5 = (defpackage.tm) r5;
        r7 = r5.a;
        r7 = r12.equals(r7);
        r8 = "xml:lang";
        r10 = "[]";
        if (r7 == 0) goto L_0x0111;
        r6 = 1;
        r7 = r5.b();
        if (r6 > r7) goto L_0x0085;
        r7 = r5.a(r6);
        r4 = defpackage.to.a;
        r2 = r7.a;
        r2 = r4.get(r2);
        r2 = (defpackage.ub) r2;
        if (r2 == 0) goto L_0x010b;
        r4 = r7.i();
        r4 = r4.s();
        if (r4 == 0) goto L_0x00f1;
        r4 = new tm;
        r3 = r7.a;
        r4.<init>(r3, r2);
        r7.a = r10;
        r4.a(r7);
        r4.c = r5;
        r3 = r5.k();
        r9 = r6 + -1;
        r3.set(r9, r4);
        r2 = r2.m();
        if (r2 == 0) goto L_0x010b;
        r2 = r7.i();
        r2 = r2.d();
        if (r2 != 0) goto L_0x010b;
        r2 = new tm;
        r2.<init>(r8, r15, r13);
        r7.d(r2);
        goto L_0x010b;
        r3 = r7.i();
        r4 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r9 = 0;
        r3.a(r4, r9);
        r3 = r7.i();
        r3.a(r2);
        r2 = r2.m();
        if (r2 == 0) goto L_0x010b;
        defpackage.to.a(r7);
        r6 = r6 + 1;
        r2 = 1;
        r3 = 0;
        r4 = 2;
        goto L_0x00a1;
        r2 = r5.a;
        r3 = "http://ns.adobe.com/exif/1.0/";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x01f8;
        r2 = "exif:GPSTimeStamp";
        r3 = 0;
        r2 = defpackage.tn.a(r5, r2, r3);
        if (r2 == 0) goto L_0x017d;
        r3 = r2.b;	 Catch:{ ss -> 0x017d }
        r3 = defpackage.sx.e(r3);	 Catch:{ ss -> 0x017d }
        r4 = r3.a();	 Catch:{ ss -> 0x017d }
        if (r4 != 0) goto L_0x017d;	 Catch:{ ss -> 0x017d }
        r4 = r3.b();	 Catch:{ ss -> 0x017d }
        if (r4 != 0) goto L_0x017d;	 Catch:{ ss -> 0x017d }
        r4 = r3.c();	 Catch:{ ss -> 0x017d }
        if (r4 == 0) goto L_0x013d;	 Catch:{ ss -> 0x017d }
        goto L_0x017d;	 Catch:{ ss -> 0x017d }
        r4 = "exif:DateTimeOriginal";	 Catch:{ ss -> 0x017d }
        r7 = 0;	 Catch:{ ss -> 0x017d }
        r4 = defpackage.tn.a(r5, r4, r7);	 Catch:{ ss -> 0x017d }
        if (r4 != 0) goto L_0x014c;	 Catch:{ ss -> 0x017d }
        r4 = "exif:DateTimeDigitized";	 Catch:{ ss -> 0x017d }
        r4 = defpackage.tn.a(r5, r4, r7);	 Catch:{ ss -> 0x017d }
        if (r4 != 0) goto L_0x014f;	 Catch:{ ss -> 0x017d }
        goto L_0x017d;	 Catch:{ ss -> 0x017d }
        r4 = r4.b;	 Catch:{ ss -> 0x017d }
        r4 = defpackage.sx.e(r4);	 Catch:{ ss -> 0x017d }
        r3 = r3.l();	 Catch:{ ss -> 0x017d }
        r7 = r4.a();	 Catch:{ ss -> 0x017d }
        r9 = 1;	 Catch:{ ss -> 0x017d }
        r3.set(r9, r7);	 Catch:{ ss -> 0x017d }
        r7 = r4.b();	 Catch:{ ss -> 0x017d }
        r9 = 2;
        r3.set(r9, r7);	 Catch:{ ss -> 0x017c }
        r4 = r4.c();	 Catch:{ ss -> 0x017c }
        r3.set(r6, r4);	 Catch:{ ss -> 0x017c }
        r4 = new ti;	 Catch:{ ss -> 0x017c }
        r4.<init>(r3);	 Catch:{ ss -> 0x017c }
        r3 = defpackage.tc.a(r4);	 Catch:{ ss -> 0x017c }
        r2.b = r3;	 Catch:{ ss -> 0x017c }
        goto L_0x017e;
        goto L_0x017e;
        r9 = 2;
        r2 = "exif:UserComment";
        r3 = 0;
        r2 = defpackage.tn.a(r5, r2, r3);
        if (r2 == 0) goto L_0x01f3;
        r3 = r2.i();
        r3 = r3.s();
        if (r3 == 0) goto L_0x01f0;
        r3 = new tm;
        r4 = r2.b;
        r5 = r2.i();
        r3.<init>(r10, r4, r5);
        r3.c = r2;
        r4 = r2.c();
        if (r4 <= 0) goto L_0x01b3;
        r5 = r2.c();
        r5 = r5 - r4;
        r5 = r2.b(r5);
        r3.d(r5);
        r4 = r4 + -1;
        goto L_0x01a2;
        r2.d();
        r4 = r3.i();
        r4 = r4.d();
        if (r4 != 0) goto L_0x01e0;
        r4 = new tm;
        r5 = new ub;
        r5.<init>();
        r5 = r5.c();
        r4.<init>(r8, r15, r5);
        r3.d(r4);
        r4 = r3.i();
        r5 = 1;
        r4.a(r5);
        r4 = r3.i();
        r4.b(r5);
        r2.a(r3);
        r3 = new ub;
        r4 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r3.<init>(r4);
        r2.e = r3;
        r3 = "";
        r2.b = r3;
        defpackage.to.a(r2);
        r2 = 1;
        r3 = 0;
        r4 = 2;
        goto L_0x0085;
        r9 = 2;
        r2 = r5.a;
        r3 = "http://ns.adobe.com/xmp/1.0/DynamicMedia/";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02c7;
        r2 = "xmpDM:copyright";
        r3 = 0;
        r2 = defpackage.tn.a(r5, r2, r3);
        if (r2 == 0) goto L_0x02c2;
        r3 = r11;	 Catch:{ ss -> 0x02c2 }
        r3 = (defpackage.tk) r3;	 Catch:{ ss -> 0x02c2 }
        r3 = r3.a;	 Catch:{ ss -> 0x02c2 }
        r4 = 1;	 Catch:{ ss -> 0x02c2 }
        r3 = defpackage.tn.a(r3, r12, r13, r4);	 Catch:{ ss -> 0x02c2 }
        r4 = r2.b;	 Catch:{ ss -> 0x02c2 }
        r10 = "\n\n";	 Catch:{ ss -> 0x02c2 }
        r5 = "dc:rights";	 Catch:{ ss -> 0x02c2 }
        r6 = 0;	 Catch:{ ss -> 0x02c2 }
        r3 = defpackage.tn.a(r3, r5, r6);	 Catch:{ ss -> 0x02c2 }
        if (r3 == 0) goto L_0x029e;	 Catch:{ ss -> 0x02c2 }
        r5 = r3.e();	 Catch:{ ss -> 0x02c2 }
        if (r5 != 0) goto L_0x022a;	 Catch:{ ss -> 0x02c2 }
        goto L_0x029e;	 Catch:{ ss -> 0x02c2 }
        r5 = defpackage.tn.a(r3, r15);	 Catch:{ ss -> 0x02c2 }
        if (r5 >= 0) goto L_0x0253;	 Catch:{ ss -> 0x02c2 }
        r6 = 1;	 Catch:{ ss -> 0x02c2 }
        r5 = r3.a(r6);	 Catch:{ ss -> 0x02c2 }
        r8 = r5.b;	 Catch:{ ss -> 0x02c2 }
        r6 = "http://purl.org/dc/elements/1.1/";	 Catch:{ ss -> 0x02c2 }
        r7 = "rights";	 Catch:{ ss -> 0x02c2 }
        r16 = "";	 Catch:{ ss -> 0x02c2 }
        r17 = "x-default";	 Catch:{ ss -> 0x02c2 }
        r5 = r11;
        r18 = r8;
        r8 = r16;
        r16 = 2;
        r9 = r17;
        r13 = r10;
        r10 = r18;
        r5.a(r6, r7, r8, r9, r10);	 Catch:{ ss -> 0x02c4 }
        r5 = defpackage.tn.a(r3, r15);	 Catch:{ ss -> 0x02c4 }
        goto L_0x0256;	 Catch:{ ss -> 0x02c4 }
        r13 = r10;	 Catch:{ ss -> 0x02c4 }
        r16 = 2;	 Catch:{ ss -> 0x02c4 }
        r3 = r3.a(r5);	 Catch:{ ss -> 0x02c4 }
        r5 = r3.b;	 Catch:{ ss -> 0x02c4 }
        r6 = r5.indexOf(r13);	 Catch:{ ss -> 0x02c4 }
        if (r6 >= 0) goto L_0x027d;	 Catch:{ ss -> 0x02c4 }
        r6 = r4.equals(r5);	 Catch:{ ss -> 0x02c4 }
        if (r6 != 0) goto L_0x02bc;	 Catch:{ ss -> 0x02c4 }
        r6 = new java.lang.StringBuilder;	 Catch:{ ss -> 0x02c4 }
        r6.<init>();	 Catch:{ ss -> 0x02c4 }
        r6.append(r5);	 Catch:{ ss -> 0x02c4 }
        r6.append(r13);	 Catch:{ ss -> 0x02c4 }
        r6.append(r4);	 Catch:{ ss -> 0x02c4 }
        r4 = r6.toString();	 Catch:{ ss -> 0x02c4 }
        r3.b = r4;	 Catch:{ ss -> 0x02c4 }
        goto L_0x02bc;	 Catch:{ ss -> 0x02c4 }
        r6 = r6 + 2;	 Catch:{ ss -> 0x02c4 }
        r7 = r5.substring(r6);	 Catch:{ ss -> 0x02c4 }
        r7 = r7.equals(r4);	 Catch:{ ss -> 0x02c4 }
        if (r7 != 0) goto L_0x02bc;	 Catch:{ ss -> 0x02c4 }
        r7 = new java.lang.StringBuilder;	 Catch:{ ss -> 0x02c4 }
        r7.<init>();	 Catch:{ ss -> 0x02c4 }
        r8 = 0;	 Catch:{ ss -> 0x02c4 }
        r5 = r5.substring(r8, r6);	 Catch:{ ss -> 0x02c4 }
        r7.append(r5);	 Catch:{ ss -> 0x02c4 }
        r7.append(r4);	 Catch:{ ss -> 0x02c4 }
        r4 = r7.toString();	 Catch:{ ss -> 0x02c4 }
        goto L_0x027a;	 Catch:{ ss -> 0x02c4 }
        r13 = r10;	 Catch:{ ss -> 0x02c4 }
        r16 = 2;	 Catch:{ ss -> 0x02c4 }
        r3 = new java.lang.StringBuilder;	 Catch:{ ss -> 0x02c4 }
        r3.<init>();	 Catch:{ ss -> 0x02c4 }
        r3.append(r13);	 Catch:{ ss -> 0x02c4 }
        r3.append(r4);	 Catch:{ ss -> 0x02c4 }
        r10 = r3.toString();	 Catch:{ ss -> 0x02c4 }
        r6 = "http://purl.org/dc/elements/1.1/";	 Catch:{ ss -> 0x02c4 }
        r7 = "rights";	 Catch:{ ss -> 0x02c4 }
        r8 = "";	 Catch:{ ss -> 0x02c4 }
        r9 = "x-default";	 Catch:{ ss -> 0x02c4 }
        r5 = r11;	 Catch:{ ss -> 0x02c4 }
        r5.a(r6, r7, r8, r9, r10);	 Catch:{ ss -> 0x02c4 }
        r3 = r2.c;	 Catch:{ ss -> 0x02c4 }
        r3.c(r2);	 Catch:{ ss -> 0x02c4 }
        goto L_0x02c4;
        r16 = 2;
        r2 = 1;
        r3 = 0;
        goto L_0x02e2;
        r16 = 2;
        r2 = r5.a;
        r3 = "http://ns.adobe.com/xap/1.0/rights/";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x02e0;
        r2 = "xmpRights:UsageTerms";
        r3 = 0;
        r2 = defpackage.tn.a(r5, r2, r3);
        if (r2 == 0) goto L_0x02e1;
        defpackage.to.a(r2);
        goto L_0x02e1;
        r3 = 0;
        r2 = 1;
        r4 = 2;
        r13 = 0;
        goto L_0x0085;
        r2 = r0.g;
        if (r2 == 0) goto L_0x03fd;
        r0.g = r3;
        r1 = r20.b();
        r2 = new java.util.ArrayList;
        r3 = r0.k();
        r2.<init>(r3);
        r2 = java.util.Collections.unmodifiableList(r2);
        r2 = r2.iterator();
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x03fd;
        r3 = r2.next();
        r3 = (defpackage.tm) r3;
        r4 = r3.g;
        if (r4 == 0) goto L_0x0301;
        r4 = r3.f();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x03f8;
        r5 = r4.next();
        r5 = (defpackage.tm) r5;
        r7 = r5.h;
        if (r7 == 0) goto L_0x0315;
        r7 = 0;
        r5.h = r7;
        r8 = defpackage.sv.a;
        r9 = r5.a;
        r8 = r8.c(r9);
        if (r8 == 0) goto L_0x0315;
        r9 = r8.a();
        r10 = 0;
        r12 = 1;
        r9 = defpackage.tn.a(r0, r9, r10, r12);
        r9.f = r7;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r12 = r8.b();
        r10.append(r12);
        r12 = r8.c();
        r10.append(r12);
        r10 = r10.toString();
        r10 = defpackage.tn.a(r9, r10, r7);
        if (r10 != 0) goto L_0x03ae;
        r7 = r8.d();
        r7 = r7.a();
        if (r7 == 0) goto L_0x0382;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r10 = r8.b();
        r7.append(r10);
        r8 = r8.c();
        r7.append(r8);
        r7 = r7.toString();
        r5.a = r7;
        r9.a(r5);
        goto L_0x03be;
        r7 = new tm;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r12 = r8.b();
        r10.append(r12);
        r12 = r8.c();
        r10.append(r12);
        r10 = r10.toString();
        r8 = r8.d();
        r8 = r8.d();
        r7.<init>(r10, r8);
        r9.a(r7);
        defpackage.to.a(r4, r5, r7);
        goto L_0x0315;
        r7 = r8.d();
        r7 = r7.a();
        if (r7 == 0) goto L_0x03c3;
        if (r1 == 0) goto L_0x03be;
        r7 = 1;
        defpackage.to.a(r5, r10, r7);
        r4.remove();
        goto L_0x0315;
        r7 = r8.d();
        r7 = r7.c();
        if (r7 == 0) goto L_0x03dd;
        r7 = defpackage.tn.a(r10, r15);
        r8 = -1;
        if (r7 == r8) goto L_0x03da;
        r7 = r10.a(r7);
        r13 = r7;
        goto L_0x03db;
        r13 = 0;
        r7 = 1;
        goto L_0x03eb;
        r7 = r10.e();
        if (r7 == 0) goto L_0x03e9;
        r7 = 1;
        r13 = r10.a(r7);
        goto L_0x03eb;
        r7 = 1;
        r13 = 0;
        if (r13 != 0) goto L_0x03f2;
        defpackage.to.a(r4, r5, r10);
        goto L_0x0315;
        if (r1 == 0) goto L_0x03be;
        defpackage.to.a(r5, r13, r7);
        goto L_0x03be;
        r5 = 0;
        r3.g = r5;
        goto L_0x0301;
        r1 = r0.a;
        if (r1 == 0) goto L_0x0451;
        r1 = r0.a;
        r1 = r1.length();
        r2 = 36;
        if (r1 < r2) goto L_0x0451;
        r1 = r0.a;
        r1 = r1.toLowerCase();
        r2 = "uuid:";
        r3 = r1.startsWith(r2);
        if (r3 == 0) goto L_0x041d;
        r1 = r1.substring(r6);
        r3 = defpackage.th.c(r1);
        if (r3 == 0) goto L_0x0451;
        r3 = "http://ns.adobe.com/xap/1.0/mm/";
        r4 = "InstanceID";
        r3 = defpackage.tv.a(r3, r4);
        r4 = 0;
        r5 = 1;
        r3 = defpackage.tn.a(r0, r3, r5, r4);
        if (r3 == 0) goto L_0x0447;
        r3.e = r4;
        r1 = java.lang.String.valueOf(r1);
        r1 = r2.concat(r1);
        r3.b = r1;
        r3.d = r4;
        r3.d();
        r0.a = r4;
        goto L_0x0451;
        r0 = new ss;
        r1 = 9;
        r2 = "Failure creating xmpMM:InstanceID";
        r0.<init>(r2, r1);
        throw r0;
        defpackage.to.b(r0);
        return r11;
        r0 = new ss;
        r1 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r2 = "Invalid attributes of rdf:RDF element";
        r0.<init>(r2, r1);
        throw r0;
        r0 = new tk;
        r0.<init>();
        return r0;
        r0 = new ss;
        r1 = "Parameter must not be null";
        r0.<init>(r1, r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.a(java.lang.Object, ua):su");
    }

    private static Object[] a(Node node, boolean z, Object[] objArr) {
        while (true) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if ((short) 7 == item.getNodeType()) {
                    ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                    if ("xpacket".equals(processingInstruction.getTarget())) {
                        if (objArr != null) {
                            objArr[2] = processingInstruction.getData();
                        }
                    }
                }
                if (!((short) 3 == item.getNodeType() || (short) 7 == item.getNodeType())) {
                    String namespaceURI = item.getNamespaceURI();
                    String localName = item.getLocalName();
                    if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                        node = item;
                        z = false;
                    } else if (!z && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        if (objArr != null) {
                            objArr[0] = item;
                            objArr[1] = a;
                        }
                        return objArr;
                    } else {
                        Object[] a = tl.a(item, z, objArr);
                        if (a != null) {
                            return a;
                        }
                    }
                }
            }
            return null;
        }
    }
}
