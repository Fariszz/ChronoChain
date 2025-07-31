package org.chronochain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult <T> implements Serializable {

    private String httpCode = "200";

    private String code;

    private String msg;

    private Long requestTime;

    private T data;
}
