package com.wondoo.httpdata;

public record WondooApiResponse<T>(
        T content,
        String message
) {
}
