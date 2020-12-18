package US;

public class DataGiven {

	String dateRecieved;
	String Product;
	String subProduct;
	String issue;
	String subIssue;
	String company;
	String State;
	String zipCode;
	String SubVia;
	String dateSentToComp;
	String companyResponse;
	String timelyResponse;
	String consumerDisputed;
	String complaintID;
	public DataGiven(String dateRecieved, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String subVia, String dateSentToComp, String companyResponse,
			String timelyResponse, String consumerDisputed, String complaintID) {
		super();
		this.dateRecieved = dateRecieved;
		Product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		State = state;
		this.zipCode = zipCode;
		SubVia = subVia;
		this.dateSentToComp = dateSentToComp;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
		this.complaintID = complaintID;
	}
	public String getDateRecieved() {
		return dateRecieved;
	}
	public void setDateRecieved(String dateRecieved) {
		this.dateRecieved = dateRecieved;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public String getSubProduct() {
		return subProduct;
	}
	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSubVia() {
		return SubVia;
	}
	public void setSubVia(String subVia) {
		SubVia = subVia;
	}
	public String getDateSentToComp() {
		return dateSentToComp;
	}
	public void setDateSentToComp(String dateSentToComp) {
		this.dateSentToComp = dateSentToComp;
	}
	public String getCompanyResponse() {
		return companyResponse;
	}
	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}
	public String getTimelyResponse() {
		return timelyResponse;
	}
	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}
	public String getConsumerDisputed() {
		return consumerDisputed;
	}
	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}
	public String getComplaintID() {
		return complaintID;
	}
	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}
	
	
	
	
}
