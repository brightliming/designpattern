package com.ehualu.memento;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by bright on 16-7-4.
 */
public class BeanUtil {
    public static HashMap<String,Object> backupProp(Object bean){
        HashMap<String,Object> result = new HashMap<String,Object>();

        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            for(PropertyDescriptor desc:descriptors) {
                String fieldName = desc.getName();

                Method getter = desc.getReadMethod();

                Object fieldValue = getter.invoke(bean, new Object[]{});

                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static void restoreProp(Object bean,HashMap<String,Object> propMap){
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            for(PropertyDescriptor desc:descriptors){
                String fieldName = desc.getName();

                Method setter = desc.getWriteMethod();

                if(propMap.containsKey(fieldName)){
                    setter.invoke(bean,new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
