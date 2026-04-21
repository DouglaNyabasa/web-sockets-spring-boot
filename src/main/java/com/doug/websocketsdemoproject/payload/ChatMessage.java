package com.doug.websocketsdemoproject.payload;

import com.doug.websocketsdemoproject.domain.MessageType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    String content;
    String sender;
    MessageType type;
}
