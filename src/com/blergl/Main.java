package com.blergl;

/**
 * Created with IntelliJ IDEA.
 * User: josh
 * Date: 12/7/14
 * Time: 6:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        SystemConfig sc = new SystemConfig(10,"random schema");
        System.out.println(sc.doConfig());
    }
}
