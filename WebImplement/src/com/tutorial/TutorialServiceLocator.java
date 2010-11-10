/**
 * TutorialServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorial;

public class TutorialServiceLocator extends org.apache.axis.client.Service implements com.tutorial.TutorialService {

    public TutorialServiceLocator() {
    }


    public TutorialServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TutorialServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Tutorial
    private java.lang.String Tutorial_address = "http://localhost:8084/WebServicesTutorial/services/Tutorial";

    public java.lang.String getTutorialAddress() {
        return Tutorial_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TutorialWSDDServiceName = "Tutorial";

    public java.lang.String getTutorialWSDDServiceName() {
        return TutorialWSDDServiceName;
    }

    public void setTutorialWSDDServiceName(java.lang.String name) {
        TutorialWSDDServiceName = name;
    }

    public com.tutorial.Tutorial getTutorial() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Tutorial_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTutorial(endpoint);
    }

    public com.tutorial.Tutorial getTutorial(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tutorial.TutorialSoapBindingStub _stub = new com.tutorial.TutorialSoapBindingStub(portAddress, this);
            _stub.setPortName(getTutorialWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTutorialEndpointAddress(java.lang.String address) {
        Tutorial_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tutorial.Tutorial.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tutorial.TutorialSoapBindingStub _stub = new com.tutorial.TutorialSoapBindingStub(new java.net.URL(Tutorial_address), this);
                _stub.setPortName(getTutorialWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Tutorial".equals(inputPortName)) {
            return getTutorial();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tutorial.com", "TutorialService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tutorial.com", "Tutorial"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Tutorial".equals(portName)) {
            setTutorialEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
