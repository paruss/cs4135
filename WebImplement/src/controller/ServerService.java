/**
 * ServerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controller;

public interface ServerService extends javax.xml.rpc.Service {
    public java.lang.String getServerAddress();

    public controller.Server getServer() throws javax.xml.rpc.ServiceException;

    public controller.Server getServer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
