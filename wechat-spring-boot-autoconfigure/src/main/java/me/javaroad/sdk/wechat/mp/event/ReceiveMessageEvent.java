package me.javaroad.sdk.wechat.mp.event;

import me.javaroad.sdk.wechat.mp.model.message.Message;
import org.springframework.context.ApplicationEvent;

/**
 * @author heyx
 */
public class ReceiveMessageEvent extends ApplicationEvent {

    public ReceiveMessageEvent(Message source) {
        super(source);
    }
}
