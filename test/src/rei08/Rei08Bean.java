package rei08;

import java.io.Serializable;

public class Rei08Bean implements Serializable {
		private String sei = null;
		private String nen = null;
		private String[] mosidoki = null;
		private String[] seminar = null;
		private String tokoro = null;
		private String company = null;

		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getTokoro() {
			return tokoro;
		}
		public void setTokoro(String tokoro) {
			this.tokoro = tokoro;
		}
		public String getSei() {
			return sei;
		}
		public void setSei(String sei) {
			this.sei = sei;
		}

		public String getNen() {
			return nen;
		}
		public void setNen(String nen) {
			this.nen = nen;
		}
		public String[] getMosidoki() {
			return mosidoki;
		}
		public void setMosidoki(String[] mosidoki) {
			this.mosidoki = mosidoki;
		}
		public String[] getSeminar() {
			return seminar;
		}
		public void setSeminar(String[] seminar) {
			this.seminar = seminar;
		}






}
