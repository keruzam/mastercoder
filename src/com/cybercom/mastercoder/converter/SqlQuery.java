package com.cybercom.mastercoder.converter;

import java.util.*;

/**
 * Store all elements of query as list, without whitespaces
 */
public class SqlQuery {

   // {INSERT,INTO,table_name,(,column1,column2,column3,),VALUES,(value1,value2,value3,),;}
   private LinkedList<String> components;

   public SqlQuery(LinkedList<String> comp) {
      this.components = new LinkedList<String>(comp);
   }

   public LinkedList<String> getComponents() {
      return components;
   }

   public void setComponents(LinkedList<String> components) {
      this.components = components;
   }
}