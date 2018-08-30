package GroupIdP1.ArtifactIdP1;


import java.util.ArrayList; 

public class configBean {
	private String url;
	private long steptime;
	private ArrayList<String> classname;
	private String browename;
	private String browserpath;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public ArrayList<String> getClassname() {
		return classname;
	}
	public void setClassname(ArrayList<String> classname) {
		this.classname = classname;
	}
	public long getSteptime() {
		return steptime;
	}
	public String getBrowename() {
		return browename;
	}

	public void setBrowename(String browename) {
		this.browename = browename;
	}

	public String getBrowserpath() {
		return browserpath;
	}

	public void setBrowserpath(String browserpath) {
		this.browserpath = browserpath;
	}

	public void setSteptime(long steptime) {
		this.steptime = steptime;
	}

}
