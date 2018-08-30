package Package1;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;

public class CellBean {

	private int celltype;
    private HSSFCellStyle cellstyle;
    private HSSFComment comment;
    private HSSFHyperlink hyperlink;
    
    public HSSFComment getComment() {
		return comment;
	}

	public void setComment(HSSFComment comment) {
		this.comment = comment;
	}

	public HSSFHyperlink getHyperlink() {
		return hyperlink;
	}

	public void setHyperlink(HSSFHyperlink hyperlink) {
		this.hyperlink = hyperlink;
	}

	public int getCelltype() {
		return celltype;
	}

	public void setCelltype(int celltype) {
		this.celltype = celltype;
	}

	public HSSFCellStyle getCellstyle() {
		return cellstyle;
	}

	public void setCellstyle(HSSFCellStyle cellstyle) {
		this.cellstyle = cellstyle;
	}

	

}
