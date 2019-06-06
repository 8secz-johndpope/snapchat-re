//-----------------------------------------------------------------------
// Copyright (c) 2017 Snap Inc.
//-----------------------------------------------------------------------

#define SC_USE_USER_DEFINED_VS_MAIN

#include <std.glsl>
#include <std_vs.glsl>
#include <std_fs.glsl>
#include <depth/disparity_conversion.glsl>
#include <depth/float_packing.glsl>

uniform sampler2D mainTexture;
uniform mat3 mainTextureTransform;

uniform sampler2D depthTexture;
uniform mat3 depthTextureTransform;

uniform float depthToDisparityNumerator;

#ifdef VERTEX_SHADER

void main(void)
{
    varTex0 = vec2(mainTextureTransform * vec3(texture0, 1.0));
    varTex1 = vec2(depthTextureTransform * vec3(texture0, 1.0));
    gl_Position = position;
}

#endif


#ifdef FRAGMENT_SHADER

void main() {
    vec3 lr_x = texture2D(mainTexture, varTex0).rgb;
    float depth = texture2D(depthTexture, varTex1).r;
    float lr_y = depthToDisparity(depth, depthToDisparityNumerator);

#ifdef BY_Y
    gl_FragColor = vec4(encode2(lr_x.b*lr_y), encode2(lr_y));
#elif RY_GY
    gl_FragColor = vec4(encode2(lr_x.r*lr_y), encode2(lr_x.g*lr_y));
#else
    #error "Expected define not specified"
#endif
}

#endif
