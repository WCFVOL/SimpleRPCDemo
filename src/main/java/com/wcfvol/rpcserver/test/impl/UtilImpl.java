package com.wcfvol.rpcserver.test.impl;

import com.wcfvol.rpcserver.server.RPCService;
import com.wcfvol.rpcserver.test.Util;

import java.util.Date;

@RPCService(value=Util.class,version = "com.wcfvol.rpcserver")
public class UtilImpl implements Util {
    public Date getTime() {
        return new Date();
    }
}
