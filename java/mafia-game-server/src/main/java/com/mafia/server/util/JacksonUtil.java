/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mafia.server.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.logging.Logger;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author Just1689
 */
public class JacksonUtil<T> {
    
    public T stringToObject(String json, Class clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            T result = (T) objectMapper.readValue(json, clazz);
            return result;
        } catch (IOException ex) {
            Logger.getLogger(this.getClass()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}