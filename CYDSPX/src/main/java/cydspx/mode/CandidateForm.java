package cydspx.mode;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CandidateForm extends Candidate{
	private String[] service_intention;			//服务意向
	private String[] vocations;					//行业
	private String achievement1;
	private String prize_year1;
	private String prize_level1;
	private String achievement2;
	private String prize_year2;
	private String prize_level2;
	private String achievement3;
	private String prize_year3;
	private String prize_level3;
	
	private String project_name1;
	private String elect_year1;
	private String elect_level1;
	private String project_name2;
	private String elect_year2;
	private String elect_level2;
	private String project_name3;
	private String elect_year3;
	private String elect_level3;
	
	boolean check(String data)
	{
		if(data == null || data.isEmpty()) return false;
		return true;
	}
	
	boolean check(String[] data)
	{
		if(data == null || data.length == 0) return false;
		return true;
	}
	
	public boolean check()
	{
		if(!check(this.photograph)) return false;
		if(!check(this.attachment)) return false;
		if(!check(this.name)) return false;
		if(!check(this.nation)) return false;
		if(!check(this.politics)) return false;
		if(!check(this.cert_type)) return false;
//		if(!check(this.sex)) return false;
		if(!check(this.birthday)) return false;
		if(!check(this.state)) return false;
		if(!check(this.cert_no)) return false;
		if(!check(this.mobile_phone)) return false;
		if(!check(this.email)) return false;
		if(!check(this.tel_phone)) return false;
		if(!check(this.job)) return false;
		if(!check(this.workunit)) return false;
		if(!check(this.origin_recommand)) return false;
		if(!check(this.service_intention)) return false;
		if(!check(this.vocations)) return false;
		
		return true;
	}
	
}











