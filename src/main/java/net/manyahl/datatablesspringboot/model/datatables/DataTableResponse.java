package net.manyahl.datatablesspringboot.model.datatables;

import java.util.List;

import net.manyahl.datatablesspringboot.model.Movie;

public class DataTableResponse {
	private int draw;
	private int recordsTotal;
	private int recordsFiltered;
	private List<Movie> data;
	
	public DataTableResponse() {}

	public DataTableResponse(int draw, int recordsTotal, int recordsFiltered, List<Movie> data) {
		super();
		this.draw = draw;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
		this.data = data;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public List<Movie> getData() {
		return data;
	}

	public void setData(List<Movie> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataTableResponse [draw=" + draw + ", recordsTotal=" + recordsTotal + ", recordsFiltered="
				+ recordsFiltered + ", data=" + data + "]";
	}

}
