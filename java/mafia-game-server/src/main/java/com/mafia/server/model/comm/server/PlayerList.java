/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mafia.server.model.comm.server;

import com.mafia.server.model.state.Player;
import java.util.List;

/**
 *
 * @author Just1689
 */
public class PlayerList extends ServerMessage {

    private String message;

    public PlayerList(List<Player> players) {
        StringBuilder out = new StringBuilder();
        for (Player player : players) {
            out.append("<span class=\"label label-default\">");
            out.append(player.getName());
            out.append("</span> ");
        }
        message = out.toString();
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
