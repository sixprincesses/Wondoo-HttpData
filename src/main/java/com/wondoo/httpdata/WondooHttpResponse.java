package com.wondoo.httpdata;

public record WondooHttpResponse<T>(
        T value,
        Exception exception
) {
    public static <T> WondooHttpResponse<T> ok(T value) {
        return new WondooHttpResponse<>(value, null);
    }

    public static <T> WondooHttpResponse<T> failed(Exception e) {
        return new WondooHttpResponse<>(null, e);
    }

    public T valueOrDefaultValue(T defaultValue) {
        return value != null ? value : defaultValue;
    }

    public boolean isSuccess() {
        return !hasException();
    }

    public boolean hasException() {
        return exception != null;
    }
}
