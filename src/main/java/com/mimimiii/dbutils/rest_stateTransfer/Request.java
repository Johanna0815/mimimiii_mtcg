package com.mimimiii.dbutils.rest_stateTransfer;

import com.mimimiii.dbutils.http_news.Crud_Method;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Request {
    private Crud_Method crud_Method;
    private String pathname;
    private String params;
    private String contentType;
    private Integer contentLength;
    private String body = "";
}
