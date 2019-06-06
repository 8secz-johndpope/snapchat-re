//-----------------------------------------------------------------------
// Copyright (c) 2019 Snap Inc.
//-----------------------------------------------------------------------

#define SC_USE_USER_DEFINED_VS_MAIN

#include <std.glsl>
#include <std_vs.glsl>
#include <std_fs.glsl>

uniform sampler2D mainTexture;
uniform mat3 mainTextureTransform;

#ifdef VERTEX_SHADER

void main() {
    varTex0 = vec2(mainTextureTransform * vec3(texture0, 1.0));
    gl_Position = position;
}

#endif // VERTEX_SHADER

#ifdef FRAGMENT_SHADER

void main() {
    vec3 lr_x = texture2D(mainTexture, varTex0).rgb;
#if defined(RG_RB_GB)
    gl_FragColor = vec4(lr_x.rrg*lr_x.gbb, 1.0);
#elif defined(RR_GG_BB)
    gl_FragColor = vec4(lr_x*lr_x, 1.0);
#elif defined(R_G_B)
    gl_FragColor = vec4(lr_x, 1.0);
#else
    #error "Expected define not specified"
#endif
}

#endif
