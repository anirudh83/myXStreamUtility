package com.anirudh;

import com.anirudh.domain.Product;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anirudh on 15/07/14.
 */
public class TransformerTest {

    private Transformer<Product> productTransformer;
    private Product product;
    @Before
    public void init(){
        productTransformer = new Transformer<Product>();
        product = new Product(123,"Banana",23.00);
    }
    @Test
    public void testJSONToObject(){
        String json = productTransformer.getJSONFromObject(product);
        System.out.println(json);
        Product convertedproduct = productTransformer.getObjectFromJSON(json);
        System.out.println(convertedproduct.getName());
    }

    @Test
    public void testXMLtoObjectForStax(){
        String xml = productTransformer.getXMLFromObject(product);
        System.out.println(xml);
        Product convertedproduct = productTransformer.getObjectFromXML(xml);
        System.out.println(convertedproduct.getName());
    }

    @Test
    public void testXMLtoObjectForDom(){
        String xml = productTransformer.getXMLFromObjectUsingDomDriver(product);
        System.out.println(xml);
        Product convertedproduct = productTransformer.getObjectFromXMLUsingDomDriver(xml);
        System.out.println(convertedproduct.getName());
    }

}
