/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashthrims.infrastructure.util;

import com.vaadin.data.Property;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author boniface
 */
public class DataFieldsUtil {

    public List getSelectListFields(Object obj) {

        List<String> list = new ArrayList<String>();
        Collection data = (Collection) obj;
        for (Iterator it = data.iterator(); it.hasNext();) {
            Object object = it.next();
            list.add(object.toString());
        }
        return list;
    }

    public List getSelectListLongFields(Object obj) {

        List<Long> list = new ArrayList<Long>();
        Collection<Long> data = (Collection<Long>) obj;
        for (Iterator it = data.iterator(); it.hasNext();) {
            Object object = it.next();
            list.add(Long.parseLong(object.toString()));
        }
        return list;
    }

    public String getStringFields(Object obj) {
        String field = null;
        if (obj != null) {
            field = obj.toString();
        } else {
            field = null;
        }
        return field;
    }

    public Date getDateFields(Object obj) {
        Date field = null;
        String pattern = "EEE MMM dd HH:mm:ss z yyyy";
        String shortdate = "yyyy-MM-dd";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        SimpleDateFormat shdate = new SimpleDateFormat(shortdate);
        if (obj != null) {
            try {
                field = df.parse(obj.toString());
            } catch (ParseException ex) {
                try {
                    field = shdate.parse(obj.toString());
                } catch (ParseException ex1) {
                    Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            field = null;
        }
        return field;
    }

    public Date getDbDateFields(Object obj) {
        Date field = null;
        String pattern = "yyyy-MM-dd";
        String longDate = "EEE MMM dd HH:mm:ss z yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        SimpleDateFormat shdate = new SimpleDateFormat(longDate);
        if (obj != null) {
            try {
                field = df.parse(obj.toString());
            } catch (ParseException ex) {

                try {
                    field = shdate.parse(obj.toString());
                } catch (ParseException ex1) {
                    Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            field = null;
        }
        return field;
    }

    public String getTableFields(Property itemProperty) {
        if (itemProperty != null) {
            itemProperty.toString();
        }
        return null;
    }

    public Long getLongFields(Object value) {
        if (value != null) {
            return Long.parseLong(value.toString());
        }
        return null;
    }
}
