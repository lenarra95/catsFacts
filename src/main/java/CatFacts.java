public class CatFacts {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public void catFacts (String id, String text, String type, String user, Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId () {
        return id;
    }

    public String getText () {
        return text;
    }

    public String getType () {
        return type;
    }

    public String getUser () {
        return user;
    }

    public Integer getUpvotes () {
        return upvotes;
    }
    @Override
    public String toString() {
        return "Id - " + this.getId() + "\n" +
                "Text - " + this.getText() + "\n" +
                "Type - " + this.getType() + "\n" +
                "User - " + this.getUser() + "\n" +
                "UpVotes - " + this.getUpvotes() + "\n";
    }
}
