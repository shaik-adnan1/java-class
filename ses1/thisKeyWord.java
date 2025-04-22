package ses1;
public class thisKeyWord {

    String name;

    thisKeyWord(String name) {
        this.name = name;
    }

    public String diplayString() {
        String username = name;
        String returnString = "This is the username using this keyword: " + username;
        return returnString;
    }

    public static void main(String[] args) {
        thisKeyWord thisObj = new thisKeyWord("adnan");
        System.out.println(thisObj.diplayString());
    }
}
