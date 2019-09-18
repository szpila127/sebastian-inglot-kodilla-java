package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Produkt 1");
        Product product2 = new Product("Produkt 2");

        Item item1 = new Item(new BigDecimal(10), 11, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(20), 22, new BigDecimal(200));

        item1.setProduct(product2);
        item2.setProduct(product1);

        Invoice invoice = new Invoice("Invoice 1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
     //   invoiceDao.deleteById(id);
    }

}
