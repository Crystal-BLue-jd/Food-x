/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery.GUI;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Ilyes
 */
public class ModelList {
        private final SimpleIntegerProperty menuid;
    private final SimpleIntegerProperty price;

    private final SimpleStringProperty menuname;
public ModelList(String menuname, int menuid , int price) {
        this.menuname = new SimpleStringProperty(menuname);
        this.menuid = new SimpleIntegerProperty(menuid);
        this.price = new SimpleIntegerProperty(price);
    }
    public String getMenuname() {
        return menuname.get();
    }

    public void setMenuname(String menuname) {
        this.menuname.set(menuname);
    }

    public int getMenuid() {
        return menuid.get();
    }

    public void setMenuid(int menuid) {
        this.menuid.set(menuid); 
    }


    public int getPrice() {
        return price.get();
    }

    public void setPrice(int price) {
        this.price.set(price);
    }

    
    
}
