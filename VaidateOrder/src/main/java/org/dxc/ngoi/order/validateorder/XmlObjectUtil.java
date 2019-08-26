package org.dxc.ngoi.order.validateorder;


import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import com.hp.sales.om.orders.Biztalk1;





public class XmlObjectUtil {
	
	
    //    comment to trigger build and release
    
    public static Biztalk1  getGSXMLObjFromXML(String xmlString) {
        try {

        	JAXBContext jc = JAXBContext.newInstance(Biztalk1.class);
            Unmarshaller u = jc.createUnmarshaller();
            
            JAXBElement<Biztalk1> jaxbOrder = u.unmarshal(new StreamSource(new StringReader(xmlString)), Biztalk1.class);
    
            return jaxbOrder.getValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
    public static String getXMLStringFromGSXMLObj(Biztalk1 biztalk1) {
        
        if ( null != biztalk1) {
            try {
                StringWriter strWriter = new StringWriter();
            	JAXBContext jc = JAXBContext.newInstance(Biztalk1.class);

                Marshaller m = jc.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                m.marshal(new JAXBElement<Biztalk1>(new QName("http://hp.com/sales/om/orders/","Biztalk1"), Biztalk1.class, biztalk1),strWriter);              
                return strWriter.getBuffer().toString();
            } catch (Exception e) {

            	throw new RuntimeException(e);
            }           
        }else{
            return null;
        }

    }
}
    

	
