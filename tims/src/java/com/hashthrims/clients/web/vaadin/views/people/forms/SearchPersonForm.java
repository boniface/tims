/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashthrims.clients.web.vaadin.views.people.forms;

import com.hashthrims.clients.web.vaadin.data.ClientDataService;
import com.hashthrims.domain.offices.Facility;
import com.vaadin.data.Item;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Select;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.Runo;
import java.util.List;

/**
 *
 * @author boniface
 */
public class SearchPersonForm {

    // Define Buttons
    private Button search = new Button("Search For a Person");
    private Button add = new Button("Add New Person");
    //Define Footer
    private HorizontalLayout footer;
    private static ClientDataService data = new ClientDataService();

    public SearchPersonForm() {
    }

    public Form createSearchPersonForm() {
        Form form = new SearchGridForm();
        form.setCaption("Search For a Person");
        form.setImmediate(false);
        form.setFormFieldFactory(new SearchPersonFieldFactory());

        // Add Listeners

        footer = new HorizontalLayout();
        footer.setSpacing(true);
        footer.addComponent(search);

        footer.addComponent(add);


        footer.setVisible(true);
        footer.setMargin(true);
        form.setWriteThrough(false);
        form.setFooter(footer);
        return form;
    }

    /**
     * @return the save
     */
    public Button getSearch() {
        return search;
    }

    /**
     * @param save the save to set
     */
    public void setSearch(Button save) {
        this.search = save;
    }

    /**
     * @return the edit
     */
    public Button getAdd() {
        return add;
    }

    /**
     * @param edit the edit to set
     */
    public void setAdd(Button edit) {
        this.add = edit;
    }

    /**
     * @param footer the footer to set
     */
    public void setFooter(HorizontalLayout footer) {
        this.footer = footer;
    }

    static class SearchPersonFieldFactory extends DefaultFieldFactory {

        private Select selectFacilityList;

        @Override
        public Field createField(Item item, Object propertyId,
                Component uiContext) {
            Field field = super.createField(item, propertyId, uiContext);
            if ("firstName".equals(propertyId)) {
                field = new TextField("First Name:");
                ((TextField) field).setColumns(20);
                ((TextField) field).setNullRepresentation("");
                ((TextField) field).setRequiredError("Enter Value");
            } else if ("lastName".equals(propertyId)) {
                field = new TextField("Surname:");
                ((TextField) field).setColumns(20);
                ((TextField) field).setNullRepresentation("");
                ((TextField) field).setRequiredError("Enter Value");
            } else if ("facility".equals(propertyId)) {
                List<Facility> facilities = data.getFacilityService().findAll();
                selectFacilityList = new Select("Searh By Facility");
                for (Facility fac : facilities) {
                    selectFacilityList.addItem(fac.getId());
                    selectFacilityList.setItemCaption(fac.getId(), fac.getFacilityName());
                }
                selectFacilityList.setNewItemsAllowed(false);
                selectFacilityList.setImmediate(true);
                selectFacilityList.setWidth("250");

                return selectFacilityList;
            }
            return field;
        }
    }

    class SearchGridForm extends Form {

        private GridLayout layout;

        public SearchGridForm() {
            setCaption("Person Form");
            layout = new GridLayout(3, 3);
            layout.setMargin(true);
            layout.setSpacing(true);

            //layout.setSizeFull();
            //layout.setStyleName(Runo.LAYOUT_DARKER);
            layout.setStyleName(Runo.CSSLAYOUT_SHADOW);
            HorizontalLayout firstHeader = new HorizontalLayout();
            firstHeader.setSizeFull();
            firstHeader.setStyleName(Runo.LAYOUT_DARKER);
            Label firstHeaderlabel = new Label("Search For a Person");
            firstHeaderlabel.setStyleName(Runo.LABEL_H2);
            firstHeader.addComponent(firstHeaderlabel);
            layout.addComponent(firstHeader, 0, 0, 2, 0);
            layout.setComponentAlignment(firstHeader, Alignment.MIDDLE_CENTER);


            setLayout(layout);

        }

        @Override
        protected void attachField(Object propertyId, Field field) {

            if (propertyId.equals("firstName")) {
                layout.addComponent(field, 0, 1);
            } else if (propertyId.equals("lastName")) {
                layout.addComponent(field, 1, 1);
            } else if (propertyId.equals("facility")) {
                layout.addComponent(field, 2, 1);
            }


        }
    }
}
