package Package1;

import java.util.ArrayList;

public class KeywordBean {
	private String testcaseid;
	private String keywordname;
	private String stepid;
	private String elementtype;
	private String locatetype;
	private String locatevalue;
	private String valuetype;
	private String value;
	private String store_get_key;
	private boolean hasSteps;
	private ArrayList<StepBean> steps ; // array list of steps 
	public boolean isHasSteps() {
		return hasSteps;
	}

	public void setHasSteps(boolean hasSteps) {
		this.hasSteps = hasSteps;
	}

	public String getTestcaseid() {
		return testcaseid;
	}

	public void setTestcaseid(String testcaseid) {
		this.testcaseid = testcaseid;
	}

	public String getKeywordname() {
		return keywordname;
	}

	public void setKeywordname(String keywordname) {
		this.keywordname = keywordname;
	}

	public String getStepid() {
		return stepid;
	}

	public void setStepid(String stepid) {
		this.stepid = stepid;
	}

	public String getElementtype() {
		return elementtype;
	}

	public void setElementtype(String elementtype) {
		this.elementtype = elementtype;
	}

	public String getLocatetype() {
		return locatetype;
	}

	public void setLocatetype(String locatetype) {
		this.locatetype = locatetype;
	}

	public String getLocatevalue() {
		return locatevalue;
	}

	public void setLocatevalue(String locatevalue) {
		this.locatevalue = locatevalue;
	}

	public String getValuetype() {
		return valuetype;
	}

	public void setValuetype(String valuetype) {
		this.valuetype = valuetype;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStore_get_key() {
		return store_get_key;
	}

	public void setStore_get_key(String store_get_key) {
		this.store_get_key = store_get_key;
	}

	public ArrayList<StepBean> getSteps() {
		return steps;
	}

	public void setSteps(ArrayList<StepBean> steps) {
		this.steps = steps;
	}

}
