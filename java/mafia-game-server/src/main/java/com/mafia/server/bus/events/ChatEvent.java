/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mafia.server.bus.events;

import com.mafia.server.bus.ent.ChatEvents;
import com.mafia.server.model.comm.client.Chat;
import com.mafia.server.model.state.Repository;

/**
 *
 * @author Just1689
 */
public class ChatEvent implements Runnable, Event {

    private Chat data;
    private String createdBy;

    @Override
    public void run() {
        //impl
        System.out.println(data.toString());
        ChatEvents.messageEveryoneInGame(Repository.getPlayerBySessionId(createdBy), createdBy);

    }

    @Override
    public void setData(Object obj, String sessionId) {
        this.data = (Chat) obj;
        this.createdBy = sessionId;

    }

}