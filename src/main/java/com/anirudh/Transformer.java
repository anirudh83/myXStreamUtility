package com.anirudh;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Created by anirudh on 15/07/14.
 */
public class Transformer<T> {


    public T getObjectFromJSON(String json){
        return (T) XStreamObjectFactory.getJettisonDriverInstance().fromXML(json);
    }

    public String getJSONFromObject(T t){
        return XStreamObjectFactory.getJettisonDriverInstance().toXML(t);
    }


    public T getObjectFromXML(String xml){
        return (T)XStreamObjectFactory.getStaxDriverInstance().fromXML(xml);
    }

    public String getXMLFromObject(T t){
        return XStreamObjectFactory.getStaxDriverInstance().toXML(t);
    }

    public T getObjectFromXMLUsingDomDriver(String xml){
        return (T)XStreamObjectFactory.getDomDriverInstance().fromXML(xml);
    }

    public String getXMLFromObjectUsingDomDriver(T t){
        return XStreamObjectFactory.getDomDriverInstance().toXML(t);
    }


}
