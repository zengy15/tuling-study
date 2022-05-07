package com.tuling.zk_demo.client;

public class ClusterBase extends StandaloneBase {

    private final static  String CLUSTER_CONNECT_STR="192.168.65.156:2181,192.168.65.190:2181,192.168.65.200:2181";


    private static final  int CLUSTER_SESSION_TIMEOUT=60 * 1000;


    @Override
    protected String getConnectStr() {
        return CLUSTER_CONNECT_STR;
    }

    @Override
    protected int getSessionTimeout() {
        return CLUSTER_SESSION_TIMEOUT;
    }
}
