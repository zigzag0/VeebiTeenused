/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.websvc.order;

import javax.jws.WebService;

/**
 *
 * @author Sinegami
 */
@WebService(serviceName = "products", portName = "productsSOAP", endpointInterface = "ee.ttu.idu0075._2016.ws.order.Products", targetNamespace = "http://www.ttu.ee/idu0075/2016/ws/order", wsdlLocation = "WEB-INF/wsdl/ProductWebService/orders.wsdl")
public class ProductWebService {

    public ee.ttu.idu0075._2016.ws.order.ProductType addProduct(ee.ttu.idu0075._2016.ws.order.AddProductRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public ee.ttu.idu0075._2016.ws.order.ProductType updateProduct(ee.ttu.idu0075._2016.ws.order.ProductType parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String deleteProduct(ee.ttu.idu0075._2016.ws.order.DeleteProductRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
