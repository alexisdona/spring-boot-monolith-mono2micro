package com.alekseybykov.examples.springboot.component.rest.api;

import com.alekseybykov.examples.springboot.component.rest.api.response.NegativeResponse;
import com.alekseybykov.examples.springboot.component.rest.api.response.PositiveResponse;
import com.alekseybykov.examples.springboot.component.rest.api.status.StatusCode;

import java.util.Collections;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-07-10
 */
public class ComponentAPI {
    private ComponentAPI() { }

    public static PositiveResponse positiveResponse(Object data) {
        return new PositiveResponse(data);
    }

    public static PositiveResponse emptyPositiveResponse() {
        return new PositiveResponse(Collections.emptyList());
    }

    public static NegativeResponse negativeResponse(StatusCode errorCode, String errorMessage, Object details) {
        return new NegativeResponse(errorCode, errorMessage, details);
    }
}