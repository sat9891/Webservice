/**
 * PartyImplementerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class PartyImplementerServiceLocator extends org.apache.axis.client.Service implements com.PartyImplementerService {

    public PartyImplementerServiceLocator() {
    }


    public PartyImplementerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PartyImplementerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PartyImplementerPort
    private java.lang.String PartyImplementerPort_address = "http://localhost:9191/party";

    public java.lang.String getPartyImplementerPortAddress() {
        return PartyImplementerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PartyImplementerPortWSDDServiceName = "PartyImplementerPort";

    public java.lang.String getPartyImplementerPortWSDDServiceName() {
        return PartyImplementerPortWSDDServiceName;
    }

    public void setPartyImplementerPortWSDDServiceName(java.lang.String name) {
        PartyImplementerPortWSDDServiceName = name;
    }

    public com.Party getPartyImplementerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PartyImplementerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPartyImplementerPort(endpoint);
    }

    public com.Party getPartyImplementerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.PartyImplementerPortBindingStub _stub = new com.PartyImplementerPortBindingStub(portAddress, this);
            _stub.setPortName(getPartyImplementerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPartyImplementerPortEndpointAddress(java.lang.String address) {
        PartyImplementerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.Party.class.isAssignableFrom(serviceEndpointInterface)) {
                com.PartyImplementerPortBindingStub _stub = new com.PartyImplementerPortBindingStub(new java.net.URL(PartyImplementerPort_address), this);
                _stub.setPortName(getPartyImplementerPortWSDDServiceName());
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
        if ("PartyImplementerPort".equals(inputPortName)) {
            return getPartyImplementerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/", "PartyImplementerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/", "PartyImplementerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PartyImplementerPort".equals(portName)) {
            setPartyImplementerPortEndpointAddress(address);
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
