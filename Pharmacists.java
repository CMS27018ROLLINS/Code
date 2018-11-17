
public class Pharmacists extends People implements Infomation{

	private String certdate; 
	public Pharmacists() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSsn() {
		// TODO Auto-generated method stub
		return ssn;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public String getTel() {
		// TODO Auto-generated method stub
		return tel;
	}

	public String getCertDate() { 
		return certdate;
	}

}
