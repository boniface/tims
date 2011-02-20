/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashthrims.clients.web.vaadin.views.location.forms;

import com.hashthrims.clients.web.vaadin.data.ClientDataService;
import com.hashthrims.domain.regionlist.Country;
import com.vaadin.data.Item;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Select;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.Runo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author boniface
 */
public class ProvinceForm {

    // Define Buttons
    private Button save = new Button("Save");
    private Button edit = new Button("Edit");
    private Button cancel = new Button("Cancel");
    private Button update = new Button("Update");
    private Button delete = new Button("Delete");
    //Define Footer
    private HorizontalLayout footer;
    private static final ClientDataService data = new ClientDataService();

    public ProvinceForm() {
    }

    public Form createProvinceFrom() {
        final Form form = new Form();
        form.setCaption("Province");
        form.setImmediate(false);
        form.setFormFieldFactory(new ProvinceFieldFactory());

        // Add Listeners

        footer = new HorizontalLayout();
        footer.setSpacing(true);
        footer.addComponent(save);
        footer.addComponent(cancel);
        footer.addComponent(edit);
        footer.addComponent(update);
        footer.addComponent(delete);
        footer.setVisible(true);
        footer.setMargin(true);
        // Determines which properties are shown, and in which order:
        edit.setVisible(false);
        update.setVisible(false);
        delete.setVisible(false);
        form.setWriteThrough(false);
        form.setFooter(footer);

        return form;
    }

    public List orderList() {
        List order = new ArrayList();
        order.add("provinceName");
        order.add("provinceCode");
        order.add("country");
        order.add("provinceId");
        return order;
    }

    /**
     * @return the delete
     */
    public Button getDelete() {
        return delete;
    }

    /**
     * @param delete the delete to set
     */
    public void setDelete(Button delete) {
        this.delete = delete;
    }

    /**
     * @return the save
     */
    public Button getSave() {
        return save;
    }

    /**
     * @param save the save to set
     */
    public void setSave(Button save) {
        this.save = save;
    }

    /**
     * @return the edit
     */
    public Button getEdit() {
        return edit;
    }

    /**
     * @param edit the edit to set
     */
    public void setEdit(Button edit) {
        this.edit = edit;
    }

    /**
     * @return the cancel
     */
    public Button getCancel() {
        return cancel;
    }

    /**
     * @param cancel the cancel to set
     */
    public void setCancel(Button cancel) {
        this.cancel = cancel;
    }

    /**
     * @return the update
     */
    public Button getUpdate() {
        return update;
    }

    /**
     * @param update the update to set
     */
    public void setUpdate(Button update) {
        this.update = update;
    }

    /**
     * @param footer the footer to set
     */
    public void setFooter(HorizontalLayout footer) {
        this.footer = footer;
    }

    static class ProvinceFieldFactory extends DefaultFieldFactory {

        @Override
        public Field createField(Item item, Object propertyId,
                Component uiContext) {

            Field field = super.createField(item, propertyId, uiContext);

            if ("provinceName".equals(propertyId)) {
                field = new TextField("Province Name:");
                ((TextField) field).setColumns(30);
                ((TextField) field).setNullRepresentation("");
                ((TextField) field).setRequired(true);
                ((TextField) field).setRequiredError("Please Enter Province Name");
            } else if ("provinceCode".equals(propertyId)) {
                field = new TextField("Province Code:");
           
                ((TextField) field).setColumns(30);
                ((TextField) field).setNullRepresentation("");
         
                ((TextField) field).setRequired(true);
                ((TextField) field).setRequiredError("Please Enter Province Code");
            } else if ("provinceId".equals(propertyId)) {
                field = new TextField("Province ID:");
             
                ((TextField) field).setVisible(false);

            } else if ("country".equals(propertyId)) {
                List<Country> countries = data.getCountryService().findAll();
                Select select = new Select("Country");
                for (Country country : countries) {
                    select.addItem(country.getCountryName());
                }
                select.setNewItemsAllowed(true);
                select.setWidth("300");
                select.setRequired(true);
                return select;
            }

            return field;

        }
    }
}
