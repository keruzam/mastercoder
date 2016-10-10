package com.cybercom.mastercoder.converter;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * MasterCoder - Zadanie 1 (implementacja ISQLConverter)
 * 
 * @author Tomasz Mazurek
 *
 */
public class SQLConverter extends ISQLConverter {

	private static final String SEMICOLON = ";";

	public static ISQLConverter getInstance() {
		return new SQLConverter();
	}

	@Override
	public LinkedList<SqlQuery> convertToSqlInsert(String tabName,
			String typesBuff, String colNamBuff, String dataBuff) {
		LinkedList<SqlQuery> queries = new LinkedList<SqlQuery>();
		ComponentBuilder builder = new ComponentBuilder(typesBuff, colNamBuff,
				tabName);
		Scanner scanner = new Scanner(dataBuff);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split(SEMICOLON);
			SqlQuery query = new SqlQuery(builder.create(data));
			queries.add(query);
		}
		scanner.close();
		return queries;
	}

	class ComponentBuilder {
		String[] types;
		String[] colNames;
		String tabName;

		public ComponentBuilder(String typesBuff, String colNamBuff,
				String tabName) {
			this.types = typesBuff.split(SEMICOLON);
			this.colNames = colNamBuff.split(SEMICOLON);
			this.tabName = tabName;
		}

		// INSERT,INTO,table_name,(,column1,column2,column3,),VALUES,(value1,value2,value3,),;
		public LinkedList<String> create(String[] data) {
			LinkedList<String> query = new LinkedList<String>();
			query.add("INSERT");
			query.add("INTO");
			query.add(tabName);
			query.add("(");

			for (String col : colNames) {
				query.add(col);
			}
			query.add(")");
			query.add("VALUES");
			query.add("(");
			for (String value : data) {
				query.add(value);
			}
			query.add(")");
			query.add(SEMICOLON);
			return query;
		}
	}
}
