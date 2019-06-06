package defpackage;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.ajbc.a;
import defpackage.ajbc.b;

/* renamed from: ajax */
public final class ajax {
    public static final ajbp a = ajbp.a("canonical_status");
    public static final ajbp b = ajbp.a("method");

    static {
        String str = "RPC Errors";
        String str2 = SCamera.CAMERA_ID_FRONT;
        b.a("grpc.io/client/error_count", str, str2);
        String str3 = "Request bytes";
        String str4 = "By";
        a.a("grpc.io/client/request_bytes", str3, str4);
        String str5 = "Response bytes";
        a.a("grpc.io/client/response_bytes", str5, str4);
        String str6 = "ms";
        a.a("grpc.io/client/roundtrip_latency", "RPC roundtrip latency msec", str6);
        String str7 = "Server elapsed time in msecs";
        a.a("grpc.io/client/server_elapsed_time", str7, str6);
        String str8 = "Uncompressed Request bytes";
        a.a("grpc.io/client/uncompressed_request_bytes", str8, str4);
        String str9 = "Uncompressed Response bytes";
        a.a("grpc.io/client/uncompressed_response_bytes", str9, str4);
        b.a("grpc.io/client/started_count", "Number of client RPCs (streams) started", str2);
        b.a("grpc.io/client/finished_count", "Number of client RPCs (streams) finished", str2);
        b.a("grpc.io/client/request_count", "Number of client RPC request messages", str2);
        b.a("grpc.io/client/response_count", "Number of client RPC response messages", str2);
        b.a("grpc.io/server/error_count", str, str2);
        a.a("grpc.io/server/request_bytes", str3, str4);
        a.a("grpc.io/server/response_bytes", str5, str4);
        a.a("grpc.io/server/server_elapsed_time", str7, str6);
        a.a("grpc.io/server/server_latency", "Latency in msecs", str6);
        a.a("grpc.io/server/uncompressed_request_bytes", str8, str4);
        a.a("grpc.io/server/uncompressed_response_bytes", str9, str4);
        b.a("grpc.io/server/started_count", "Number of server RPCs (streams) started", str2);
        b.a("grpc.io/server/finished_count", "Number of server RPCs (streams) finished", str2);
        b.a("grpc.io/server/request_count", "Number of server RPC request messages", str2);
        b.a("grpc.io/server/response_count", "Number of server RPC response messages", str2);
    }
}
