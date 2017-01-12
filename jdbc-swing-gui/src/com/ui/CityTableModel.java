package com.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.core.City;

class CityTableModel extends AbstractTableModel {

	private static final int NAME_COL = 0;
	private static final int COUNTRY_CODE_COL = 1;
	private static final int DISTRICT_COL = 2;
	
	
	private static final int POPULATION_COL = 3;
	
	private String[] columnNames = { "Name", "Country Code", "Distict",
			"Population" };
	private List<City> citys;

	public CityTableModel(List<City> theCitys) {
		citys = theCitys;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return citys.size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		City tempCity = citys.get(row);

		switch (col) {
		case NAME_COL:
			return tempCity.getName();
		case COUNTRY_CODE_COL:
			return tempCity.getCountryCode();
		case DISTRICT_COL:
			return tempCity.getDistrict();
		case POPULATION_COL:
			return tempCity.getPopulation();
		default:
			return tempCity.getName();
		}
	}

	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
}
