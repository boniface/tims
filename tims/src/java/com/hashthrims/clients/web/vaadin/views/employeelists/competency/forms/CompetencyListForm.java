/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashthrims.clients.web.vaadin.views.employeelists.competency.forms;

import com.hashthrims.clients.web.vaadin.data.ClientDataService;
import com.hashthrims.domain.employeelist.CompetencyType;
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
public class CompetencyListForm {

    // Define Buttons
    private Button save = new Button("Save");
    private Button edit = new Button("Edit");
    private Button cancel = new Button("Cancel");
    private Button update = new Button("Update");
    private Button delete = new Button("Delete");
    //Define Footer
    private HorizontalLayout footer;
   private static ClientDataService data = new ClientDataService();

    public CompetencyListForm() {
    }

    public Form createCompetencyForm() {
        Form form = new Form();
        form.setCaption("Competency");
        form.setImmediate(false);
        form.setFormFieldFactory(new CompetencyFieldFactory());

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
        order.add("competencyName");
        order.add("competencyType");
        order.add("competencyNotes");
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

    static class CompetencyFieldFactory extends DefaultFieldFactory {

        @Override
        public Field createField(Item item, Object propertyId,
                Component uiContext) {

            Field field = super.createField(item, propertyId, uiContext);


            if ("competencyName".equals(propertyId)) {
                field = new TextField("Competency Name:");
        
                ((TextField) field).setColumns(30);
                ((TextField) field).setNullRepresentation("");
             
                ((TextField) field).setRequired(true);
                ((TextField) field).setRequiredError("Please Enter Competency Name");
            } else if ("competencyNotes".equals(propertyId)) {
                field = new TextField("Competency Notes:");
            
                ((TextField) field).setColumns(30);
                ((TextField) field).setNullRepresentation("");
            
                ((TextField) field).setRequired(true);
                ((TextField) field).setRequiredError("Please Enter Competency Notes");
            } else if ("competencyType".equals(propertyId)) {
                List<CompetencyType> competancyTypes = data.getCompetencyTypeService().findAll();
                Select select = new Select("Subject Area");
                for (CompetencyType competancyType : competancyTypes) {
                    select.addItem(competancyType.getComp_name_typ());
                }
                select.setNewItemsAllowed(true);
                select.setWidth("300");
                select.setRequired(true);
                return select;
            } else if ("competencyId".equals(propertyId)) {
                field = new TextField("Competency ID:");
          
                ((TextField) field).setVisible(false);
            }
            return field;
        }
    }
}
