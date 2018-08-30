package GroupIdP1.ArtifactIdP1;

import java.util.ArrayList;

import org.xml.sax.helpers.DefaultHandler;

import Package1.ConfigBean;

public class Configuration extends DefaultHandler {

	
	private ConfigBean bean;
	private int totalclass;
	private int count=1;
	private String content;
	private ArrayList<String> classes = new ArrayList<String>();

	public Configuration(InputStream is) throws ParserConfigurationException, IOException,SAXException{
		SAXParserFactory sax = SAXParserFactory.newInstance(); // Singto
		SAXParser sp = sax.newSAXParser();
			sp.parse(is, this);
	}

	@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if(qName.equals("config")){
				bean = new ConfigBean();
			}
			
		}
	@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			content = new String(ch,start,length);
			
		}
	 @Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			// TODO Auto-generated method stub
			if(qName.equals("url")){
				bean.setUrl(content);
			}
			if(qName.equals("timeout")){
				bean.setSteptime(Long.parseLong(content));
			}
			
			if(qName.equals("totalexecuteclass")){
			   totalclass = Integer.parseInt(content);	
			}
			if(qName.equals("browser")){
				bean.setBrowename(content);
			}
			if(qName.equals("browserdriverpath")){
				bean.setBrowserpath(content);
			}
			if((!qName.equals("url") && !qName.equals("totalexecuteclass")) && ("class"+count).equals(qName) && count<=totalclass){
				 classes.add(content);    
				count++;
			}
			if(qName.equals("config")){
				bean.setClassname(classes);
			}
		}
	 public ConfigBean getConfiguration(){
		 return bean;
}
