/**
 * TutorialService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorial;

public interface TutorialService extends javax.xml.rpc.Service {
    public java.lang.String getTutorialAddress();

    public com.tutorial.Tutorial getTutorial() throws javax.xml.rpc.ServiceException;

    public com.tutorial.Tutorial getTutorial(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
