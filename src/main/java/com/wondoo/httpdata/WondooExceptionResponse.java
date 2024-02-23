package com.wondoo.httpdata;

public record WondooExceptionResponse(
        String errorMessage,
        String errorCode
) {
}
