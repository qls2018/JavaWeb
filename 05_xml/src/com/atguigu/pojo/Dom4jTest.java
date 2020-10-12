package com.atguigu.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @auther qq
 * @creat 2020-07-29-17:10
 */
public class Dom4jTest {
    @Test
    public void test1() throws Exception {
        SAXReader saxReader = new SAXReader();
        try {
            Document doc = saxReader.read("src/books.xml");
            System.out.println(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test2() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/books.xml");
        Element rootElement = document.getRootElement();
        List<Element> books = rootElement.elements("book");
        for (Element book : books) {
            Element nameElement = book.element("name");
            String nameText = nameElement.getText();
            String priceText = book.elementText("price");
            String authorText = book.elementText("author");

            String snValue = book.attributeValue("sn");

            System.out.println(new Book(snValue,nameText, Double.parseDouble(priceText),authorText));


        }

    }

}
