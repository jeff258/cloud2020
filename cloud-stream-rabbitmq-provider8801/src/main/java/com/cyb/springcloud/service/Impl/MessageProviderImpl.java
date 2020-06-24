package com.cyb.springcloud.service.Impl;

import com.cyb.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

import org.springframework.cloud.stream.messaging.Source;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by cyb on 2020/6/24 16:47
 */
@Slf4j
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
   @Resource
    MessageChannel output;

    @Override
    public String send() {
        String uuid=UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());

        log.info("****生产者***uuid====="+uuid);

        return null;


    }
}
