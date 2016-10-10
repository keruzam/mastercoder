package com.cybercom.mastercoder.converter;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		String typesBuff = "STRING;STRING;STRING;INT;DATE";
		String colNamBuff = "USER;DESCRIPTION;NOTE;NUMBER;LOGINDATE";
		String dataBuff = "MICHAEL;ADMIN;COMPANY;2051;2000-12-01 23:39\r\nMICHAEL1;ADMIN1;COMPANY1;2052;2001-12-01 13:39\r\n";
		ISQLConverter converter = SQLConverter.getInstance();
		LinkedList<SqlQuery> queries = converter.convertToSqlInsert("USERS",
				typesBuff, colNamBuff, dataBuff);
		System.out.print(queries.get(0).getComponents().toString());
	}

}
