import java.util.List;

public class Main {

	public static void main(String[] args) {
		
    User emerson = new User();
    emerson.setName("Emerson");
    emerson.setCPF("050");
    
    List<String> friends = emerson.getFriends();
    friends.add("Elenice");
    
    System.out.println("Lista de amigos: ");
    for (String friendName: emerson.getFriends()) {
    	System.out.println(friendName);
    }
	}

}
