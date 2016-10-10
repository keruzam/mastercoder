package com.cybercom.mastercoder.converter;

import java.util.LinkedList;
import java.util.List;

public abstract class ISQLConverter {

   /*Put implementation creating ISQLConverter derived object in implementation file*/
   public static ISQLConverter getInstance() {
      throw new RuntimeException("please implement this");
   }


   /**
    *
    * @param tabName
    * @param typesBuff     Types of columns ex: STRING;STRING;STRING;INT;DATE\r\n
    * @param colNamBuff    Column name ex: USER;DESCRIPTION;NOTE;NUMBER;LOGINDATE\r\n
    * @param dataBuff      Data ex: MICHAEL;ADMIN;COMPANY;2051;2000-12-01 23:39\r\n
                           MICHAEL1;ADMIN1;COMPANY1;2052;2001-12-01 13:39\r\n ...
                           possible more than one line separated by '\r\n'
    * @return
    */
   public abstract LinkedList<SqlQuery> convertToSqlInsert(
      String tabName,
      String typesBuff,
      String colNamBuff,
      String dataBuff);
}
