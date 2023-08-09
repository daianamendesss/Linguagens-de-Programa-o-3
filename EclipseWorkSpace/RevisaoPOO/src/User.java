import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
	private String name;
	private String CPF;
	private List<String> friends;
	
	public User() {
		friends = new ArrayList<>();
		friends.add("Luiza");
		friends.add("Rosana");
		friends.add("Noé");
	}
	public void setFriends(List<String>friends) {
		this.friends = friends;
	}
	public void addFriend(String name) {
		friends.add(name);
	}
	public List<String> getFriends(){
		List<String> friendsCopy = new ArrayList<>();
		for (String friendName: this.friends) {
			friendsCopy.add(friendName);
		}
		return friendsCopy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
			this.CPF = CPF;
	} 
}
