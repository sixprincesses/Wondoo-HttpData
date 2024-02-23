package com.wondoo.httpdata;

public record WondooExceptionResponse(
        String errorCode,
        String errorMessage
) {
}
