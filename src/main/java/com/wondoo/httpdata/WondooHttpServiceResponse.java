package com.wondoo.httpdata;

public record WondooHttpServiceResponse<T>(
        T value,
        Exception exception
) {
    public static <T> WondooHttpServiceResponse<T> ok(T value) {
        return new WondooHttpServiceResponse<>(value, null);
    }

    public static <T> WondooHttpServiceResponse<T> failed(Exception e) {
        return new WondooHttpServiceResponse<>(null, e);
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
