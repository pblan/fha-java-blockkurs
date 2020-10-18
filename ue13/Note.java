public class Note {
    private String value;

    public Note(Note n) {
        value = n.value;
    }

    public String toString() {
        return "Note: " + value;
    }
    public void setValue(String s) throws Exception {
        switch (s) {
            case "1,0", "1,3", "1,7", "2,0", "2,3", "2,7", "3,0", "3,3", "3,7", "4,0", "5.0" -> value = s;
            default -> throw new Exception("Falscher Wert");
        }
    }

    public String getValue() {
        return value;
    }

    public Note() {
        this.value = "5,0";
    }
    
    public Note(String s) throws Exception {
        switch (s) {
            case "1,0", "1,3", "1,7", "2,0", "2,3", "2,7", "3,0", "3,3", "3,7", "4,0", "5.0" -> this.value = s;
            default -> throw new Exception("Falscher Wert");
        }
    }

    public boolean hatBestanden() {
        return !this.value.equals("5,0");
    }
}
