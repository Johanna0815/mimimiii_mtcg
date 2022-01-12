package com.mimimiii.dbutils.http_news;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class MessageImpl implements Message {

    @Getter
    @Setter
    int id;

    @Getter
    String message;

}
