package com.msa4spring.responses;


import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Builder
public class ResponseDTO<T> {
    private String code;
    private String msg;
    private T data;
}
