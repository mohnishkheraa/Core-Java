package world.hello;

public class PlayerDetail {

		private String name;
		
		private String team;
		private String skills;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		public String getSkills() {
			return skills;
		}
		public void setSkills(String skills) {
			this.skills = skills;
		}
		@Override
		public String toString() {
			return  name+"---" + team+"---" + skills  ;
			// return  this.getName() + "--" + this.getTeam() +  "--" + this.getSkills() ;
		}
		
}
