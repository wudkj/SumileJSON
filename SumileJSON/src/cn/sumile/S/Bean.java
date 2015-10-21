package cn.sumile.S;

import java.util.ArrayList;

public class Bean {
	public String error;
	public ArrayList<Bean2> data;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public ArrayList<Bean2> getData() {
		return data;
	}

	public void setData(ArrayList<Bean2> data) {
		this.data = data;
	}

	public static class Bean2 {
		public String name;
		public ArrayList<Bean3> value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Bean3> getValue() {
			return value;
		}

		public void setValue(ArrayList<Bean3> value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Bean2 [name=" + name + ", value=" + value + "]";
		}

	}

	public static class Bean3 {
		public String name;
		private String value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Bean3 [name=" + name + ", value=" + value + "]";
		}

	}
}
