package com.anirudh;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Created by anirudh on 15/07/14.
 */
public class XStreamObjectFactory {

    private static final XStream XSTREAM_INSTANCE = null;

    public static XStream getStaxDriverInstance(){
        if(XSTREAM_INSTANCE==null) {
            return new XStream(new StaxDriver());
        }else{
            return XSTREAM_INSTANCE;
        }
    }

    public static XStream getDomDriverInstance(){
        if(XSTREAM_INSTANCE==null){
            return new XStream(new DomDriver());
        }else{
            return XSTREAM_INSTANCE;
        }
    }

    public static XStream getJettisonDriverInstance(){
        if(XSTREAM_INSTANCE==null){
            return new XStream(new JettisonMappedXmlDriver());
        }  else {
            return XSTREAM_INSTANCE;
        }
    }
}
